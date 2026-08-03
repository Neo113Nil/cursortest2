package com.ironsource;

/* renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3302u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3302u1.b f6748a;
    private static final java.lang.String b;

    /* renamed from: com.ironsource.u1$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6749a;
        private final com.ironsource.C3202o8.e b;
        private final java.lang.String c;
        private final org.json.JSONObject d;

        public a(java.lang.String name, com.ironsource.C3202o8.e productType, java.lang.String demandSourceName, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            this.f6749a = name;
            this.b = productType;
            this.c = demandSourceName;
            this.d = params;
        }

        public final java.lang.String a() {
            return this.f6749a;
        }

        public final com.ironsource.C3202o8.e b() {
            return this.b;
        }

        public final java.lang.String c() {
            return this.c;
        }

        public final org.json.JSONObject d() {
            return this.d;
        }

        public final java.lang.String e() {
            return this.c;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.ironsource.C3302u1.a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            com.ironsource.C3302u1.a aVar = (com.ironsource.C3302u1.a) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.f6749a, aVar.f6749a) && this.b == aVar.b && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d.toString(), aVar.d.toString());
        }

        public final java.lang.String f() {
            return this.f6749a;
        }

        public final org.json.JSONObject g() {
            return this.d;
        }

        public final com.ironsource.C3202o8.e h() {
            return this.b;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final org.json.JSONObject i() {
            org.json.JSONObject put = new org.json.JSONObject(this.d.toString()).put(com.ironsource.X3.i.m, this.b).put("demandSourceName", this.c);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(put, "JSONObject(params.toStri…eName\", demandSourceName)");
            return put;
        }

        public java.lang.String toString() {
            return "CallbackResult(name=" + this.f6749a + ", productType=" + this.b + ", demandSourceName=" + this.c + ", params=" + this.d + ")";
        }

        public final com.ironsource.C3302u1.a a(java.lang.String name, com.ironsource.C3202o8.e productType, java.lang.String demandSourceName, org.json.JSONObject params) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            return new com.ironsource.C3302u1.a(name, productType, demandSourceName, params);
        }

        public static /* synthetic */ com.ironsource.C3302u1.a a(com.ironsource.C3302u1.a aVar, java.lang.String str, com.ironsource.C3202o8.e eVar, java.lang.String str2, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f6749a;
            }
            if ((i & 2) != 0) {
                eVar = aVar.b;
            }
            if ((i & 4) != 0) {
                str2 = aVar.c;
            }
            if ((i & 8) != 0) {
                jSONObject = aVar.d;
            }
            return aVar.a(str, eVar, str2, jSONObject);
        }
    }

    /* renamed from: com.ironsource.u1$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionClick$1", f = "AndroidSandboxJSHandler.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ironsource.u1$c */
    static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6750a;
        final /* synthetic */ android.adservices.measurement.MeasurementManager c;
        final /* synthetic */ android.net.Uri d;
        final /* synthetic */ android.view.MotionEvent e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(android.adservices.measurement.MeasurementManager measurementManager, android.net.Uri uri, android.view.MotionEvent motionEvent, kotlin.coroutines.Continuation<? super com.ironsource.C3302u1.c> continuation) {
            super(2, continuation);
            this.c = measurementManager;
            this.d = uri;
            this.e = motionEvent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.ironsource.C3302u1.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.ironsource.C3302u1.this.new c(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6750a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.ironsource.C3302u1 c3302u1 = com.ironsource.C3302u1.this;
                android.adservices.measurement.MeasurementManager measurementManager = this.c;
                android.net.Uri uri = this.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "uri");
                android.view.MotionEvent motionEvent = this.e;
                this.f6750a = 1;
                if (c3302u1.a(measurementManager, uri, motionEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ironsource.sdk.controller.androidSandbox.AndroidSandboxJSHandler$handleAttributionImpression$1", f = "AndroidSandboxJSHandler.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ironsource.u1$d */
    static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        int f6751a;
        final /* synthetic */ android.adservices.measurement.MeasurementManager c;
        final /* synthetic */ android.net.Uri d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(android.adservices.measurement.MeasurementManager measurementManager, android.net.Uri uri, kotlin.coroutines.Continuation<? super com.ironsource.C3302u1.d> continuation) {
            super(2, continuation);
            this.c = measurementManager;
            this.d = uri;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.ironsource.C3302u1.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.ironsource.C3302u1.this.new d(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6751a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.ironsource.C3302u1 c3302u1 = com.ironsource.C3302u1.this;
                android.adservices.measurement.MeasurementManager measurementManager = this.c;
                android.net.Uri uri = this.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "uri");
                this.f6751a = 1;
                if (c3302u1.a(measurementManager, uri, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    static {
        com.ironsource.C3302u1.b bVar = new com.ironsource.C3302u1.b(null);
        f6748a = bVar;
        java.lang.String name = bVar.getClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "this::class.java.name");
        b = name;
    }

    public final com.ironsource.C3302u1.a a(android.content.Context context, com.ironsource.InterfaceC3338w1 message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof com.ironsource.InterfaceC3338w1.a) {
            return a(context, (com.ironsource.InterfaceC3338w1.a) message);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private final com.ironsource.C3302u1.a a(android.content.Context context, com.ironsource.InterfaceC3338w1.a aVar) {
        android.adservices.measurement.MeasurementManager a2 = com.ironsource.C3140l0.a(context);
        if (a2 == null) {
            com.ironsource.sdk.utils.Logger.i(b, "could not obtain measurement manager");
            return a(aVar, "could not obtain measurement manager");
        }
        try {
            if (aVar instanceof com.ironsource.InterfaceC3338w1.a.b) {
                return a(aVar, a2);
            }
            if (aVar instanceof com.ironsource.InterfaceC3338w1.a.C0168a) {
                return a((com.ironsource.InterfaceC3338w1.a.C0168a) aVar, a2);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return a(aVar, "failed to handle attribution, message: " + e.getMessage());
        }
    }

    private final com.ironsource.C3302u1.a a(com.ironsource.InterfaceC3338w1.a aVar, android.adservices.measurement.MeasurementManager measurementManager) {
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.ironsource.C3302u1.d(measurementManager, android.net.Uri.parse(aVar.b()), null), 1, null);
        return a(aVar);
    }

    private final com.ironsource.C3302u1.a a(com.ironsource.InterfaceC3338w1.a.C0168a c0168a, android.adservices.measurement.MeasurementManager measurementManager) {
        android.net.Uri parse = android.net.Uri.parse(c0168a.b());
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.ironsource.C3302u1.c(measurementManager, parse, android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, c0168a.n(), c0168a.o().c(), c0168a.o().d(), c0168a.p()), null), 1, null);
        return a(c0168a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object a(android.adservices.measurement.MeasurementManager measurementManager, android.net.Uri uri, android.view.MotionEvent motionEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        measurementManager.registerSource(uri, motionEvent, java.util.concurrent.Executors.newSingleThreadExecutor(), com.ironsource.C3320v1.a(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : kotlin.Unit.INSTANCE;
    }

    private final com.ironsource.C3302u1.a a(com.ironsource.InterfaceC3338w1.a aVar) {
        org.json.JSONObject params = new org.json.JSONObject().put("params", new org.json.JSONObject().put("type", aVar instanceof com.ironsource.InterfaceC3338w1.a.C0168a ? com.ironsource.Y3.d : "impression"));
        java.lang.String a2 = aVar.a();
        com.ironsource.C3202o8.e d2 = aVar.d();
        java.lang.String e = aVar.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(params, "params");
        return new com.ironsource.C3302u1.a(a2, d2, e, params);
    }

    private final com.ironsource.C3302u1.a a(com.ironsource.InterfaceC3338w1 interfaceC3338w1, java.lang.String str) {
        org.json.JSONObject put = new org.json.JSONObject().put("reason", str).put("type", interfaceC3338w1 instanceof com.ironsource.InterfaceC3338w1.a.C0168a ? com.ironsource.Y3.d : "impression");
        java.lang.String c2 = interfaceC3338w1.c();
        com.ironsource.C3202o8.e d2 = interfaceC3338w1.d();
        java.lang.String e = interfaceC3338w1.e();
        org.json.JSONObject put2 = new org.json.JSONObject().put("params", put);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(put2, "JSONObject().put(\"params\", payload)");
        return new com.ironsource.C3302u1.a(c2, d2, e, put2);
    }
}
