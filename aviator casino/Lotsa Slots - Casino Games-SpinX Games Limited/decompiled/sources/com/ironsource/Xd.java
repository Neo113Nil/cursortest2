package com.ironsource;

/* loaded from: classes5.dex */
public interface Xd {
    void onAdInstanceDidBecomeVisible();

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToShow(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError);

    void onRewardedAdShown();

    void onUserEarnedReward();
}
