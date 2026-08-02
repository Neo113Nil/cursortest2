package com.neptunesoft.bacdz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Insets;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

/* loaded from: classes4.dex */
public class SplashScreen extends AppCompatActivity {
    public static boolean darkmode;
    static SharedPreferences settings_darkmode;
    public static int useApplication;
    AnimatedVectorDrawable animatedVectorDrawable;
    AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
    ImageView animation_view;
    Handler handler = new Handler();
    Runnable time_wait_logo = new Runnable() { // from class: com.neptunesoft.bacdz.SplashScreen.1
        @Override // java.lang.Runnable
        public void run() {
            SplashScreen.this.startActivity(new Intent(SplashScreen.this.getApplicationContext(), (Class<?>) HomeActivity.class));
            SplashScreen.this.finish();
            SplashScreen.this.handler.removeCallbacks(SplashScreen.this.time_wait_logo);
        }
    };

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        increment();
        if (darkmode) {
            AppCompatDelegate.setDefaultNightMode(2);
        } else {
            AppCompatDelegate.setDefaultNightMode(1);
        }
        setContentView(R.layout.activity_splash_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.SplashScreen$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SplashScreen.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.animation_view);
        this.animation_view = imageView;
        if (darkmode) {
            imageView.setImageResource(R.drawable.splash_screen_dark_animtion);
        } else {
            imageView.setImageResource(R.drawable.splash_screen_light_animtion);
        }
        Drawable drawable = this.animation_view.getDrawable();
        if (drawable instanceof AnimatedVectorDrawableCompat) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = (AnimatedVectorDrawableCompat) drawable;
            this.animatedVectorDrawableCompat = animatedVectorDrawableCompat;
            animatedVectorDrawableCompat.start();
        } else if (drawable instanceof AnimatedVectorDrawable) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            this.animatedVectorDrawable = animatedVectorDrawable;
            animatedVectorDrawable.start();
        }
        this.handler.postDelayed(this.time_wait_logo, 3000L);
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets platformInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            i = platformInsets.left;
            i2 = platformInsets.top;
            i3 = platformInsets.right;
            i4 = platformInsets.bottom;
            view.setPadding(i, i2, i3, i4);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    void init() {
        SharedPreferences sharedPreferences = getSharedPreferences("DARKMODE", 0);
        settings_darkmode = sharedPreferences;
        darkmode = sharedPreferences.getBoolean("switchkey1", false);
    }

    private void increment() {
        SharedPreferences sharedPreferences = getSharedPreferences("USEAPP", 0);
        int i = sharedPreferences.getInt("switchkey2", 0);
        useApplication = i;
        if (i != -1) {
            useApplication = i + 1;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("switchkey2", useApplication);
            edit.apply();
        }
    }
}
