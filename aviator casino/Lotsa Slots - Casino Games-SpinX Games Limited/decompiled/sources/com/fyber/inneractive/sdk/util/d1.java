package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class d1 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f4289a;

    public d1(android.os.Looper looper, com.fyber.inneractive.sdk.network.f fVar) {
        super(looper);
        this.f4289a = new java.lang.ref.WeakReference(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v20, types: [org.json.JSONObject] */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.String str;
        java.lang.String a2;
        super.handleMessage(message);
        com.fyber.inneractive.sdk.util.e1 e1Var = (com.fyber.inneractive.sdk.util.e1) com.fyber.inneractive.sdk.util.v.a(this.f4289a);
        if (e1Var != null) {
            com.fyber.inneractive.sdk.network.f fVar = (com.fyber.inneractive.sdk.network.f) e1Var;
            int i = message.what;
            if (i == 12312329 || i == 20150330) {
                if (fVar.f && fVar.f3838a.size() > 0) {
                    while (true) {
                        str = null;
                        if (fVar.f3838a.size() <= 0) {
                            break;
                        }
                        try {
                            str = (org.json.JSONObject) fVar.f3838a.poll();
                        } catch (java.lang.Throwable unused) {
                        }
                        if (str != null) {
                            fVar.b.put(str);
                        }
                    }
                    if (fVar.b.length() > 0) {
                        org.json.JSONArray jSONArray = fVar.b;
                        int i2 = com.fyber.inneractive.sdk.config.k.f3616a;
                        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.name");
                        if (android.text.TextUtils.isEmpty(property)) {
                            a2 = "https://" + com.fyber.inneractive.sdk.config.IAConfigManager.N.i.f;
                        } else {
                            a2 = com.fyber.inneractive.sdk.config.a.a(property, "Event");
                        }
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        try {
                            str = jSONArray.toString();
                        } catch (java.lang.Throwable unused2) {
                        }
                        if (str != null) {
                            com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.x0(new com.fyber.inneractive.sdk.network.e(a2, jSONArray, currentTimeMillis), a2, str));
                        }
                        fVar.b = new org.json.JSONArray();
                    }
                }
                com.fyber.inneractive.sdk.util.d1 d1Var = fVar.d;
                if (d1Var != null) {
                    d1Var.removeMessages(12312329);
                    long j = fVar.e * 1000;
                    com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.d;
                    if (d1Var2 != null) {
                        d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j));
                    }
                }
            }
        }
    }
}
