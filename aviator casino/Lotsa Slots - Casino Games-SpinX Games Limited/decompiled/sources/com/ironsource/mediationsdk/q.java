package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
class q implements com.ironsource.Bc {
    private static com.ironsource.mediationsdk.q z;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.Ze f6458a;
    private com.ironsource.environment.NetworkStateReceiver p;
    private android.os.CountDownTimer q;
    private java.lang.String t;
    private com.ironsource.Ve u;
    private long w;
    private int b = com.ironsource.mediationsdk.q.e.f;
    private com.ironsource.InterfaceC3129k7 c = com.ironsource.Jb.Y().k();
    private final java.lang.String d = "appKey";
    private final java.lang.String e = getClass().getSimpleName();
    private boolean l = false;
    private boolean n = false;
    private java.util.List<com.ironsource.Kc> r = new java.util.ArrayList();
    private java.lang.String s = "";
    private com.ironsource.mediationsdk.q.f y = new com.ironsource.mediationsdk.q.a();
    private android.os.Handler m = com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.getInitHandler();
    private int f = 1;
    private int g = 0;
    private int h = 62;
    private int i = 12;
    private int j = 5;
    private java.util.concurrent.atomic.AtomicBoolean o = new java.util.concurrent.atomic.AtomicBoolean(true);
    private boolean k = false;
    private boolean v = false;
    private com.ironsource.T9 x = new com.ironsource.T9();

