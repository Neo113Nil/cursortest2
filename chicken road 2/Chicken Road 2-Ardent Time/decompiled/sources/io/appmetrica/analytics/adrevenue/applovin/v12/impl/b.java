package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

/* loaded from: classes.dex */
public final class b implements io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.adrevenue.applovin.v12.impl.a f3425a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f3426b;

    public b(io.appmetrica.analytics.adrevenue.applovin.v12.impl.a aVar, io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        this.f3425a = aVar;
        this.f3426b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final java.lang.String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(java.lang.Object... objArr) {
        java.lang.String str;
        if (!io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.isArgumentsOfClasses(objArr, com.applovin.mediation.MaxAd.class, com.applovin.sdk.AppLovinSdk.class)) {
            return false;
        }
        java.lang.Object O2 = i1.AbstractC0189h.O(0, objArr);
        if (O2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        com.applovin.mediation.MaxAd maxAd = (com.applovin.mediation.MaxAd) O2;
        java.lang.Object O3 = i1.AbstractC0189h.O(1, objArr);
        if (O3 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        com.applovin.sdk.AppLovinSdk appLovinSdk = (com.applovin.sdk.AppLovinSdk) O3;
        this.f3425a.getClass();
        com.applovin.mediation.MaxAdFormat format = maxAd.getFormat();
        io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType moduleAdType = format == null ? null : kotlin.jvm.internal.i.a(format, com.applovin.mediation.MaxAdFormat.NATIVE) ? io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.NATIVE : kotlin.jvm.internal.i.a(format, com.applovin.mediation.MaxAdFormat.BANNER) ? io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.BANNER : kotlin.jvm.internal.i.a(format, com.applovin.mediation.MaxAdFormat.REWARDED) ? io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.REWARDED : kotlin.jvm.internal.i.a(format, com.applovin.mediation.MaxAdFormat.INTERSTITIAL) ? io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.INTERSTITIAL : kotlin.jvm.internal.i.a(format, com.applovin.mediation.MaxAdFormat.MREC) ? io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.MREC : io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.OTHER;
        h1.C0172d D2 = u0.AbstractC0995a.D("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        h1.C0172d D3 = u0.AbstractC0995a.D(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        com.applovin.mediation.MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (str = format2.getLabel()) == null) {
            str = "null";
        }
        this.f3426b.getInternalClientModuleFacade().reportAdRevenue(new io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue(java.math.BigDecimal.valueOf(io.appmetrica.analytics.coreutils.internal.WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE)), java.util.Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), i1.AbstractC0202u.G(D2, D3, u0.AbstractC0995a.D(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str), u0.AbstractC0995a.D(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, "applovin")), false, 32, null));
        io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + java.util.Arrays.toString(objArr) + " was reported", new java.lang.Object[0]);
        return true;
    }
}
