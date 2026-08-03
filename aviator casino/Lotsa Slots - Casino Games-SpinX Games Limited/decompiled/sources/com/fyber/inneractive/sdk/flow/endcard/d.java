package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.flow.endcard.b {
    public d(int i, com.fyber.inneractive.sdk.flow.x0 x0Var) {
        super(i, x0Var);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(android.view.ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        com.fyber.inneractive.sdk.flow.endcard.f fVar = (com.fyber.inneractive.sdk.flow.endcard.f) f();
        fVar.a(bVar, null);
        android.view.ViewGroup viewGroup2 = fVar.c;
        com.fyber.inneractive.sdk.util.v.a(viewGroup2);
        viewGroup.addView(viewGroup2);
        a(this.e, this.c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.flow.endcard.n c() {
        return new com.fyber.inneractive.sdk.flow.endcard.f(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.player.ui.c d() {
        java.lang.Boolean c;
        com.fyber.inneractive.sdk.config.global.features.v vVar = this.c.g;
        android.view.View b = f().b();
        com.fyber.inneractive.sdk.player.ui.c d = super.d();
        d.e = b;
        d.b = (vVar == null || (c = vVar.c("cta_text_all_caps")) == null || !c.booleanValue()) ? false : true;
        boolean b2 = com.fyber.inneractive.sdk.flow.endcard.b.b(vVar);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.fyber.inneractive.sdk.flow.endcard.b.a(vVar));
        if (b2) {
            d.d = valueOf;
        }
        return d;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        return com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.flow.endcard.l h() {
        return com.fyber.inneractive.sdk.flow.endcard.l.Default;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return com.fyber.inneractive.sdk.model.vast.i.Default_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        return true;
    }

    public final void a(int i, com.fyber.inneractive.sdk.flow.x0 x0Var) {
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_DEFAULT_COMPANION_DISPLAYED;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = x0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.d;
        org.json.JSONArray jSONArray = x0Var.f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = jSONArray;
        wVar.a((java.lang.String) null);
    }
}
