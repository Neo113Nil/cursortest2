package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public class f implements com.ironsource.mediationsdk.demandOnly.i.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.P4 f6421a;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.g> b;
    private final com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> c;

    public f(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> list, com.ironsource.D9 d9, com.ironsource.mediationsdk.c cVar, com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> w7, java.lang.String str, java.lang.String str2, com.ironsource.P4 p4) {
        java.lang.String d = com.ironsource.mediationsdk.utils.IronSourceUtils.d();
        boolean j = d9.j();
        com.ironsource.mediationsdk.f fVar = new com.ironsource.mediationsdk.f(d9.g(), d);
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
        this.f6421a = p4;
        this.c = w7;
        for (com.ironsource.mediationsdk.model.NetworkSettings networkSettings : list) {
            if (networkSettings.isIronSource()) {
                com.ironsource.mediationsdk.AbstractAdapter a2 = cVar.a(networkSettings, networkSettings.getInterstitialSettings(), true);
                if (a2 != null) {
                    com.ironsource.mediationsdk.demandOnly.g gVar = new com.ironsource.mediationsdk.demandOnly.g(str, str2, networkSettings, this.c.a(networkSettings.getSubProviderId()), d9.e(), a2, new com.ironsource.mediationsdk.e(fVar));
                    gVar.a(j);
                    this.b.put(networkSettings.getSubProviderId(), gVar);
                }
            } else {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("cannot load " + networkSettings.getProviderTypeForReflection());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(com.ironsource.mediationsdk.demandOnly.h.d dVar) {
        java.lang.String e = dVar.e();
        java.lang.String b = dVar.b();
        try {
            com.ironsource.mediationsdk.demandOnly.g gVar = this.b.get(e);
            if (gVar == null) {
                this.f6421a.a(com.ironsource.EnumC3378y5.IS_DO_INSTANCE_NOT_FOUND_IN_LOAD, e);
                com.ironsource.mediationsdk.logger.IronSourceError buildNonExistentInstanceError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                com.ironsource.mediationsdk.logger.IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.c.a(e).onInterstitialAdLoadFailed(e, buildNonExistentInstanceError);
                return;
            }
            if (android.text.TextUtils.isEmpty(b)) {
                gVar.b();
            } else {
                gVar.a(new com.ironsource.mediationsdk.demandOnly.o.a(com.ironsource.I9.b(com.ironsource.C3127k5.b().c(), b)));
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronSourceError buildLoadFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e2.getMessage());
            com.ironsource.mediationsdk.logger.IronLog.API.error(buildLoadFailedError.getErrorMessage());
            this.c.a(e).onInterstitialAdLoadFailed(e, buildLoadFailedError);
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public boolean b(java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.g gVar = this.b.get(str);
        if (gVar != null) {
            return gVar.a();
        }
        this.f6421a.a(com.ironsource.EnumC3378y5.IS_DO_INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK, str);
        return false;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.i.b
    public void a(java.lang.String str) {
        try {
            com.ironsource.mediationsdk.demandOnly.g gVar = this.b.get(str);
            if (gVar == null) {
                this.f6421a.a(com.ironsource.EnumC3378y5.IS_DO_INSTANCE_NOT_FOUND_IN_SHOW, str);
                com.ironsource.mediationsdk.logger.IronSourceError buildNonExistentInstanceError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNonExistentInstanceError("Interstitial");
                com.ironsource.mediationsdk.logger.IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
                this.c.a(str).onInterstitialAdShowFailed(str, buildNonExistentInstanceError);
                return;
            }
            gVar.e();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronSourceError buildShowFailedError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildShowFailedError("Interstitial", "showInterstitial exception " + e.getMessage());
            com.ironsource.mediationsdk.logger.IronLog.API.error(buildShowFailedError.getErrorMessage());
            this.c.a(str).onInterstitialAdShowFailed(str, buildShowFailedError);
        }
    }

    public java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.g> a() {
        return this.b;
    }
}
