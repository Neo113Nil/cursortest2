package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public abstract class c extends com.fyber.inneractive.sdk.flow.endcard.b implements com.fyber.inneractive.sdk.response.i {
    public final com.fyber.inneractive.sdk.model.vast.c g;

    public c(com.fyber.inneractive.sdk.flow.x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i) {
        super(i, x0Var);
        this.g = cVar;
    }

    public final void a(com.fyber.inneractive.sdk.network.u uVar, com.fyber.inneractive.sdk.flow.x0 x0Var) {
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = x0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.d;
        org.json.JSONArray jSONArray = x0Var.f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = jSONArray;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject a2 = this.g.a();
        try {
            jSONObject.put("companion_data", a2);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", a2);
        }
        org.json.JSONArray jSONArray2 = this.b;
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            org.json.JSONArray jSONArray3 = this.b;
            try {
                jSONObject.put("plbl_det", jSONArray3);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "plbl_det", jSONArray3);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
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
    public final void e() {
        a();
        android.view.View b = f().b();
        if (b != null) {
            b.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        return com.fyber.inneractive.sdk.util.g.VAST_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.flow.endcard.l h() {
        return com.fyber.inneractive.sdk.flow.endcard.l.Companion;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return this.g.f3800a;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public boolean l() {
        return f().b() != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void m() {
        super.m();
        a(com.fyber.inneractive.sdk.network.u.VAST_COMPANION_LOADED, this.c);
    }

    public final void a(int i, com.fyber.inneractive.sdk.flow.x0 x0Var) {
        com.fyber.inneractive.sdk.player.n.a(this, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
        a(com.fyber.inneractive.sdk.network.u.VAST_COMPANION_DISPLAYED, x0Var);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.f3683a);
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.VAST_COMPANION_FAILED_LOADING;
        if (inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject a2 = this.g.a();
        try {
            jSONObject.put("companion_data", a2);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", a2);
        }
        java.lang.Throwable cause = inneractiveInfrastructureError.getCause();
        java.lang.String description = inneractiveInfrastructureError.description();
        if (android.text.TextUtils.isEmpty(description)) {
            description = com.fyber.inneractive.sdk.util.v.a(cause);
        }
        if (!android.text.TextUtils.isEmpty(description)) {
            try {
                jSONObject.put("reason", inneractiveInfrastructureError);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "reason", inneractiveInfrastructureError);
            }
        }
        com.fyber.inneractive.sdk.flow.x0 x0Var = this.c;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = x0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.d;
        org.json.JSONArray jSONArray = x0Var.f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.b = tVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = jSONArray;
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(android.view.ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        android.view.View b = f().b();
        if (b != null) {
            ((com.fyber.inneractive.sdk.flow.endcard.a) f()).c();
            com.fyber.inneractive.sdk.util.v.a(b);
            viewGroup.addView(b);
            b.requestFocus();
            a(this.e, this.c);
        }
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final java.util.List a(com.fyber.inneractive.sdk.model.vast.x xVar) {
        return this.g.a(xVar);
    }
}
