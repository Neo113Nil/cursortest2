package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class x implements com.fyber.inneractive.sdk.config.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.config.IAConfigManager f3643a;

    public x(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager) {
        this.f3643a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(com.fyber.inneractive.sdk.config.s sVar, com.fyber.inneractive.sdk.config.o oVar) {
        com.fyber.inneractive.sdk.network.f fVar = this.f3643a.F;
        fVar.getClass();
        int a2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b.a("send_events_batch_interval", 30, -1);
        int i = a2 >= 0 ? a2 : 30;
        java.lang.String property = java.lang.System.getProperty("fyber.marketplace.use_batch_interval");
        if (property != null && !java.lang.Boolean.getBoolean(property)) {
            i = 0;
        }
        fVar.f = true;
        fVar.e = i;
        com.fyber.inneractive.sdk.util.d1 d1Var = fVar.d;
        if (d1Var != null && d1Var.hasMessages(12312329)) {
            fVar.d.removeMessages(12312329);
        }
        long j = fVar.e * 1000;
        com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.d;
        if (d1Var2 != null) {
            d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j));
        }
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = this.f3643a;
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = iAConfigManager.H;
        com.fyber.inneractive.sdk.config.o oVar2 = iAConfigManager.t.b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String a3 = oVar2.a("k", (java.lang.String) null);
        if (a3 != null) {
            try {
                jSONObject = new org.json.JSONObject(a3);
            } catch (org.json.JSONException unused) {
            }
        }
        dVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            hashMap.put(next, java.lang.Integer.valueOf(jSONObject.optInt(next, 0)));
        }
        dVar.e.clear();
        dVar.e.putAll(hashMap);
    }
}
