package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.external.InneractiveAdSpot f4284a;
    public boolean c;
    public boolean b = false;
    public long d = 0;
    public long e = 0;
    public long f = 0;

    public final void a(boolean z) {
        this.c = z;
        if (this.b) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s%s timer could not start. Timer is in action!", "AdExperienceLatency: ", z ? "skip" : "close");
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s%s timer started", "AdExperienceLatency: ", z ? "skip" : "close");
        this.d = java.lang.System.currentTimeMillis();
        this.b = true;
    }

    public final void a() {
        if (!this.b || this.e <= 0) {
            return;
        }
        this.f += java.lang.System.currentTimeMillis() - this.e;
        this.e = 0L;
    }

    public final void a(java.lang.String str) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (!this.b || this.c) {
            return;
        }
        java.lang.String a2 = com.fyber.inneractive.sdk.util.c0.a(java.lang.System.currentTimeMillis(), this.d, this.f);
        com.fyber.inneractive.sdk.external.InneractiveAdSpot inneractiveAdSpot = this.f4284a;
        com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.USER_CLOSE_ACTION_LATENCY;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f3765a : null;
        com.fyber.inneractive.sdk.response.e eVar = adContent != null ? adContent.b : null;
        org.json.JSONArray b = (adContent == null || (rVar = adContent.c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("close_action_latency", a2);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "close_action_latency", a2);
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("origin", str);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "origin", str);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.b = false;
    }
}
