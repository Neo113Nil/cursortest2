package com.google.android.gms.ads.mediation.customevent;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface CustomEventInterstitial extends com.google.android.gms.ads.mediation.customevent.CustomEvent {
    void requestInterstitialAd(android.content.Context context, com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener customEventInterstitialListener, java.lang.String str, com.google.android.gms.ads.mediation.MediationAdRequest mediationAdRequest, android.os.Bundle bundle);

    void showInterstitial();
}
