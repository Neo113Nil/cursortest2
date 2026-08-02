package org.betup.services.ads.rewarded;

import org.betup.services.offer.VideoRewardService;

/* loaded from: classes2.dex */
public final class RewardedAdListenerAdapter implements RewardedAdListener {
    private final VideoRewardService videoRewardService;

    public RewardedAdListenerAdapter(VideoRewardService videoRewardService) {
        this.videoRewardService = videoRewardService;
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdListener
    public void onAdLoaded(String adUnitId) {
        this.videoRewardService.onRewardedVideoLoaded(true);
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdListener
    public void onAdFailedToLoad(String adUnitId, String errorMessage) {
        this.videoRewardService.onRewardedVideoFailedToLoad();
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdListener
    public void onAdShown(String adUnitId, String mediationAdapterClassName) {
        this.videoRewardService.onGmaRewardedShown(mediationAdapterClassName);
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdListener
    public void onAdFailedToShow(String adUnitId, String errorMessage) {
        this.videoRewardService.onRewardedVideoShowFailed();
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdListener
    public void onAdDismissed(String adUnitId, boolean userEarnedReward) {
        this.videoRewardService.onRewardedVideoClosed(userEarnedReward);
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdListener
    public void onUserEarnedReward(String adUnitId) {
        this.videoRewardService.onRewardedVideoFinished(0.0d, "");
    }
}
