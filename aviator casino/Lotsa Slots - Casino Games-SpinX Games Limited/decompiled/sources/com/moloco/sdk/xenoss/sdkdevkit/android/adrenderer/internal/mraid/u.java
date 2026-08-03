package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class u implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    public static final int j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f7523a;
    public final kotlinx.coroutines.CoroutineScope b;
    public kotlinx.coroutines.Job c;
    public final android.view.View.OnLayoutChangeListener d;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> e;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s g;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a> h;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a> i;

    public static final class a {
        public static final int b = 8;

        /* renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s f7524a;

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            this.f7524a = value;
        }

        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s a() {
            return this.f7524a;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidViewVisualMetricsTracker$layoutChangeListener$1$1", f = "MraidViewVisualMetricsTracker.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7525a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, int i3, int i4, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.b> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.this.new b(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7525a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.f7525a = 1;
                if (kotlinx.coroutines.DelayKt.delay(200L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.this.n();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.this.a(this.c, this.d, this.e, this.f);
            return kotlin.Unit.INSTANCE;
        }
    }

    public u(android.view.View view, android.content.Context context, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7523a = view;
        this.b = kotlinx.coroutines.CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.b.a().getMain());
        android.view.View.OnLayoutChangeListener onLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.this, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.d = onLayoutChangeListener;
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s sVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s(context);
        this.g = sVar;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a(sVar));
        this.h = MutableStateFlow2;
        this.i = MutableStateFlow2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.Job job = this.c;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.f7523a.removeOnLayoutChangeListener(this.d);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a> k() {
        return this.i;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return this.f;
    }

    public final void n() {
        this.e.setValue(java.lang.Boolean.valueOf(this.f7523a.isShown()));
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u uVar, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = uVar.c;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(uVar.b, null, null, uVar.new b(i, i2, i3, i4, null), 3, null);
        uVar.c = launch$default;
    }

    public final void a(int i, int i2, int i3, int i4) {
        android.graphics.Rect rect = new android.graphics.Rect(i, i2, i3, i4);
        int width = rect.width();
        int height = rect.height();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.s sVar = this.g;
        sVar.a(i, i2, width, height);
        sVar.b(i, i2, width, height);
        sVar.c(i, i2, width, height);
        sVar.a(width, height);
        this.h.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u.a(this.g));
    }
}
