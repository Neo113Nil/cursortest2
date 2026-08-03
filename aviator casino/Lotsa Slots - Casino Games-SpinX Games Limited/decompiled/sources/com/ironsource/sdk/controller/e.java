package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class e implements com.ironsource.sdk.controller.c, com.ironsource.sdk.controller.l {
    private com.ironsource.sdk.controller.l b;
    private android.os.CountDownTimer d;
    private final com.ironsource.Q7 g;
    private final com.ironsource.Zg h;
    private final com.ironsource.C3188nc k;

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f6612a = "e";
    private com.ironsource.C3202o8.b c = com.ironsource.C3202o8.b.None;
    private final com.ironsource.L3 e = new com.ironsource.L3("NativeCommandExecutor");
    private final com.ironsource.L3 f = new com.ironsource.L3("ControllerCommandsExecutor");
    private final java.util.Map<java.lang.String, com.ironsource.sdk.controller.l.a> i = new java.util.HashMap();
    private final java.util.Map<java.lang.String, com.ironsource.sdk.controller.l.b> j = new java.util.HashMap();

    class a implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f6613a;
        final /* synthetic */ com.ironsource.InterfaceC3287t4 b;

        a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
            this.f6613a = jSONObject;
            this.b = interfaceC3287t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6613a, this.b);
            }
        }
    }

    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.T4 f6614a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ com.ironsource.InterfaceC3287t4 c;

        b(com.ironsource.T4 t4, java.util.Map map, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
            this.f6614a = t4;
            this.b = map;
            this.c = interfaceC3287t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6614a, this.b, this.c);
            }
        }
    }

    class c implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6615a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ironsource.T4 c;
        final /* synthetic */ com.ironsource.InterfaceC3269s4 d;

        c(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
            this.f6615a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC3269s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6615a, this.b, this.c, this.d);
            }
        }
    }

    class d implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f6616a;
        final /* synthetic */ com.ironsource.InterfaceC3269s4 b;

        d(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
            this.f6616a = jSONObject;
            this.b = interfaceC3269s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6616a, this.b);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.e$e, reason: collision with other inner class name */
    class RunnableC0162e implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.T4 f6617a;

        RunnableC0162e(com.ironsource.T4 t4) {
            this.f6617a = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6617a);
            }
        }
    }

    class f implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.T4 f6618a;

        f(com.ironsource.T4 t4) {
            this.f6618a = t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.b(this.f6618a);
            }
        }
    }

    class g implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.T4 f6619a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ com.ironsource.InterfaceC3269s4 c;

        g(com.ironsource.T4 t4, java.util.Map map, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
            this.f6619a = t4;
            this.b = map;
            this.c = interfaceC3269s4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6619a, this.b, this.c);
            }
        }
    }

    class h implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.sdk.controller.l.a f6620a;
        final /* synthetic */ com.ironsource.sdk.controller.f.c b;

        h(com.ironsource.sdk.controller.l.a aVar, com.ironsource.sdk.controller.f.c cVar) {
            this.f6620a = aVar;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.e eVar = com.ironsource.sdk.controller.e.this;
            if (eVar.b != null) {
                if (this.f6620a != null) {
                    eVar.i.put(this.b.f(), this.f6620a);
                }
                com.ironsource.sdk.controller.e.this.b.a(this.b, this.f6620a);
            }
        }
    }

    class i implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f6621a;

        i(org.json.JSONObject jSONObject) {
            this.f6621a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.b(this.f6621a);
            }
        }
    }

    class j implements java.lang.Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a();
                com.ironsource.sdk.controller.e.this.b = null;
            }
        }
    }

    class k extends android.os.CountDownTimer {
        k(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.e.this.f6612a, "Global Controller Timer Finish");
            com.ironsource.sdk.controller.e.this.d(com.ironsource.X3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class l implements java.lang.Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.e.this.d();
        }
    }

    class m implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6625a;
        final /* synthetic */ java.lang.String b;

        m(java.lang.String str, java.lang.String str2) {
            this.f6625a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.ironsource.sdk.controller.e eVar = com.ironsource.sdk.controller.e.this;
                eVar.b = eVar.b(eVar.h.b(), com.ironsource.sdk.controller.e.this.h.d(), com.ironsource.sdk.controller.e.this.h.f(), com.ironsource.sdk.controller.e.this.h.e(), com.ironsource.sdk.controller.e.this.h.g(), com.ironsource.sdk.controller.e.this.h.c(), this.f6625a, this.b);
                com.ironsource.sdk.controller.e.this.b.b();
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                com.ironsource.sdk.controller.e.this.d(android.util.Log.getStackTraceString(th));
            }
        }
    }

    class n extends android.os.CountDownTimer {
        n(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.ironsource.sdk.utils.Logger.i(com.ironsource.sdk.controller.e.this.f6612a, "Recovered Controller | Global Controller Timer Finish");
            com.ironsource.sdk.controller.e.this.d(com.ironsource.X3.c.k);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }
    }

    class o implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6627a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ironsource.T4 c;
        final /* synthetic */ com.ironsource.InterfaceC3305u4 d;

        o(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3305u4 interfaceC3305u4) {
            this.f6627a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC3305u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6627a, this.b, this.c, this.d);
            }
        }
    }

    class p implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.json.JSONObject f6628a;
        final /* synthetic */ com.ironsource.InterfaceC3305u4 b;

        p(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3305u4 interfaceC3305u4) {
            this.f6628a = jSONObject;
            this.b = interfaceC3305u4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6628a, this.b);
            }
        }
    }

    class q implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6629a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ com.ironsource.T4 c;
        final /* synthetic */ com.ironsource.InterfaceC3287t4 d;

        q(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
            this.f6629a = str;
            this.b = str2;
            this.c = t4;
            this.d = interfaceC3287t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6629a, this.b, this.c, this.d);
            }
        }
    }

    class r implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f6630a;
        final /* synthetic */ com.ironsource.InterfaceC3287t4 b;

        r(java.lang.String str, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
            this.f6630a = str;
            this.b = interfaceC3287t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.a(this.f6630a, this.b);
            }
        }
    }

    class s implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.T4 f6631a;
        final /* synthetic */ java.util.Map b;
        final /* synthetic */ com.ironsource.InterfaceC3287t4 c;

        s(com.ironsource.T4 t4, java.util.Map map, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
            this.f6631a = t4;
            this.b = map;
            this.c = interfaceC3287t4;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.C3327v8.a(com.ironsource.C3083he.j, new com.ironsource.C3238q8().a(com.ironsource.B5.v, this.f6631a.f()).a(com.ironsource.B5.w, com.ironsource.C3345w8.a(this.f6631a, com.ironsource.C3202o8.e.Interstitial)).a(com.ironsource.B5.x, java.lang.Boolean.valueOf(com.ironsource.C3345w8.a(this.f6631a))).a(com.ironsource.B5.I, java.lang.Long.valueOf(com.ironsource.N.f5845a.b(this.f6631a.h()))).a());
            com.ironsource.sdk.controller.l lVar = com.ironsource.sdk.controller.e.this.b;
            if (lVar != null) {
                lVar.b(this.f6631a, this.b, this.c);
            }
        }
    }

    public e(android.content.Context context, com.ironsource.C2947a4 c2947a4, com.ironsource.U4 u4, com.ironsource.Q7 q7, int i2, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, com.ironsource.C3188nc c3188nc) {
        this.k = c3188nc;
        this.g = q7;
        java.lang.String networkStorageDir = com.ironsource.sdk.utils.IronSourceStorageUtils.getNetworkStorageDir(context);
        com.ironsource.C3020e5 a2 = com.ironsource.C3020e5.a(networkStorageDir, q7, jSONObject);
        this.h = new com.ironsource.Zg(context, c2947a4, u4, i2, a2, networkStorageDir);
        a(context, c2947a4, u4, i2, a2, networkStorageDir, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(android.content.Context context, com.ironsource.C2947a4 c2947a4, com.ironsource.U4 u4, int i2, com.ironsource.C3020e5 c3020e5, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.ironsource.sdk.controller.v b2 = b(context, c2947a4, u4, i2, c3020e5, str, str2, str3);
            this.b = b2;
            b2.b();
        } catch (java.lang.Throwable th) {
            com.ironsource.C3180n4.d().a(th);
            d(android.util.Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(java.lang.String str) {
        com.ironsource.C3327v8.a(com.ironsource.C3083he.d, new com.ironsource.C3238q8().a(com.ironsource.B5.A, str).a());
        this.c = com.ironsource.C3202o8.b.Loading;
        this.b = new com.ironsource.sdk.controller.n(str, this.g);
        this.e.c();
        this.e.a();
        com.ironsource.Q7 q7 = this.g;
        if (q7 != null) {
            q7.c(new com.ironsource.sdk.controller.e.l());
        }
    }

    private void e(java.lang.String str) {
        com.ironsource.sdk.IronSourceNetwork.updateInitFailed(new com.ironsource.C3220p8(1001, str));
    }

    private com.ironsource.sdk.controller.l.a i() {
        return new com.ironsource.sdk.controller.l.a() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda1
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(com.ironsource.sdk.controller.f.a aVar) {
                com.ironsource.sdk.controller.e.this.a(aVar);
            }
        };
    }

    private com.ironsource.sdk.controller.l.b j() {
        return new com.ironsource.sdk.controller.l.b() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda2
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(com.ironsource.Mb mb) {
                com.ironsource.sdk.controller.e.this.a(mb);
            }
        };
    }

    private void l() {
        com.ironsource.sdk.utils.Logger.i(this.f6612a, "handleReadyState");
        this.c = com.ironsource.C3202o8.b.Ready;
        android.os.CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        n();
        this.f.c();
        this.f.a();
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.f();
        }
    }

    private boolean m() {
        return com.ironsource.C3202o8.b.Ready.equals(this.c);
    }

    private void n() {
        this.h.a(true);
        com.ironsource.sdk.controller.l lVar = this.b;
        if (lVar != null) {
            lVar.a(this.h.i());
        }
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.l
    public void b() {
    }

    @Override // com.ironsource.sdk.controller.l
    @java.lang.Deprecated
    public void f() {
    }

    @Override // com.ironsource.sdk.controller.l
    public void g() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.g();
    }

    @Override // com.ironsource.sdk.controller.l
    public com.ironsource.C3202o8.c h() {
        com.ironsource.sdk.controller.l lVar = this.b;
        return lVar != null ? lVar.h() : com.ironsource.C3202o8.c.None;
    }

    public com.ironsource.sdk.controller.l k() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.sdk.controller.f.a aVar) {
        com.ironsource.sdk.controller.l.a remove = this.i.remove(aVar.c());
        if (remove != null) {
            remove.a(aVar);
        }
    }

    private void b(java.lang.Runnable runnable) {
        a(runnable, 0L);
    }

    @Override // com.ironsource.sdk.controller.l
    public void e() {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.sdk.controller.v b(android.content.Context context, com.ironsource.C2947a4 c2947a4, com.ironsource.U4 u4, int i2, com.ironsource.C3020e5 c3020e5, java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Throwable {
        com.ironsource.C3327v8.a(com.ironsource.C3083he.c, new com.ironsource.C3238q8().a(com.ironsource.B5.y, "thread-" + java.lang.Thread.currentThread().getName()).a());
        com.ironsource.sdk.controller.v vVar = new com.ironsource.sdk.controller.v(context, u4, c2947a4, this, this.g, i2, c3020e5, str, i(), j(), str2, str3);
        com.ironsource.V5 v5 = new com.ironsource.V5(context, c3020e5, new com.ironsource.U5(this.g.a()), new com.ironsource.Nb(c3020e5.a()));
        vVar.a(new com.ironsource.sdk.controller.u(context));
        vVar.a(new com.ironsource.sdk.controller.o(context));
        vVar.a(new com.ironsource.sdk.controller.q(context));
        vVar.a(new com.ironsource.sdk.controller.i(context));
        vVar.a(new com.ironsource.sdk.controller.a(context));
        vVar.a(new com.ironsource.sdk.controller.j(c3020e5.a(), v5));
        vVar.a(new com.ironsource.C3302u1());
        vVar.a(new com.ironsource.C3359x4(context, new com.ironsource.C3341w4()));
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.ironsource.Mb mb) {
        com.ironsource.sdk.controller.l.b bVar = this.j.get(mb.d());
        if (bVar != null) {
            bVar.a(mb);
        }
    }

    private void a(java.lang.Runnable runnable, long j2) {
        com.ironsource.Q7 q7 = this.g;
        if (q7 != null) {
            q7.d(runnable, j2);
        } else {
            com.ironsource.sdk.utils.Logger.e(this.f6612a, "mThreadManager = null");
        }
    }

    private void a(final android.content.Context context, final com.ironsource.C2947a4 c2947a4, final com.ironsource.U4 u4, final int i2, final com.ironsource.C3020e5 c3020e5, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        int A = com.ironsource.Jb.Y().h().A();
        if (A > 0) {
            com.ironsource.C3327v8.a(com.ironsource.C3083he.B, new com.ironsource.C3238q8().a(com.ironsource.B5.y, java.lang.String.valueOf(A)).a());
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.ironsource.sdk.controller.e$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.sdk.controller.e.this.c(context, c2947a4, u4, i2, c3020e5, str, str2, str3);
            }
        };
        if (com.ironsource.Jb.Y().h().s()) {
            this.g.b(runnable, A);
        } else {
            a(runnable, A);
        }
        this.d = new com.ironsource.sdk.controller.e.k(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c() {
        com.ironsource.sdk.utils.Logger.i(this.f6612a, "handleControllerLoaded");
        this.c = com.ironsource.C3202o8.b.Loaded;
        this.e.c();
        this.e.a();
    }

    @Override // com.ironsource.sdk.controller.c
    public void d() {
        com.ironsource.sdk.utils.Logger.i(this.f6612a, "handleControllerReady ");
        this.k.a(h());
        if (com.ironsource.C3202o8.c.Web.equals(h())) {
            com.ironsource.C3327v8.a(com.ironsource.C3083he.e, new com.ironsource.C3238q8().a(com.ironsource.B5.y, java.lang.String.valueOf(this.h.l())).a());
            com.ironsource.sdk.IronSourceNetwork.updateInitSucceeded();
        }
        l();
    }

    @Override // com.ironsource.sdk.controller.c
    public void c(java.lang.String str) {
        com.ironsource.sdk.utils.Logger.i(this.f6612a, "handleControllerFailed ");
        com.ironsource.C3238q8 c3238q8 = new com.ironsource.C3238q8();
        c3238q8.a(com.ironsource.B5.A, str);
        c3238q8.a(com.ironsource.B5.y, java.lang.String.valueOf(this.h.l()));
        com.ironsource.C3327v8.a(com.ironsource.C3083he.o, c3238q8.a());
        this.h.a(false);
        e(str);
        if (this.d != null) {
            com.ironsource.sdk.utils.Logger.i(this.f6612a, "cancel timer mControllerReadyTimer");
            this.d.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.c
    public void b(java.lang.String str) {
        com.ironsource.C3327v8.a(com.ironsource.C3083he.y, new com.ironsource.C3238q8().a(com.ironsource.B5.y, str).a());
        android.os.CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        d(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        this.f.a(new com.ironsource.sdk.controller.e.s(t4, map, interfaceC3287t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(com.ironsource.T4 t4) {
        this.f.a(new com.ironsource.sdk.controller.e.f(t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(org.json.JSONObject jSONObject) {
        this.f.a(new com.ironsource.sdk.controller.e.i(jSONObject));
    }

    public void a(java.lang.Runnable runnable) {
        this.e.a(runnable);
    }

    @Override // com.ironsource.sdk.controller.l
    public void b(android.content.Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.b(context);
    }

    @Override // com.ironsource.InterfaceC2968b7
    public void a(com.ironsource.X6 x6) {
        com.ironsource.Z6 b2 = x6.b();
        if (b2 == com.ironsource.Z6.SendEvent) {
            com.ironsource.C3327v8.a(com.ironsource.C3083he.A, new com.ironsource.C3238q8().a(com.ironsource.B5.y, x6.a() + " : strategy: " + b2).a());
            return;
        }
        if (b2 == com.ironsource.Z6.NativeController) {
            com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(x6.a(), this.g);
            this.b = nVar;
            this.k.a(nVar.h());
            com.ironsource.C3327v8.a(com.ironsource.C3083he.d, new com.ironsource.C3238q8().a(com.ironsource.B5.A, x6.a() + " : strategy: " + b2).a());
            com.ironsource.C3327v8.a(com.ironsource.C3083he.A, new com.ironsource.C3238q8().a(com.ironsource.B5.y, x6.a() + " : strategy: " + b2).a());
        }
    }

    private void a(com.ironsource.C3202o8.e eVar, com.ironsource.T4 t4, java.lang.String str, java.lang.String str2) {
        com.ironsource.sdk.utils.Logger.i(this.f6612a, "recoverWebController for product: " + eVar.toString());
        com.ironsource.C3238q8 c3238q8 = new com.ironsource.C3238q8();
        c3238q8.a(com.ironsource.B5.w, eVar.toString());
        c3238q8.a(com.ironsource.B5.v, t4.f());
        com.ironsource.C3327v8.a(com.ironsource.C3083he.b, c3238q8.a());
        this.h.n();
        a();
        com.ironsource.sdk.controller.e.m mVar = new com.ironsource.sdk.controller.e.m(str, str2);
        if (com.ironsource.Jb.Y().h().s()) {
            this.g.b(mVar);
        } else {
            b(mVar);
        }
        this.d = new com.ironsource.sdk.controller.e.n(200000L, 1000L).start();
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3305u4 interfaceC3305u4) {
        if (this.h.a(h(), this.c)) {
            a(com.ironsource.C3202o8.e.RewardedVideo, t4, str, str2);
        }
        this.f.a(new com.ironsource.sdk.controller.e.o(str, str2, t4, interfaceC3305u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3305u4 interfaceC3305u4) {
        this.f.a(new com.ironsource.sdk.controller.e.p(jSONObject, interfaceC3305u4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        if (this.h.a(h(), this.c)) {
            a(com.ironsource.C3202o8.e.Interstitial, t4, str, str2);
        }
        this.f.a(new com.ironsource.sdk.controller.e.q(str, str2, t4, interfaceC3287t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        com.ironsource.sdk.utils.Logger.i(this.f6612a, "load interstitial");
        this.f.a(new com.ironsource.sdk.controller.e.r(str, interfaceC3287t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        this.f.a(new com.ironsource.sdk.controller.e.a(jSONObject, interfaceC3287t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3287t4 interfaceC3287t4) {
        this.f.a(new com.ironsource.sdk.controller.e.b(t4, map, interfaceC3287t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public boolean a(java.lang.String str) {
        if (this.b == null || !m()) {
            return false;
        }
        return this.b.a(str);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(java.lang.String str, java.lang.String str2, com.ironsource.T4 t4, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        if (this.h.a(h(), this.c)) {
            a(com.ironsource.C3202o8.e.Banner, t4, str, str2);
        }
        this.f.a(new com.ironsource.sdk.controller.e.c(str, str2, t4, interfaceC3269s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(org.json.JSONObject jSONObject, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        this.f.a(new com.ironsource.sdk.controller.e.d(jSONObject, interfaceC3269s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4) {
        this.f.a(new com.ironsource.sdk.controller.e.RunnableC0162e(t4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.T4 t4, java.util.Map<java.lang.String, java.lang.String> map, com.ironsource.InterfaceC3269s4 interfaceC3269s4) {
        this.f.a(new com.ironsource.sdk.controller.e.g(t4, map, interfaceC3269s4));
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(com.ironsource.sdk.controller.f.c cVar, com.ironsource.sdk.controller.l.a aVar) {
        this.f.a(new com.ironsource.sdk.controller.e.h(aVar, cVar));
    }

    public void a(java.lang.String str, com.ironsource.sdk.controller.l.b bVar) {
        this.j.put(str, bVar);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(android.content.Context context) {
        com.ironsource.sdk.controller.l lVar;
        if (!m() || (lVar = this.b) == null) {
            return;
        }
        lVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.l
    public void a() {
        com.ironsource.sdk.utils.Logger.i(this.f6612a, "destroy controller");
        android.os.CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        com.ironsource.L3 l3 = this.f;
        if (l3 != null) {
            l3.b();
        }
        this.d = null;
        b(new com.ironsource.sdk.controller.e.j());
    }

    @Override // com.ironsource.sdk.controller.l
    public void a(android.app.Activity activity) {
        this.b.a(activity);
    }
}
