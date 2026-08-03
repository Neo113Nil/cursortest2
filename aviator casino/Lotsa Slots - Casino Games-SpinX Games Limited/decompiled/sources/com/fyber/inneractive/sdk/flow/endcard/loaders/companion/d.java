package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.network.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.w f3693a;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a b;
    public final com.fyber.inneractive.sdk.flow.endcard.v c;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.endcard.loaders.companion.e d;

    public d(com.fyber.inneractive.sdk.flow.endcard.loaders.companion.e eVar, com.fyber.inneractive.sdk.flow.endcard.v vVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.d = eVar;
        this.c = vVar;
        this.f3693a = (com.fyber.inneractive.sdk.flow.endcard.w) vVar.f();
        this.b = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(java.lang.Object obj, java.lang.Exception exc, boolean z) {
        boolean equalsIgnoreCase;
        android.graphics.Bitmap bitmap;
        com.fyber.inneractive.sdk.network.d1 d1Var = (com.fyber.inneractive.sdk.network.d1) obj;
        if (exc == null && d1Var != null && d1Var.b == null && (bitmap = d1Var.f3836a) != null) {
            com.fyber.inneractive.sdk.flow.endcard.w wVar = this.f3693a;
            android.graphics.Bitmap bitmap2 = wVar.c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            wVar.c = bitmap;
            wVar.d.setImageBitmap(bitmap);
            com.fyber.inneractive.sdk.flow.endcard.loaders.companion.e eVar = this.d;
            com.fyber.inneractive.sdk.flow.endcard.v vVar = this.c;
            eVar.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject a2 = vVar.g.a();
            try {
                jSONObject.put("companion_data", a2);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", a2);
            }
            com.fyber.inneractive.sdk.flow.x0 x0Var = vVar.c;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_COMPANION_LOADED;
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = x0Var.c;
            com.fyber.inneractive.sdk.response.g gVar = x0Var.d;
            org.json.JSONArray jSONArray = x0Var.f;
            com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(gVar);
            wVar2.c = uVar;
            wVar2.f3860a = inneractiveAdRequest;
            wVar2.d = jSONArray;
            wVar2.f.put(jSONObject);
            wVar2.a((java.lang.String) null);
            this.b.a();
            return;
        }
        java.lang.String str = d1Var != null ? d1Var.b : null;
        com.fyber.inneractive.sdk.flow.endcard.loaders.companion.e eVar2 = this.d;
        com.fyber.inneractive.sdk.flow.endcard.v vVar2 = this.c;
        eVar2.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%s sending VAST_COMPANION_FAILED_LOADING event", "StaticCompanionEndCardLoader");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.String a3 = android.text.TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.v.a(exc) : str;
        if (!android.text.TextUtils.isEmpty(a3)) {
            try {
                jSONObject2.put("reason", a3);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "reason", a3);
            }
        }
        org.json.JSONObject a4 = vVar2.g.a();
        try {
            jSONObject2.put("companion_data", a4);
        } catch (java.lang.Exception unused3) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", a4);
        }
        com.fyber.inneractive.sdk.flow.x0 x0Var2 = vVar2.c;
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.VAST_COMPANION_FAILED_LOADING;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest2 = x0Var2.c;
        com.fyber.inneractive.sdk.response.g gVar2 = x0Var2.d;
        org.json.JSONArray jSONArray2 = x0Var2.f;
        com.fyber.inneractive.sdk.network.w wVar3 = new com.fyber.inneractive.sdk.network.w(gVar2);
        wVar3.b = tVar;
        wVar3.f3860a = inneractiveAdRequest2;
        wVar3.d = jSONArray2;
        wVar3.f.put(jSONObject2);
        wVar3.a((java.lang.String) null);
        this.b.a(str);
        com.fyber.inneractive.sdk.flow.endcard.v vVar3 = this.c;
        java.lang.String str2 = vVar3.g.f;
        com.fyber.inneractive.sdk.model.vast.k kVar = vVar3.h;
        if (!android.text.TextUtils.isEmpty(str2)) {
            java.lang.String substring = str2.substring(str2.lastIndexOf(46) + 1);
            if (kVar.extension.equalsIgnoreCase(substring)) {
                return;
            }
            com.fyber.inneractive.sdk.model.vast.k kVar2 = com.fyber.inneractive.sdk.model.vast.k.Jpeg;
            if (kVar == kVar2) {
                equalsIgnoreCase = com.fyber.inneractive.sdk.model.vast.k.Jpg.extension.equalsIgnoreCase(substring);
            } else if (kVar == com.fyber.inneractive.sdk.model.vast.k.Jpg) {
                equalsIgnoreCase = kVar2.extension.equalsIgnoreCase(substring);
            }
            if (equalsIgnoreCase) {
                return;
            }
        }
        com.fyber.inneractive.sdk.flow.x0 x0Var3 = this.c.c;
        com.fyber.inneractive.sdk.network.t tVar2 = com.fyber.inneractive.sdk.network.t.VAST_COMPANION_INCOMPATIBLE_MIMETYPE;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest3 = x0Var3.c;
        com.fyber.inneractive.sdk.response.g gVar3 = x0Var3.d;
        org.json.JSONArray jSONArray3 = x0Var3.f;
        com.fyber.inneractive.sdk.network.w wVar4 = new com.fyber.inneractive.sdk.network.w(gVar3);
        wVar4.b = tVar2;
        wVar4.f3860a = inneractiveAdRequest3;
        wVar4.d = jSONArray3;
        wVar4.a((java.lang.String) null);
    }
}
