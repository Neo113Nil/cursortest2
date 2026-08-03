package com.unity3d.ironsourceads.rewarded;

/* loaded from: classes5.dex */
public interface RewardedAdListener {
    void onRewardedAdClicked(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd);

    void onRewardedAdDismissed(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd);

    void onRewardedAdFailedToShow(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedAdShown(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd);

    void onUserEarnedReward(com.unity3d.ironsourceads.rewarded.RewardedAd rewardedAd);
}
