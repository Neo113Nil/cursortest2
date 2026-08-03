package com.unity3d.ironsourceads.rewarded;

/* loaded from: classes5.dex */
public final class RewardedAd implements com.ironsource.Xd {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Wd f8028a;
    private com.unity3d.ironsourceads.rewarded.RewardedAdListener b;

    public RewardedAd(com.ironsource.Wd rewardedAdInternal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardedAdInternal, "rewardedAdInternal");
        this.f8028a = rewardedAdInternal;
        rewardedAdInternal.a(this);
    }

    public final com.unity3d.ironsourceads.rewarded.RewardedAdInfo getAdInfo() {
        return this.f8028a.b();
    }

    public final com.unity3d.ironsourceads.rewarded.RewardedAdListener getListener() {
        return this.b;
    }

    public final boolean isReadyToShow() {
        com.ironsource.mediationsdk.logger.IronLog.API.info();
        return this.f8028a.d();
    }

    @Override // com.ironsource.Xd
    public void onAdInstanceDidBecomeVisible() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Xd
    public void onRewardedAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("RewardedAdListener onRewardedAdClicked adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.Xd
    public void onRewardedAdDismissed() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("RewardedAdListener onRewardedAdDismissed adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.Xd
    public void onRewardedAdFailedToShow(com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("RewardedAdListener onRewardedAdFailedToShow error: " + error + " adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.Xd
    public void onRewardedAdShown() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("RewardedAdListener onRewardedAdShown adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.Xd
    public void onUserEarnedReward() {
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("RewardedAdListener onUserEarnedReward adInfo: " + getAdInfo());
        com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener = this.b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(com.unity3d.ironsourceads.rewarded.RewardedAdListener rewardedAdListener) {
        this.b = rewardedAdListener;
    }

    public final void show(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.ironsource.mediationsdk.logger.IronLog.API.info();
        this.f8028a.a(activity);
    }
}
