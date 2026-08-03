package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

/* loaded from: classes5.dex */
public final class a extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g {
    public static final int k = 8;
    public final kotlinx.coroutines.CoroutineScope c;
    public final com.moloco.sdk.internal.services.s d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h e;
    public final boolean f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c g;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> h;
    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> i;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> j;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2", f = "StaticWebView.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a, reason: collision with other inner class name */
    public static final class C0245a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<kotlin.Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7541a;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ long d;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1", f = "StaticWebView.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a, reason: collision with other inner class name */
        public static final class C0246a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7542a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a b;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1$1", f = "StaticWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$a, reason: collision with other inner class name */
            public static final class C0247a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7543a;
                public /* synthetic */ boolean b;
                public /* synthetic */ java.lang.Object c;

                public C0247a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.C0247a> continuation) {
                    super(3, continuation);
                }

                public final java.lang.Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.C0247a c0247a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.C0247a(continuation);
                    c0247a.b = z;
                    c0247a.c = gVar;
                    return c0247a.invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
                    return a(bool.booleanValue(), gVar, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7543a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    boolean z = this.b;
                    return kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.c);
                }
            }

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticWebView$loadHtml$2$isLoadOperationTimedOut$1$2", f = "StaticWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$b */
            public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Pair<? extends java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7544a;
                public /* synthetic */ java.lang.Object b;

                public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.b> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(kotlin.Pair<java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> pair, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.b) create(pair, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.b(continuation);
                    bVar.b = obj;
                    return bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7544a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Pair pair = (kotlin.Pair) this.b;
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Boolean) pair.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) pair.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0246a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a> continuation) {
                super(2, continuation);
                this.b = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, ? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7542a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow flowCombine = kotlinx.coroutines.flow.FlowKt.flowCombine(this.b.g.m(), this.b.g.l(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.C0247a(null));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a.b(null);
                    this.f7542a = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(flowCombine, bVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0245a(java.lang.String str, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<kotlin.Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.this.new C0245a(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7541a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                try {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.this;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3448e.a(aVar, aVar.getHtmlCssFixer().a(this.c));
                    long j = this.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a c0246a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a.C0246a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.this, null);
                    this.f7541a = 1;
                    obj = kotlinx.coroutines.TimeoutKt.m12302withTimeoutOrNullKLykuaI(j, c0246a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (java.lang.Exception e) {
                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b.f7545a, "loadHtml", e, false, 8, null);
                    return new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.b);
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (obj == null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.this.g.c();
            }
            boolean booleanValue = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.this.g.m().getValue().booleanValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g value = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.this.g.l().getValue();
            return value != null ? new com.moloco.sdk.internal.v.a(value) : booleanValue ? new com.moloco.sdk.internal.v.b(kotlin.Unit.INSTANCE) : new com.moloco.sdk.internal.v.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f7446a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r2, sVar, hVar, (i & 16) != 0 ? false : z, (i & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c(r2, sVar, hVar) : cVar);
        kotlinx.coroutines.CoroutineScope CoroutineScope = (i & 2) != 0 ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain()) : coroutineScope;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> c() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3447d, android.webkit.WebView
    public void destroy() {
        super.destroy();
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.c, null, 1, null);
    }

    public final kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getClickthroughEvent() {
        return this.i;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> getUnrecoverableError() {
        return this.h;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        if (this.f) {
            return false;
        }
        if (event.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.g.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(kotlin.collections.ArraysKt.first(iArr), kotlin.collections.ArraysKt.last(iArr), getHeight(), getWidth(), (int) (event.getX() + kotlin.collections.ArraysKt.first(iArr)), (int) (event.getY() + kotlin.collections.ArraysKt.last(iArr))));
        }
        return super.onTouchEvent(event);
    }

    public final java.lang.Object a(java.lang.String str, long j, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<kotlin.Unit, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getMain(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a.C0245a(str, j, null), continuation);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        this.g.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.g.a(buttonType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context, kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c webViewClientImpl) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.c = scope;
        this.d = clickthroughService;
        this.e = buttonTracker;
        this.f = z;
        this.g = webViewClientImpl;
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        android.webkit.WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        setBackgroundColor(0);
        setVisibility(8);
        this.h = webViewClientImpl.l();
        this.i = webViewClientImpl.f();
        this.j = webViewClientImpl.o();
    }
}
