package com.fyber.inneractive.sdk.renderers;

/* loaded from: classes3.dex */
public final class z extends com.fyber.inneractive.sdk.renderers.a {
    public z(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.f0
    public final java.lang.String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.ui.m a(android.content.Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.b == null) {
            this.b = new com.fyber.inneractive.sdk.player.ui.t(context, new com.fyber.inneractive.sdk.player.ui.h(), rVar);
        }
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.a, com.fyber.inneractive.sdk.renderers.f0
    public final com.fyber.inneractive.sdk.player.controller.b a(com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot, com.fyber.inneractive.sdk.flow.t0 t0Var) {
        com.fyber.inneractive.sdk.player.controller.z zVar = this.f4237a;
        if (zVar != null) {
            return zVar;
        }
        this.f4237a = new com.fyber.inneractive.sdk.player.controller.c0(this.c, (com.fyber.inneractive.sdk.player.ui.t) this.b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().b.m), t0Var.c);
        return super.a(inneractiveAdSpot, t0Var);
    }
}
