package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class p extends com.fyber.inneractive.sdk.flow.o implements com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener {
    public com.fyber.inneractive.sdk.response.e g;

    public p(java.lang.String str) {
        super(str);
    }

    @Override // com.fyber.inneractive.sdk.flow.o, com.fyber.inneractive.sdk.interfaces.a
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        com.fyber.inneractive.sdk.metrics.i b = com.fyber.inneractive.sdk.metrics.d.d.b(this.e);
        b.b.put(new com.fyber.inneractive.sdk.metrics.h("success"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b.d));
        super.a(inneractiveAdRequest);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        com.fyber.inneractive.sdk.metrics.i b = com.fyber.inneractive.sdk.metrics.d.d.b(this.e);
        b.b.put(new com.fyber.inneractive.sdk.metrics.h("retrying"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b.d));
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager, boolean z, java.lang.Exception exc) {
        com.fyber.inneractive.sdk.config.IAConfigManager.removeListener(this);
        if (z) {
            return;
        }
        a(null, c(), new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.NO_APP_CONFIG_AVAILABLE, exc));
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void b(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        a(inneractiveAdRequest, this.g);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.metrics.i b = com.fyber.inneractive.sdk.metrics.d.d.b(this.e);
        b.b.put(new com.fyber.inneractive.sdk.metrics.h("dyn_timeout"), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - b.d));
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void a(boolean z) {
        com.fyber.inneractive.sdk.network.m mVar = this.d;
        if (mVar != null) {
            mVar.a();
        }
        super.a(true);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        java.lang.String str;
        if (eVar == null || (str = eVar.y) == null) {
            return;
        }
        com.fyber.inneractive.sdk.metrics.i b = com.fyber.inneractive.sdk.metrics.d.d.b(str);
        com.fyber.inneractive.sdk.config.global.r rVar = this.c;
        if (rVar == null) {
            rVar = com.fyber.inneractive.sdk.config.global.r.a();
        }
        com.fyber.inneractive.sdk.config.s sVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t;
        com.fyber.inneractive.sdk.config.o oVar = sVar != null ? sVar.b : null;
        if (oVar == null || !oVar.a(false, "e_699")) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sEvent 699 is disabled", com.fyber.inneractive.sdk.util.IAlog.a(b));
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray a2 = com.fyber.inneractive.sdk.metrics.i.a(b.b);
        try {
            jSONObject.put("adl", a2);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "adl", a2);
        }
        org.json.JSONArray a3 = com.fyber.inneractive.sdk.metrics.i.a(b.f3797a);
        try {
            jSONObject.put("adml", a3);
        } catch (java.lang.Exception unused2) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "adml", a3);
        }
        if (!android.text.TextUtils.isEmpty(null)) {
            try {
                jSONObject.put("dns_failed", (java.lang.Object) null);
            } catch (java.lang.Exception unused3) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "dns_failed", null);
            }
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.SDK_BIDDING_METRICS;
        org.json.JSONArray b2 = rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = b2;
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }
}
