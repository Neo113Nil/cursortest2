package com.dogearn.dogemoney;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes.dex */
public class AdsoneActivity extends AppCompatActivity {
    private AdView adView;
    private TextView countdowntxt;
    DatabaseReference databaseReference;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    private int myIntValue;
    private Button taskone;
    private TextView txt;
    String user_id;
    DatabaseReference user_id_child;

    /* JADX WARN: Type inference failed for: r8v29, types: [com.dogearn.dogemoney.AdsoneActivity$2] */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_adsone);
        this.countdowntxt = (TextView) findViewById(R.id.countDownID);
        this.taskone = (Button) findViewById(R.id.task1);
        this.txt = (TextView) findViewById(R.id.textString);
        this.databaseReference = FirebaseDatabase.getInstance().getReference().child("users");
        this.user_id = FirebaseAuth.getInstance().getCurrentUser().getUid();
        this.user_id_child = this.databaseReference.child(this.user_id);
        MobileAds.initialize(this, "ca-app-pub-7300440519666493~2860439544");
        this.adView = (AdView) findViewById(R.id.adsoneadView);
        this.adView.loadAd(new AdRequest.Builder().build());
        this.mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        this.mPublisherInterstitialAd.setAdUnitId("ca-app-pub-7300440519666493/2453546751");
        this.mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        this.taskone.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.AdsoneActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        new CountDownTimer(10000L, 1000L) { // from class: com.dogearn.dogemoney.AdsoneActivity.2
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                AdsoneActivity.this.countdowntxt.setText(" " + (j / 1000));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                AdsoneActivity.this.countdowntxt.setText("done!");
                ((Vibrator) AdsoneActivity.this.getSystemService("vibrator")).vibrate(200L);
            }
        }.start();
        this.taskone.setVisibility(4);
        this.taskone.postDelayed(new Runnable() { // from class: com.dogearn.dogemoney.AdsoneActivity.3
            @Override // java.lang.Runnable
            public void run() {
                AdsoneActivity.this.taskone.setVisibility(0);
            }
        }, 10000L);
        this.taskone.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.AdsoneActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (AdsoneActivity.this.mPublisherInterstitialAd.isLoaded()) {
                    AdsoneActivity adsoneActivity = AdsoneActivity.this;
                    adsoneActivity.startActivity(new Intent(adsoneActivity, (Class<?>) AdstwoActivity.class));
                    AdsoneActivity.this.mPublisherInterstitialAd.show();
                    return;
                }
                Toast.makeText(AdsoneActivity.this, "Not ads at that time", 0).show();
            }
        });
    }
}
