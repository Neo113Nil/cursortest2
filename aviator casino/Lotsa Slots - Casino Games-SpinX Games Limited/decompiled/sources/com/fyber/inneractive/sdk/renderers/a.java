package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public class a extends com.fyber.inneractive.sdk.renderers.f0 {
    public a(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final void b() {
        this.c.getClass();
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public com.fyber.inneractive.sdk.player.ui.m a(android.content.Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.player.ui.s sVar = this.b;
        return sVar == null ? new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.h(), this.c, rVar, a()) : sVar;
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public com.fyber.inneractive.sdk.player.controller.b a(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.flow.t0 t0Var) {
        if (this.f4237a == null) {
            java.lang.Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f4237a = new com.fyber.inneractive.sdk.player.controller.s(this.c, (com.fyber.inneractive.sdk.player.ui.o) this.b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().b.m), t0Var.c, selectedUnitController instanceof com.fyber.inneractive.sdk.flow.u0 ? ((com.fyber.inneractive.sdk.flow.u0) selectedUnitController).isOverlayOutside() : false, a());
        }
        return this.f4237a;
    }
}
