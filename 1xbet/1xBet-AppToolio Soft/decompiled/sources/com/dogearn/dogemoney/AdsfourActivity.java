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
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes.dex */
public class AdsfourActivity extends AppCompatActivity {
    private Button button;
    DatabaseReference databaseReference;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    private int myIntValue;
    private TextView textView;
    String user_id;
    DatabaseReference user_id_child;

    /* JADX WARN: Type inference failed for: r8v20, types: [com.dogearn.dogemoney.AdsfourActivity$1] */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_adsfour);
        this.textView = (TextView) findViewById(R.id.countDownFour);
        this.button = (Button) findViewById(R.id.nextTaskFour);
        this.databaseReference = FirebaseDatabase.getInstance().getReference().child("users");
        this.user_id = FirebaseAuth.getInstance().getCurrentUser().getUid();
        this.user_id_child = this.databaseReference.child(this.user_id);
        MobileAds.initialize(this, "ca-app-pub-7300440519666493~6502219975");
        this.mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        this.mPublisherInterstitialAd.setAdUnitId("ca-app-pub-7300440519666493/1204170574");
        this.mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        new CountDownTimer(10000L, 1000L) { // from class: com.dogearn.dogemoney.AdsfourActivity.1
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                AdsfourActivity.this.textView.setText(" " + (j / 1000));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                AdsfourActivity.this.textView.setText("done!");
                ((Vibrator) AdsfourActivity.this.getSystemService("vibrator")).vibrate(200L);
            }
        }.start();
        this.button.setVisibility(4);
        this.button.postDelayed(new Runnable() { // from class: com.dogearn.dogemoney.AdsfourActivity.2
            @Override // java.lang.Runnable
            public void run() {
                AdsfourActivity.this.button.setVisibility(0);
            }
        }, 10000L);
        this.mPublisherInterstitialAd.setAdListener(new AdListener() { // from class: com.dogearn.dogemoney.AdsfourActivity.3
            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                AdsfourActivity.this.mPublisherInterstitialAd.show();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
                Toast.makeText(AdsfourActivity.this, "Ad failed to load", 0).show();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLeftApplication() {
                Toast.makeText(AdsfourActivity.this, "You did invalid click", 0).show();
                AdsfourActivity.this.user_id_child.child("Invadil").setValue(Integer.valueOf(AdsfourActivity.this.myIntValue + 1));
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                AdsfourActivity.this.mPublisherInterstitialAd.show();
            }
        });
        this.button.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.AdsfourActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdsfourActivity adsfourActivity = AdsfourActivity.this;
                adsfourActivity.startActivity(new Intent(adsfourActivity, (Class<?>) AdsfiveActivity.class));
            }
        });
    }
}
