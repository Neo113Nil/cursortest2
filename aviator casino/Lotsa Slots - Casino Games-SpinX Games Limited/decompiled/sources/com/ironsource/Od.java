package com.ironsource;

/* loaded from: classes5.dex */
public final class Od {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.B7 f5882a;
    private final kotlin.jvm.functions.Function0<java.lang.Long> b;
    private final com.ironsource.H7 c;
    private final java.util.concurrent.Executor d;

    /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Od.a f5883a = new com.ironsource.Od.a();

        a() {
            super(0, java.lang.System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Long invoke() {
            return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
    }

    public static final class b implements android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> {
        b() {
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(java.lang.Exception error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
            com.ironsource.Od.this.a(error.getMessage());
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(java.lang.Object obj) {
            com.ironsource.Od.this.c();
        }
    }

    public Od() {
        this(null, null, null, null, 15, null);
    }

    private final boolean b(android.content.Context context) {
        return com.ironsource.mediationsdk.utils.IronSourceUtils.c(context);
    }

    private final void d() {
        this.f5882a.a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.REGISTER_TRIGGER, (org.json.JSONObject) null));
    }

    public final void c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        d();
        try {
            android.adservices.measurement.MeasurementManager a2 = com.ironsource.C3140l0.a(context);
            if (a2 == null) {
                a("could not obtain measurement manager");
            } else {
                a2.registerTrigger(a(context), this.d, a());
            }
        } catch (java.lang.Exception e) {
            a(e.getMessage());
            com.ironsource.C3180n4.d().a(e);
        }
    }

    public Od(com.ironsource.B7 eventManager, kotlin.jvm.functions.Function0<java.lang.Long> getTimeFunction, com.ironsource.H7 serviceProvider, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getTimeFunction, "getTimeFunction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "serviceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        this.f5882a = eventManager;
        this.b = getTimeFunction;
        this.c = serviceProvider;
        this.d = executor;
    }

    private final java.lang.String b() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> c = com.ironsource.C3150la.b().c();
        java.util.List<java.lang.String> list = c != null ? c.get(com.ironsource.mediationsdk.metadata.a.b) : null;
        java.lang.String str = list != null ? (java.lang.String) kotlin.collections.CollectionsKt.first((java.util.List) list) : null;
        return str == null ? "" : str;
    }

    private final android.net.Uri a(android.content.Context context) {
        com.ironsource.InterfaceC3362x7 a2 = this.c.a();
        java.lang.String a3 = com.ironsource.mediationsdk.utils.IronSourceUtils.a(context);
        android.net.Uri build = new android.net.Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", android.os.Build.VERSION.RELEASE).appendQueryParameter("apiLevel", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", android.os.Build.MODEL).appendQueryParameter("sdkVersion", com.unity3d.mediation.LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(com.ironsource.M6.X0, a2.J(context)).appendQueryParameter(com.ironsource.M6.M0, a2.z(context)).appendQueryParameter("auid", a2.e(context)).appendQueryParameter("isFirstSession", java.lang.String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(com.ironsource.M6.j0, java.lang.String.valueOf(com.ironsource.C3140l0.a())).appendQueryParameter("origin", "1").appendQueryParameter(com.ironsource.C4.a.d, java.lang.String.valueOf(this.b.invoke().longValue())).appendQueryParameter(com.ironsource.X3.j.x, a2.d(context)).appendQueryParameter("deviceCarrier", a2.v(context)).appendQueryParameter("connectionType", a3).appendQueryParameter(com.ironsource.T3.b, java.lang.String.valueOf(kotlin.text.StringsKt.equals(a3, com.ironsource.T3.b, true))).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .schem…arameter\n        .build()");
        return build;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Od(com.ironsource.B7 b7, kotlin.jvm.functions.Function0 function0, com.ironsource.H7 h7, java.util.concurrent.Executor executor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b7, function0, h7, executor);
        b7 = (i & 1) != 0 ? com.ironsource.Jb.u.d().q() : b7;
        function0 = (i & 2) != 0 ? com.ironsource.Od.a.f5883a : function0;
        h7 = (i & 4) != 0 ? com.ironsource.Jb.u.d() : h7;
        if ((i & 8) != 0) {
            executor = java.util.concurrent.Executors.newSingleThreadExecutor();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f5882a.a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.REGISTER_TRIGGER_SUCCESS, (org.json.JSONObject) null));
    }

    private final android.os.OutcomeReceiver<java.lang.Object, java.lang.Exception> a() {
        return new com.ironsource.Od.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(java.lang.String str) {
        this.f5882a.a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.REGISTER_TRIGGER_FAIL, new org.json.JSONObject().put("reason", str)));
    }
}