    class a extends com.ironsource.mediationsdk.q.f {
        a() {
            super();
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x029e, code lost:
        
            if (r0.g == r0.j) goto L55;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            try {
                com.ironsource.mediationsdk.p h = com.ironsource.mediationsdk.p.h();
                if (!android.text.TextUtils.isEmpty(com.ironsource.mediationsdk.q.this.s)) {
                    com.ironsource.J6.a().a("userId", com.ironsource.mediationsdk.q.this.s);
                }
                if (!android.text.TextUtils.isEmpty(com.ironsource.mediationsdk.q.this.t)) {
                    com.ironsource.J6.a().a("appKey", com.ironsource.mediationsdk.q.this.t);
                }
                com.ironsource.mediationsdk.q qVar = com.ironsource.mediationsdk.q.this;
                qVar.x.i(qVar.s);
                com.ironsource.mediationsdk.q.this.w = new java.util.Date().getTime();
                com.ironsource.Ld.c().a();
                com.ironsource.mediationsdk.q.this.u = h.b(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), com.ironsource.mediationsdk.q.this.s, this.c);
                com.ironsource.mediationsdk.q qVar2 = com.ironsource.mediationsdk.q.this;
                if (qVar2.u == null) {
                    if (qVar2.g == 3) {
                        qVar2.v = true;
                        java.util.Iterator it = qVar2.r.iterator();
                        while (it.hasNext()) {
                            ((com.ironsource.Kc) it.next()).a();
                        }
                    }
                    if (this.f6464a) {
                        com.ironsource.mediationsdk.q qVar3 = com.ironsource.mediationsdk.q.this;
                        if (qVar3.g < qVar3.h) {
                            qVar3.k = true;
                            qVar3.m.postDelayed(this, qVar3.f * 1000);
                            com.ironsource.mediationsdk.q qVar4 = com.ironsource.mediationsdk.q.this;
                            if (qVar4.g < qVar4.i) {
                                qVar4.f *= 2;
                            }
                        }
                    }
                    if (this.f6464a) {
                        com.ironsource.mediationsdk.q qVar5 = com.ironsource.mediationsdk.q.this;
                    }
                    com.ironsource.mediationsdk.q qVar6 = com.ironsource.mediationsdk.q.this;
                    if (!qVar6.l) {
                        qVar6.l = true;
                        if (android.text.TextUtils.isEmpty(this.b)) {
                            this.b = "noServerResponse";
                        }
                        java.util.Iterator it2 = com.ironsource.mediationsdk.q.this.r.iterator();
                        while (it2.hasNext()) {
                            ((com.ironsource.Kc) it2.next()).g(this.b);
                        }
                        com.ironsource.mediationsdk.q.this.b(com.ironsource.mediationsdk.q.d.INIT_FAILED);
                        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No server response", 1);
                    }
                    com.ironsource.mediationsdk.q.this.g++;
                    return;
                }
                qVar2.m.removeCallbacks(this);
                if (!com.ironsource.mediationsdk.q.this.u.q()) {
                    com.ironsource.mediationsdk.q qVar7 = com.ironsource.mediationsdk.q.this;
                    if (qVar7.l) {
                        return;
                    }
                    qVar7.b(com.ironsource.mediationsdk.q.d.INIT_FAILED);
                    com.ironsource.mediationsdk.q qVar8 = com.ironsource.mediationsdk.q.this;
                    qVar8.l = true;
                    java.util.Iterator it3 = qVar8.r.iterator();
                    while (it3.hasNext()) {
                        ((com.ironsource.Kc) it3.next()).g("serverResponseIsNotValid");
                    }
                    return;
                }
                com.ironsource.mediationsdk.q.this.b(com.ironsource.mediationsdk.q.d.INITIATED);
                new com.ironsource.Kb().a(com.ironsource.mediationsdk.q.this.u.c().b().e().b(), h.v());
                com.ironsource.M1 f = com.ironsource.mediationsdk.q.this.u.c().b().f();
                if (f != null) {
                    com.ironsource.V4 v4 = com.ironsource.V4.f6012a;
                    v4.c(f.g());
                    v4.a(f.f());
                    v4.a(f.j());
                    com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(f.h());
                    com.ironsource.mediationsdk.q.this.c.a(f);
                }
                com.ironsource.mediationsdk.q.this.a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), com.ironsource.mediationsdk.q.this.u);
                long time = new java.util.Date().getTime();
                com.ironsource.mediationsdk.q qVar9 = com.ironsource.mediationsdk.q.this;
                h.a(time - qVar9.w, qVar9.u.i());
                if (f != null && f.e()) {
                    new com.ironsource.Od(com.ironsource.Jb.Y().q(), new kotlin.jvm.functions.Function0() { // from class: com.ironsource.mediationsdk.q$a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                        }
                    }, com.ironsource.Jb.Y(), com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.getThreadPoolExecutor()).c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext());
                }
                com.ironsource.mediationsdk.q.this.f6458a = new com.ironsource.Ze();
                com.ironsource.mediationsdk.q qVar10 = com.ironsource.mediationsdk.q.this;
                qVar10.f6458a.a(qVar10.c);
                if (com.ironsource.mediationsdk.q.this.u.c().b().g() && com.ironsource.environment.ContextProvider.getInstance().getApplicationContext() != null) {
                    com.ironsource.C3221p9.f6553a.a(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext());
                }
                java.util.List<com.ironsource.mediationsdk.IronSource.a> h2 = com.ironsource.mediationsdk.q.this.u.h();
                java.util.Iterator it4 = com.ironsource.mediationsdk.q.this.r.iterator();
                while (it4.hasNext()) {
                    ((com.ironsource.Kc) it4.next()).a(h2, com.ironsource.mediationsdk.q.this.g(), com.ironsource.mediationsdk.q.this.u.c());
                }
                com.ironsource.C3010dd.P.i();
                com.ironsource.G1 d = com.ironsource.mediationsdk.q.this.u.c().b().d();
                if (d.f()) {
                    com.ironsource.C3180n4.d().a(d.b(), d.d(), d.c(), d.e(), com.ironsource.mediationsdk.utils.IronSourceUtils.d(), d.a(), d.g());
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    class b implements java.lang.Runnable {

        class a extends android.os.CountDownTimer {
            a(long j, long j2) {
                super(j, j2);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                com.ironsource.mediationsdk.q qVar = com.ironsource.mediationsdk.q.this;
                if (qVar.l) {
                    return;
                }
                qVar.l = true;
                java.util.Iterator it = qVar.r.iterator();
                while (it.hasNext()) {
                    ((com.ironsource.Kc) it.next()).g("noInternetConnection");
                }
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                if (j <= 45000) {
                    com.ironsource.mediationsdk.q qVar = com.ironsource.mediationsdk.q.this;
                    qVar.v = true;
                    java.util.Iterator it = qVar.r.iterator();
                    while (it.hasNext()) {
                        ((com.ironsource.Kc) it.next()).a();
                    }
                }
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.mediationsdk.q.this.q = new com.ironsource.mediationsdk.q.b.a(60000L, 15000L).start();
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6461a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.q.d.values().length];
            f6461a = iArr;
            try {
                iArr[com.ironsource.mediationsdk.q.d.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f6461a[com.ironsource.mediationsdk.q.d.INIT_FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f6461a[com.ironsource.mediationsdk.q.d.INITIATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    enum d {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static int f6463a = 0;
        public static int b = 1;
        public static int c = 2;
        public static int d = 3;
        public static int e = 4;
        public static int f = 5;
    }

    abstract class f implements java.lang.Runnable {
        java.lang.String b;

        /* renamed from: a, reason: collision with root package name */
        boolean f6464a = true;
        protected com.ironsource.mediationsdk.p.b c = new com.ironsource.mediationsdk.q.f.a();

        class a implements com.ironsource.mediationsdk.p.b {
            a() {
            }

            @Override // com.ironsource.mediationsdk.p.b
            public void a(java.lang.String str) {
                com.ironsource.mediationsdk.q.f fVar = com.ironsource.mediationsdk.q.f.this;
                fVar.f6464a = false;
                fVar.b = str;
            }
        }

        f() {
        }
    }

    private q() {
    }

    public static synchronized com.ironsource.mediationsdk.q c() {
        com.ironsource.mediationsdk.q qVar;
        synchronized (com.ironsource.mediationsdk.q.class) {
            if (z == null) {
                z = new com.ironsource.mediationsdk.q();
            }
            qVar = z;
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return this.k;
    }

    public void a(android.content.Context context, com.ironsource.Ve ve) {
        this.x.i(ve.g().h());
        this.x.c(ve.g().d());
        com.ironsource.C1 b2 = ve.c().b();
        this.x.a(b2.a());
        this.x.d(b2.c().b());
        this.x.b(b2.k().b());
        this.x.a(java.lang.Boolean.valueOf(com.ironsource.mediationsdk.utils.IronSourceUtils.c(context)));
        com.ironsource.M1 f2 = ve.c().b().f();
        this.x.b(f2.b());
        com.ironsource.Jb.Q().o().a(f2.c());
    }

    public int b() {
        return this.b;
    }

    public synchronized boolean d() {
        return this.v;
    }

    void e() {
        b(com.ironsource.mediationsdk.q.d.INIT_FAILED);
    }

    public synchronized void f() {
        int a2 = a(a());
        this.b = a2;
        this.x.c(a2);
    }

    public synchronized void b(com.ironsource.mediationsdk.q.d dVar) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("old status: " + a() + ", new status: " + dVar + ")");
        com.ironsource.Ee.f5686a.a(com.ironsource.De.values()[dVar.ordinal()]);
    }

    private static int a(com.ironsource.mediationsdk.q.d dVar) {
        int i = com.ironsource.mediationsdk.q.c.f6461a[dVar.ordinal()];
        if (i == 1) {
            return com.ironsource.mediationsdk.q.e.d;
        }
        if (i == 2) {
            return com.ironsource.mediationsdk.q.e.e;
        }
        if (i != 3) {
            return com.ironsource.mediationsdk.q.e.f6463a;
        }
        return com.ironsource.mediationsdk.q.e.b;
    }

    public synchronized void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.ironsource.mediationsdk.IronSource.a... aVarArr) {
        try {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.o;
            if (atomicBoolean != null && atomicBoolean.compareAndSet(true, false)) {
                b(com.ironsource.mediationsdk.q.d.INIT_IN_PROGRESS);
                this.s = str2;
                this.t = str;
                if (com.ironsource.mediationsdk.utils.IronSourceUtils.g(context)) {
                    this.m.post(this.y);
                } else {
                    this.n = true;
                    if (this.p == null) {
                        this.p = new com.ironsource.environment.NetworkStateReceiver(context, this);
                    }
                    context.registerReceiver(this.p, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.mediationsdk.q.b());
                }
            } else {
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, this.e + ": Multiple calls to init are not allowed", 2);
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.Bc
    public void a(boolean z2) {
        if (this.n && z2) {
            android.os.CountDownTimer countDownTimer = this.q;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.n = false;
            this.k = true;
            com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.INIT_AFTER_REACHABILITY_CHANGE, com.ironsource.mediationsdk.utils.IronSourceUtils.b(false)));
            this.m.post(this.y);
        }
    }

    public synchronized com.ironsource.mediationsdk.q.d a() {
        return com.ironsource.mediationsdk.q.d.values()[com.ironsource.Ee.f5686a.a().ordinal()];
    }
}
