package com.ironsource;

/* loaded from: classes5.dex */
public final class Be {
    public static final com.ironsource.Be.b l = new com.ironsource.Be.b(null);
    private static final kotlin.Lazy<com.ironsource.Be> m = kotlin.LazyKt.lazy(com.ironsource.Be.a.f5637a);

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ge f5636a;
    private final com.ironsource.Re b;
    private final com.ironsource.He c;
    private com.ironsource.Ze d;
    private final kotlin.Lazy e;
    private final java.lang.String f;
    private final java.util.List<com.ironsource.InterfaceC3297te> g;
    private com.ironsource.C3190ne h;
    private com.ironsource.C3226pe i;
    private boolean j;
    private long k;

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.Be> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Be.a f5637a = new com.ironsource.Be.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.Be invoke() {
            return new com.ironsource.Be(null, null, null, 7, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.Be a() {
            return (com.ironsource.Be) com.ironsource.Be.m.getValue();
        }

        private b() {
        }
    }

    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.InterfaceC3129k7> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Be.c f5638a = new com.ironsource.Be.c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.InterfaceC3129k7 invoke() {
            return com.ironsource.Jb.u.d().k();
        }
    }

    public static final class d implements com.ironsource.InterfaceC3297te {
        final /* synthetic */ android.content.Context b;

        d(android.content.Context context) {
            this.b = context;
        }

        @Override // com.ironsource.InterfaceC3297te
        public void a(final com.ironsource.C3190ne sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            com.ironsource.Ge ge = com.ironsource.Be.this.f5636a;
            final com.ironsource.Be be = com.ironsource.Be.this;
            final android.content.Context context = this.b;
            ge.c(new java.lang.Runnable() { // from class: com.ironsource.Be$d$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.Be.d.a(com.ironsource.Be.this, context, sdkConfig);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.Be this$0, android.content.Context applicationContext, com.ironsource.C3190ne sdkConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            this$0.a(applicationContext, sdkConfig);
        }

        @Override // com.ironsource.InterfaceC3297te
        public void a(final com.ironsource.C3226pe error, final com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.Ge ge = com.ironsource.Be.this.f5636a;
            final com.ironsource.Be be = com.ironsource.Be.this;
            ge.c(new java.lang.Runnable() { // from class: com.ironsource.Be$d$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.Be.d.a(com.ironsource.Be.this, error, c2988c9);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(com.ironsource.Be this$0, com.ironsource.C3226pe error, com.ironsource.C2988c9 c2988c9) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
            this$0.a(error, c2988c9);
        }
    }

    public Be() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.Be this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(true);
    }

    private final com.ironsource.InterfaceC3129k7 c() {
        return (com.ironsource.InterfaceC3129k7) this.e.getValue();
    }

    public final void d() {
        this.f5636a.d(new java.lang.Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Be.b(com.ironsource.Be.this);
            }
        });
    }

    public Be(com.ironsource.Ge tools, com.ironsource.Re serverInit, com.ironsource.He sdkServicesInitializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverInit, "serverInit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkServicesInitializer, "sdkServicesInitializer");
        this.f5636a = tools;
        this.b = serverInit;
        this.c = sdkServicesInitializer;
        this.e = kotlin.LazyKt.lazy(com.ironsource.Be.c.f5638a);
        this.f = "Be";
        this.g = new java.util.ArrayList();
    }

    private final void b(com.ironsource.C3190ne c3190ne) {
        this.h = c3190ne;
        a(false);
    }

    private final com.ironsource.De b() {
        if (this.h != null) {
            return com.ironsource.De.INITIATED;
        }
        if (this.i != null) {
            return com.ironsource.De.INIT_FAILED;
        }
        if (this.j) {
            return com.ironsource.De.INIT_IN_PROGRESS;
        }
        return com.ironsource.De.NOT_INIT;
    }

