package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class p implements com.ironsource.S9, com.ironsource.Kc, com.ironsource.O4, com.ironsource.O4.b, com.ironsource.O4.c, com.ironsource.O4.a {
    private static boolean a0 = false;
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private java.lang.Boolean H;
    private java.lang.Boolean I;
    private com.ironsource.Cc J;
    private boolean K;
    private boolean L;
    private boolean M;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.h.d> N;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.h.b> O;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.demandOnly.h.d> P;
    private com.ironsource.mediationsdk.demandOnly.f Q;
    private com.ironsource.mediationsdk.demandOnly.k R;
    private com.ironsource.mediationsdk.demandOnly.c S;
    private com.ironsource.N5 T;
    private com.ironsource.T9 U;
    private com.ironsource.R6 V;
    private boolean W;
    private com.ironsource.mediationsdk.adquality.AdQualityBridge X;
    com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener> Y;
    com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener> Z;

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6455a;
    private final java.lang.String b;
    private final com.ironsource.InterfaceC3362x7 c;
    private final com.ironsource.InterfaceC3362x7.a d;
    private final com.ironsource.L7 e;
    private final com.ironsource.InterfaceC3129k7 f;
    private final com.ironsource.I8.a g;
    private com.ironsource.mediationsdk.logger.IronSourceLoggerManager h;
    private com.ironsource.C3366xb i;
    private java.util.concurrent.atomic.AtomicBoolean j;
    private final java.lang.Object k;
    private com.ironsource.Ve l;
    private java.lang.String m;
    private java.lang.String n;
    private java.lang.String o;
    private java.util.Map<java.lang.String, java.lang.String> p;
    private java.lang.String q;
    private java.util.concurrent.atomic.AtomicBoolean r;
    private boolean s;
    private java.util.List<com.ironsource.mediationsdk.IronSource.a> t;
    private java.lang.String u;
    private java.util.Set<com.ironsource.mediationsdk.IronSource.a> v;
    private java.util.Set<com.ironsource.mediationsdk.IronSource.a> w;
    private boolean x;
    private com.ironsource.C2953aa y;
    private final java.lang.String z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6456a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.q.d.values().length];
            b = iArr;
            try {
                iArr[com.ironsource.mediationsdk.q.d.NOT_INIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                b[com.ironsource.mediationsdk.q.d.INIT_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                b[com.ironsource.mediationsdk.q.d.INIT_IN_PROGRESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                b[com.ironsource.mediationsdk.q.d.INITIATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            f6456a = iArr2;
            try {
                iArr2[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f6456a[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                f6456a[com.ironsource.mediationsdk.IronSource.a.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                f6456a[com.ironsource.mediationsdk.IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    public interface b {
        void a(java.lang.String str);
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        static volatile com.ironsource.mediationsdk.p f6457a = new com.ironsource.mediationsdk.p();

        private c() {
        }
    }

    private p() {
        this(com.ironsource.Jb.Y().a(), com.ironsource.Jb.Q().c(), com.ironsource.Jb.Y().w(), com.ironsource.Jb.Y().k(), com.ironsource.Jb.Q().D());
    }

    private boolean A() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().e() == null) ? false : true;
    }

    private boolean B() {
        return A() && C();
    }

    private boolean C() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.k() == null || this.l.k().c() == null || this.l.k().c().isEmpty()) ? false : true;
    }

    private boolean D() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().f() == null) ? false : true;
    }

    private boolean E() {
        return D() && F();
    }

    private boolean F() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.k() == null || this.l.k().d() == null || this.l.k().d().size() <= 0) ? false : true;
    }

    private void J() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> c2 = com.ironsource.C3150la.b().c();
        if (c2.containsKey(com.ironsource.mediationsdk.metadata.a.c)) {
            if (android.text.TextUtils.isEmpty(c2.get(com.ironsource.mediationsdk.metadata.a.c).get(0))) {
                return;
            }
            com.ironsource.V4.f6012a.b(!com.ironsource.mediationsdk.metadata.MetaDataUtils.getMetaDataBooleanValue(r0));
        }
    }

    private void K() {
        if (this.D) {
            L();
        }
    }

    private void L() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Banner started in demand only mode", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.l.k().a().size(); i++) {
            java.lang.String str = this.l.k().a().get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            org.json.JSONObject a2 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(false, false, 1);
            a(a2, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", 1010}});
            a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_BN_INIT_FAILED, a2);
            a(com.ironsource.mediationsdk.IronSource.a.BANNER, false);
            return;
        }
        synchronized (this.O) {
            com.ironsource.U2 c2 = this.l.c().c();
            com.ironsource.P4.a aVar = new com.ironsource.P4.a("Mediation");
            if (c2.k()) {
                aVar.a("isOneFlow", 1);
            }
            this.S = new com.ironsource.mediationsdk.demandOnly.c(arrayList, c2, i(), j(), new com.ironsource.P4.b(com.ironsource.F9.i(), aVar));
        }
        for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.O.values()) {
            this.S.a(bVar.g(), bVar.e());
        }
        this.O.clear();
    }

    private void M() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Interstitial started in demand only mode", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.l.k().b().size(); i++) {
            java.lang.String str = this.l.k().b().get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            org.json.JSONObject a2 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(false, false, 1);
            a(a2, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", 1010}});
            a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_IS_INIT_FAILED, a2);
            a(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL, false);
            return;
        }
        synchronized (this.N) {
            this.Q = a((java.util.List<com.ironsource.mediationsdk.model.NetworkSettings>) arrayList);
        }
        java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.N.values().iterator();
        while (it.hasNext()) {
            this.Q.a(it.next());
        }
        this.N.clear();
    }

    private void N() {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "Rewarded Video started in demand only mode", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < this.l.k().d().size(); i++) {
            java.lang.String str = this.l.k().d().get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList.add(this.l.l().b(str));
            }
        }
        if (arrayList.isEmpty()) {
            a(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        synchronized (this.P) {
            this.R = b(arrayList);
        }
        if (com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            a(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO, false);
            return;
        }
        java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.P.values().iterator();
        while (it.hasNext()) {
            this.R.a(it.next());
        }
        this.P.clear();
    }

    private void O() {
        if (this.C) {
            M();
        }
    }

    private void P() {
        if (this.B) {
            N();
        }
    }

    private boolean b(java.util.List<com.ironsource.mediationsdk.IronSource.a> list, boolean z, com.ironsource.N3 n3) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        try {
            this.t = list;
            c(true);
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "onInitSuccess()", 1);
            com.ironsource.mediationsdk.utils.IronSourceUtils.i("init success");
            if (z) {
                org.json.JSONObject b2 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(false);
                try {
                    b2.put("revived", true);
                } catch (org.json.JSONException e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                }
                com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.FIRST_INSTANCE_RESULT, b2));
            }
            int b3 = n3.b().f().b();
            if (b3 >= 0) {
                com.ironsource.V3 v3 = new com.ironsource.V3();
                v3.a(b3);
                v3.a(b3, this.l.l().d());
            }
            com.ironsource.F9.i().h();
            com.ironsource.C3065ge.i().h();
            com.ironsource.Jb.Y().q().h();
            com.ironsource.mediationsdk.c.b().b(i(), j());
            for (com.ironsource.mediationsdk.IronSource.a aVar : com.ironsource.mediationsdk.IronSource.a.values()) {
                if (this.v.contains(aVar)) {
                    if (list.contains(aVar)) {
                        b(aVar);
                    } else {
                        a(aVar, false);
                    }
                }
            }
            com.ironsource.Cc l = l();
            if (l != null) {
                l.a(this.l);
            }
            return true;
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            com.ironsource.Cc l2 = l();
            if (l2 != null) {
                l2.onInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "onInitSuccess() had failed"));
            }
            return false;
        }
    }

    private synchronized void c(boolean z) {
        this.s = z;
    }

    private void d(android.content.Context context) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.j;
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        com.ironsource.Df.a().a(new com.ironsource.K6(context));
        com.ironsource.Jb.Y().q().a(context, this.y);
        com.ironsource.F9.i().a(context, this.y);
        com.ironsource.C3065ge.i().a(context, this.y);
        com.ironsource.C3010dd.P.a(context, this.y);
    }

    public static com.ironsource.mediationsdk.p h() {
        return com.ironsource.mediationsdk.p.c.f6457a;
    }

    private synchronized com.ironsource.Cc l() {
        return this.J;
    }

    private void p() {
        this.h = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger(0);
        this.i = new com.ironsource.C3366xb();
    }

    private boolean q() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality");
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("AdQuality SDK exist: " + cls.getName());
            return true;
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("No AdQuality SDK found");
            return false;
        }
    }

    private boolean r() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().b() == null || this.l.c().b().b() == null) ? false : true;
    }

    private boolean s() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().c() == null) ? false : true;
    }

    private boolean t() {
        return s() && u();
    }

    private boolean u() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.k() == null || this.l.k().a() == null || this.l.k().a().size() <= 0) ? false : true;
    }

    private synchronized boolean w() {
        return this.s;
    }

    private boolean x() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.c() == null || this.l.c().d() == null) ? false : true;
    }

    private boolean y() {
        return x() && z();
    }

    private boolean z() {
        com.ironsource.Ve ve = this.l;
        return (ve == null || ve.k() == null || this.l.k().b() == null || this.l.k().b().size() <= 0) ? false : true;
    }

    public boolean G() {
        return w();
    }

    public void H() {
        this.W = false;
    }

    public void I() {
        if (a0) {
            return;
        }
        a0 = true;
        org.json.JSONObject b2 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(false);
        try {
            b2.put("status", "false");
            b2.put("errorCode", 1);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.FIRST_INSTANCE_RESULT, b2));
    }

    public void a(long j, com.ironsource.Ve.a aVar) {
        org.json.JSONObject b2 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(v());
        try {
            b2.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, j);
            b2.put("sessionDepth", this.A);
            b2.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.INIT_COMPLETE, b2));
    }

    @Override // com.ironsource.O4.a
    public void e(java.lang.String str) {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            com.ironsource.mediationsdk.demandOnly.c cVar = this.S;
            if (cVar != null) {
                cVar.a(str);
            }
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    @Override // com.ironsource.S9
    public void f(java.lang.String str) {
        try {
            java.lang.String str2 = this.f6455a + ":setMediationType(mediationType:" + str + ")";
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
            com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, str2, 1);
            if (a(str, 1, 64) && k(str)) {
                this.q = str;
                this.U.f(str);
            } else {
                this.h.log(ironSourceTag, " mediationType value is invalid - should be alphanumeric and 1-64 chars in length", 1);
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, this.f6455a + ":setMediationType(mediationType:" + str + ")", e);
        }
    }

    @Override // com.ironsource.Kc
    public void g(java.lang.String str) {
        try {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "onInitFailed(reason:" + str + ")", 1);
            com.ironsource.mediationsdk.utils.IronSourceUtils.i("Mediation init failed");
            if (this.i != null) {
                java.util.Iterator<com.ironsource.mediationsdk.IronSource.a> it = this.v.iterator();
                while (it.hasNext()) {
                    a(it.next(), true);
                }
            }
            com.ironsource.Cc l = l();
            if (l != null) {
                l.onInitFailed(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed"));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    public java.lang.String i() {
        return this.m;
    }

    public void j(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.API.verbose("userId = " + str);
        this.n = str;
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.SET_USER_ID, com.ironsource.mediationsdk.utils.IronSourceUtils.a(false)));
        com.ironsource.mediationsdk.adquality.AdQualityBridge adQualityBridge = this.X;
        if (adQualityBridge != null) {
            adQualityBridge.changeUserId(str);
        }
    }

    public java.lang.String k() {
        return this.q;
    }

    public java.util.Map<java.lang.String, java.lang.String> m() {
        return this.p;
    }

    public com.ironsource.C2953aa n() {
        return this.y;
    }

    public java.lang.String o() {
        return this.u;
    }

    boolean v() {
        return this.B || this.C || this.D;
    }

    private boolean k(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    private com.ironsource.M3 l(java.lang.String str) {
        com.ironsource.M3 m3 = new com.ironsource.M3();
        if (str == null) {
            m3.a(new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, "Init Fail - appKey is missing"));
        } else if (!a(str, 5, 10)) {
            m3.a(com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError("appKey", str, "length should be between 5-10 characters"));
        } else if (!k(str)) {
            m3.a(com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidCredentialsError("appKey", str, "should contain only english characters and numbers"));
        }
        return m3;
    }

    public com.ironsource.Yb c() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> a2 = a(this.l.k().c());
        if (a2.size() > 0) {
            return new com.ironsource.Yb(a2, this.l.c().e(), com.ironsource.mediationsdk.utils.IronSourceUtils.f(), com.ironsource.C3150la.b(), this.y);
        }
        org.json.JSONObject a3 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(false, true, 1);
        a(a3, new java.lang.Object[][]{new java.lang.Object[]{"errorCode", 1010}});
        a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_NT_INIT_FAILED, a3);
        return null;
    }

    @Override // com.ironsource.O4.c
    public synchronized boolean h(java.lang.String str) {
        boolean z;
        com.ironsource.mediationsdk.demandOnly.k kVar = this.R;
        if (kVar != null) {
            z = kVar.a(str);
        }
        return z;
    }

    public com.ironsource.C2955ac i(java.lang.String str) {
        com.ironsource.Pb e = this.l.c().e();
        if (e == null) {
            return null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return e.e();
        }
        com.ironsource.C2955ac a2 = e.a(str);
        return a2 != null ? a2 : e.e();
    }

    p(com.ironsource.InterfaceC3362x7 interfaceC3362x7, com.ironsource.InterfaceC3362x7.a aVar, com.ironsource.L7 l7, com.ironsource.InterfaceC3129k7 interfaceC3129k7, com.ironsource.I8.a aVar2) {
        this.f6455a = getClass().getName();
        this.b = "!SDK-VERSION-STRING!:com.ironsource:mediationsdk:\u200b9.4.0";
        this.k = new java.lang.Object();
        this.l = null;
        this.m = null;
        this.n = "";
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = false;
        this.x = true;
        this.z = "sessionDepth";
        this.I = null;
        this.W = false;
        this.c = interfaceC3362x7;
        this.d = aVar;
        this.e = l7;
        this.f = interfaceC3129k7;
        this.g = aVar2;
        p();
        this.j = new java.util.concurrent.atomic.AtomicBoolean();
        this.v = new java.util.HashSet();
        this.w = new java.util.HashSet();
        this.C = false;
        this.B = false;
        this.D = false;
        this.r = new java.util.concurrent.atomic.AtomicBoolean(true);
        this.A = 0;
        this.E = false;
        this.F = false;
        this.G = false;
        this.u = com.ironsource.mediationsdk.utils.IronSourceUtils.d();
        this.H = java.lang.Boolean.FALSE;
        this.M = false;
        this.J = null;
        this.K = true;
        this.N = new java.util.concurrent.ConcurrentHashMap<>();
        this.P = new java.util.concurrent.ConcurrentHashMap<>();
        this.O = new java.util.concurrent.ConcurrentHashMap<>();
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = new com.ironsource.N5();
        com.ironsource.T9 t9 = new com.ironsource.T9();
        this.U = t9;
        this.V = new com.ironsource.R6(t9);
        this.X = null;
        this.Y = new com.ironsource.W7.a();
        this.Z = new com.ironsource.W7.b();
    }

    @Override // com.ironsource.O4.b
    public synchronized boolean d(java.lang.String str) {
        boolean z;
        com.ironsource.mediationsdk.demandOnly.f fVar = this.Q;
        if (fVar != null) {
            z = fVar.b(str);
        }
        return z;
    }

    java.lang.Boolean d() {
        return this.I;
    }

    public com.ironsource.Ve e() {
        return this.l;
    }

    public java.lang.String j() {
        return this.n;
    }

    private boolean d(com.ironsource.Ve ve) {
        com.ironsource.mediationsdk.adquality.a a2 = ve.c().a();
        return this.X == null && a2 != null && a2.b() && com.ironsource.mediationsdk.adquality.AdQualityBridge.adQualityAvailable();
    }

    public synchronized com.ironsource.mediationsdk.logger.IronSourceError a(android.content.Context context, java.lang.String str, boolean z, com.ironsource.Cc cc, com.ironsource.mediationsdk.IronSource.a... aVarArr) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("GitHash: 9064f35");
        if (!com.ironsource.Y9.a((java.lang.Object) context, "Init Failed - provided context is null")) {
            g("Provided context is null");
            return new com.ironsource.mediationsdk.logger.IronSourceError(2000, "Provided context is null");
        }
        this.g.a(context);
        boolean z2 = context instanceof android.app.Activity;
        if (z2) {
            a((android.app.Activity) context);
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.r;
        if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
            com.ironsource.Ee.f5686a.a(cc == null);
            if ((aVarArr == null || aVarArr.length == 0) && cc == null) {
                for (com.ironsource.mediationsdk.IronSource.a aVar : com.ironsource.mediationsdk.IronSource.a.values()) {
                    this.v.add(aVar);
                }
                this.E = true;
                this.F = true;
                this.G = true;
            } else {
                for (com.ironsource.mediationsdk.IronSource.a aVar2 : aVarArr) {
                    this.v.add(aVar2);
                    this.w.add(aVar2);
                    if (aVar2.equals(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL)) {
                        this.F = true;
                    }
                    if (aVar2.equals(com.ironsource.mediationsdk.IronSource.a.BANNER)) {
                        this.G = true;
                    }
                    if (aVar2.equals(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO)) {
                        this.E = true;
                    }
                }
            }
            com.ironsource.mediationsdk.logger.IronLog.API.info("init(appKey:" + str + ")");
            com.ironsource.M3 l = l(str);
            if (l.b()) {
                this.m = str;
            }
            com.ironsource.Ve a2 = a(context, this.m);
            if (a2 != null) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("init cache exists");
                a(a2.c().b().f());
            } else {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("init cache does not exist");
            }
            com.ironsource.environment.ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
            this.d.a(context.getApplicationContext(), java.util.concurrent.TimeUnit.HOURS.toMillis(com.ironsource.V4.f6012a.d()));
            this.U.g(com.unity3d.mediation.LevelPlay.getSdkVersion());
            this.U.a(com.ironsource.O7.a());
            this.U.b(com.ironsource.mediationsdk.utils.IronSourceUtils.f(context));
            this.U.a(com.ironsource.C3140l0.a());
            J();
            d(context);
            if (this.m == null) {
                com.ironsource.mediationsdk.q.c().e();
                if (this.v.contains(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO)) {
                    com.ironsource.Md.a().a(false, (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo) null);
                }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, l.a().toString(), 1);
                return new com.ironsource.mediationsdk.logger.IronSourceError(2010, "App key is null");
            }
            this.U.a(context);
            this.U.c(this.m);
            this.U.h(this.u);
            if (this.x) {
                org.json.JSONObject b2 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(z);
                if (aVarArr != null) {
                    for (com.ironsource.mediationsdk.IronSource.a aVar3 : aVarArr) {
                        try {
                            b2.put(aVar3.toString(), true);
                        } catch (java.lang.Exception e) {
                            com.ironsource.C3180n4.d().a(e);
                        }
                    }
                }
                int i = this.A + 1;
                this.A = i;
                a(z2, z, i, b2, cc != null);
                this.x = false;
            }
            return null;
        }
        if (aVarArr != null) {
            a(z2, z, cc != null, aVarArr);
        } else {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Multiple calls to init without ad units are not allowed", 3);
        }
        com.ironsource.De b3 = com.ironsource.Ee.f5686a.b();
        if (w()) {
            a(this.l);
            return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_INIT_ALREADY_FINISHED, "Already finished init");
        }
        if (b3 == com.ironsource.De.INIT_FAILED) {
            return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_LEGACY_INIT_FAILED, "Legacy init failed");
        }
        if (b3 != com.ironsource.De.NOT_INIT) {
            if (cc != null) {
                a(cc);
            }
            return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, "Old Api init in progress");
        }
        return new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, "Already called new init");
    }

    private com.ironsource.P4 f() {
        return new com.ironsource.P4.b(com.ironsource.Jb.Y().q(), new com.ironsource.P4.a("IronSource"));
    }

    public java.lang.String g() {
        return this.o;
    }

    @Override // com.ironsource.O4.b
    public void c(java.lang.String str) {
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "showDemandOnlyInterstitial() instanceId=" + str, 1);
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener a2 = this.Y.a(str);
        try {
            if (!this.C) {
                com.ironsource.mediationsdk.logger.IronLog.API.error("Interstitial was initialized in mediation mode. Use showInterstitial instead");
                a2.onInterstitialAdShowFailed(str, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was initialized in mediation mode. Use showInterstitial instead"));
                return;
            }
            com.ironsource.mediationsdk.demandOnly.f fVar = this.Q;
            if (fVar == null) {
                com.ironsource.mediationsdk.logger.IronLog.API.error("Interstitial was not initiated");
                a2.onInterstitialAdShowFailed(str, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial was not initiated"));
            } else {
                fVar.a(str);
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.API.error(e.getMessage());
            if (a2 != null) {
                a2.onInterstitialAdShowFailed(str, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", "Interstitial"));
            }
        }
    }

    public void c(android.content.Context context) {
        com.ironsource.Kf kf = com.ironsource.Kf.f5806a;
        kf.b();
        if (!w()) {
            kf.a(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_TEST_SUITE_SDK_NOT_INITIALIZED);
            com.ironsource.mediationsdk.logger.IronLog.API.error("TestSuite cannot be launched, SDK not initialized");
            return;
        }
        if (!c(this.l)) {
            kf.a(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_TEST_SUITE_DISABLED);
            com.ironsource.mediationsdk.logger.IronLog.API.error(com.ironsource.mediationsdk.utils.IronSourceConstants.errorMessage_TEST_SUITE_DISABLED);
        } else if (!com.ironsource.mediationsdk.utils.IronSourceUtils.g(context)) {
            kf.a(com.ironsource.mediationsdk.utils.IronSourceConstants.errorCode_TEST_SUITE_NO_NETWORK_CONNECTIVITY);
            com.ironsource.mediationsdk.logger.IronLog.API.error("TestSuite cannot be launched, No network connectivity");
        } else {
            new com.ironsource.Lf().a(context, i(), this.l.j(), com.unity3d.mediation.LevelPlay.getSdkVersion(), this.l.c().g().b(), d(), this.K);
            this.W = true;
            kf.c();
        }
    }

    private void b(com.ironsource.mediationsdk.IronSource.a aVar) {
        int i = com.ironsource.mediationsdk.p.a.f6456a[aVar.ordinal()];
        if (i == 1) {
            P();
        } else if (i == 2) {
            O();
        } else {
            if (i != 3) {
                return;
            }
            K();
        }
    }

    private com.ironsource.mediationsdk.demandOnly.k b(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> list) {
        com.ironsource.C3029ee f = this.l.c().f();
        com.ironsource.P4.a aVar = new com.ironsource.P4.a("Mediation");
        if (f.d()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.k(list, f, com.ironsource.mediationsdk.c.b(), this.Z, i(), j(), new com.ironsource.P4.b(com.ironsource.C3065ge.i(), aVar));
    }

    private boolean c(com.ironsource.Ve ve) {
        return ve != null && ve.p();
    }

    @Override // com.ironsource.S9
    public boolean b(java.lang.String str) {
        try {
            com.ironsource.M3 m3 = new com.ironsource.M3();
            a(str, m3);
            if (m3.b()) {
                this.o = str;
                com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.SET_USER_ID, com.ironsource.mediationsdk.utils.IronSourceUtils.a(true)));
                return true;
            }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, m3.a().toString(), 2);
            return false;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            this.h.logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, this.f6455a + ":setDynamicUserId(dynamicUserId:" + str + ")", e);
            return false;
        }
    }

    @Override // com.ironsource.O4.c
    public synchronized void b(android.app.Activity activity, java.lang.String str) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity()).a(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO).b(), this.Z.a(str));
    }

    @Override // com.ironsource.O4.b
    public synchronized void b(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity()).a(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL).a(true).a(str2).b(), this.Y.a(str));
    }

    public com.ironsource.mediationsdk.o b(android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBanner()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        com.ironsource.environment.ContextProvider.getInstance().updateActivity(activity);
        return new com.ironsource.mediationsdk.o(activity, iSBannerSize);
    }

    private boolean b(com.ironsource.mediationsdk.demandOnly.h.b bVar) {
        synchronized (this.O) {
            if (this.S != null) {
                return false;
            }
            this.O.put(bVar.e(), bVar);
            return true;
        }
    }

    private void a(com.ironsource.M1 m1) {
        com.ironsource.V4 v4 = com.ironsource.V4.f6012a;
        v4.c(m1.g());
        v4.a(m1.f());
        v4.a(m1.j());
        this.f.a(m1);
    }

    public java.lang.String b() {
        com.ironsource.mediationsdk.q c2 = com.ironsource.mediationsdk.q.c();
        int i = com.ironsource.mediationsdk.p.a.b[c2.a().ordinal()];
        if (i != 1) {
            return i != 2 ? i != 3 ? (i == 4 && !B()) ? "No Native Ad configurations found" : "" : c2.d() ? "init() had failed" : "init() not finished yet" : "init() had failed";
        }
        return "init() must be called first";
    }

    public synchronized java.util.List<com.ironsource.mediationsdk.IronSource.a> a(android.content.Context context, java.lang.String str, boolean z, com.ironsource.mediationsdk.IronSource.a... aVarArr) {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        if ((aVarArr == null || aVarArr.length == 0) && z) {
            if (this.E) {
                a(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO);
            } else {
                this.B = true;
                arrayList.add(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO);
            }
            if (this.F) {
                a(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL);
            } else {
                this.C = true;
                arrayList.add(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL);
            }
            if (this.G) {
                a(com.ironsource.mediationsdk.IronSource.a.BANNER);
            } else {
                this.D = true;
                arrayList.add(com.ironsource.mediationsdk.IronSource.a.BANNER);
            }
        } else {
            for (com.ironsource.mediationsdk.IronSource.a aVar : aVarArr) {
                if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL)) {
                    if (this.F) {
                        a(aVar);
                    } else {
                        this.C = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
                if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO)) {
                    if (this.E) {
                        a(aVar);
                    } else {
                        this.B = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
                if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.BANNER)) {
                    if (this.G) {
                        a(aVar);
                    } else {
                        this.D = true;
                        if (!arrayList.contains(aVar)) {
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        }
        if (context != null) {
            if (context instanceof android.app.Activity) {
                a((android.app.Activity) context);
            }
            com.ironsource.environment.ContextProvider.getInstance().updateAppContext(context.getApplicationContext());
        }
        return arrayList;
    }

    com.ironsource.Ve b(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.p.b bVar) {
        synchronized (this.k) {
            com.ironsource.Ve ve = this.l;
            if (ve != null) {
                return new com.ironsource.Ve(ve);
            }
            com.ironsource.Ve a2 = a(context, str, bVar);
            if (a2 == null || !a2.q()) {
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager logger = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger();
                com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
                a2 = a(context, i());
                if (a2 != null) {
                    com.ironsource.mediationsdk.logger.IronSourceError buildUsingCachedConfigurationError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(i(), str);
                    this.h.log(ironSourceTag, buildUsingCachedConfigurationError.toString() + ": " + a2.toString(), 1);
                    com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.USING_CACHE_FOR_INIT_EVENT, com.ironsource.mediationsdk.utils.IronSourceUtils.b(false)));
                }
            }
            if (a2 != null) {
                this.l = a2;
                com.ironsource.mediationsdk.utils.IronSourceUtils.e(context, a2.toString());
                b(this.l, context);
                com.ironsource.F9.i().c(true);
                com.ironsource.C3065ge.i().c(true);
                com.ironsource.C3010dd.P.c(true);
                com.ironsource.Jb.Y().q().c(true);
            }
            return a2;
        }
    }

    private void a(com.ironsource.mediationsdk.IronSource.a aVar) {
        java.lang.String str = aVar + " ad unit has already been initialized";
        this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, str, 3);
        com.ironsource.mediationsdk.utils.IronSourceUtils.i(str);
    }

    private synchronized void a(boolean z, boolean z2, boolean z3, com.ironsource.mediationsdk.IronSource.a... aVarArr) {
        int i = 0;
        for (com.ironsource.mediationsdk.IronSource.a aVar : aVarArr) {
            if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL)) {
                this.F = true;
            } else if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.BANNER)) {
                this.G = true;
            } else if (aVar.equals(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO)) {
                this.E = true;
            }
        }
        if (com.ironsource.mediationsdk.q.c().a() == com.ironsource.mediationsdk.q.d.INIT_FAILED) {
            try {
                if (this.i != null) {
                    int length = aVarArr.length;
                    while (i < length) {
                        com.ironsource.mediationsdk.IronSource.a aVar2 = aVarArr[i];
                        if (!this.v.contains(aVar2)) {
                            a(aVar2, true);
                        }
                        i++;
                    }
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            return;
        }
        if (!w()) {
            org.json.JSONObject b2 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(z2);
            int length2 = aVarArr.length;
            while (i < length2) {
                com.ironsource.mediationsdk.IronSource.a aVar3 = aVarArr[i];
                if (!this.v.contains(aVar3)) {
                    this.v.add(aVar3);
                    this.w.add(aVar3);
                    try {
                        b2.put(aVar3.toString(), true);
                    } catch (java.lang.Exception e2) {
                        com.ironsource.C3180n4.d().a(e2);
                        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                    }
                } else {
                    this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, aVar3 + " ad unit has started initializing.", 3);
                }
                i++;
            }
            int i2 = this.A + 1;
            this.A = i2;
            a(z, z2, i2, b2, z3);
            return;
        }
        if (this.t == null) {
            return;
        }
        try {
            new com.ironsource.Kb().a(this.l.c().b().e().b(), v());
        } catch (java.lang.Exception e3) {
            com.ironsource.C3180n4.d().a(e3);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e3.toString());
        }
        org.json.JSONObject b3 = com.ironsource.mediationsdk.utils.IronSourceUtils.b(z2);
        for (com.ironsource.mediationsdk.IronSource.a aVar4 : aVarArr) {
            if (!this.v.contains(aVar4)) {
                this.v.add(aVar4);
                this.w.add(aVar4);
                try {
                    b3.put(aVar4.toString(), true);
                } catch (java.lang.Exception e4) {
                    com.ironsource.C3180n4.d().a(e4);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e4.toString());
                }
                java.util.List<com.ironsource.mediationsdk.IronSource.a> list = this.t;
                if (list != null && list.contains(aVar4)) {
                    b(aVar4);
                } else {
                    a(aVar4, false);
                }
            } else {
                a(aVar4);
            }
        }
        int i3 = this.A + 1;
        this.A = i3;
        a(z, z2, i3, b3, z3);
        return;
    }

    public void b(com.ironsource.Ve ve, android.content.Context context) {
        b(ve);
        a(ve, context);
    }

    private void b(com.ironsource.Ve ve) {
        this.h.setLoggerDebugLevel("console", ve.c().b().h().a());
    }

    @Override // com.ironsource.S9
    public java.lang.String b(android.content.Context context) {
        java.lang.String J = this.c.J(context);
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.GET_ADVERTISING_ID, com.ironsource.mediationsdk.utils.IronSourceUtils.b(false)));
        return !android.text.TextUtils.isEmpty(J) ? J : "";
    }

    private void b(com.ironsource.EnumC3378y5 enumC3378y5, org.json.JSONObject jSONObject) {
        com.ironsource.C3065ge.i().a(new com.ironsource.C3360x5(enumC3378y5, jSONObject));
    }

    public void b(boolean z) {
        this.I = java.lang.Boolean.valueOf(z);
        com.ironsource.mediationsdk.c.b().b(z);
        this.U.a(z);
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(z ? com.ironsource.EnumC3378y5.CONSENT_TRUE_CODE : com.ironsource.EnumC3378y5.CONSENT_FALSE_CODE, com.ironsource.mediationsdk.utils.IronSourceUtils.b(false)));
    }

    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        com.ironsource.mediationsdk.c.b().b(new com.ironsource.mediationsdk.t(str, jSONObject));
    }

    @Override // com.ironsource.U8
    public void b(com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        if (com.ironsource.Y9.a((java.lang.Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            com.ironsource.C3150la.b().a(impressionDataListener);
            com.ironsource.mediationsdk.logger.IronLog.API.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    private void a(boolean z, boolean z2, int i, org.json.JSONObject jSONObject, boolean z3) {
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (z2) {
                sb.append(java.lang.String.format(",Activity=%s", java.lang.Boolean.valueOf(com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null)));
            } else if (!z) {
                sb.append(",init_context_flow");
            }
            sb.append(java.lang.String.format(",cachedUserAgent=%s", java.lang.Boolean.valueOf(this.c.n())));
            jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, sb.toString());
            jSONObject.put("sessionDepth", i);
            if (z3) {
                if (z2) {
                    jSONObject.put("isMultipleAdObjects", 1);
                } else {
                    jSONObject.put("isMultipleAdUnits", 1);
                }
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.FIRST_INSTANCE, jSONObject));
    }

    private synchronized void a(com.ironsource.Cc cc) {
        this.J = cc;
    }

    public boolean a(boolean z, com.ironsource.Ve ve) {
        a(ve);
        if (w()) {
            return true;
        }
        synchronized (this.k) {
            this.l = ve;
        }
        return b(ve.h(), z, ve.c());
    }

    @Override // com.ironsource.Kc
    public void a(java.util.List<com.ironsource.mediationsdk.IronSource.a> list, boolean z, com.ironsource.N3 n3) {
        a(this.l);
        b(list, z, n3);
    }

    private void a(com.ironsource.Ve ve) {
        if (q() && d(ve)) {
            com.ironsource.mediationsdk.adquality.AdQualityBridge adQualityBridge = new com.ironsource.mediationsdk.adquality.AdQualityBridge(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), i(), j(), new com.ironsource.C3104j0(), ve.c().b().h().a());
            this.X = adQualityBridge;
            com.ironsource.C2953aa c2953aa = this.y;
            if (c2953aa != null) {
                adQualityBridge.setSegment(c2953aa);
            }
        }
    }

    private com.ironsource.mediationsdk.demandOnly.f a(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> list) {
        com.ironsource.D9 d = this.l.c().d();
        com.ironsource.P4.a aVar = new com.ironsource.P4.a("Mediation");
        if (d.j()) {
            aVar.a("isOneFlow", 1);
        }
        return new com.ironsource.mediationsdk.demandOnly.f(list, d, com.ironsource.mediationsdk.c.b(), this.Y, i(), j(), new com.ironsource.P4.b(com.ironsource.F9.i(), aVar));
    }

    private java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> a(java.util.ArrayList<java.lang.String> arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            java.lang.String str = arrayList.get(i);
            if (!android.text.TextUtils.isEmpty(str)) {
                arrayList2.add(this.l.l().b(str));
            }
        }
        return arrayList2;
    }

    @Override // com.ironsource.Kc
    public void a() {
        if (this.H.booleanValue()) {
            this.H = java.lang.Boolean.FALSE;
            com.ironsource.mediationsdk.l.a().b(com.ironsource.mediationsdk.IronSource.a.BANNER, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_WHILE_LONG_INITIATION, "init() had failed"));
        }
        if (this.M) {
            this.M = false;
            com.ironsource.mediationsdk.l.a().b(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
        }
        if (this.L) {
            this.L = false;
            com.ironsource.mediationsdk.l.a().b(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        synchronized (this.N) {
            java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.N.values().iterator();
            while (it.hasNext()) {
                java.lang.String e = it.next().e();
                this.Y.a(e).onInterstitialAdLoadFailed(e, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            }
            this.N.clear();
        }
        synchronized (this.P) {
            java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it2 = this.P.values().iterator();
            while (it2.hasNext()) {
                java.lang.String e2 = it2.next().e();
                this.Z.a(e2).onRewardedVideoAdLoadFailed(e2, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            }
            this.P.clear();
        }
        synchronized (this.O) {
            for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.O.values()) {
                com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout g = bVar.g();
                if (g != null) {
                    g.getListener().a(bVar.e(), com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Banner"));
                }
            }
            this.O.clear();
        }
    }

    private void a(com.ironsource.mediationsdk.IronSource.a aVar, boolean z) {
        int i = com.ironsource.mediationsdk.p.a.f6456a[aVar.ordinal()];
        if (i == 1) {
            if (this.B) {
                java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it = this.P.values().iterator();
                while (it.hasNext()) {
                    java.lang.String e = it.next().e();
                    this.Z.a(e).onRewardedVideoAdLoadFailed(e, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                }
                this.P.clear();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && this.D) {
                for (com.ironsource.mediationsdk.demandOnly.h.b bVar : this.O.values()) {
                    com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout g = bVar.g();
                    if (g != null) {
                        g.getListener().a(bVar.e(), com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Banner"));
                    }
                }
                this.O.clear();
                return;
            }
            return;
        }
        if (this.C) {
            java.util.Iterator<com.ironsource.mediationsdk.demandOnly.h.d> it2 = this.N.values().iterator();
            while (it2.hasNext()) {
                java.lang.String e2 = it2.next().e();
                this.Y.a(e2).onInterstitialAdLoadFailed(e2, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("initISDemandOnly() had failed", "Interstitial"));
            }
            this.N.clear();
        }
    }

    public void a(com.ironsource.C2953aa c2953aa) {
        this.y = c2953aa;
        com.ironsource.mediationsdk.adquality.AdQualityBridge adQualityBridge = this.X;
        if (adQualityBridge != null) {
            adQualityBridge.setSegment(c2953aa);
        }
        com.ironsource.F9.i().a(this.y);
        com.ironsource.C3065ge.i().a(this.y);
        com.ironsource.C3010dd.P.a(this.y);
        com.ironsource.Jb.Y().q().a(this.y);
    }

    @Override // com.ironsource.S9
    public void a(boolean z) {
        com.ironsource.mediationsdk.c.b().a(z);
    }

    @Override // com.ironsource.O4.c
    public synchronized void a(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(str2).a(activity, com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity()).a(true).a(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO).b(), this.Z.a(str));
    }

    void a(com.ironsource.mediationsdk.demandOnly.h.d dVar, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        java.lang.String e = dVar.e();
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.API;
        ironLog.info("instanceId=" + e);
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.API.error(th.getMessage());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new com.ironsource.mediationsdk.logger.IronSourceError(510, th.getMessage()));
        }
        if (!this.E) {
            ironLog.error("initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new com.ironsource.mediationsdk.logger.IronSourceError(510, "initISDemandOnly() must be called before loadDemandOnlyRewardedVideo()"));
            return;
        }
        if (!this.B) {
            ironLog.error("Rewarded video was initialized in mediation mode");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new com.ironsource.mediationsdk.logger.IronSourceError(510, "Rewarded video was initialized in mediation mode"));
            return;
        }
        com.ironsource.mediationsdk.q.d a2 = com.ironsource.mediationsdk.q.c().a();
        if (a2 == com.ironsource.mediationsdk.q.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        com.ironsource.mediationsdk.logger.IronSourceError a3 = dVar.a();
        if (a3 != null) {
            if (a3.getErrorCode() == 1060) {
                b(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_CALLED_RV_LOAD_WITH_NO_ACTIVITY, com.ironsource.mediationsdk.utils.IronSourceUtils.a(true, !android.text.TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(a3.toString());
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, a3);
            return;
        }
        a(dVar.d());
        if (a2 == com.ironsource.mediationsdk.q.d.INIT_IN_PROGRESS) {
            if (com.ironsource.mediationsdk.q.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            synchronized (this.P) {
                this.P.put(e, dVar);
            }
            if (android.text.TextUtils.isEmpty(dVar.b())) {
                return;
            }
            b(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, com.ironsource.mediationsdk.utils.IronSourceUtils.a(true, !android.text.TextUtils.isEmpty(dVar.b()), 1));
            return;
        }
        if (!E()) {
            ironLog.error("No rewarded video configurations found");
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", com.ironsource.mediationsdk.utils.IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        synchronized (this.P) {
            com.ironsource.mediationsdk.demandOnly.k kVar = this.R;
            if (kVar == null) {
                this.P.put(e, dVar);
                if (!android.text.TextUtils.isEmpty(dVar.b())) {
                    b(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_IAB_RV_LOAD_FAILED_INIT_IN_PROGRESS, com.ironsource.mediationsdk.utils.IronSourceUtils.a(true, !android.text.TextUtils.isEmpty(dVar.b()), 1));
                }
                return;
            }
            kVar.a(dVar);
            return;
        }
        com.ironsource.C3180n4.d().a(th);
        com.ironsource.mediationsdk.logger.IronLog.API.error(th.getMessage());
        iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(e, new com.ironsource.mediationsdk.logger.IronSourceError(510, th.getMessage()));
    }

    @Override // com.ironsource.O4.c
    public synchronized void a(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.API;
        ironLog.info("instanceId=" + str);
        com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener a2 = this.Z.a(str);
        try {
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.API.error(e.getMessage());
            if (a2 != null) {
                a2.onRewardedVideoAdShowFailed(str, new com.ironsource.mediationsdk.logger.IronSourceError(510, e.getMessage()));
            }
        }
        if (!this.B) {
            ironLog.error("Rewarded video was initialized in mediation mode. Use showRewardedVideo instead");
            a2.onRewardedVideoAdShowFailed(str, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was initialized in mediation mode. Use showRewardedVideo instead"));
            return;
        }
        com.ironsource.mediationsdk.demandOnly.k kVar = this.R;
        if (kVar == null) {
            ironLog.error("Rewarded video was not initiated");
            a2.onRewardedVideoAdShowFailed(str, new com.ironsource.mediationsdk.logger.IronSourceError(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_INIT_FAILED, "Rewarded video was not initiated"));
        } else {
            kVar.b(str);
        }
    }

    @Override // com.ironsource.O4.c
    public void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        this.Z.a((com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener>) iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.O4.b
    public synchronized void a(android.app.Activity activity, java.lang.String str) {
        a(new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity, com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity()).a(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL).b(), this.Y.a(str));
    }

    private synchronized void a(com.ironsource.mediationsdk.demandOnly.h.d dVar, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        java.lang.String e = dVar.e();
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.API;
        ironLog.info("instanceId=" + e);
        try {
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            com.ironsource.mediationsdk.logger.IronLog.API.error(th.getMessage());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new com.ironsource.mediationsdk.logger.IronSourceError(510, th.getMessage()));
        }
        if (!this.F) {
            ironLog.error("initISDemandOnly() must be called before loadISDemandOnlyInterstitial()");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new com.ironsource.mediationsdk.logger.IronSourceError(510, "initISDemandOnly() must be called before loadISDemandOnlyInterstitial()"));
            return;
        }
        if (!this.C) {
            ironLog.error("Interstitial was initialized in mediation mode. Use loadInterstitial instead");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, new com.ironsource.mediationsdk.logger.IronSourceError(510, "Interstitial was initialized in mediation mode. Use loadInterstitial instead"));
            return;
        }
        com.ironsource.mediationsdk.q.d a2 = com.ironsource.mediationsdk.q.c().a();
        if (a2 == com.ironsource.mediationsdk.q.d.INIT_FAILED) {
            ironLog.error("init() had failed");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            return;
        }
        com.ironsource.mediationsdk.logger.IronSourceError a3 = dVar.a();
        if (a3 != null) {
            if (a3.getErrorCode() == 1060) {
                b(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_CALLED_IS_LOAD_WITH_NO_ACTIVITY, com.ironsource.mediationsdk.utils.IronSourceUtils.a(true, !android.text.TextUtils.isEmpty(dVar.b()), 1));
            }
            ironLog.error(a3.toString());
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, a3);
            return;
        }
        a(dVar.d());
        if (a2 == com.ironsource.mediationsdk.q.d.INIT_IN_PROGRESS) {
            if (com.ironsource.mediationsdk.q.c().d()) {
                ironLog.error("init() had failed");
                iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("init() had failed", "Interstitial"));
            } else {
                synchronized (this.N) {
                    this.N.put(dVar.e(), dVar);
                }
                if (!android.text.TextUtils.isEmpty(dVar.e())) {
                    a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, com.ironsource.mediationsdk.utils.IronSourceUtils.a(true, !android.text.TextUtils.isEmpty(dVar.b()), 1));
                }
            }
            return;
        }
        if (!y()) {
            ironLog.error("No interstitial configurations found");
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(e, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", "Interstitial"));
            return;
        }
        synchronized (this.N) {
            com.ironsource.mediationsdk.demandOnly.f fVar = this.Q;
            if (fVar == null) {
                this.N.put(dVar.e(), dVar);
                if (!android.text.TextUtils.isEmpty(dVar.b())) {
                    a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_IAB_IS_LOAD_FAILED_INIT_IN_PROGRESS, com.ironsource.mediationsdk.utils.IronSourceUtils.a(true, !android.text.TextUtils.isEmpty(dVar.b()), 1));
                }
                return;
            }
            fVar.a(dVar);
        }
    }

    @Override // com.ironsource.O4.b
    public void a(com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        this.Y.a((com.ironsource.W7<com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener>) iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.O4.a
    public com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout a(android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager ironSourceLoggerManager = this.h;
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            this.h.log(ironSourceTag, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        com.ironsource.environment.ContextProvider.getInstance().updateActivity(activity);
        return new com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    @Override // com.ironsource.O4.a
    public synchronized void a(android.app.Activity activity, com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, java.lang.String str) {
        com.ironsource.mediationsdk.demandOnly.h.b a2 = new com.ironsource.mediationsdk.demandOnly.h.c().b(str).a(activity).a(iSDemandOnlyBannerLayout).a(com.ironsource.mediationsdk.IronSource.a.BANNER).a();
        com.ironsource.mediationsdk.logger.IronSourceError a3 = a2.a();
        if (a3 != null) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, a3.getErrorMessage(), 3);
            if (iSDemandOnlyBannerLayout != null) {
                iSDemandOnlyBannerLayout.getListener().a(str, a3);
            }
            return;
        }
        com.ironsource.mediationsdk.logger.IronSourceError a4 = a(com.ironsource.mediationsdk.q.c().a());
        if (a4 != null) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, a4.getErrorMessage(), 3);
            iSDemandOnlyBannerLayout.getListener().a(str, a4);
            return;
        }
        com.ironsource.environment.ContextProvider.getInstance().updateActivity(activity);
        if (a(a2)) {
            return;
        }
        if (!t()) {
            this.h.log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "No banner configurations found", 3);
            iSDemandOnlyBannerLayout.getListener().a(str, com.ironsource.mediationsdk.utils.ErrorBuilder.buildInitFailedError("the server response does not contain banner data", "Banner"));
        } else {
            if (b(a2)) {
                return;
            }
            this.S.a(iSDemandOnlyBannerLayout, str);
        }
    }

    private boolean a(com.ironsource.mediationsdk.demandOnly.h.b bVar) {
        if (com.ironsource.mediationsdk.q.c().a() != com.ironsource.mediationsdk.q.d.INIT_IN_PROGRESS) {
            return false;
        }
        synchronized (this.O) {
            this.O.put(bVar.e(), bVar);
        }
        return true;
    }

    private com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.mediationsdk.q.d dVar) {
        if (!this.G) {
            return new com.ironsource.mediationsdk.logger.IronSourceError(510, "ironSource SDK was not initialized");
        }
        if (!this.D) {
            return new com.ironsource.mediationsdk.logger.IronSourceError(510, "ironSource SDK was not initialized using Demand Only mode");
        }
        if (dVar == com.ironsource.mediationsdk.q.d.INIT_FAILED) {
            return new com.ironsource.mediationsdk.logger.IronSourceError(510, "ironSource initialization failed");
        }
        if (dVar == com.ironsource.mediationsdk.q.d.INIT_IN_PROGRESS && com.ironsource.mediationsdk.q.c().d()) {
            return new com.ironsource.mediationsdk.logger.IronSourceError(510, "ironSource initialization in progress");
        }
        return null;
    }

    public com.ironsource.Ve a(android.content.Context context, java.lang.String str) {
        if (com.ironsource.C3060g9.a(context)) {
            com.ironsource.C3358x3 c2 = com.ironsource.C3060g9.c(context);
            java.lang.String d = c2.d();
            java.lang.String f = c2.f();
            java.lang.String e = c2.e();
            if (d.equals(str)) {
                com.ironsource.Ve ve = new com.ironsource.Ve(context, d, f, e);
                ve.a(com.ironsource.Ve.a.CACHE);
                return ve;
            }
        }
        return null;
    }

    private com.ironsource.Ve a(android.content.Context context, java.lang.String str, com.ironsource.mediationsdk.p.b bVar) {
        com.ironsource.Ve ve = null;
        if (!com.ironsource.mediationsdk.utils.IronSourceUtils.g(context)) {
            return null;
        }
        try {
            java.lang.String b2 = b(context);
            if (android.text.TextUtils.isEmpty(b2)) {
                b2 = this.c.a(context);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            java.lang.String str2 = b2;
            com.ironsource.C2953aa c2953aa = this.y;
            java.lang.String a2 = com.ironsource.C3022e7.a(com.ironsource.Xe.a(context, i(), str, str2, k(), this.K, c2953aa != null ? c2953aa.f() : null, v()), com.ironsource.C3024e9.a().toString(), bVar);
            if (a2 == null) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("serverResponseString is null");
                return null;
            }
            if (com.ironsource.mediationsdk.utils.IronSourceUtils.g()) {
                com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
                ironLog.verbose("encrypt");
                org.json.JSONObject jSONObject = new org.json.JSONObject(a2);
                java.lang.String optString = jSONObject.optString(com.ironsource.Ve.n, null);
                if (android.text.TextUtils.isEmpty(optString)) {
                    ironLog.warning("encryptedResponse is empty - return null");
                    return null;
                }
                a2 = a(optString, java.lang.Boolean.valueOf(jSONObject.optBoolean("compression", false)));
                if (android.text.TextUtils.isEmpty(a2)) {
                    ironLog.warning("encoded response invalid - return null");
                    I();
                    return null;
                }
            }
            com.ironsource.Ve ve2 = new com.ironsource.Ve(context, i(), str, a2);
            try {
                ve2.a(com.ironsource.Ve.a.SERVER);
                if (ve2.q()) {
                    return ve2;
                }
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("response invalid - return null");
                return null;
            } catch (java.lang.Exception e) {
                e = e;
                ve = ve2;
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("exception = " + e);
                return ve;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    private java.lang.String a(java.lang.String str, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            return com.ironsource.I9.d(com.ironsource.C3127k5.b().c(), str);
        }
        return com.ironsource.I9.b(com.ironsource.C3127k5.b().c(), str);
    }

    private void a(com.ironsource.Ve ve, android.content.Context context) {
        boolean l = r() ? ve.c().b().b().l() : false;
        boolean l2 = D() ? ve.c().f().m().l() : false;
        boolean l3 = x() ? ve.c().d().i().l() : false;
        boolean l4 = s() ? ve.c().c().g().l() : false;
        boolean l5 = A() ? ve.c().e().g().l() : false;
        com.ironsource.C3028ed i = ve.c().b().i();
        boolean i2 = i.i();
        if (l) {
            a((com.ironsource.AbstractC3143l3) com.ironsource.Jb.Y().q(), ve.c().b().b(), context, ve, true);
        }
        if (l2) {
            a((com.ironsource.AbstractC3143l3) com.ironsource.C3065ge.i(), ve.c().f().m(), context, ve, true);
        } else {
            com.ironsource.C3065ge.i().a(false);
        }
        if (l3) {
            a((com.ironsource.AbstractC3143l3) com.ironsource.F9.i(), ve.c().d().i(), context, ve, true);
        } else if (l4) {
            a((com.ironsource.AbstractC3143l3) com.ironsource.F9.i(), ve.c().c().g(), context, ve, true);
        } else if (l5) {
            a((com.ironsource.AbstractC3143l3) com.ironsource.F9.i(), ve.c().e().g(), context, ve, true);
        } else {
            com.ironsource.F9.i().a(false);
        }
        com.ironsource.C3010dd c3010dd = com.ironsource.C3010dd.P;
        c3010dd.a(i2);
        if (i2) {
            c3010dd.b(i.j(), context);
            c3010dd.b(i.l(), context);
            c3010dd.c(i.k(), context);
            c3010dd.b(i.g());
            c3010dd.c(i.h());
        }
    }

    private void a(com.ironsource.AbstractC3143l3 abstractC3143l3, com.ironsource.J1 j1, android.content.Context context, com.ironsource.Ve ve, boolean z) {
        abstractC3143l3.a(z);
        abstractC3143l3.a(j1.c(), context);
        abstractC3143l3.b(j1.d(), context);
        abstractC3143l3.a(j1.f());
        abstractC3143l3.d(j1.e());
        abstractC3143l3.b(j1.a());
        abstractC3143l3.b(j1.i(), context);
        abstractC3143l3.c(j1.h(), context);
        abstractC3143l3.a(j1.j(), context);
        abstractC3143l3.d(j1.g(), context);
        abstractC3143l3.a(ve.c().b().j());
        abstractC3143l3.b(j1.k());
        abstractC3143l3.c(j1.b());
    }

    private void a(java.lang.String str, com.ironsource.M3 m3) {
        if (a(str, 1, 128)) {
            return;
        }
        m3.a(com.ironsource.mediationsdk.utils.ErrorBuilder.buildInvalidKeyValueError(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DYNAMIC_USER_ID, "dynamicUserId is invalid, should be between 1-128 chars in length."));
    }

    private boolean a(java.lang.String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }

    boolean a(com.ironsource.C3018e3 c3018e3) {
        return this.e.c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), c3018e3, com.ironsource.mediationsdk.IronSource.a.BANNER);
    }

    com.ironsource.C3135kd.b a(com.ironsource.C3064gd c3064gd) {
        return this.e.a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), c3064gd, com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO);
    }

    private void a(com.ironsource.EnumC3378y5 enumC3378y5, org.json.JSONObject jSONObject) {
        com.ironsource.F9.i().a(new com.ironsource.C3360x5(enumC3378y5, jSONObject));
    }

    private void a(org.json.JSONObject jSONObject, java.lang.Object[][] objArr) {
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    jSONObject.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "IronSourceObject addToDictionary: " + android.util.Log.getStackTraceString(e), 3);
            }
        }
    }

    public void a(java.lang.String str, java.util.List<java.lang.String> list) {
        java.lang.String checkMetaDataKeyValidity = com.ironsource.mediationsdk.metadata.MetaDataUtils.checkMetaDataKeyValidity(str);
        java.lang.String checkMetaDataValueValidity = com.ironsource.mediationsdk.metadata.MetaDataUtils.checkMetaDataValueValidity(list);
        if (checkMetaDataKeyValidity.length() > 0) {
            com.ironsource.mediationsdk.logger.IronLog.API.verbose(checkMetaDataKeyValidity);
            return;
        }
        if (checkMetaDataValueValidity.length() > 0) {
            com.ironsource.mediationsdk.logger.IronLog.API.verbose(checkMetaDataValueValidity);
            return;
        }
        com.ironsource.mediationsdk.metadata.MetaData formatMetaData = com.ironsource.mediationsdk.metadata.MetaDataUtils.formatMetaData(str, list);
        java.lang.String metaDataKey = formatMetaData.getMetaDataKey();
        java.util.List<java.lang.String> metaDataValue = formatMetaData.getMetaDataValue();
        if (com.ironsource.mediationsdk.metadata.MetaDataUtils.isMediationOnlyKey(metaDataKey)) {
            if (w() && com.ironsource.mediationsdk.metadata.MetaDataUtils.isMediationKeysBeforeInit(metaDataKey)) {
                com.ironsource.mediationsdk.logger.IronLog.API.error("setMetaData with key = " + metaDataKey + " must to be called before init");
            } else {
                com.ironsource.C3150la.b().a(metaDataKey, metaDataValue);
            }
        } else {
            com.ironsource.mediationsdk.c.b().c(metaDataKey, metaDataValue);
        }
        try {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> d = com.ironsource.mediationsdk.c.b().d();
            d.putAll(com.ironsource.C3150la.b().c());
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : d.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            this.V.a(jSONObject);
            this.U.a(jSONObject);
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("got the following error " + e.getMessage());
        }
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(w() ? com.ironsource.EnumC3378y5.SET_META_DATA_AFTER_INIT : com.ironsource.EnumC3378y5.SET_META_DATA, com.ironsource.mediationsdk.utils.IronSourceUtils.a(str, list, metaDataValue)));
    }

    @Override // com.ironsource.O4
    public java.lang.String a(android.content.Context context) {
        java.lang.String str;
        com.ironsource.De de;
        java.lang.String str2;
        com.ironsource.C3120jg k;
        com.ironsource.P4 f = f();
        com.ironsource.De de2 = null;
        try {
            de = com.ironsource.Ee.f5686a.a();
        } catch (java.lang.Exception unused) {
            str = null;
        }
        try {
            f.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_IN_INIT_STATUS, de);
        } catch (java.lang.Exception unused2) {
            str = null;
            de2 = de;
            f.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_ENRICH_TOKEN_ERROR, de2);
            de = de2;
            str2 = str;
            f.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, de);
            return str2;
        }
        if (context == null) {
            com.ironsource.mediationsdk.logger.IronLog.API.error("bidding data cannot be retrieved, context required");
            f.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_WITHOUT_CONTEXT, (com.ironsource.De) null);
            return null;
        }
        if (de == com.ironsource.De.NOT_INIT) {
            com.ironsource.mediationsdk.logger.IronLog.API.error("bidding data cannot be retrieved, SDK not initialized");
            f.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_NO_INIT_RETURNED_NULL, (com.ironsource.De) null);
            return null;
        }
        com.ironsource.mediationsdk.q.c().f();
        com.ironsource.Ve ve = this.l;
        boolean e = (ve == null || (k = ve.c().b().k()) == null) ? true : k.e();
        this.U.b(context);
        org.json.JSONObject a2 = new com.ironsource.C3102ig().a(context);
        com.ironsource.mediationsdk.d.b().a(a2, true);
        if (e) {
            str2 = com.ironsource.I9.a(a2.toString());
        } else {
            str2 = com.ironsource.I9.c(a2.toString());
        }
        if (de == com.ironsource.De.INITIATED) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("external token parameters: " + a2);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            f.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_RETURNED_NULL, de);
        }
        f.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_DO_GET_BIDDING_DATA_CALLED_TOKEN_RETURNED, de);
        return str2;
    }

    @Override // com.ironsource.U8
    public void a(com.ironsource.mediationsdk.impressionData.ImpressionDataListener impressionDataListener) {
        if (com.ironsource.Y9.a((java.lang.Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            com.ironsource.C3150la.b().b(impressionDataListener);
        }
    }

    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (com.ironsource.Y9.a((java.lang.Object) jSONObject, "setAdRevenueData - impressionData is null") && com.ironsource.Y9.a((java.lang.Object) str, "setAdRevenueData - dataSource is null")) {
            this.T.a(str, jSONObject);
        }
    }

    private void a(android.app.Activity activity) {
        com.ironsource.environment.ContextProvider.getInstance().updateActivity(activity);
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("activity is updated to: " + activity.hashCode());
    }
}
