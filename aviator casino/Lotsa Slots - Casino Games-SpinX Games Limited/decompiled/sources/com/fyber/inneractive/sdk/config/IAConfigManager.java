package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public class IAConfigManager {
    public static long O;
    public com.fyber.inneractive.sdk.network.v0 A;
    public com.fyber.inneractive.sdk.network.v0 B;
    public com.fyber.inneractive.sdk.config.g C;
    public final com.fyber.inneractive.sdk.ignite.h D;
    public final com.fyber.inneractive.sdk.cache.k E;
    public final com.fyber.inneractive.sdk.network.f F;
    public final java.util.HashMap G;
    public final com.fyber.inneractive.sdk.serverapi.extradata.d H;
    public final java.util.concurrent.atomic.AtomicBoolean I;
    public com.fyber.inneractive.sdk.measurement.e J;
    public android.webkit.WebView K;
    public final com.fyber.inneractive.sdk.config.global.r L;
    public com.fyber.inneractive.sdk.config.cellular.a M;

    /* renamed from: a, reason: collision with root package name */
    public java.util.HashMap f3582a = new java.util.HashMap();
    public java.util.HashMap b = new java.util.HashMap();
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public android.content.Context f;
    public final java.util.concurrent.CopyOnWriteArrayList g;
    public boolean h;
    public final com.fyber.inneractive.sdk.config.k0 i;
    public com.fyber.inneractive.sdk.external.InneractiveUserConfig j;
    public boolean k;
    public java.lang.String l;
    public com.fyber.inneractive.sdk.external.InneractiveMediationName m;
    public java.lang.String n;
    public java.lang.String o;
    public java.util.ArrayList p;
    public boolean q;
    public final com.fyber.inneractive.sdk.network.l0 r;
    public java.lang.String s;
    public com.fyber.inneractive.sdk.config.s t;
    public com.fyber.inneractive.sdk.config.i u;
    public com.fyber.inneractive.sdk.config.t v;
    public final com.fyber.inneractive.sdk.config.x0 w;
    public com.fyber.inneractive.sdk.util.s1 x;
    public com.fyber.inneractive.sdk.config.global.a y;
    public final com.fyber.inneractive.sdk.util.y0 z;
    public static final com.fyber.inneractive.sdk.config.IAConfigManager N = new com.fyber.inneractive.sdk.config.IAConfigManager();
    public static final com.fyber.inneractive.sdk.config.g0 P = new com.fyber.inneractive.sdk.config.g0();

    public interface OnConfigurationReadyAndValidListener {
        void onConfigurationReadyAndValid(com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager, boolean z, java.lang.Exception exc);
    }

    public IAConfigManager() {
        new java.util.HashSet();
        this.h = false;
        this.i = new com.fyber.inneractive.sdk.config.k0();
        this.k = false;
        this.q = false;
        this.r = new com.fyber.inneractive.sdk.network.l0();
        this.s = "";
        this.w = new com.fyber.inneractive.sdk.config.x0();
        this.z = new com.fyber.inneractive.sdk.util.y0();
        this.D = new com.fyber.inneractive.sdk.ignite.h();
        this.E = new com.fyber.inneractive.sdk.cache.k();
        this.F = new com.fyber.inneractive.sdk.network.f();
        this.G = new java.util.HashMap();
        this.I = new java.util.concurrent.atomic.AtomicBoolean();
        this.L = com.fyber.inneractive.sdk.config.global.r.a();
        this.g = new java.util.concurrent.CopyOnWriteArrayList();
        this.H = new com.fyber.inneractive.sdk.serverapi.extradata.d();
    }

    public static void addListener(com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        N.g.add(onConfigurationReadyAndValidListener);
    }

    public static org.json.JSONArray b() {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = N.H;
        dVar.getClass();
        org.json.JSONArray jSONArray = (org.json.JSONArray) dVar.a(new org.json.JSONArray(), new com.fyber.inneractive.sdk.serverapi.extradata.b());
        if (jSONArray == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sExtra data JSON is empty", "UserExtraDataManager");
            return null;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("%sReturning extra data JSON objects", "UserExtraDataManager");
        return jSONArray;
    }

    public static boolean c() {
        com.fyber.inneractive.sdk.config.g gVar = N.C;
        return gVar != null && gVar.h();
    }

    public static boolean d() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = N;
        boolean z = iAConfigManager.e != null;
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        boolean booleanValue = java.lang.Boolean.valueOf(java.lang.System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", java.lang.Boolean.toString(false))).booleanValue();
        if ((z && java.lang.System.currentTimeMillis() - O > 3600000) || booleanValue) {
            if (booleanValue) {
                com.fyber.inneractive.sdk.config.s sVar = iAConfigManager.t;
                sVar.d = false;
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.util.l(sVar.e));
            }
            a();
            com.fyber.inneractive.sdk.web.b1 b1Var = com.fyber.inneractive.sdk.web.b1.c;
            b1Var.getClass();
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.web.a1(b1Var));
        }
        return z;
    }

    public static void e() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = N;
        if (iAConfigManager.I.get()) {
            return;
        }
        iAConfigManager.I.set(true);
        android.content.SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("privacy_api_usage_reported", true).apply();
        }
    }

    public static void f() {
        android.content.SharedPreferences sharedPreferences = com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("IAConfigFQE", true).apply();
        }
    }

    public static boolean g() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = N;
        java.lang.Boolean c = ((com.fyber.inneractive.sdk.config.global.features.m) iAConfigManager.L.a(com.fyber.inneractive.sdk.config.global.features.m.class)).c(com.ironsource.mediationsdk.metadata.a.j);
        boolean booleanValue = c != null ? c.booleanValue() : false;
        com.fyber.inneractive.sdk.util.IAlog.a("OMSDK AB %s", java.lang.String.valueOf(booleanValue));
        if (booleanValue) {
            com.fyber.inneractive.sdk.measurement.e eVar = iAConfigManager.J;
            return eVar == null || !eVar.f3786a;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("OM SDK disabled", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.util.IAlog.d("OM SDK disabled", new java.lang.Object[0]);
        return false;
    }

    public static void removeListener(com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener) {
        N.g.remove(onConfigurationReadyAndValidListener);
    }

    public final void a(boolean z, java.lang.Exception exc) {
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener onConfigurationReadyAndValidListener = (com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener) it.next();
            if (onConfigurationReadyAndValidListener != null) {
                com.fyber.inneractive.sdk.util.IAlog.e("notifying listener configuration state has been resolved", new java.lang.Object[0]);
                onConfigurationReadyAndValidListener.onConfigurationReadyAndValid(this, z, !z ? exc : null);
            }
        }
    }

    public static void a() {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = N;
        com.fyber.inneractive.sdk.network.v0 v0Var = iAConfigManager.A;
        if (v0Var != null) {
            iAConfigManager.r.a(v0Var);
        }
        com.fyber.inneractive.sdk.config.s sVar = iAConfigManager.t;
        if (sVar.d) {
            return;
        }
        iAConfigManager.r.a(new com.fyber.inneractive.sdk.network.v0(new com.fyber.inneractive.sdk.config.p(sVar), sVar.f3636a, sVar.e));
    }
}
