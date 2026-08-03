package com.unity3d.scar.adapter.common;

/* loaded from: classes5.dex */
public interface IScarInterstitialAdListenerWrapper extends com.unity3d.scar.adapter.common.IScarAdListenerWrapper {
    void onAdFailedToShow(int i, java.lang.String str);

    void onAdImpression();

    void onAdLeftApplication();

    void onAdSkipped();
}
