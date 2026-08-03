package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public class c implements com.ironsource.mediationsdk.demandOnly.i.a {

    /* renamed from: a, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.d> f6417a = new java.util.concurrent.ConcurrentHashMap<>();
    private com.ironsource.P4 b;

    public c(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> list, com.ironsource.U2 u2, java.lang.String str, java.lang.String str2, com.ironsource.P4 p4) {
        java.lang.String d = com.ironsource.mediationsdk.utils.IronSourceUtils.d();
        boolean k = u2.k();
        this.b = p4;
        com.ironsource.mediationsdk.e eVar = new com.ironsource.mediationsdk.e(new com.ironsource.mediationsdk.f(u2.d(), d));
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                com.ironsource.mediationsdk.AbstractAdapter a2 = com.ironsource.mediationsdk.c.b().a(networkSettings, networkSettings.getBannerSettings(), true);
                if (a2 != null) {
                    com.ironsource.mediationsdk.demandOnly.d dVar = new com.ironsource.mediationsdk.demandOnly.d(str, str2, networkSettings, u2.b(), a2, eVar);
                    dVar.a(k);
                    this.f6417a.put(dVar.l(), dVar);
                }
            } else {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.d dVar = this.f6417a.get(str);
        if (dVar != null) {
            dVar.a(iSDemandOnlyBannerLayout);
            return;
        }
        this.b.a(com.ironsource.EnumC3378y5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
        com.ironsource.mediationsdk.logger.IronSourceError buildNonExistentInstanceError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Banner");
        com.ironsource.mediationsdk.logger.IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
        iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str, java.lang.String str2) {
        com.ironsource.mediationsdk.demandOnly.d dVar = this.f6417a.get(str);
        if (dVar == null) {
            this.b.a(com.ironsource.EnumC3378y5.BN_DO_INSTANCE_NOT_FOUND_IN_LOAD, str);
            com.ironsource.mediationsdk.logger.IronSourceError buildNonExistentInstanceError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Banner");
            com.ironsource.mediationsdk.logger.IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.getListener().a(str, buildNonExistentInstanceError);
            return;
        }
        dVar.a(iSDemandOnlyBannerLayout, new com.ironsource.mediationsdk.demandOnly.o.a(com.ironsource.I9.b(com.ironsource.C3127k5.b().c(), str2)));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.a
    public synchronized void a(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.d dVar = this.f6417a.get(str);
        if (dVar == null) {
            this.b.a(com.ironsource.EnumC3378y5.BN_DO_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            com.ironsource.mediationsdk.logger.IronLog.API.error(com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Banner").getErrorMessage());
            return;
        }
        dVar.r();
    }
}
