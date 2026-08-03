package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.network.n1 f3849a;

    public m1(com.fyber.inneractive.sdk.network.n1 n1Var) {
        this.f3849a = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.fyber.inneractive.sdk.network.n1 n1Var = this.f3849a;
        com.fyber.inneractive.sdk.network.t0 t0Var = (com.fyber.inneractive.sdk.network.t0) com.fyber.inneractive.sdk.util.v.a(n1Var.b);
        java.lang.Thread thread = (java.lang.Thread) com.fyber.inneractive.sdk.util.v.a(this.f3849a.f3850a);
        if (t0Var == null || t0Var.f == com.fyber.inneractive.sdk.network.i1.DONE || t0Var.f == com.fyber.inneractive.sdk.network.i1.RESOLVED) {
            return;
        }
        boolean v = t0Var.v();
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkWatchdogHolder : should report: %s", com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.network.n1.class), java.lang.Boolean.valueOf(v));
        if (v) {
            if (thread != null) {
                java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
                java.lang.Exception exc = new java.lang.Exception();
                exc.setStackTrace(stackTrace);
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                exc.printStackTrace(new java.io.PrintWriter(stringWriter));
                str = stringWriter.getBuffer().toString();
            } else {
                str = "";
            }
            java.lang.String r = t0Var.r();
            com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = t0Var instanceof com.fyber.inneractive.sdk.network.q0 ? ((com.fyber.inneractive.sdk.network.q0) t0Var).p : null;
            com.fyber.inneractive.sdk.response.e eVar = t0Var instanceof com.fyber.inneractive.sdk.network.f1 ? ((com.fyber.inneractive.sdk.network.f1) t0Var).s : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.NETWORK_REQUEST_PASSED_ALLOWED_TIME;
            org.json.JSONArray b = t0Var.k() != null ? t0Var.k().b() : null;
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.c = uVar;
            wVar.f3860a = inneractiveAdRequest;
            wVar.d = b;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("url", r);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "url", r);
            }
            try {
                jSONObject.put("stack_trace", str);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", str);
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(n1Var.c);
            try {
                jSONObject.put("total_time", valueOf);
            } catch (java.lang.Exception unused3) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "total_time", valueOf);
            }
            wVar.f.put(jSONObject);
            wVar.a((java.lang.String) null);
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkWatchdogHolder should cancel by timeout: %d", com.fyber.inneractive.sdk.util.IAlog.a(n1Var), java.lang.Integer.valueOf(n1Var.c));
        t0Var.d();
    }
}
