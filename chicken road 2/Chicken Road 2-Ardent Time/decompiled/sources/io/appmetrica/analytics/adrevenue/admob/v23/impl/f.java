package io.appmetrica.analytics.adrevenue.admob.v23.impl;

/* loaded from: classes.dex */
public final class f extends io.appmetrica.analytics.adrevenue.admob.v23.impl.e {
    public f(io.appmetrica.analytics.adrevenue.admob.v23.impl.b bVar, io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        super(bVar, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(java.lang.Object... objArr) {
        if (!io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.isArgumentsOfClasses(objArr, com.google.android.gms.ads.AdValue.class, com.google.android.gms.ads.interstitial.InterstitialAd.class)) {
            return false;
        }
        com.google.android.gms.ads.AdValue adValue = (com.google.android.gms.ads.AdValue) objArr[0];
        com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = (com.google.android.gms.ads.interstitial.InterstitialAd) objArr[1];
        this.f3423a.getClass();
        a(io.appmetrica.analytics.adrevenue.admob.v23.impl.b.a(adValue, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.INTERSTITIAL, "interstitialAd", interstitialAd.getResponseInfo(), interstitialAd.getAdUnitId()));
        return true;
    }
}
