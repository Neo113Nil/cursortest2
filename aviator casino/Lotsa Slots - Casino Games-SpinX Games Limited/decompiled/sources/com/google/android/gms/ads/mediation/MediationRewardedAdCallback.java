package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public interface MediationRewardedAdCallback extends com.google.android.gms.ads.mediation.MediationAdCallback {
    void onAdFailedToShow(com.google.android.gms.ads.AdError adError);

    void onUserEarnedReward();

    @java.lang.Deprecated
    void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem rewardItem);

    void onVideoComplete();

    void onVideoStart();
}
