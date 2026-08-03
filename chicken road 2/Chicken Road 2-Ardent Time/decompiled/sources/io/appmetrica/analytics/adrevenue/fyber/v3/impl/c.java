package io.appmetrica.analytics.adrevenue.fyber.v3.impl;

/* loaded from: classes.dex */
public final class c implements io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.adrevenue.fyber.v3.impl.b f3429a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f3430b;

    public c(io.appmetrica.analytics.adrevenue.fyber.v3.impl.b bVar, io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        this.f3429a = bVar;
        this.f3430b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final java.lang.String getDescription() {
        return "Fyber";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(java.lang.Object... objArr) {
        io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType moduleAdType;
        if (!io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.isArgumentsOfClasses(objArr, com.fyber.fairbid.ads.ImpressionData.class)) {
            return false;
        }
        com.fyber.fairbid.ads.ImpressionData impressionData = (com.fyber.fairbid.ads.ImpressionData) objArr[0];
        io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade internalClientModuleFacade = this.f3430b.getInternalClientModuleFacade();
        this.f3429a.getClass();
        com.fyber.fairbid.ads.PlacementType placementType = impressionData.getPlacementType();
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(io.appmetrica.analytics.coreutils.internal.WrapUtils.getFiniteDoubleOrDefault(impressionData.getNetPayout(), com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE));
        java.util.Currency currency = java.util.Currency.getInstance(impressionData.getCurrency());
        if (placementType == null) {
            moduleAdType = null;
        } else {
            int i2 = io.appmetrica.analytics.adrevenue.fyber.v3.impl.a.f3428a[placementType.ordinal()];
            moduleAdType = i2 != 1 ? i2 != 2 ? i2 != 3 ? io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.OTHER : io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.INTERSTITIAL : io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.REWARDED : io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.BANNER;
        }
        io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType moduleAdType2 = moduleAdType;
        java.lang.String demandSource = impressionData.getDemandSource();
        java.lang.String creativeId = impressionData.getCreativeId();
        java.lang.String obj = impressionData.getPriceAccuracy().toString();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, "fyber");
        hashMap.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-fyber-v3");
        hashMap.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, placementType == null ? "null" : placementType.name());
        internalClientModuleFacade.reportAdRevenue(new io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue(valueOf, currency, moduleAdType2, demandSource, creativeId, null, null, null, obj, hashMap, false));
        io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from Fyber was reported", new java.lang.Object[0]);
        return true;
    }
}
