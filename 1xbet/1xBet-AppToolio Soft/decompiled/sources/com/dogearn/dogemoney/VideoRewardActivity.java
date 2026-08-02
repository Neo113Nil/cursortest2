package com.dogearn.dogemoney;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes.dex */
public class VideoRewardActivity extends AppCompatActivity implements RewardedVideoAdListener {
    DatabaseReference databaseReference;
    private Button done;
    private RewardedVideoAd mRewardedVideoAd;
    int myIntValue;
    private Button playVideo;
    String user_id;
    DatabaseReference user_id_child;

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdFailedToLoad(int i) {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdLeftApplication() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdLoaded() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoStarted() {
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_reward);
        this.playVideo = (Button) findViewById(R.id.clickForReward);
        this.mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        this.mRewardedVideoAd.setRewardedVideoAdListener(this);
        loadRewardedVideoAd();
        this.databaseReference = FirebaseDatabase.getInstance().getReference().child("users");
        this.user_id = FirebaseAuth.getInstance().getCurrentUser().getUid();
        MobileAds.initialize(this, "ca-app-pub-7300440519666493~6502219975");
        this.user_id_child = this.databaseReference.child(this.user_id);
        this.myIntValue = getSharedPreferences("your_prefs", 0).getInt("your_int_key", 0);
    }

    private void loadRewardedVideoAd() {
        if (this.mRewardedVideoAd.isLoaded()) {
            return;
        }
        this.mRewardedVideoAd.loadAd("ca-app-pub-7300440519666493/2918198188", new AdRequest.Builder().build());
    }

    public void startVideoAds(View view) {
        if (this.mRewardedVideoAd.isLoaded()) {
            this.mRewardedVideoAd.show();
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdClosed() {
        loadRewardedVideoAd();
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewarded(RewardItem rewardItem) {
        Toast.makeText(this, "Congratulations, you  earn 2 points", 0).show();
        SharedPreferences.Editor edit = getSharedPreferences("your_prefs", 0).edit();
        int i = this.myIntValue + 2;
        edit.putInt("your_int_key", i);
        edit.commit();
        this.user_id_child.child("scores").setValue(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        loadRewardedVideoAd();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.mRewardedVideoAd.resume(this);
        super.onResume();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.mRewardedVideoAd.pause(this);
        super.onPause();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.mRewardedVideoAd.destroy(this);
        super.onDestroy();
    }
}
