package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes6.dex */
public interface Wd {
    void onAdInstanceDidBecomeVisible();

    void onRewardedAdClicked();

    void onRewardedAdDismissed();

    void onRewardedAdFailedToShow(IronSourceError ironSourceError);

    void onRewardedAdShown();

    void onUserEarnedReward();
}
