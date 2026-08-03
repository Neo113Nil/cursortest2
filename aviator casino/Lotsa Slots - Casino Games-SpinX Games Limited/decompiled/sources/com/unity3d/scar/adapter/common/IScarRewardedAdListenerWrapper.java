package com.unity3d.scar.adapter.common;

/* loaded from: classes5.dex */
public interface IScarRewardedAdListenerWrapper extends com.unity3d.scar.adapter.common.IScarAdListenerWrapper {
    void onAdFailedToShow(int i, java.lang.String str);

    void onAdImpression();

    void onAdSkipped();

    void onUserEarnedReward();
}
