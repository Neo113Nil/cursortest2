package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface MediationNativeListener {
    void onAdClicked(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    @java.lang.Deprecated
    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, int i);

    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.AdError adError);

    void onAdImpression(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.ads.mediation.UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void onVideoEnd(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter);

    void zzc(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.internal.ads.zzbmw zzbmwVar);

    void zzd(com.google.android.gms.ads.mediation.MediationNativeAdapter mediationNativeAdapter, com.google.android.gms.internal.ads.zzbmw zzbmwVar, java.lang.String str);
}
