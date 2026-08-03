package io.appmetrica.analytics.adrevenue.admob.v23.impl;

/* loaded from: classes.dex */
public final class c extends io.appmetrica.analytics.adrevenue.admob.v23.impl.e {
    public c(io.appmetrica.analytics.adrevenue.admob.v23.impl.b bVar, io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        super(bVar, clientContext);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(java.lang.Object... objArr) {
        if (!io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.isArgumentsOfClasses(objArr, com.google.android.gms.ads.AdValue.class, com.google.android.gms.ads.appopen.AppOpenAd.class)) {
            return false;
        }
        com.google.android.gms.ads.AdValue adValue = (com.google.android.gms.ads.AdValue) objArr[0];
        com.google.android.gms.ads.appopen.AppOpenAd appOpenAd = (com.google.android.gms.ads.appopen.AppOpenAd) objArr[1];
        this.f3423a.getClass();
        a(io.appmetrica.analytics.adrevenue.admob.v23.impl.b.a(adValue, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.APP_OPEN, "appOpenAd", appOpenAd.getResponseInfo(), appOpenAd.getAdUnitId()));
        return true;
    }
}
