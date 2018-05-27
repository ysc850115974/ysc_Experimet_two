package com.example.administrator.ysc_experimet_two;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("msg","oncreate");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("msg","onstart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("msg","onresume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("msg","onpause");
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("msg","onstop");
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("msg","ondestroy");
        // The activity is about to be destroyed.
    }

}
