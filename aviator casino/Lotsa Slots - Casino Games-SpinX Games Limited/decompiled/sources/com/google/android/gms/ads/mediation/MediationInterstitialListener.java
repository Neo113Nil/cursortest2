package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface MediationInterstitialListener {
    void onAdClicked(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdClosed(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter);

    @java.lang.Deprecated
    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter, int i);

    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter, com.google.android.gms.ads.AdError adError);

    void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdLoaded(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(com.google.android.gms.ads.mediation.MediationInterstitialAdapter mediationInterstitialAdapter);
}
