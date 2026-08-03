package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* loaded from: classes5.dex */
public final class k implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j {
    public static final int j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7509a;
    public kotlin.jvm.functions.Function0<kotlin.Unit> b;
    public final kotlinx.coroutines.CoroutineScope c;
    public final android.webkit.WebView d;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d f;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l> g;
    public final kotlinx.coroutines.flow.SharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l> h;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f> i;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidFullscreenContentControllerImpl$onEvent$1", f = "MraidFullscreenContentController.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7510a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l lVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.a> continuation) {
            super(2, continuation);
            this.c = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7510a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.this.g;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l lVar = this.c;
                this.f7510a = 1;
                if (mutableSharedFlow.emit(lVar, this) == coroutine_suspended) {
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

    public static final class b implements kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.Flow f7511a;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f7512a;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidFullscreenContentControllerImpl$special$$inlined$mapNotNull$1$2", f = "MraidFullscreenContentController.kt", i = {}, l = {52}, m = "emit", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k$b$a$a, reason: collision with other inner class name */
            public static final class C0240a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ java.lang.Object f7513a;
                public int b;
                public java.lang.Object c;

                public C0240a(kotlin.coroutines.Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    this.f7513a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                this.f7512a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a.C0240a c0240a;
                int i;
                if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a.C0240a) {
                    c0240a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a.C0240a) continuation;
                    int i2 = c0240a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0240a.b = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = c0240a.f7513a;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0240a.b;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.f7512a;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n) obj;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f fVar = nVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f) nVar : null;
                            if (fVar != null) {
                                c0240a.b = 1;
                                if (flowCollector.emit(fVar, c0240a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                c0240a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a.C0240a(continuation);
                java.lang.Object obj22 = c0240a.f7513a;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0240a.b;
                if (i != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        public b(kotlinx.coroutines.flow.Flow flow) {
            this.f7511a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f> flowCollector, kotlin.coroutines.Continuation continuation) {
            java.lang.Object collect = this.f7511a.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b.a(flowCollector), continuation);
            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(boolean z, kotlin.jvm.functions.Function0 function0, kotlinx.coroutines.CoroutineScope coroutineScope, int i, android.webkit.WebView webView, kotlinx.coroutines.flow.SharedFlow sharedFlow, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, coroutineScope, i, webView, sharedFlow, lVar);
    }

    public static java.lang.Object b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k kVar) {
        return kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(kVar.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public static final kotlin.Unit p() {
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public void B() {
        a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l.f7514a);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l E = E();
        if (E != null) {
            E.c("");
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l E() {
        return this.e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f7509a;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> S() {
        return this.b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.flow.SharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l> a() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public android.webkit.WebView c() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        this.b.invoke();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.f> e() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> l() {
        return this.f.l();
    }

    public k(boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> closeFullscreenAdRepresentation, kotlinx.coroutines.CoroutineScope scope, int i, android.webkit.WebView webView, kotlinx.coroutines.flow.SharedFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n> mraidJsCommands, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeFullscreenAdRepresentation, "closeFullscreenAdRepresentation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mraidJsCommands, "mraidJsCommands");
        this.f7509a = z;
        this.b = closeFullscreenAdRepresentation;
        this.c = scope;
        this.d = webView;
        this.e = lVar;
        this.f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f.a(i, scope);
        kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.g = MutableSharedFlow$default;
        this.h = MutableSharedFlow$default;
        this.i = kotlinx.coroutines.flow.FlowKt.stateIn(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.b(mraidJsCommands), scope, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
        a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l.b);
    }

    public final void a(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.b = function0;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar) {
        this.e = lVar;
    }

    public final kotlinx.coroutines.Job a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l lVar) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.a(lVar, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
    public void a(java.lang.String clickThroughUrl, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
        b(position);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l E = E();
        if (E != null) {
            E.a(clickThroughUrl);
        }
    }

    public /* synthetic */ k(boolean z, kotlin.jvm.functions.Function0 function0, kotlinx.coroutines.CoroutineScope coroutineScope, int i, android.webkit.WebView webView, kotlinx.coroutines.flow.SharedFlow sharedFlow, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k.p();
            }
        } : function0, coroutineScope, i, webView, sharedFlow, (i2 & 64) != 0 ? null : lVar, null);
    }
}