    private final void a(android.content.Context context, com.ironsource.T9 t9, com.ironsource.Ve ve) {
        t9.i(ve.g().h());
        t9.c(ve.g().d());
        com.ironsource.C1 b2 = ve.c().b();
        kotlin.jvm.internal.Intrinsics.checkNotNull(b2);
        t9.a(b2.a());
        t9.d(b2.c().b());
        t9.b(b2.k().b());
        t9.a(java.lang.Boolean.valueOf(com.ironsource.mediationsdk.utils.IronSourceUtils.c(context)));
        com.ironsource.C1 b3 = ve.c().b();
        kotlin.jvm.internal.Intrinsics.checkNotNull(b3);
        t9.b(b3.f().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.InterfaceC3297te listener, com.ironsource.C3190ne sdkConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
        listener.a(sdkConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.InterfaceC3297te listener, com.ironsource.C3226pe error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        com.ironsource.InterfaceC3297te.CC.a(listener, error, null, 2, null);
    }

    private final void b(android.content.Context context, com.ironsource.C3190ne c3190ne) {
        java.lang.String str;
        boolean z;
        java.lang.String str2;
        boolean z2;
        java.lang.String str3;
        boolean z3;
        com.ironsource.J1 b2;
        com.ironsource.Pb e;
        com.ironsource.J1 g;
        com.ironsource.U2 c2;
        com.ironsource.J1 g2;
        com.ironsource.D9 d2;
        com.ironsource.J1 i;
        com.ironsource.C3029ee f;
        com.ironsource.J1 m2;
        com.ironsource.J1 b3;
        com.ironsource.Ve d3 = c3190ne.d();
        com.ironsource.C1 b4 = d3.c().b();
        if (b4 == null || (b3 = b4.b()) == null) {
            str = null;
            z = false;
        } else {
            z = b3.l();
            str = b3.d();
        }
        com.ironsource.N3 c3 = d3.c();
        if (c3 == null || (f = c3.f()) == null || (m2 = f.m()) == null) {
            str2 = null;
            z2 = false;
        } else {
            boolean l2 = m2.l();
            str2 = m2.d();
            z2 = l2;
        }
        com.ironsource.N3 c4 = d3.c();
        if (c4 == null || (d2 = c4.d()) == null || (i = d2.i()) == null) {
            str3 = null;
            z3 = false;
        } else {
            boolean l3 = i.l();
            str3 = i.d();
            z3 = l3;
        }
        com.ironsource.N3 c5 = d3.c();
        boolean l4 = (c5 == null || (c2 = c5.c()) == null || (g2 = c2.g()) == null) ? false : g2.l();
        com.ironsource.N3 c6 = d3.c();
        boolean l5 = (c6 == null || (e = c6.e()) == null || (g = e.g()) == null) ? false : g.l();
        com.ironsource.Jb.b bVar = com.ironsource.Jb.u;
        bVar.d().q().b(str, context);
        if (z) {
            com.ironsource.C1 b5 = d3.c().b();
            if (b5 != null && (b2 = b5.b()) != null) {
                a(this, bVar.d().q(), b2, context, d3, false, 16, null);
            }
        } else {
            bVar.d().q().a(false);
        }
        com.ironsource.C3065ge.i().b(str2, context);
        if (z2) {
            com.ironsource.N3 c7 = d3.c();
            com.ironsource.C3029ee f2 = c7 != null ? c7.f() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(f2);
            com.ironsource.J1 rewardedVideoConfig = f2.m();
            com.ironsource.C3065ge i2 = com.ironsource.C3065ge.i();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i2, "getInstance()");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rewardedVideoConfig, "rewardedVideoConfig");
            a(this, i2, rewardedVideoConfig, context, d3, false, 16, null);
        } else {
            com.ironsource.C3065ge.i().a(false);
        }
        com.ironsource.F9.i().b(str3, context);
        if (z3) {
            com.ironsource.N3 c8 = d3.c();
            com.ironsource.D9 d4 = c8 != null ? c8.d() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(d4);
            com.ironsource.J1 interstitialConfig = d4.i();
            com.ironsource.F9 i3 = com.ironsource.F9.i();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i3, "getInstance()");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interstitialConfig, "interstitialConfig");
            a(this, i3, interstitialConfig, context, d3, false, 16, null);
        } else if (l4) {
            com.ironsource.N3 c9 = d3.c();
            com.ironsource.U2 c10 = c9 != null ? c9.c() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(c10);
            com.ironsource.J1 bannerConfig = c10.g();
            com.ironsource.F9 i4 = com.ironsource.F9.i();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i4, "getInstance()");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bannerConfig, "bannerConfig");
            a(this, i4, bannerConfig, context, d3, false, 16, null);
        } else if (l5) {
            com.ironsource.N3 c11 = d3.c();
            com.ironsource.Pb e2 = c11 != null ? c11.e() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(e2);
            com.ironsource.J1 g3 = e2.g();
            com.ironsource.F9 i5 = com.ironsource.F9.i();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(i5, "getInstance()");
            a(this, i5, g3, context, d3, false, 16, null);
        } else {
            com.ironsource.F9.i().a(false);
        }
        com.ironsource.N3 c12 = d3.c();
        com.ironsource.C1 b6 = c12 != null ? c12.b() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(b6);
        com.ironsource.C3028ed i6 = b6.i();
        boolean a2 = i6.a();
        java.lang.String b7 = i6.b();
        boolean c13 = i6.c();
        int d5 = i6.d();
        int[] e3 = i6.e();
        int[] f3 = i6.f();
        com.ironsource.C3010dd c3010dd = com.ironsource.C3010dd.P;
        c3010dd.a(a2);
        c3010dd.b(b7, context);
        if (a2) {
            c3010dd.b(e3, context);
            c3010dd.c(f3, context);
            c3010dd.b(c13);
            c3010dd.c(d5);
        }
    }

    public final void a(final android.content.Context context, final com.ironsource.C3333ve initRequest, final com.ironsource.InterfaceC3297te listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        final android.content.Context applicationContext = context.getApplicationContext();
        this.f5636a.d(new java.lang.Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Be.a(com.ironsource.Be.this, listener, context, initRequest, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Be this$0, com.ironsource.InterfaceC3297te listener, android.content.Context context, com.ironsource.C3333ve initRequest, android.content.Context context2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        com.ironsource.C3190ne c3190ne = this$0.h;
        if (c3190ne != null) {
            this$0.a(listener, c3190ne);
            return;
        }
        this$0.g.add(listener);
        if (this$0.j) {
            return;
        }
        this$0.i = null;
        this$0.a(true);
        this$0.k = new java.util.Date().getTime();
        this$0.b.a(context, initRequest, this$0.f5636a, this$0.new d(context2));
    }

    public /* synthetic */ Be(com.ironsource.Ge ge, com.ironsource.Re re, com.ironsource.He he, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.ironsource.Fe() : ge, (i & 2) != 0 ? new com.ironsource.Qe(null, 1, null) : re, (i & 4) != 0 ? new com.ironsource.He(null, null, null, null, null, 31, null) : he);
    }

    public final void a(final com.ironsource.C3351we serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f5636a.d(new java.lang.Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Be.a(com.ironsource.C3351we.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3351we serverResponse, com.ironsource.Be this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "$serverResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.C3190ne c3190ne = new com.ironsource.C3190ne(serverResponse, null, null, 6, null);
        this$0.b(c3190ne);
        this$0.a(c3190ne);
    }

    public final void a(final com.ironsource.C3226pe error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f5636a.d(new java.lang.Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Be.a(com.ironsource.Be.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Be this$0, com.ironsource.C3226pe error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        this$0.a(error, (com.ironsource.C2988c9) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(com.ironsource.C3226pe c3226pe, com.ironsource.C2988c9 c2988c9) {
        this.i = c3226pe;
        a(false);
        java.util.Iterator<com.ironsource.InterfaceC3297te> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c3226pe);
        }
        this.g.clear();
        if (c2988c9 != null) {
            c2988c9.b();
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: " + c3226pe, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(android.content.Context context, com.ironsource.C3190ne c3190ne) {
        com.ironsource.Se i;
        b(c3190ne);
        com.ironsource.M1 a2 = c3190ne.a();
        com.ironsource.V4 v4 = com.ironsource.V4.f6012a;
        v4.c(a2.g());
        com.ironsource.Jb.b bVar = com.ironsource.Jb.u;
        bVar.a().o().a(a2.c());
        if (bVar.d().h().e() && (i = c3190ne.i()) != null) {
            this.c.a(context, i);
        }
        com.ironsource.C2988c9 f = c3190ne.f();
        if (f != null) {
            f.b();
        }
        v4.a(a2.f());
        v4.a(a2.j());
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.setUseSharedExecutorService(a2.h());
        c().a(a2);
        a(context, this.f5636a.g(), c3190ne.d());
        this.f5636a.a(new java.util.Date().getTime() - this.k, c3190ne.g());
        com.ironsource.Ze ze = new com.ironsource.Ze();
        this.d = ze;
        ze.a(c());
        com.ironsource.mediationsdk.utils.IronSourceUtils.e(context, c3190ne.d().toString());
        bVar.d().q().c(true);
        com.ironsource.F9.i().c(true);
        com.ironsource.C3065ge.i().c(true);
        com.ironsource.C3010dd c3010dd = com.ironsource.C3010dd.P;
        c3010dd.c(true);
        b(context, c3190ne);
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger(0).setDebugLevel(c3190ne.e().b());
        com.ironsource.F1 b2 = c3190ne.b();
        if (b2.f()) {
            this.f5636a.a(b2);
        }
        a(c3190ne);
        c3010dd.i();
        com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
        ironLog.verbose("parameters for init url: " + com.ironsource.Xe.a());
        ironLog.verbose("parameters for init POST data: " + com.ironsource.Xe.b());
    }

    private final void a(com.ironsource.C3190ne c3190ne) {
        java.util.Iterator<com.ironsource.InterfaceC3297te> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next(), c3190ne);
        }
        this.g.clear();
    }

    private final void a(boolean z) {
        this.j = z;
        this.f5636a.a(b());
    }

    private final void a(final com.ironsource.InterfaceC3297te interfaceC3297te, final com.ironsource.C3190ne c3190ne) {
        this.f5636a.a(new java.lang.Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Be.b(com.ironsource.InterfaceC3297te.this, c3190ne);
            }
        });
    }

    private final void a(final com.ironsource.InterfaceC3297te interfaceC3297te, final com.ironsource.C3226pe c3226pe) {
        this.f5636a.a(new java.lang.Runnable() { // from class: com.ironsource.Be$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Be.b(com.ironsource.InterfaceC3297te.this, c3226pe);
            }
        });
    }

    static /* synthetic */ void a(com.ironsource.Be be, com.ironsource.AbstractC3143l3 abstractC3143l3, com.ironsource.J1 j1, android.content.Context context, com.ironsource.Ve ve, boolean z, int i, java.lang.Object obj) {
        be.a(abstractC3143l3, j1, context, ve, (i & 16) != 0 ? true : z);
    }

    private final void a(com.ironsource.AbstractC3143l3 abstractC3143l3, com.ironsource.J1 j1, android.content.Context context, com.ironsource.Ve ve, boolean z) {
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
        com.ironsource.C1 b2 = ve.c().b();
        kotlin.jvm.internal.Intrinsics.checkNotNull(b2);
        abstractC3143l3.a(b2.j());
        abstractC3143l3.b(j1.k());
        abstractC3143l3.c(j1.b());
    }
}
