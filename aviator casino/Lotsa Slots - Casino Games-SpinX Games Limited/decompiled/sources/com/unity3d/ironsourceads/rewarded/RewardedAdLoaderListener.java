package com.unity3d.ironsourceads.rewarded;

/* loaded from: classes5.dex */
public interface RewardedAdLoaderListener {
    void onRewardedAdLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedAdLoaded(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd);
}
