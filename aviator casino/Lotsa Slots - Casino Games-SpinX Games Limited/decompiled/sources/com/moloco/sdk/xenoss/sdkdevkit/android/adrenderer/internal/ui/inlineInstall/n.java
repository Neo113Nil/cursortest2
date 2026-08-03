package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

/* loaded from: classes5.dex */
public final class n implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m {
    public static final int i = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7632a;
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> b;
    public final kotlinx.coroutines.CoroutineScope c;
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> d;
    public final long e;
    public final kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, java.lang.String, android.content.Intent> f;
    public final kotlin.jvm.functions.Function2<android.content.pm.PackageManager, android.content.Intent, java.lang.Boolean> g;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7633a;
        public final kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, kotlin.Unit> b;
        public final kotlinx.coroutines.Job c;
        public final kotlinx.coroutines.Job d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, kotlin.Unit> onOutcome, kotlinx.coroutines.Job timeoutJob, kotlinx.coroutines.Job fgJob) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutJob, "timeoutJob");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fgJob, "fgJob");
            this.f7633a = z;
            this.b = onOutcome;
            this.c = timeoutJob;
            this.d = fgJob;
        }

        public final boolean a() {
            return this.f7633a;
        }

        public final kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, kotlin.Unit> b() {
            return this.b;
        }

        public final kotlinx.coroutines.Job c() {
            return this.c;
        }

        public final kotlinx.coroutines.Job d() {
            return this.d;
        }

        public final boolean e() {
            return this.f7633a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a) obj;
            return this.f7633a == aVar.f7633a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, aVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, aVar.d);
        }

        public final kotlinx.coroutines.Job f() {
            return this.d;
        }

        public final kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, kotlin.Unit> g() {
            return this.b;
        }

        public final kotlinx.coroutines.Job h() {
            return this.c;
        }

        public int hashCode() {
            return (((((kotlin.UByte$$ExternalSyntheticBackport0.m(this.f7633a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public java.lang.String toString() {
            return "LaunchState(backgroundedSinceLaunch=" + this.f7633a + ", onOutcome=" + this.b + ", timeoutJob=" + this.c + ", fgJob=" + this.d + ')';
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a a(boolean z, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, kotlin.Unit> onOutcome, kotlinx.coroutines.Job timeoutJob, kotlinx.coroutines.Job fgJob) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutJob, "timeoutJob");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fgJob, "fgJob");
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a(z, onOutcome, timeoutJob, fgJob);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a aVar, boolean z, kotlin.jvm.functions.Function1 function1, kotlinx.coroutines.Job job, kotlinx.coroutines.Job job2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f7633a;
            }
            if ((i & 2) != 0) {
                function1 = aVar.b;
            }
            if ((i & 4) != 0) {
                job = aVar.c;
            }
            if ((i & 8) != 0) {
                job2 = aVar.d;
            }
            return aVar.a(z, function1, job, job2);
        }

        public final void a(boolean z) {
            this.f7633a = z;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.StoreLauncherImpl$launch$fgJob$1", f = "StoreLauncher.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7634a;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n f7635a;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n nVar) {
                this.f7635a = nVar;
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a aVar;
                if (!z && (aVar = this.f7635a.h) != null) {
                    aVar.a(true);
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                return a(((java.lang.Boolean) obj).booleanValue(), continuation);
            }
        }

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7634a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow flow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.this.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.this);
                this.f7634a = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.StoreLauncherImpl$launch$timeoutJob$1", f = "StoreLauncher.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7636a;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7636a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                long j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.this.e;
                this.f7636a = 1;
                if (kotlinx.coroutines.DelayKt.m12291delayVtjQ1oo(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.this.cancel();
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(android.content.Context context, androidx.activity.result.ActivityResultLauncher activityResultLauncher, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.Flow flow, long j, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, activityResultLauncher, coroutineScope, flow, j, function3, function2);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m
    public void cancel() {
        kotlinx.coroutines.Job f;
        kotlinx.coroutines.Job h;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a aVar = this.h;
        if (aVar != null && (h = aVar.h()) != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(h, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a aVar2 = this.h;
        if (aVar2 != null && (f = aVar2.f()) != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(f, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(android.content.Context context, androidx.activity.result.ActivityResultLauncher<android.content.Intent> installLauncher, kotlinx.coroutines.CoroutineScope scope, kotlinx.coroutines.flow.Flow<java.lang.Boolean> foregroundFlow, long j, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? extends android.content.Intent> intentFactory, kotlin.jvm.functions.Function2<? super android.content.pm.PackageManager, ? super android.content.Intent, java.lang.Boolean> canResolve) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installLauncher, "installLauncher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foregroundFlow, "foregroundFlow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canResolve, "canResolve");
        this.f7632a = context;
        this.b = installLauncher;
        this.c = scope;
        this.d = foregroundFlow;
        this.e = j;
        this.f = intentFactory;
        this.g = canResolve;
    }

    public static final android.content.Intent a(java.lang.String bundleId, java.lang.String str, java.lang.String caller) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caller, "caller");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        java.lang.String str2 = "https://play.google.com/d?id=" + bundleId;
        if (str != null) {
            str2 = str2 + "&referrer=" + str;
        }
        intent.setData(android.net.Uri.parse(str2));
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", caller);
        return intent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ n(android.content.Context context, androidx.activity.result.ActivityResultLauncher activityResultLauncher, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.Flow flow, long j, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, activityResultLauncher, coroutineScope, flow, r7, (i2 & 32) != 0 ? new kotlin.jvm.functions.Function3() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        } : function3, (i2 & 64) != 0 ? new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a((android.content.pm.PackageManager) obj, (android.content.Intent) obj2));
            }
        } : function2, null);
        long j2;
        if ((i2 & 16) != 0) {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            j2 = kotlin.time.DurationKt.toDuration(60, kotlin.time.DurationUnit.SECONDS);
        } else {
            j2 = j;
        }
    }

    public static final boolean a(android.content.pm.PackageManager pm, android.content.Intent i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pm, "pm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i2, "i");
        return i2.resolveActivity(pm) != null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m
    public boolean a(java.lang.String bundleId, java.lang.String str, kotlin.jvm.functions.Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, kotlin.Unit> onOutcome) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onOutcome, "onOutcome");
        cancel();
        kotlin.jvm.functions.Function3<java.lang.String, java.lang.String, java.lang.String, android.content.Intent> function3 = this.f;
        java.lang.String packageName = this.f7632a.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        android.content.Intent invoke = function3.invoke(bundleId, str, packageName);
        kotlin.jvm.functions.Function2<android.content.pm.PackageManager, android.content.Intent, java.lang.Boolean> function2 = this.g;
        android.content.pm.PackageManager packageManager = this.f7632a.getPackageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        if (!function2.invoke(packageManager, invoke).booleanValue()) {
            return false;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.b(null), 3, null);
        launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.c(null), 3, null);
        this.h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a(false, onOutcome, launch$default2, launch$default);
        this.b.launch(invoke);
        return true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.m
    public void a(int i2) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n.a aVar = this.h;
        if (aVar == null) {
            return;
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(aVar.h(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(aVar.f(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        aVar.g().invoke(aVar.e() ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.a.b : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k.c.b);
        this.h = null;
    }
}
