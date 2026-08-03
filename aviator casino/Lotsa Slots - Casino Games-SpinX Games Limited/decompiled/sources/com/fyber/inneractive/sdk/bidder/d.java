package com.fyber.inneractive.sdk.bidder;

/* loaded from: classes3.dex */
public final class d {
    public java.lang.String A;
    public java.lang.Boolean B;
    public java.lang.String C;
    public int D;
    public com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender E;
    public boolean F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;
    public java.lang.String J;
    public final boolean K;
    public java.lang.Boolean L;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f3545a;
    public java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public java.lang.String j;
    public java.lang.String k;
    public java.lang.Long l;
    public int m;
    public int n;
    public final com.fyber.inneractive.sdk.bidder.q o;
    public java.lang.String p;
    public java.lang.String q;
    public final com.fyber.inneractive.sdk.bidder.g0 r;
    public java.lang.Boolean s;
    public java.lang.Boolean t;
    public java.lang.Boolean u;
    public boolean v;
    public java.lang.Boolean w;
    public java.lang.Boolean x;
    public java.lang.Boolean y;
    public int z;

    public d(com.fyber.inneractive.sdk.serverapi.c cVar) {
        java.lang.String str;
        this.f3545a = cVar;
        if (android.text.TextUtils.isEmpty(this.b)) {
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.bidder.c(this));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("2.2.0-Android-8.4.4");
        if (!android.text.TextUtils.isEmpty(com.fyber.inneractive.sdk.external.InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(com.fyber.inneractive.sdk.external.InneractiveAdManager.getDevPlatform());
        }
        this.c = sb.toString();
        this.d = com.fyber.inneractive.sdk.util.o.f4302a.getPackageName();
        this.e = com.fyber.inneractive.sdk.util.k.j();
        this.f = com.fyber.inneractive.sdk.util.k.l();
        this.m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f4263a;
        try {
            java.lang.Class.forName(com.unity3d.services.core.properties.MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str = "unity3d";
        } catch (java.lang.Throwable unused) {
            str = "native";
        }
        this.o = !str.equals("native") ? !str.equals("unity3d") ? com.fyber.inneractive.sdk.bidder.q.UNRECOGNIZED : com.fyber.inneractive.sdk.bidder.q.UNITY3D : com.fyber.inneractive.sdk.bidder.q.NATIVE;
        this.r = ((com.fyber.inneractive.sdk.util.s.a() ^ true) || com.fyber.inneractive.sdk.config.IAConfigManager.N.q) ? com.fyber.inneractive.sdk.bidder.g0.SECURE : com.fyber.inneractive.sdk.bidder.g0.UNSECURE;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        if (android.text.TextUtils.isEmpty(iAConfigManager.n)) {
            this.H = iAConfigManager.l;
        } else {
            this.H = iAConfigManager.l + "_" + iAConfigManager.n;
        }
        this.K = com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild();
        a();
        this.t = com.fyber.inneractive.sdk.serverapi.b.g();
        this.B = com.fyber.inneractive.sdk.serverapi.b.i();
        this.w = com.fyber.inneractive.sdk.serverapi.b.f();
        this.x = com.fyber.inneractive.sdk.serverapi.b.l();
        this.y = com.fyber.inneractive.sdk.serverapi.b.k();
    }

    public final void a() {
        this.f3545a.getClass();
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        this.g = iAConfigManager.o;
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            this.f3545a.getClass();
            this.h = com.fyber.inneractive.sdk.util.k.i();
            this.i = this.f3545a.a();
            java.lang.String str = this.f3545a.b;
            this.j = str == null ? "" : str.substring(0, java.lang.Math.min(3, str.length()));
            java.lang.String str2 = this.f3545a.b;
            this.k = str2 != null ? str2.substring(java.lang.Math.min(3, str2.length())) : "";
            this.f3545a.getClass();
            com.fyber.inneractive.sdk.util.a1 a2 = com.fyber.inneractive.sdk.util.a1.a();
            com.fyber.inneractive.sdk.util.IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", a2, a2.b());
            this.q = a2.b();
            int i = com.fyber.inneractive.sdk.config.k.f3616a;
            java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.device");
            if (android.text.TextUtils.isEmpty(property)) {
                com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f3639a.b;
                property = vVar != null ? vVar.f3641a : null;
            }
            this.A = property;
            this.G = iAConfigManager.j.getZipCode();
        }
        this.E = iAConfigManager.j.getGender();
        this.D = iAConfigManager.j.getAge();
        this.l = com.fyber.inneractive.sdk.serverapi.b.e();
        this.f3545a.getClass();
        java.util.ArrayList arrayList = iAConfigManager.p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.p = com.fyber.inneractive.sdk.util.o.a(arrayList);
        }
        this.C = com.fyber.inneractive.sdk.serverapi.b.b();
        this.v = com.fyber.inneractive.sdk.serverapi.b.h().booleanValue();
        this.z = com.fyber.inneractive.sdk.serverapi.b.c().intValue();
        this.F = iAConfigManager.k;
        this.s = com.fyber.inneractive.sdk.serverapi.b.m();
        if (android.text.TextUtils.isEmpty(iAConfigManager.n)) {
            this.H = iAConfigManager.l;
        } else {
            this.H = iAConfigManager.l + "_" + iAConfigManager.n;
        }
        this.u = com.fyber.inneractive.sdk.serverapi.b.n();
        iAConfigManager.D.n();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.D.p;
        this.I = lVar != null ? lVar.f3496a.i() : null;
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.D.p;
        this.J = lVar2 != null ? lVar2.f3496a.d() : null;
        this.f3545a.getClass();
        this.m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f3545a.getClass();
        this.n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.L = com.fyber.inneractive.sdk.serverapi.b.j();
    }
}
