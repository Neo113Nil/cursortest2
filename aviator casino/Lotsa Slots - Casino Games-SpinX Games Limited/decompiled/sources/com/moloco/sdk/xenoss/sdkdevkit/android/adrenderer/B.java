package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* loaded from: classes5.dex */
public abstract class B<T extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> extends android.widget.FrameLayout implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f7353a;
    public T b;
    public android.view.View c;
    public final kotlin.Lazy d;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> e;
    public final kotlin.Lazy f;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$isAdDisplaying$2$1", f = "XenossBannerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7354a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.a> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object a(boolean z, boolean z2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.a(continuation);
            aVar.b = z;
            aVar.c = z2;
            return aVar.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Boolean bool2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7354a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b && this.c);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$load$1", f = "XenossBannerView.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7355a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<T> b;
        public final /* synthetic */ long c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a d;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.XenossBannerView$load$1$1", f = "XenossBannerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7356a;
            public /* synthetic */ boolean b;

            public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b.a> continuation) {
                super(2, continuation);
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b.a) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b.a(continuation);
                aVar.b = ((java.lang.Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f7356a != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<T> b, long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b> continuation) {
            super(2, continuation);
            this.b = b;
            this.c = j;
            this.d = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b(this.b, this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7355a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.b.getAdLoader().a(this.c, this.d);
                kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded = this.b.isLoaded();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b.a(null);
                this.f7355a = 1;
                if (kotlinx.coroutines.flow.FlowKt.first(isLoaded, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.b.k();
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(android.content.Context context, kotlinx.coroutines.CoroutineScope scope) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7353a = scope;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.this);
            }
        });
        this.e = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.this);
            }
        });
    }

    public static final kotlinx.coroutines.flow.StateFlow b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B b2) {
        return b2.getAdLoader().isLoaded();
    }

    public static /* synthetic */ void getAdView$annotations() {
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f7353a, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.b(this, j, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.f7353a, null, 1, null);
        setAdView(null);
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public abstract com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b getAdLoader();

    public T getAdShowListener() {
        return this.b;
    }

    public final android.view.View getAdView() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
        return (kotlinx.coroutines.flow.StateFlow) this.d.getValue();
    }

    public abstract void k();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return (kotlinx.coroutines.flow.StateFlow) this.f.getValue();
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View changedView, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        this.e.setValue(java.lang.Boolean.valueOf(i == 0));
    }

    public void setAdShowListener(T t) {
        this.b = t;
    }

    public final void setAdView(android.view.View view) {
        android.view.View view2 = this.c;
        this.c = view;
        removeAllViews();
        androidx.compose.ui.platform.ComposeView composeView = view2 instanceof androidx.compose.ui.platform.ComposeView ? (androidx.compose.ui.platform.ComposeView) view2 : null;
        if (composeView != null) {
            composeView.disposeComposition();
        }
        if (view != null) {
            addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
    }

    public static final kotlinx.coroutines.flow.StateFlow a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B b2) {
        return kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flowCombine(b2.isLoaded(), b2.e, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B.a(null)), b2.f7353a, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.FALSE);
    }
}
