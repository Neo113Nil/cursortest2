package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.w f3757a;

    public v(com.fyber.inneractive.sdk.flow.w wVar) {
        this.f3757a = wVar;
    }

    public final void a(com.fyber.inneractive.sdk.network.u uVar, com.fyber.inneractive.sdk.ignite.m mVar) {
        com.fyber.inneractive.sdk.flow.w wVar = this.f3757a;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = wVar.f3765a;
        com.fyber.inneractive.sdk.response.e eVar = wVar.b;
        com.fyber.inneractive.sdk.config.global.r rVar = wVar.c;
        org.json.JSONArray b = rVar != null ? rVar.b() : null;
        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar2.c = uVar;
        wVar2.f3860a = inneractiveAdRequest;
        wVar2.d = b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String a2 = mVar.a();
        try {
            jSONObject.put("ignitem", a2);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "ignitem", a2);
        }
        wVar2.f.put(jSONObject);
        wVar2.a((java.lang.String) null);
    }

    public final void a(com.fyber.inneractive.sdk.network.t tVar, java.lang.String str, java.lang.String str2, com.fyber.inneractive.sdk.ignite.m mVar) {
        com.fyber.inneractive.sdk.flow.w wVar = this.f3757a;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = wVar.f3765a;
        com.fyber.inneractive.sdk.response.e eVar = wVar.b;
        com.fyber.inneractive.sdk.config.global.r rVar = wVar.c;
        org.json.JSONArray b = rVar != null ? rVar.b() : null;
        com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar2.b = tVar;
        wVar2.f3860a = inneractiveAdRequest;
        wVar2.d = b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (mVar != null) {
            java.lang.String a2 = mVar.a();
            try {
                jSONObject.put("ignitem", a2);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "ignitem", a2);
            }
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, str2);
            } catch (java.lang.Exception unused3) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, str2);
            }
        }
        wVar2.f.put(jSONObject);
        wVar2.a((java.lang.String) null);
    }
}
