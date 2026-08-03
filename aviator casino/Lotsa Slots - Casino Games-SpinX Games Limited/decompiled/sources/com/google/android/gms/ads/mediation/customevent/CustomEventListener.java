package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @java.lang.Deprecated
    void onAdFailedToLoad(int i);

    void onAdFailedToLoad(com.google.android.gms.ads.AdError adError);

    void onAdLeftApplication();

    void onAdOpened();
}
