package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class f extends com.fyber.inneractive.sdk.renderers.f0 {
    public f(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.ui.m a(android.content.Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.b == null) {
            this.b = new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.f(), this.c, rVar, a());
        }
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void b() {
        this.c.getClass();
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.controller.b a(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.flow.t0 t0Var) {
        if (this.f4237a == null) {
            java.lang.Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f4237a = new com.fyber.inneractive.sdk.player.controller.g(this.c, this.b, inneractiveAdSpot.getAdContent().d, t0Var.c, selectedUnitController instanceof com.fyber.inneractive.sdk.flow.u0 ? ((com.fyber.inneractive.sdk.flow.u0) selectedUnitController).isOverlayOutside() : false, com.fyber.inneractive.sdk.config.IAConfigManager.N.k || t0Var.f, a());
        }
        return this.f4237a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
        this.c.getClass();
        eVar.a();
    }
}
