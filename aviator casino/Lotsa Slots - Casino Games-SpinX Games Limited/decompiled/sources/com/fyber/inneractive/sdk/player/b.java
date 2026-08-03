package com.fyber.inneractive.sdk.player;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.t0 f3864a;
    public com.fyber.inneractive.sdk.player.n b;

    public b(com.fyber.inneractive.sdk.flow.t0 t0Var) {
        this.f3864a = t0Var;
    }

    public final com.fyber.inneractive.sdk.player.a a() {
        com.fyber.inneractive.sdk.measurement.e eVar;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        if (this.b == null) {
            android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
            com.fyber.inneractive.sdk.flow.t0 t0Var2 = this.f3864a;
            com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var2.b;
            com.fyber.inneractive.sdk.config.s0 s0Var = t0Var2.d;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = t0Var2.f3765a;
            if (s0Var != null) {
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
                java.lang.Boolean c = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.L.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c(com.ironsource.mediationsdk.metadata.a.j);
                boolean booleanValue = c != null ? c.booleanValue() : false;
                com.fyber.inneractive.sdk.util.IAlog.a("OMSDK AB %s", java.lang.String.valueOf(booleanValue));
                if (booleanValue && (t0Var = ((com.fyber.inneractive.sdk.config.r0) this.f3864a.d).f) != null && ((unitDisplayType = t0Var.j) == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL || unitDisplayType == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED)) {
                    eVar = iAConfigManager.J;
                    this.b = new com.fyber.inneractive.sdk.player.n(application, gVar, s0Var, inneractiveAdRequest, t0Var2, eVar);
                }
            }
            eVar = null;
            this.b = new com.fyber.inneractive.sdk.player.n(application, gVar, s0Var, inneractiveAdRequest, t0Var2, eVar);
        }
        return this.b;
    }
}
