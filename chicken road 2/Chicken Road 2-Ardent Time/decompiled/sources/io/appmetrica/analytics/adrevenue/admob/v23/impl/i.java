package io.appmetrica.analytics.adrevenue.admob.v23.impl;

/* loaded from: classes.dex */
public final class i extends io.appmetrica.analytics.adrevenue.admob.v23.impl.e {
    public i(io.appmetrica.analytics.adrevenue.admob.v23.impl.b bVar, io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        super(bVar, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(java.lang.Object... objArr) {
        if (!io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.isArgumentsOfClasses(objArr, com.google.android.gms.ads.AdValue.class, com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.class)) {
            return false;
        }
        com.google.android.gms.ads.AdValue adValue = (com.google.android.gms.ads.AdValue) objArr[0];
        com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd rewardedInterstitialAd = (com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) objArr[1];
        this.f3423a.getClass();
        a(io.appmetrica.analytics.adrevenue.admob.v23.impl.b.a(adValue, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.OTHER, "rewardedInterstitialAd", rewardedInterstitialAd.getResponseInfo(), rewardedInterstitialAd.getAdUnitId()));
        return true;
    }
}
