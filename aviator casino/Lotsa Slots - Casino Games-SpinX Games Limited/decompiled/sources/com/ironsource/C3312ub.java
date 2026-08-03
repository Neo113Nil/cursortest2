package com.ironsource;

/* renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3312ub {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3256r9 f6763a = new com.ironsource.C3256r9(null, 1, 0 == true ? 1 : 0);

    /* renamed from: com.ironsource.ub$a */
    public static final class a extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ java.lang.Runnable b;

        a(java.lang.Runnable runnable) {
            this.b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            this.b.run();
        }
    }

    /* renamed from: com.ironsource.ub$b */
    public static final class b extends com.ironsource.AbstractRunnableC3136ke {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> b;

        b(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            this.b = function0;
        }

        @Override // com.ironsource.AbstractRunnableC3136ke
        public void a() {
            this.b.invoke();
        }
    }

    /* renamed from: com.ironsource.ub$c */
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.util.Map.Entry<? extends java.lang.String, ? extends java.lang.Boolean>, java.lang.CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.C3312ub.c f6764a = new com.ironsource.C3312ub.c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence invoke(java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
            return entry.getKey() + com.ironsource.X3.j.b + entry.getValue().booleanValue();
        }
    }

    public final void a(com.ironsource.AbstractRunnableC3136ke safeRunnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        a(this, safeRunnable, 0L, 2, (java.lang.Object) null);
    }

    public final void b(final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new java.lang.Runnable() { // from class: com.ironsource.ub$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3312ub.a(com.ironsource.C3312ub.this, runnable);
            }
        }, 0L, 2, (java.lang.Object) null);
    }

    public final void c(final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        a(this, new java.lang.Runnable() { // from class: com.ironsource.ub$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3312ub.b(com.ironsource.C3312ub.this, runnable);
            }
        }, 0L, 2, (java.lang.Object) null);
    }

    public final void d(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f6763a.b(runnable);
    }

    public final void e(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        com.ironsource.environment.thread.IronSourceThreadManager.postOnUiThreadTask$default(com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3312ub this$0, java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.f6763a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final com.ironsource.C3312ub this$0, final java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "$runnable");
        android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: com.ironsource.ub$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                com.ironsource.C3312ub.a(com.ironsource.C3312ub.this, runnable, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3312ub this$0, java.lang.Runnable runnable, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.b(runnable);
    }

    public final void b(com.ironsource.AbstractRunnableC3136ke safeRunnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f6763a.a(safeRunnable);
    }

    public static /* synthetic */ void a(com.ironsource.C3312ub c3312ub, java.lang.Runnable runnable, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3312ub.a(runnable, j);
    }

    public final com.ironsource.C3226pe b(com.ironsource.C3226pe error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        return error.c() == 2080 ? new com.ironsource.C3226pe(error.c(), "serverResponseIsNotValid") : error;
    }

    public final void a(java.lang.Runnable runnable, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.ironsource.C3312ub.a(runnable), j);
    }

    public final void a(java.lang.Runnable callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6763a.a(callback);
    }

    public final void a(com.ironsource.AbstractRunnableC3136ke safeRunnable, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(safeRunnable, "safeRunnable");
        this.f6763a.a(safeRunnable, j);
    }

    public final void b(java.lang.String adUnitId, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        com.ironsource.Ff.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObject);
    }

    public static /* synthetic */ void a(com.ironsource.C3312ub c3312ub, com.ironsource.AbstractRunnableC3136ke abstractRunnableC3136ke, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3312ub.a(abstractRunnableC3136ke, j);
    }

    public static /* synthetic */ void a(com.ironsource.C3312ub c3312ub, kotlin.jvm.functions.Function0 function0, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c3312ub.a((kotlin.jvm.functions.Function0<kotlin.Unit>) function0, j);
    }

    public final void a(kotlin.jvm.functions.Function0<kotlin.Unit> action, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        a((com.ironsource.AbstractRunnableC3136ke) new com.ironsource.C3312ub.b(action), j);
    }

    public final android.os.Handler a() {
        return this.f6763a.a();
    }

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.ironsource.C3221p9.a aVar = com.ironsource.C3221p9.f6553a;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final com.ironsource.mediationsdk.IronSource.a[] a(com.unity3d.mediation.LevelPlay.AdFormat... adFormats) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.unity3d.mediation.LevelPlay.AdFormat adFormat : adFormats) {
            arrayList.add(a(adFormat));
        }
        return (com.ironsource.mediationsdk.IronSource.a[]) arrayList.toArray(new com.ironsource.mediationsdk.IronSource.a[0]);
    }

    public final void b(boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, java.lang.String.valueOf(z));
        com.ironsource.Ff.a(com.ironsource.EnumC3378y5.SET_COPPA, jSONObject);
    }

    public final com.ironsource.mediationsdk.IronSource.a a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface networkAdapter, com.ironsource.mediationsdk.IronSource.a adFormat, java.lang.String providerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkAdapter, "networkAdapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerName, "providerName");
        return com.ironsource.Ff.a(networkAdapter, adFormat, providerName);
    }

    public static /* synthetic */ void a(com.ironsource.C3312ub c3312ub, long j, com.ironsource.Ve.a aVar, long j2, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i & 8) != 0) {
            jSONObject = new org.json.JSONObject();
        }
        c3312ub.a(j, aVar, j2, jSONObject);
    }

    public final void a(long j, com.ironsource.Ve.a responseOrigin, long j2, org.json.JSONObject data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseOrigin, "responseOrigin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("isMultipleAdUnits", 1);
            data.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, j);
            java.lang.String b2 = responseOrigin.b();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b2, "responseOrigin.value");
            data.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, a(b2, j2));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Ff.a(com.ironsource.EnumC3378y5.SDK_INIT_SUCCESS, data);
    }

    public final com.ironsource.C3226pe a(com.ironsource.C3226pe error) {
        com.ironsource.C3226pe c3226pe;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        int c2 = error.c();
        if (c2 == 2070) {
            c3226pe = new com.ironsource.C3226pe(error.c(), "noServerResponse");
        } else {
            if (c2 != 2110) {
                return error;
            }
            c3226pe = new com.ironsource.C3226pe(error.c(), com.ironsource.mediationsdk.utils.IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return c3226pe;
    }

    private final java.lang.String a(java.lang.String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    public static /* synthetic */ void a(com.ironsource.C3312ub c3312ub, com.ironsource.C3226pe c3226pe, long j, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i & 4) != 0) {
            jSONObject = new org.json.JSONObject();
        }
        c3312ub.a(c3226pe, j, jSONObject);
    }

    public final void a(com.ironsource.C3226pe error, long j, org.json.JSONObject data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        try {
            data.put("errorCode", error.c());
            data.put("reason", error.d());
            data.put("isMultipleAdUnits", 1);
            data.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, j);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
        com.ironsource.Ff.a(com.ironsource.EnumC3378y5.SDK_INIT_FAILED, data);
    }

    public final void a(java.lang.String placementName, com.unity3d.mediation.LevelPlay.AdFormat adFormat, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("placement", placementName);
        jSONObject.put(com.ironsource.Va.f, adFormat.getValue());
        jSONObject.put("adf", com.ironsource.Ff.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObject.put("isMultipleAdUnits", 1);
        com.ironsource.Ff.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(java.lang.String adUnitId, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errorCode", i);
        jSONObject.putOpt("reason", str);
        jSONObject.put("mediationAdUnitId", adUnitId);
        jSONObject.put("isMultipleAdUnits", 1);
        com.ironsource.Ff.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObject);
    }

    public final void a(java.util.Map<java.lang.String, java.lang.Boolean> networkConsents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, kotlin.collections.CollectionsKt.joinToString$default(networkConsents.entrySet(), ";", null, null, 0, null, com.ironsource.C3312ub.c.f6764a, 30, null));
        com.ironsource.Ff.a(com.ironsource.EnumC3378y5.GDPR_CONSENTS, jSONObject);
    }

    public final void a(boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, java.lang.String.valueOf(z));
        com.ironsource.Ff.a(com.ironsource.EnumC3378y5.SET_CCPA, jSONObject);
    }
}
