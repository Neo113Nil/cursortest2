package com.fyber.inneractive.sdk.flow.endcard;

/* loaded from: classes3.dex */
public final class o extends com.fyber.inneractive.sdk.flow.endcard.b {
    public final java.lang.String g;
    public com.fyber.inneractive.sdk.web.a h;

    public o(com.fyber.inneractive.sdk.flow.x0 x0Var, java.lang.String str, int i) {
        super(i, x0Var);
        this.h = new com.fyber.inneractive.sdk.web.a(null, 0);
        this.g = str;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(android.view.ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        com.fyber.inneractive.sdk.flow.endcard.p pVar = (com.fyber.inneractive.sdk.flow.endcard.p) f();
        android.view.View b = pVar.b();
        if (b != null) {
            com.fyber.inneractive.sdk.util.v.a(b);
            viewGroup.addView(b);
            com.fyber.inneractive.sdk.web.i1 i1Var = pVar.e().f3879a;
            if (i1Var != null) {
                i1Var.a(true);
            }
        }
        a(this.e, this.c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.flow.endcard.n c() {
        return new com.fyber.inneractive.sdk.flow.endcard.p(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.player.ui.c d() {
        android.view.View b = f().b();
        com.fyber.inneractive.sdk.player.ui.c d = super.d();
        d.e = b;
        return d;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        com.fyber.inneractive.sdk.web.a aVar = this.h;
        com.fyber.inneractive.sdk.util.g gVar = com.fyber.inneractive.sdk.util.g.FMP_ENDCARD;
        gVar.a(aVar.f4323a);
        gVar.a(aVar.b);
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.flow.endcard.l h() {
        return com.fyber.inneractive.sdk.flow.endcard.l.Fmp;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean j() {
        return this.e > 1;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        com.fyber.inneractive.sdk.flow.endcard.p pVar = (com.fyber.inneractive.sdk.flow.endcard.p) f();
        return pVar.f && pVar.b() != null;
    }

    public final java.lang.String n() {
        com.fyber.inneractive.sdk.flow.endcard.q qVar;
        com.fyber.inneractive.sdk.web.b bVar = (com.fyber.inneractive.sdk.web.b) ((com.fyber.inneractive.sdk.flow.endcard.p) f()).e().f3879a;
        if (bVar == null || (qVar = bVar.N) == null) {
            return null;
        }
        return qVar.c;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (inneractiveInfrastructureError.isErrorAlreadyReported(com.fyber.inneractive.sdk.network.t.FMP_COMPANION_FAILED_LOADING)) {
            return;
        }
        java.lang.Throwable cause = inneractiveInfrastructureError.getCause();
        com.fyber.inneractive.sdk.util.IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", this.f3683a);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String a2 = com.fyber.inneractive.sdk.util.v.a(cause);
        if (!android.text.TextUtils.isEmpty(a2)) {
            try {
                jSONObject.put("error", a2);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "error", a2);
            }
        }
        java.lang.String n = n();
        if (!android.text.TextUtils.isEmpty(n)) {
            try {
                jSONObject.put("version", n);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "version", n);
            }
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        try {
            jSONObject.put("loaded_from_cache", bool);
        } catch (java.lang.Exception unused3) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", bool);
        }
        com.fyber.inneractive.sdk.flow.x0 x0Var = this.c;
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.FMP_COMPANION_FAILED_LOADING;
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

    public final void a(int i, com.fyber.inneractive.sdk.flow.x0 x0Var) {
        java.lang.String n = n();
        this.h = new com.fyber.inneractive.sdk.web.a(n, i);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (!android.text.TextUtils.isEmpty(n)) {
            try {
                jSONObject.put("version", n);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "version", n);
            }
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((com.fyber.inneractive.sdk.flow.endcard.p) f()).l);
        try {
            jSONObject.put("loaded_from_cache", valueOf);
        } catch (java.lang.Exception unused2) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", valueOf);
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FMP_COMPANION_SUCCESSFULLY_SHOWN;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = x0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.d;
        org.json.JSONArray jSONArray = x0Var.f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = jSONArray;
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }
}
