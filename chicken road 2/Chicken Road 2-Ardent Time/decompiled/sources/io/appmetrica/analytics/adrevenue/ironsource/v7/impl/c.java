package io.appmetrica.analytics.adrevenue.ironsource.v7.impl;

/* loaded from: classes.dex */
public final class c implements com.ironsource.mediationsdk.impressionData.ImpressionDataListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f3431a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.adrevenue.ironsource.v7.impl.b f3432b = new io.appmetrica.analytics.adrevenue.ironsource.v7.impl.b();

    public c(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        this.f3431a = clientContext;
    }

    public final void onImpressionSuccess(com.ironsource.mediationsdk.impressionData.ImpressionData impressionData) {
        io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType moduleAdType;
        if (impressionData != null) {
            io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade internalClientModuleFacade = this.f3431a.getInternalClientModuleFacade();
            this.f3432b.getClass();
            java.lang.String adUnit = impressionData.getAdUnit();
            java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(io.appmetrica.analytics.coreutils.internal.WrapUtils.getFiniteDoubleOrDefault(impressionData.getRevenue().doubleValue(), com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE));
            java.util.Currency currency = java.util.Currency.getInstance("USD");
            if (adUnit != null) {
                switch (adUnit) {
                    case "Rewarded Video":
                        moduleAdType = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.REWARDED;
                        break;
                    case "Interstitial":
                        moduleAdType = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.INTERSTITIAL;
                        break;
                    case "Banner":
                        moduleAdType = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.BANNER;
                        break;
                    default:
                        moduleAdType = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue(valueOf, currency, moduleAdType, impressionData.getAdNetwork(), null, null, null, impressionData.getPlacement(), impressionData.getPrecision(), new io.appmetrica.analytics.adrevenue.ironsource.v7.impl.a(adUnit), true));
        }
    }
}
