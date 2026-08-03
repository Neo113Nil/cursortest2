package com.ironsource;

/* renamed from: com.ironsource.l3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3143l3 implements com.ironsource.B7 {
    static boolean O = false;
    private int[] A;
    private int[] B;
    private int[] C;
    int G;
    java.lang.String H;
    java.lang.String I;
    java.util.Set<java.lang.Integer> J;
    private com.ironsource.A5 K;
    private com.ironsource.C2953aa L;
    private com.ironsource.We M;
    private boolean l;
    private com.ironsource.C4 p;
    private com.ironsource.AbstractC3014e q;
    private java.util.ArrayList<com.ironsource.C3360x5> r;
    private int t;
    private com.ironsource.I8 u;
    private android.content.Context v;
    private int[] z;

    /* renamed from: a, reason: collision with root package name */
    final int f6360a = 1;
    final int b = 100;
    final int c = 5000;
    final int d = 90000;
    final int e = 1024;
    final int f = 5;
    final java.lang.String g = "supersonic_sdk.db";
    final java.lang.String h = com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER;
    final java.lang.String i = "placement";
    private final java.lang.String j = "abt";
    private final java.lang.String k = com.ironsource.M6.c1;
    private boolean m = false;
    private boolean n = false;
    private int o = -1;
    private boolean s = true;
    private int w = 100;
    private int x = 5000;
    private int y = 1;
    private java.util.Map<java.lang.String, java.lang.String> D = new java.util.HashMap();
    private java.util.Map<java.lang.String, java.lang.String> E = new java.util.HashMap();
    private java.lang.String F = "";
    private final java.lang.Object N = new java.lang.Object();

    /* renamed from: com.ironsource.l3$a */
    class a implements java.lang.Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.AbstractC3143l3.this.a();
        }
    }

    /* renamed from: com.ironsource.l3$b */
    class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.C3360x5 f6362a;
        final /* synthetic */ com.ironsource.mediationsdk.IronSource.a b;

        b(com.ironsource.C3360x5 c3360x5, com.ironsource.mediationsdk.IronSource.a aVar) {
            this.f6362a = c3360x5;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6362a.a("eventSessionId", com.ironsource.AbstractC3143l3.this.u.b());
            this.f6362a.a("essn", java.lang.Integer.valueOf(com.ironsource.AbstractC3143l3.this.u.c()));
            java.lang.String a2 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(com.ironsource.AbstractC3143l3.this.v);
            if (com.ironsource.AbstractC3143l3.this.g(this.f6362a)) {
                this.f6362a.a("connectionType", a2);
            }
            if (com.ironsource.AbstractC3143l3.this.a(a2, this.f6362a)) {
                com.ironsource.C3360x5 c3360x5 = this.f6362a;
                c3360x5.a(com.ironsource.AbstractC3143l3.this.b(c3360x5));
            }
            java.lang.String d = com.ironsource.U3.d(com.ironsource.AbstractC3143l3.this.v);
            if (d != null) {
                this.f6362a.a("rawConnectionType", d);
            }
            int a3 = com.ironsource.AbstractC3143l3.this.a(this.f6362a.c(), this.b);
            if (a3 != com.ironsource.AbstractC3143l3.e.NOT_SUPPORTED.b()) {
                this.f6362a.a("adUnit", java.lang.Integer.valueOf(a3));
            }
            com.ironsource.AbstractC3143l3.this.a(this.f6362a, "reason");
            com.ironsource.AbstractC3143l3.this.a(this.f6362a, com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1);
            if (!com.ironsource.AbstractC3143l3.this.E.isEmpty()) {
                for (java.util.Map.Entry entry : com.ironsource.AbstractC3143l3.this.E.entrySet()) {
                    if (!this.f6362a.b().has((java.lang.String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != com.ironsource.C4.a.d) {
                        this.f6362a.a((java.lang.String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (com.ironsource.AbstractC3143l3.this.i(this.f6362a)) {
                if (com.ironsource.AbstractC3143l3.this.h(this.f6362a) && !com.ironsource.AbstractC3143l3.this.e(this.f6362a)) {
                    this.f6362a.a("sessionDepth", java.lang.Integer.valueOf(com.ironsource.AbstractC3143l3.this.c(this.f6362a)));
                }
                if (com.ironsource.AbstractC3143l3.this.j(this.f6362a)) {
                    com.ironsource.AbstractC3143l3.this.f(this.f6362a);
                }
                long a4 = com.ironsource.AbstractC3143l3.this.u.a();
                if (a4 > 0) {
                    this.f6362a.a("firstSessionTimestamp", java.lang.Long.valueOf(a4));
                }
                com.ironsource.mediationsdk.logger.IronLog.EVENT.verbose(this.f6362a.toString());
                com.ironsource.AbstractC3143l3.this.r.add(this.f6362a);
                com.ironsource.AbstractC3143l3.this.t++;
            }
            com.ironsource.AbstractC3143l3 abstractC3143l3 = com.ironsource.AbstractC3143l3.this;
            boolean a5 = abstractC3143l3.a(abstractC3143l3.B) ? com.ironsource.AbstractC3143l3.this.a(this.f6362a.c(), com.ironsource.AbstractC3143l3.this.B) : com.ironsource.AbstractC3143l3.this.d(this.f6362a);
            com.ironsource.AbstractC3143l3 abstractC3143l32 = com.ironsource.AbstractC3143l3.this;
            if (!abstractC3143l32.m && a5) {
                abstractC3143l32.m = true;
            }
            if (abstractC3143l32.p != null) {
                if (abstractC3143l32.g()) {
                    com.ironsource.AbstractC3143l3.this.f();
                    return;
                }
                com.ironsource.AbstractC3143l3 abstractC3143l33 = com.ironsource.AbstractC3143l3.this;
                if (abstractC3143l33.b((java.util.ArrayList<com.ironsource.C3360x5>) abstractC3143l33.r) || a5) {
                    com.ironsource.AbstractC3143l3.this.a();
                }
            }
        }
    }

    /* renamed from: com.ironsource.l3$d */
    class d implements java.lang.Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ironsource.AbstractC3143l3.this.f();
        }
    }

    /* renamed from: com.ironsource.l3$e */
    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* renamed from: a, reason: collision with root package name */
        private int f6365a;

        e(int i) {
            this.f6365a = i;
        }

        public int b() {
            return this.f6365a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(com.ironsource.C3360x5 c3360x5) {
        return c3360x5.c() + 90000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        java.util.ArrayList<com.ironsource.C3360x5> a2;
        try {
            this.m = false;
            java.util.ArrayList<com.ironsource.C3360x5> arrayList = new java.util.ArrayList<>();
            try {
                synchronized (this.N) {
                    a2 = this.p.a(this.I);
                    this.p.b(this.I);
                }
                com.ironsource.C5.c cVar = new com.ironsource.C5.c(new com.ironsource.C5.a(a2, this.r), this.x);
                this.p.a(cVar.a(), this.I);
                arrayList.addAll(cVar.b());
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                arrayList.clear();
                arrayList.addAll(this.r);
            }
            if (arrayList.size() > 0) {
                this.r.clear();
                this.t = 0;
                org.json.JSONObject b2 = com.ironsource.J6.a().b();
                try {
                    a(b2);
                    java.lang.String b3 = b();
                    if (!android.text.TextUtils.isEmpty(b3)) {
                        b2.put("abt", b3);
                    }
                    java.lang.String k = com.ironsource.mediationsdk.p.h().k();
                    if (!android.text.TextUtils.isEmpty(k)) {
                        b2.put(com.ironsource.M6.c1, k);
                    }
                    java.util.Map<java.lang.String, java.lang.String> c2 = c();
                    if (!c2.isEmpty()) {
                        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : c2.entrySet()) {
                            if (!b2.has(entry.getKey())) {
                                b2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    org.json.JSONObject a3 = new com.ironsource.H5().a();
                    java.util.Iterator<java.lang.String> keys = a3.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        b2.put(next, a3.get(next));
                    }
                } catch (java.lang.Throwable th2) {
                    com.ironsource.C3180n4.d().a(th2);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                java.lang.String a4 = this.q.a(arrayList, b2);
                if (android.text.TextUtils.isEmpty(a4)) {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to parse events.");
                    return;
                }
                if (!O && this.l && a(arrayList, com.ironsource.EnumC3378y5.FIRST_INSTANCE.b())) {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("events data: " + a4);
                    O = true;
                }
                if (this.n) {
                    try {
                        a4 = android.util.Base64.encodeToString(com.ironsource.Q9.a(a4, this.o), 0);
                    } catch (java.lang.Exception e2) {
                        com.ironsource.C3180n4.d().a(e2);
                    }
                }
                com.ironsource.Gf.f5727a.b(new com.ironsource.I5(new com.ironsource.AbstractC3143l3.c(), a4, this.q.b(), arrayList));
            }
        } catch (java.lang.Throwable th3) {
            com.ironsource.C3180n4.d().a(th3);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.t >= this.w || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(com.ironsource.C3360x5 c3360x5) {
        if (c3360x5 == null) {
            return false;
        }
        if (a(this.z)) {
            return true ^ a(c3360x5.c(), this.z);
        }
        if (a(this.A)) {
            return a(c3360x5.c(), this.A);
        }
        return true;
    }

    public synchronized void a(android.content.Context context, com.ironsource.C2953aa c2953aa) {
        java.lang.String a2 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, this.I, this.H);
        this.H = a2;
        b(a2);
        this.q.a(com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, this.I, (java.lang.String) null));
        this.p = com.ironsource.C4.a(context, "supersonic_sdk.db", 5);
        this.K.a(new com.ironsource.AbstractC3143l3.a());
        this.z = com.ironsource.mediationsdk.utils.IronSourceUtils.c(context, this.I);
        this.A = com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, this.I);
        this.B = com.ironsource.mediationsdk.utils.IronSourceUtils.d(context, this.I);
        this.C = com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, this.I);
        this.L = c2953aa;
        this.v = context;
    }

    protected abstract int c(com.ironsource.C3360x5 c3360x5);

    @Override // com.ironsource.B7
    public void c(int[] iArr, android.content.Context context) {
        this.A = iArr;
        com.ironsource.mediationsdk.utils.IronSourceUtils.b(context, this.I, iArr);
    }

    abstract void d();

    @Override // com.ironsource.B7
    public void d(int i) {
        if (i > 0) {
            this.x = i;
        }
    }

    protected abstract boolean d(com.ironsource.C3360x5 c3360x5);

    protected abstract java.lang.String e(int i);

    void e() {
        this.r = new java.util.ArrayList<>();
        this.t = 0;
        this.q = com.ironsource.F5.a(this.H, this.G);
        com.ironsource.A5 a5 = new com.ironsource.A5(this.I + "EventThread");
        this.K = a5;
        a5.start();
        this.K.a();
        this.u = com.ironsource.Jb.Y().m();
        this.J = new java.util.HashSet();
        d();
    }

    protected abstract void f(com.ironsource.C3360x5 c3360x5);

    public void h() {
        this.K.a(new com.ironsource.AbstractC3143l3.d());
    }

    protected abstract boolean j(com.ironsource.C3360x5 c3360x5);

    private void b(java.lang.String str) {
        com.ironsource.AbstractC3014e abstractC3014e = this.q;
        if (abstractC3014e == null || !abstractC3014e.c().equals(str)) {
            this.q = com.ironsource.F5.a(str, this.G);
        }
    }

    @Override // com.ironsource.B7
    public void d(int[] iArr, android.content.Context context) {
        this.C = iArr;
        com.ironsource.mediationsdk.utils.IronSourceUtils.a(context, this.I, iArr);
    }

    protected boolean g(com.ironsource.C3360x5 c3360x5) {
        return (c3360x5.c() == com.ironsource.EnumC3378y5.CONSENT_TRUE_CODE.b() || c3360x5.c() == com.ironsource.EnumC3378y5.CONSENT_FALSE_CODE.b() || c3360x5.c() == com.ironsource.EnumC3378y5.SET_META_DATA.b() || c3360x5.c() == com.ironsource.EnumC3378y5.SET_META_DATA_AFTER_INIT.b() || c3360x5.c() == com.ironsource.EnumC3378y5.SET_USER_ID.b()) ? false : true;
    }

    protected boolean h(com.ironsource.C3360x5 c3360x5) {
        return (c3360x5.c() == com.ironsource.EnumC3378y5.FIRST_INSTANCE.b() || c3360x5.c() == com.ironsource.EnumC3378y5.FIRST_INSTANCE_RESULT.b() || c3360x5.c() == com.ironsource.EnumC3378y5.INIT_COMPLETE.b() || c3360x5.c() == com.ironsource.EnumC3378y5.SDK_INIT_FAILED.b() || c3360x5.c() == com.ironsource.EnumC3378y5.SDK_INIT_SUCCESS.b() || c3360x5.c() == com.ironsource.EnumC3378y5.USING_CACHE_FOR_INIT_EVENT.b() || c3360x5.c() == com.ironsource.EnumC3378y5.CONSENT_TRUE_CODE.b() || c3360x5.c() == com.ironsource.EnumC3378y5.CONSENT_FALSE_CODE.b() || c3360x5.c() == com.ironsource.EnumC3378y5.SET_META_DATA.b() || c3360x5.c() == com.ironsource.EnumC3378y5.SET_META_DATA_AFTER_INIT.b() || c3360x5.c() == com.ironsource.EnumC3378y5.SET_USER_ID.b()) ? false : true;
    }

    @Override // com.ironsource.B7
    public void c(int i) {
        this.o = i;
    }

    @Override // com.ironsource.B7
    public void b(int i) {
        if (i > 0) {
            this.y = i;
        }
    }

    public void c(boolean z) {
        this.l = z;
    }

    /* renamed from: com.ironsource.l3$c */
    class c implements com.ironsource.C7 {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(com.ironsource.C7.a aVar) {
            try {
                if (aVar.c()) {
                    com.ironsource.AbstractC3143l3 abstractC3143l3 = com.ironsource.AbstractC3143l3.this;
                    java.util.ArrayList<com.ironsource.C3360x5> a2 = abstractC3143l3.p.a(abstractC3143l3.I);
                    com.ironsource.AbstractC3143l3.this.t = a2.size() + com.ironsource.AbstractC3143l3.this.r.size();
                } else {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    com.ironsource.AbstractC3143l3.this.a(com.ironsource.AbstractC3143l3.this.a(aVar.b(), aVar.a()));
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
            }
            a(aVar.b());
        }

        public void a(java.util.ArrayList<com.ironsource.C3360x5> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (java.lang.Exception e) {
                    com.ironsource.C3180n4.d().a(e);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("clearData exception: " + e.getMessage());
                }
            }
        }

        @Override // com.ironsource.C7
        public synchronized void a(final com.ironsource.C7.a aVar) {
            com.ironsource.AbstractC3143l3.this.K.a(new java.lang.Runnable() { // from class: com.ironsource.l3$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.ironsource.AbstractC3143l3.c.this.b(aVar);
                }
            });
        }
    }

    @Override // com.ironsource.B7
    public void b(int[] iArr, android.content.Context context) {
        this.z = iArr;
        com.ironsource.mediationsdk.utils.IronSourceUtils.c(context, this.I, iArr);
    }

    public java.util.Map<java.lang.String, java.lang.String> c() {
        return this.D;
    }

    @Override // com.ironsource.B7
    public void b(java.lang.String str, android.content.Context context) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.ironsource.AbstractC3014e abstractC3014e = this.q;
        if (abstractC3014e != null) {
            abstractC3014e.a(str);
        }
        com.ironsource.mediationsdk.utils.IronSourceUtils.e(context, this.I, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(com.ironsource.C3360x5 c3360x5) {
        org.json.JSONObject b2 = c3360x5.b();
        if (b2 == null) {
            return false;
        }
        return b2.has("sessionDepth");
    }

    @Override // com.ironsource.B7
    public void b(boolean z) {
        this.n = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(java.util.ArrayList<com.ironsource.C3360x5> arrayList) {
        return arrayList != null && arrayList.size() >= this.y;
    }

    public java.lang.String b() {
        return this.F;
    }

    public void b(java.util.Map<java.lang.String, java.lang.String> map) {
        this.E.putAll(map);
    }

    public synchronized void a(com.ironsource.We we) {
        this.M = we;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(java.lang.String str, com.ironsource.C3360x5 c3360x5) {
        boolean contains;
        if (!str.equalsIgnoreCase("none")) {
            return false;
        }
        if (a(this.C)) {
            contains = a(c3360x5.c(), this.C);
        } else {
            contains = this.J.contains(java.lang.Integer.valueOf(c3360x5.c()));
        }
        return contains;
    }

    @Override // com.ironsource.B7
    public synchronized void a(com.ironsource.C3360x5 c3360x5) {
        a(c3360x5, (com.ironsource.mediationsdk.IronSource.a) null);
    }

    public synchronized void a(com.ironsource.C3360x5 c3360x5, com.ironsource.mediationsdk.IronSource.a aVar) {
        if (c3360x5 != null) {
            if (this.s) {
                this.K.a(new com.ironsource.AbstractC3143l3.b(c3360x5, aVar));
            }
        }
    }

    private boolean a(java.util.ArrayList<com.ironsource.C3360x5> arrayList, int i) {
        java.util.Iterator<com.ironsource.C3360x5> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().c() == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.ArrayList<com.ironsource.C3360x5> a(java.util.ArrayList<com.ironsource.C3360x5> arrayList, java.lang.String str) {
        java.lang.String a2 = a(str, 1024);
        java.util.Iterator<com.ironsource.C3360x5> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(a2);
        }
        return arrayList;
    }

    protected void a(java.util.ArrayList<com.ironsource.C3360x5> arrayList) {
        if (arrayList != null) {
            synchronized (this.N) {
                this.p.a(arrayList, this.I);
                this.t = this.p.a(this.I).size() + this.r.size();
            }
        }
    }

    @Override // com.ironsource.B7
    public void a(int i) {
        if (i > 0) {
            this.w = i;
        }
    }

    @Override // com.ironsource.B7
    public void a(int[] iArr, android.content.Context context) {
        this.B = iArr;
        com.ironsource.mediationsdk.utils.IronSourceUtils.d(context, this.I, iArr);
    }

    @Override // com.ironsource.B7
    public void a(java.lang.String str, android.content.Context context) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.H = str;
        com.ironsource.mediationsdk.utils.IronSourceUtils.d(context, this.I, str);
        b(str);
    }

    @Override // com.ironsource.B7
    public void a(boolean z) {
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.N) {
            this.p.a(this.r, this.I);
            this.r.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int[] iArr) {
        if (!a(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    private void a(org.json.JSONObject jSONObject) {
        try {
            com.ironsource.C2953aa c2953aa = this.L;
            if (c2953aa != null) {
                if (c2953aa.a() > 0) {
                    jSONObject.put("age", this.L.a());
                }
                if (!android.text.TextUtils.isEmpty(this.L.b())) {
                    jSONObject.put(com.ironsource.C2953aa.n, this.L.b());
                }
                if (this.L.e() > 0) {
                    jSONObject.put("lvl", this.L.e());
                }
                if (this.L.d() != null) {
                    jSONObject.put("pay", this.L.d().get());
                }
                if (this.L.c() > 0.0d) {
                    jSONObject.put("iapt", this.L.c());
                }
                if (this.L.h() > 0) {
                    jSONObject.put("ucd", this.L.h());
                }
            }
            com.ironsource.We we = this.M;
            if (we != null) {
                java.lang.String b2 = we.b();
                if (!android.text.TextUtils.isEmpty(b2)) {
                    jSONObject.put("segmentId", b2);
                }
                org.json.JSONObject a2 = this.M.a();
                java.util.Iterator<java.lang.String> keys = a2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, a2.get(next));
                }
            }
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    public void a(java.lang.String str) {
        this.F = str;
    }

    public void a(java.util.Map<java.lang.String, java.lang.String> map) {
        this.D.putAll(map);
    }

    public void a(java.util.Map<java.lang.String, java.lang.Object> map, int i, java.lang.String str) {
        map.put(com.ironsource.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, java.lang.Integer.valueOf(i));
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        map.put(com.ironsource.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(com.ironsource.C3360x5 c3360x5, java.lang.String str, int i) {
        org.json.JSONObject b2 = c3360x5.b();
        if (b2 == null || !b2.has(str)) {
            return;
        }
        try {
            c3360x5.a(str, a(b2.optString(str, null), i));
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
    }

    java.lang.String a(java.lang.String str, int i) {
        return (android.text.TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.ironsource.C3360x5 c3360x5, java.lang.String str) {
        a(c3360x5, str, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i, com.ironsource.mediationsdk.IronSource.a aVar) {
        int b2 = com.ironsource.AbstractC3143l3.e.NOT_SUPPORTED.b();
        if (aVar != com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO && ((i < 1000 || i >= 2000) && (i < 91000 || i >= 92000))) {
            if (aVar != com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL && ((i < 2000 || i >= 3000) && (i < 92000 || i >= 93000))) {
                if (aVar == com.ironsource.mediationsdk.IronSource.a.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
                    return com.ironsource.AbstractC3143l3.e.BANNER.b();
                }
                return (aVar == com.ironsource.mediationsdk.IronSource.a.NATIVE_AD || (i >= 4000 && i < 5000) || (i >= 94000 && i < 95000)) ? com.ironsource.AbstractC3143l3.e.NATIVE_AD.b() : b2;
            }
            return com.ironsource.AbstractC3143l3.e.INTERSTITIAL.b();
        }
        return com.ironsource.AbstractC3143l3.e.REWARDED_VIDEO.b();
    }

    public void a(com.ironsource.C2953aa c2953aa) {
        this.L = c2953aa;
    }

    void a(java.lang.Runnable runnable) {
        this.K.a(runnable);
    }

    protected int f(int i) {
        return a(i, (com.ironsource.mediationsdk.IronSource.a) null);
    }
}
