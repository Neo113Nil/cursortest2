package com.ironsource;

/* loaded from: classes5.dex */
public final class Q7 implements com.ironsource.InterfaceC2995cg {
    private static boolean c = false;
    public static final java.lang.String d = "deviceStatus";
    public static final java.lang.String e = "iabTokenAPI";
    public static final java.lang.String f = "dsSharedSignalsAPI";
    public static final java.lang.String g = "deleteFolder";
    public static final java.lang.String h = "deleteFile";
    public static final java.lang.String i = "getCachedFilesMap";
    public static final java.lang.String j = "permissionsAPI";
    public static final java.lang.String k = "deviceDataAPI";
    public static final java.lang.String l = "adViewAPI";
    private static final com.ironsource.R9 o;
    private static final com.ironsource.R9 p;
    private static final com.ironsource.R9 q;

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Q7 f5934a = new com.ironsource.Q7();
    private static final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    private static final kotlin.Lazy m = kotlin.LazyKt.lazy(com.ironsource.Q7.a.f5935a);
    private static final kotlin.Lazy n = kotlin.LazyKt.lazy(com.ironsource.Q7.b.f5936a);

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.C3154le> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Q7.a f5935a = new com.ironsource.Q7.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.C3154le invoke() {
            return new com.ironsource.C3154le(0, null, null, 7, null);
        }
    }

    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.Map<java.lang.String, ? extends kotlin.reflect.KFunction<? extends java.lang.Boolean>>> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Q7.b f5936a = new com.ironsource.Q7.b();

        /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            a(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadDeviceStatus", "shouldRunOnBackgroundThreadDeviceStatus()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).o());
            }
        }

        /* renamed from: com.ironsource.Q7$b$b, reason: collision with other inner class name */
        /* synthetic */ class C0126b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            C0126b(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadIabToken", "shouldRunOnBackgroundThreadIabToken()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).r());
            }
        }

        /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            c(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadSharedSignals", "shouldRunOnBackgroundThreadSharedSignals()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).q());
            }
        }

        /* synthetic */ class d extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            d(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadDeleteFolder", "shouldRunOnBackgroundThreadDeleteFolder()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).k());
            }
        }

        /* synthetic */ class e extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            e(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadDeleteFile", "shouldRunOnBackgroundThreadDeleteFile()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).p());
            }
        }

        /* synthetic */ class f extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            f(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadCachedFiles", "shouldRunOnBackgroundThreadCachedFiles()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).b());
            }
        }

        /* synthetic */ class g extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            g(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadPermissions", "shouldRunOnBackgroundThreadPermissions()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).F());
            }
        }

        /* synthetic */ class h extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            h(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadDeviceData", "shouldRunOnBackgroundThreadDeviceData()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).E());
            }
        }

        /* synthetic */ class i extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
            i(java.lang.Object obj) {
                super(0, obj, com.ironsource.InterfaceC3398z7.class, "shouldRunOnBackgroundThreadAdView", "shouldRunOnBackgroundThreadAdView()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(((com.ironsource.InterfaceC3398z7) this.receiver).H());
            }
        }

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.util.Map<java.lang.String, kotlin.reflect.KFunction<java.lang.Boolean>> invoke() {
            com.ironsource.InterfaceC3398z7 h2 = com.ironsource.Jb.u.d().h();
            return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.Q7.d, new com.ironsource.Q7.b.a(h2)), kotlin.TuplesKt.to(com.ironsource.Q7.e, new com.ironsource.Q7.b.C0126b(h2)), kotlin.TuplesKt.to(com.ironsource.Q7.f, new com.ironsource.Q7.b.c(h2)), kotlin.TuplesKt.to("deleteFolder", new com.ironsource.Q7.b.d(h2)), kotlin.TuplesKt.to("deleteFile", new com.ironsource.Q7.b.e(h2)), kotlin.TuplesKt.to(com.ironsource.Q7.i, new com.ironsource.Q7.b.f(h2)), kotlin.TuplesKt.to(com.ironsource.Q7.j, new com.ironsource.Q7.b.g(h2)), kotlin.TuplesKt.to(com.ironsource.Q7.k, new com.ironsource.Q7.b.h(h2)), kotlin.TuplesKt.to(com.ironsource.Q7.l, new com.ironsource.Q7.b.i(h2)));
        }
    }

    static {
        com.ironsource.R9 r9 = new com.ironsource.R9("isadplayer-background");
        r9.start();
        r9.a();
        o = r9;
        com.ironsource.R9 r92 = new com.ironsource.R9("isadplayer-publisher-callbacks");
        r92.start();
        r92.a();
        p = r92;
        com.ironsource.R9 r93 = new com.ironsource.R9("isadplayer-release");
        r93.start();
        r93.a();
        q = r93;
    }

    private Q7() {
    }

    private final boolean f(java.lang.Runnable runnable) {
        return c && b().getQueue().contains(runnable);
    }

    public final void a(boolean z) {
        c = z;
    }

    public final void b(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        a(this, action, 0L, 2, null);
    }

    public final void c(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        b(this, action, 0L, 2, null);
    }

    public final void d(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final boolean e() {
        return c;
    }

    private final com.ironsource.C3154le b() {
        return (com.ironsource.C3154le) m.getValue();
    }

    private final java.util.Map<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Boolean>> c() {
        return (java.util.Map) n.getValue();
    }

    @Override // com.ironsource.InterfaceC2995cg
    public void a(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        c(this, action, 0L, 2, null);
    }

    public final void d(java.lang.Runnable action, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        b.postDelayed(action, j2);
    }

    public final void e(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (f(action)) {
            b().remove(action);
        } else {
            q.b(action);
        }
    }

    public static /* synthetic */ void a(com.ironsource.Q7 q7, java.lang.Runnable runnable, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        q7.b(runnable, j2);
    }

    public static /* synthetic */ void c(com.ironsource.Q7 q7, java.lang.Runnable runnable, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        q7.d(runnable, j2);
    }

    public final void b(java.lang.Runnable action, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        o.a(action, j2);
    }

    public final java.util.concurrent.ThreadPoolExecutor d() {
        return b();
    }

    public static /* synthetic */ void b(com.ironsource.Q7 q7, java.lang.Runnable runnable, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        q7.c(runnable, j2);
    }

    @Override // com.ironsource.InterfaceC2995cg
    public void a(java.lang.Runnable action, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (c) {
            b().schedule(action, j2, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            q.a(action, j2);
        }
    }

    public final void c(java.lang.Runnable action, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        p.a(action, j2);
    }

    public final android.os.Looper a() {
        return o.getLooper();
    }

    public final void a(java.lang.Runnable action, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.functions.Function0<java.lang.Boolean> function0 = c().get(name);
        if (function0 != null && function0.invoke().booleanValue()) {
            a(this, action, 0L, 2, null);
        } else {
            action.run();
        }
    }
}
