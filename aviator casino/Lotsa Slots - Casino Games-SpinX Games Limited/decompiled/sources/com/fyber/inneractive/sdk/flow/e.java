package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.external.InneractiveInfrastructureError f3680a;
    public final /* synthetic */ com.fyber.inneractive.sdk.flow.f b;

    public e(com.fyber.inneractive.sdk.flow.f fVar, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.b = fVar;
        this.f3680a = inneractiveInfrastructureError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.fyber.inneractive.sdk.response.e eVar = this.b.b;
        if (eVar == null || (str = eVar.h) == null) {
            return;
        }
        java.util.Map map = eVar.p;
        if (map == null && eVar.q == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.o oVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b;
        java.lang.String a2 = oVar.a("max_failed_creatives_interval_hours", com.fyber.inneractive.sdk.flow.f.e);
        java.lang.String a3 = oVar.a("max_failed_creatives_per_interval", com.fyber.inneractive.sdk.flow.f.f);
        int a4 = com.fyber.inneractive.sdk.util.v.a(a2, 24);
        int a5 = com.fyber.inneractive.sdk.util.v.a(a3, 1);
        android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
        if (application != null) {
            android.content.SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                jSONArray = new org.json.JSONArray(sharedPreferences.getString("lt", okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            } catch (org.json.JSONException unused) {
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
            if (oVar.a(false, this.b.f3792a) && !com.fyber.inneractive.sdk.metrics.a.a(a4, a5, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                if (map != null) {
                    try {
                        str2 = new org.json.JSONObject(map).toString();
                    } catch (java.lang.Throwable unused2) {
                        str2 = "";
                    }
                } else {
                    str2 = this.b.b.q;
                }
                com.fyber.inneractive.sdk.flow.f fVar = this.b;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = fVar.c;
                com.fyber.inneractive.sdk.response.e eVar2 = fVar.b;
                com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = this.f3680a;
                org.json.JSONArray jSONArray2 = fVar.d;
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_FAILURE_DATA;
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar2);
                wVar.b = tVar;
                wVar.f3860a = inneractiveAdRequest;
                wVar.d = jSONArray2;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("raw_response", str);
                } catch (java.lang.Exception unused3) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "raw_response", str);
                }
                try {
                    jSONObject.put("headers", str2);
                } catch (java.lang.Exception unused4) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "headers", str2);
                }
                java.lang.String description = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put(com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, description);
                } catch (java.lang.Exception unused5) {
                    com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, description);
                }
                wVar.f.put(jSONObject);
                wVar.a((java.lang.String) null);
            }
            sharedPreferences.edit().putString("lt", new org.json.JSONArray((java.util.Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
