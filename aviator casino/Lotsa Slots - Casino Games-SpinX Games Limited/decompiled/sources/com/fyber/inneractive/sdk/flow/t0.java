package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class t0 extends com.fyber.inneractive.sdk.flow.w {
    public com.fyber.inneractive.sdk.player.t i;
    public boolean j;

    public t0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        super(s0Var, rVar);
        this.j = false;
        this.b = gVar;
        this.f3765a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean b() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.d;
        if (s0Var == null || (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f) == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", com.fyber.inneractive.sdk.util.IAlog.a(this), this.d);
            return false;
        }
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType = t0Var.j;
        return com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED.equals(unitDisplayType) || com.fyber.inneractive.sdk.config.enums.UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean d() {
        return this.i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.player.n nVar;
        if (this.g != null && b()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.g;
            v0Var.y = true;
            v0Var.D = false;
            v0Var.b.h.remove(v0Var);
            v0Var.i = null;
            com.fyber.inneractive.sdk.util.IAlog.a("destroy internalStoreWebpageController", new java.lang.Object[0]);
            this.g = null;
        }
        com.fyber.inneractive.sdk.player.t tVar = this.i;
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.b bVar = tVar.f4159a;
            if (bVar != null && (nVar = bVar.b) != null) {
                nVar.i = true;
                com.fyber.inneractive.sdk.util.IAlog.a("IAMediaPlayerFlowManager: destroy", new java.lang.Object[0]);
                nVar.a();
                com.fyber.inneractive.sdk.flow.endcard.b a2 = nVar.t.b.a();
                if (a2 != null) {
                    a2.destroy();
                }
                if (nVar.f4138a != null) {
                    com.fyber.inneractive.sdk.util.IAlog.a("%s : destroy() : playerController being destroyed", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE);
                    nVar.f4138a.a();
                    nVar.f4138a = null;
                }
                nVar.l = null;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.t;
                if (kVar != null) {
                    com.fyber.inneractive.sdk.flow.endcard.m mVar = kVar.b;
                    java.util.Iterator it = mVar.f3697a.iterator();
                    while (it.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.endcard.b) it.next()).destroy();
                    }
                    mVar.f3697a.clear();
                    mVar.b.clear();
                    mVar.c = -1;
                }
                com.fyber.inneractive.sdk.player.ui.remote.g gVar = nVar.u;
                if (gVar != null) {
                    gVar.f4174a.a();
                }
                com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = nVar.v;
                if (bVar2 != null) {
                    bVar2.f3732a.a();
                    bVar2.a();
                    bVar2.e = null;
                    bVar2.h.clear();
                }
            }
            this.i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return true;
    }
}
