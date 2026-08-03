package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.p f3695a;
    public final com.fyber.inneractive.sdk.flow.endcard.o b;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a c;
    public final java.lang.String d;

    public b(com.fyber.inneractive.sdk.flow.endcard.o oVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar, java.lang.String str) {
        this.b = oVar;
        this.f3695a = (com.fyber.inneractive.sdk.flow.endcard.p) oVar.f();
        this.c = aVar;
        this.d = str;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        java.lang.String str = (java.lang.String) obj;
        if (str != null && exc == null) {
            com.fyber.inneractive.sdk.util.IAlog.c("%s loaded FMP End-Card icon %s", "IconCallback", this.d);
            com.fyber.inneractive.sdk.flow.endcard.p pVar = this.f3695a;
            pVar.k = str;
            pVar.b(this.c);
            return;
        }
        if (android.text.TextUtils.isEmpty(this.f3695a.k)) {
            com.fyber.inneractive.sdk.flow.endcard.o oVar = this.b;
            com.fyber.inneractive.sdk.util.IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", "IconCallback");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String a2 = com.fyber.inneractive.sdk.util.v.a(exc);
            if (!android.text.TextUtils.isEmpty(a2)) {
                try {
                    jSONObject.put("error", a2);
                } catch (java.lang.Exception unused) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "error", a2);
                }
            }
            java.lang.String n = oVar.n();
            if (!android.text.TextUtils.isEmpty(n)) {
                try {
                    jSONObject.put("version", n);
                } catch (java.lang.Exception unused2) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "version", n);
                }
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            try {
                jSONObject.put("loaded_from_cache", valueOf);
            } catch (java.lang.Exception unused3) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", valueOf);
            }
            com.fyber.inneractive.sdk.flow.x0 x0Var = oVar.c;
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
    }
}
