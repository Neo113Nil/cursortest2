package io.appmetrica.analytics.adrevenue.ironsource.v9.impl;

/* loaded from: classes.dex */
public final class c implements com.unity3d.mediation.impression.LevelPlayImpressionDataListener {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.client.ClientContext f3436a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.adrevenue.ironsource.v9.impl.b f3437b = new io.appmetrica.analytics.adrevenue.ironsource.v9.impl.b();

    public c(io.appmetrica.analytics.modulesapi.internal.client.ClientContext clientContext) {
        this.f3436a = clientContext;
    }

    public final void onImpressionSuccess(com.unity3d.mediation.impression.LevelPlayImpressionData levelPlayImpressionData) {
        io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType moduleAdType;
        if (levelPlayImpressionData != null) {
            io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade internalClientModuleFacade = this.f3436a.getInternalClientModuleFacade();
            this.f3437b.getClass();
            java.lang.String adFormat = levelPlayImpressionData.getAdFormat();
            java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(io.appmetrica.analytics.coreutils.internal.WrapUtils.getFiniteDoubleOrDefaultNullable(levelPlayImpressionData.getRevenue(), com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE));
            java.util.Currency currency = java.util.Currency.getInstance("USD");
            if (adFormat != null) {
                switch (adFormat) {
                    case "banner":
                        moduleAdType = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.BANNER;
                        break;
                    case "rewarded_video":
                        moduleAdType = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.REWARDED;
                        break;
                    case "interstitial":
                        moduleAdType = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.INTERSTITIAL;
                        break;
                    default:
                        moduleAdType = io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.OTHER;
                        break;
                }
            } else {
                moduleAdType = null;
            }
            internalClientModuleFacade.reportAdRevenue(new io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue(valueOf, currency, moduleAdType, levelPlayImpressionData.getAdNetwork(), levelPlayImpressionData.getMediationAdUnitId(), levelPlayImpressionData.getMediationAdUnitName(), null, levelPlayImpressionData.getPlacement(), levelPlayImpressionData.getPrecision(), new io.appmetrica.analytics.adrevenue.ironsource.v9.impl.a(adFormat), true));
        }
    }
}
