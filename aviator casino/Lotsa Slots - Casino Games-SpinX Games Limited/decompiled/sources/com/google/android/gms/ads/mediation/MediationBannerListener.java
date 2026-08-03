package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public interface MediationBannerListener {
    void onAdClicked(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    @java.lang.Deprecated
    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter, int i);

    void onAdFailedToLoad(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter, com.google.android.gms.ads.AdError adError);

    void onAdLeftApplication(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter);

    void zza(com.google.android.gms.ads.mediation.MediationBannerAdapter mediationBannerAdapter, java.lang.String str, java.lang.String str2);
}
