package com.ironsource;

/* loaded from: classes5.dex */
public class N6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3362x7 f5851a;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> b;
    private final java.util.concurrent.atomic.AtomicBoolean c;
    private final java.util.concurrent.atomic.AtomicBoolean d;

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f5852a;

        a(android.content.Context context) {
            this.f5852a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.ironsource.N6.this.e(this.f5852a);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            com.ironsource.N6.this.c.set(false);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static volatile com.ironsource.N6 f5853a = new com.ironsource.N6();

        private b() {
        }
    }

    private N6() {
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f5851a = com.ironsource.Jb.Y().a();
        this.b = new java.util.concurrent.ConcurrentHashMap<>();
    }

    static com.ironsource.N6 b() {
        return com.ironsource.N6.b.f5853a;
    }

    private void d(android.content.Context context) {
        if (context == null || this.d.getAndSet(true)) {
            return;
        }
        a("auid", this.f5851a.e(context));
        a("model", this.f5851a.l());
        a(com.ironsource.M6.t, this.f5851a.q());
        a(com.ironsource.M6.F, this.f5851a.f());
        a(com.ironsource.M6.p, this.f5851a.M(context));
        java.lang.String adQualitySdkVersion = com.ironsource.mediationsdk.adquality.AdQualityBridge.getAdQualitySdkVersion();
        if (!android.text.TextUtils.isEmpty(adQualitySdkVersion)) {
            a(com.ironsource.M6.E1, adQualitySdkVersion);
        }
        java.lang.String i = this.f5851a.i();
        if (i != null) {
            a("osv", i.replaceAll("[^0-9/.]", ""));
            a(com.ironsource.M6.J, i);
        }
        a(com.ironsource.M6.f5823a, java.lang.String.valueOf(this.f5851a.e()));
        java.lang.String v = this.f5851a.v(context);
        if (!android.text.TextUtils.isEmpty(v)) {
            a(com.ironsource.M6.R0, v);
        }
        java.lang.String e = com.ironsource.E1.e(context);
        if (!android.text.TextUtils.isEmpty(e)) {
            a(com.ironsource.M6.o, e);
        }
        java.lang.String s = this.f5851a.s(context);
        if (!android.text.TextUtils.isEmpty(s)) {
            a(com.ironsource.M6.w0, s);
        }
        a(com.ironsource.M6.f, context.getPackageName());
        a("mem", java.lang.String.valueOf(this.f5851a.r(context)));
        a(com.ironsource.M6.b0, com.ironsource.M6.k0);
        a(com.ironsource.M6.c0, java.lang.Long.valueOf(com.ironsource.E1.f(context)));
        a(com.ironsource.M6.a0, java.lang.Long.valueOf(com.ironsource.E1.d(context)));
        a(com.ironsource.M6.d, com.ironsource.E1.b(context));
        a(com.ironsource.M6.O, java.lang.Integer.valueOf(com.ironsource.T3.f(context)));
        a(com.ironsource.M6.Y, com.ironsource.T3.g(context));
        a("stid", com.ironsource.C2974bd.d(context));
        a(com.ironsource.M6.H, "android");
        a(com.ironsource.M6.z, this.f5851a.t());
        a("mThreshold", this.f5851a.a(this.f5851a.o(context)));
        a(com.ironsource.M6.h0, kotlin.KotlinVersion.CURRENT.toString());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(android.content.Context context) {
        if (context == null) {
            return;
        }
        try {
            java.lang.String J = this.f5851a.J(context);
            if (!android.text.TextUtils.isEmpty(J)) {
                a(com.ironsource.M6.X0, J);
            }
            java.lang.String c = this.f5851a.c(context);
            if (android.text.TextUtils.isEmpty(c)) {
                return;
            }
            a(com.ironsource.M6.s, java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(c)));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private void f(android.content.Context context) {
        if (context == null) {
            return;
        }
        a(context);
        java.lang.String z = this.f5851a.z(context);
        if (!android.text.TextUtils.isEmpty(z)) {
            a(com.ironsource.M6.M0, z);
        } else if (a(com.ironsource.M6.M0)) {
            b(com.ironsource.M6.M0);
        }
        a("idfi", this.f5851a.j(context));
        java.lang.String d = this.f5851a.d(context);
        if (!android.text.TextUtils.isEmpty(d)) {
            a(com.ironsource.M6.q, d.toUpperCase(java.util.Locale.getDefault()));
        }
        a(com.ironsource.M6.r, this.f5851a.B(context));
        java.lang.String d2 = this.f5851a.d();
        if (!android.text.TextUtils.isEmpty(d2)) {
            a("tz", d2);
        }
        java.lang.String b2 = com.ironsource.U3.b(context);
        if (!android.text.TextUtils.isEmpty(b2) && !b2.equals("none")) {
            a(com.ironsource.M6.j, b2);
        }
        java.lang.String d3 = com.ironsource.U3.d(context);
        if (!android.text.TextUtils.isEmpty(d3)) {
            a(com.ironsource.M6.k, d3);
        }
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            a("vpn", java.lang.Boolean.valueOf(com.ironsource.U3.e(context)));
        }
        java.lang.String H = this.f5851a.H(context);
        if (!android.text.TextUtils.isEmpty(H)) {
            a("icc", H);
        }
        int t = this.f5851a.t(context);
        if (t >= 0) {
            a(com.ironsource.M6.m1, java.lang.Integer.valueOf(t));
        }
        a(com.ironsource.M6.n1, this.f5851a.w(context));
        a(com.ironsource.M6.o1, this.f5851a.G(context));
        a(com.ironsource.M6.i0, java.lang.Float.valueOf(this.f5851a.F(context)));
        a(com.ironsource.M6.m, java.lang.String.valueOf(this.f5851a.h()));
        a(com.ironsource.M6.R, java.lang.Integer.valueOf(this.f5851a.k()));
        a(com.ironsource.M6.Q, java.lang.Integer.valueOf(this.f5851a.c()));
        a(com.ironsource.M6.a1, java.lang.String.valueOf(this.f5851a.a()));
        a(com.ironsource.M6.j1, java.lang.String.valueOf(this.f5851a.m()));
        a("mcc", java.lang.Integer.valueOf(com.ironsource.T3.b(context)));
        a("mnc", java.lang.Integer.valueOf(com.ironsource.T3.c(context)));
        a(com.ironsource.M6.T, java.lang.Boolean.valueOf(this.f5851a.j()));
        a(com.ironsource.M6.g, java.lang.Boolean.valueOf(this.f5851a.D(context)));
        a(com.ironsource.M6.h, java.lang.Integer.valueOf(this.f5851a.E(context)));
        a(com.ironsource.M6.b, java.lang.Boolean.valueOf(this.f5851a.f(context)));
        a(com.ironsource.M6.K, java.lang.Boolean.valueOf(this.f5851a.i(context)));
        a("rt", java.lang.Boolean.valueOf(this.f5851a.p()));
        a(com.ironsource.M6.Z, java.lang.String.valueOf(this.f5851a.r()));
        a(com.ironsource.M6.e, java.lang.Integer.valueOf(this.f5851a.l(context)));
        a(com.ironsource.M6.b1, java.lang.Boolean.valueOf(this.f5851a.K(context)));
        a(com.ironsource.M6.c, this.f5851a.n(context));
        a(com.ironsource.M6.d0, this.f5851a.s());
        com.ironsource.A a2 = new com.ironsource.A(com.ironsource.Jb.Y().s());
        java.util.HashMap hashMap = new java.util.HashMap();
        a2.a(hashMap);
        a(com.ironsource.M6.F0, hashMap);
        a(com.ironsource.M6.L, com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginType());
        a(com.ironsource.M6.M, com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginVersion());
        a(com.ironsource.M6.N, com.ironsource.mediationsdk.config.ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    protected void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (java.lang.String str : map.keySet()) {
                if (map.containsKey(str)) {
                    a(str, map.get(str));
                }
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void c(android.content.Context context) {
        try {
            d(context);
            f(context);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void b(java.lang.String str, java.lang.Object obj) {
        a(str, obj);
    }

    protected void b(java.lang.String str) {
        if (str == null) {
            return;
        }
        try {
            this.b.remove(str);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    protected org.json.JSONObject b(android.content.Context context) throws org.json.JSONException {
        f(context);
        return new org.json.JSONObject(com.ironsource.P6.a(this.b));
    }

    protected void a(java.lang.String str, org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            java.lang.Object obj = this.b.get(str);
            if (!(obj instanceof org.json.JSONArray)) {
                a(str, (java.lang.Object) jSONArray);
                return;
            }
            org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONArray2.put(jSONArray.get(i));
            }
            a(str, (java.lang.Object) jSONArray2);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    protected void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            java.lang.Object obj = this.b.get(str);
            if (!(obj instanceof org.json.JSONObject)) {
                a(str, (java.lang.Object) jSONObject);
                return;
            }
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            a(str, (java.lang.Object) jSONObject2);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private void a(java.lang.String str, java.lang.Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof java.lang.Boolean) {
                obj = java.lang.Integer.valueOf(((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.b.put(str, obj);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(java.lang.String str) {
        return str != null && this.b.containsKey(str);
    }

    private void a(android.content.Context context) {
        if (this.c.get()) {
            return;
        }
        try {
            this.c.set(true);
            com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.N6.a(context));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            this.c.set(false);
        }
    }

    private void a() {
        java.lang.String a2 = com.ironsource.C3192ng.f6503a.a();
        if (a2 != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("sdk", a2);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.ironsource.M6.J1, hashMap);
            java.util.Map<java.lang.String, java.lang.Object> hashMap3 = new java.util.HashMap<>();
            hashMap3.put(com.ironsource.M6.G1, hashMap2);
            a(hashMap3);
        }
    }
}
