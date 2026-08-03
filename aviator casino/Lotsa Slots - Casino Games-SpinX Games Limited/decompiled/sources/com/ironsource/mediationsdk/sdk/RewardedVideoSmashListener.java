package com.ironsource.mediationsdk.sdk;

/* loaded from: classes5.dex */
public interface RewardedVideoSmashListener {

    /* renamed from: com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    void onRewardedVideoAdClicked();

    void onRewardedVideoAdClicked(java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoAdClosed();

    void onRewardedVideoAdClosed(java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoAdEnded();

    void onRewardedVideoAdEnded(java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoAdOpened();

    void onRewardedVideoAdOpened(java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoAdRewarded();

    void onRewardedVideoAdRewarded(java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedVideoAdShowFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoAdStarted();

    void onRewardedVideoAdStarted(java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoAdVisible();

    void onRewardedVideoAdVisible(java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoAvailabilityChanged(boolean z);

    void onRewardedVideoAvailabilityChanged(boolean z, java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedVideoInitFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoInitSuccess();

    void onRewardedVideoInitSuccess(java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedVideoLoadFailed(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, java.util.Map<java.lang.String, java.lang.Object> map);

    void onRewardedVideoLoadSuccess();

    void onRewardedVideoLoadSuccess(java.util.Map<java.lang.String, java.lang.Object> map);
}
