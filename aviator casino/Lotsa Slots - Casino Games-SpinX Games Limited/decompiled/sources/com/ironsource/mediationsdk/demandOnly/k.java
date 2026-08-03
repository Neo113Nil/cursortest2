package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public class k implements com.ironsource.mediationsdk.demandOnly.i.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.P4 f6427a;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.l> b;
    private final com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> c;

    public k(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> list, com.ironsource.C3029ee c3029ee, com.ironsource.mediationsdk.c cVar, com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> w7, java.lang.String str, java.lang.String str2, com.ironsource.P4 p4) {
        java.lang.String d = com.ironsource.mediationsdk.utils.IronSourceUtils.d();
        boolean d2 = c3029ee.d();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(c3029ee.k(), d);
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
        this.f6427a = p4;
        this.c = w7;
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                com.ironsource.mediationsdk.AbstractAdapter a2 = cVar.a(networkSettings, networkSettings.getRewardedVideoSettings(), true);
                if (a2 != null) {
                    com.ironsource.mediationsdk.demandOnly.l lVar = new com.ironsource.mediationsdk.demandOnly.l(str, str2, networkSettings, this.c.a(networkSettings.getSubProviderId()), c3029ee.i(), a2, new com.ironsource.mediationsdk.e(fVar));
                    lVar.a(d2);
                    this.b.put(networkSettings.getSubProviderId(), lVar);
                }
            } else {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void a(com.ironsource.mediationsdk.demandOnly.h.d dVar) {
        java.lang.String e = dVar.e();
        try {
            com.ironsource.mediationsdk.demandOnly.l lVar = this.b.get(e);
            if (lVar == null) {
                this.f6427a.a(com.ironsource.EnumC3378y5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_LOAD, e);
                com.ironsource.mediationsdk.logger.IronSourceError buildNonExistentInstanceError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                com.ironsource.mediationsdk.logger.IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.c.a(e).onRewardedVideoAdLoadFailed(e, buildNonExistentInstanceError);
                return;
            }
            if (dVar.c()) {
                lVar.b(new com.ironsource.mediationsdk.demandOnly.o.a(com.ironsource.I9.b(com.ironsource.C3127k5.b().c(), dVar.b())));
            } else {
                lVar.c();
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadRewardedVideo exception " + e2.getMessage());
            com.ironsource.mediationsdk.logger.IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.c.a(e).onRewardedVideoAdLoadFailed(e, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public void b(java.lang.String str) {
        try {
            com.ironsource.mediationsdk.demandOnly.l lVar = this.b.get(str);
            if (lVar != null) {
                lVar.d();
                return;
            }
            this.f6427a.a(com.ironsource.EnumC3378y5.RV_DO_BUSINESS_INSTANCE_NOT_FOUND_IN_SHOW, str);
            com.ironsource.mediationsdk.logger.IronSourceError buildNonExistentInstanceError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError(com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
            com.ironsource.mediationsdk.logger.IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            this.c.a(str).onRewardedVideoAdShowFailed(str, buildNonExistentInstanceError);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceError buildShowFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildShowFailedError(com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "showRewardedVideo exception " + e.getMessage());
            com.ironsource.mediationsdk.logger.IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.c.a(str).onRewardedVideoAdShowFailed(str, buildShowFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.c
    public boolean a(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.l lVar = this.b.get(str);
        if (lVar == null) {
            this.f6427a.a(com.ironsource.EnumC3378y5.RV_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
            return false;
        }
        return lVar.a();
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.l> a() {
        return this.b;
    }
}
