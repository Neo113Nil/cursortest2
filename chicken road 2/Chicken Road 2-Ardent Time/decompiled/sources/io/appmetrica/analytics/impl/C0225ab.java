package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225ab implements io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Oc f5473a = new io.appmetrica.analytics.impl.Oc();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade
    public final void reportAdRevenue(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue moduleAdRevenue) {
        io.appmetrica.analytics.AdType adType;
        io.appmetrica.analytics.impl.Oc oc = this.f5473a;
        oc.getClass();
        io.appmetrica.analytics.AdRevenue.Builder newBuilder = io.appmetrica.analytics.AdRevenue.newBuilder(moduleAdRevenue.getAdRevenue(), moduleAdRevenue.getCurrency());
        io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType adType2 = moduleAdRevenue.getAdType();
        io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType.values();
        switch (adType2 == null ? -1 : io.appmetrica.analytics.impl.Nc.f4730a[adType2.ordinal()]) {
            case -1:
                adType = null;
                break;
            case 0:
            default:
                throw new E1.A();
            case 1:
                adType = io.appmetrica.analytics.AdType.NATIVE;
                break;
            case 2:
                adType = io.appmetrica.analytics.AdType.BANNER;
                break;
            case 3:
                adType = io.appmetrica.analytics.AdType.REWARDED;
                break;
            case 4:
                adType = io.appmetrica.analytics.AdType.INTERSTITIAL;
                break;
            case 5:
                adType = io.appmetrica.analytics.AdType.MREC;
                break;
            case 6:
                adType = io.appmetrica.analytics.AdType.APP_OPEN;
                break;
            case 7:
                adType = io.appmetrica.analytics.AdType.OTHER;
                break;
        }
        io.appmetrica.analytics.AdRevenue.Builder withPrecision = newBuilder.withAdType(adType).withAdNetwork(moduleAdRevenue.getAdNetwork()).withAdUnitId(moduleAdRevenue.getAdUnitId()).withAdUnitName(moduleAdRevenue.getAdUnitName()).withAdPlacementId(moduleAdRevenue.getAdPlacementId()).withAdPlacementName(moduleAdRevenue.getAdPlacementName()).withPrecision(moduleAdRevenue.getPrecision());
        java.util.Map<java.lang.String, java.lang.String> payload = moduleAdRevenue.getPayload();
        java.util.LinkedHashMap L2 = payload != null ? i1.AbstractC0202u.L(payload) : new java.util.LinkedHashMap();
        oc.f4768a.getClass();
        L2.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.LAYER_KEY, "native");
        io.appmetrica.analytics.ModulesFacade.reportAdRevenue(withPrecision.withPayload(L2).build(), java.lang.Boolean.valueOf(moduleAdRevenue.getAutoCollected()));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade
    public final void reportEvent(io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent internalModuleEvent) {
        io.appmetrica.analytics.ModuleEvent.Builder withValue = io.appmetrica.analytics.ModuleEvent.newBuilder(internalModuleEvent.getType()).withName(internalModuleEvent.getName()).withValue(internalModuleEvent.getValue());
        java.lang.Integer serviceDataReporterType = internalModuleEvent.getServiceDataReporterType();
        if (serviceDataReporterType != null) {
            withValue.withServiceDataReporterType(serviceDataReporterType.intValue());
        }
        io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent.Category category = internalModuleEvent.getCategory();
        if (category != null) {
            int i2 = io.appmetrica.analytics.impl.Za.f5402a[category.ordinal()];
            io.appmetrica.analytics.ModuleEvent.Category category2 = i2 != 1 ? i2 != 2 ? null : io.appmetrica.analytics.ModuleEvent.Category.GENERAL : io.appmetrica.analytics.ModuleEvent.Category.SYSTEM;
            if (category2 != null) {
                withValue.withCategory(category2);
            }
        }
        io.appmetrica.analytics.ModulesFacade.reportEvent(withValue.withExtras(internalModuleEvent.getExtras()).withAttributes(internalModuleEvent.getAttributes()).withEnvironment(internalModuleEvent.getEnvironment()).build());
    }
}
