package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public interface ISDemandOnlyRewardedVideoListener {
    void onRewardedVideoAdClicked(java.lang.String str);

    void onRewardedVideoAdClosed(java.lang.String str);

    void onRewardedVideoAdLoadFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedVideoAdLoadSuccess(java.lang.String str);

    void onRewardedVideoAdOpened(java.lang.String str);

    void onRewardedVideoAdRewarded(java.lang.String str);

    void onRewardedVideoAdShowFailed(java.lang.String str, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);
}
