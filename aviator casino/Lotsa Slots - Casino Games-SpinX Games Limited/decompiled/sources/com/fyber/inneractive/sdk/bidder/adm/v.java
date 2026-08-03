package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public final class v implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.c0 f3539a;
    public final /* synthetic */ com.fyber.inneractive.sdk.response.e b;
    public final /* synthetic */ com.fyber.inneractive.sdk.bidder.adm.y c;

    public v(com.fyber.inneractive.sdk.bidder.adm.y yVar, com.fyber.inneractive.sdk.flow.c0 c0Var, com.fyber.inneractive.sdk.response.e eVar) {
        this.c = yVar;
        this.f3539a = c0Var;
        this.b = eVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        com.fyber.inneractive.sdk.response.e eVar = (com.fyber.inneractive.sdk.response.e) obj;
        if (eVar == null || exc != null) {
            java.lang.String message = exc != null ? exc.getMessage() : "empty";
            com.fyber.inneractive.sdk.metrics.i b = com.fyber.inneractive.sdk.metrics.d.d.b(this.c.d);
            b.f3797a.put(new com.fyber.inneractive.sdk.metrics.h(message), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b.c));
            if (this.f3539a != null) {
                java.lang.Exception exc2 = exc != null ? exc : new java.lang.Exception("adm markup network result is empty");
                com.fyber.inneractive.sdk.flow.c0 c0Var = this.f3539a;
                this.c.getClass();
                c0Var.a(exc2, (exc == null || !(exc.getCause() instanceof com.fyber.inneractive.sdk.response.nativead.a)) ? ((exc instanceof com.fyber.inneractive.sdk.network.k1) && ((com.fyber.inneractive.sdk.network.k1) exc).f3844a == 404) ? com.fyber.inneractive.sdk.external.InneractiveErrorCode.NO_FILL : com.fyber.inneractive.sdk.external.InneractiveErrorCode.CONNECTION_ERROR : com.fyber.inneractive.sdk.external.InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, this.b);
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.d;
        com.fyber.inneractive.sdk.metrics.i b2 = dVar.b(this.c.d);
        b2.f3797a.put(new com.fyber.inneractive.sdk.metrics.h("success"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b2.c));
        com.fyber.inneractive.sdk.flow.c0 c0Var2 = this.f3539a;
        if (c0Var2 != null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s : InneractiveAdSpotImpl data available", com.fyber.inneractive.sdk.flow.h0.a(c0Var2.d));
            com.fyber.inneractive.sdk.flow.h0 h0Var = c0Var2.d;
            com.fyber.inneractive.sdk.config.global.r rVar = c0Var2.b;
            com.fyber.inneractive.sdk.flow.e0 e0Var = h0Var.d;
            if (h0Var.n.get()) {
                com.fyber.inneractive.sdk.util.IAlog.a("%s: loadAdWithRetries: spot is already destroyed won't continue", com.fyber.inneractive.sdk.util.IAlog.a(h0Var));
                h0Var.a(h0Var.e);
                return;
            }
            com.fyber.inneractive.sdk.flow.p pVar = h0Var.l;
            if (pVar != null) {
                pVar.b = e0Var;
                dVar.b(h0Var.f3703a).d = java.lang.System.currentTimeMillis();
                pVar.g = eVar;
                if (!com.fyber.inneractive.sdk.config.IAConfigManager.d()) {
                    com.fyber.inneractive.sdk.config.IAConfigManager.addListener(pVar);
                    com.fyber.inneractive.sdk.config.IAConfigManager.a();
                } else {
                    pVar.c = rVar;
                    com.fyber.inneractive.sdk.network.p pVar2 = new com.fyber.inneractive.sdk.network.p(rVar, eVar, h0Var.f3703a, pVar);
                    pVar.d = pVar2;
                    pVar2.c();
                }
            }
        }
    }
}
