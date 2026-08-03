package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class F extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e> {
    public static final int p = 8;
    public final android.content.Context h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E k;
    public final kotlinx.coroutines.CoroutineScope l;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i n;
    public final kotlin.Lazy o;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$isAdDisplaying$2$1", f = "StaticBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7369a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.a> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object a(boolean z, boolean z2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.a(continuation);
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
            if (this.f7369a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b && this.c);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1", f = "StaticBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7370a;
        public /* synthetic */ java.lang.Object b;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$1", f = "StaticBanner.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7371a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F b;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$1$error$1", f = "StaticBanner.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$a$a, reason: collision with other inner class name */
            public static final class C0214a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7372a;
                public /* synthetic */ java.lang.Object b;

                public C0214a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a.C0214a> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a.C0214a) create(gVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a.C0214a c0214a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a.C0214a(continuation);
                    c0214a.b = obj;
                    return c0214a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7372a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.b) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F f, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a> continuation) {
                super(2, continuation);
                this.b = f;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e adShowListener;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7371a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.b.j.getUnrecoverableError();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a.C0214a c0214a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a.C0214a(null);
                    this.f7371a = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(unrecoverableError, c0214a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
                if (gVar != null && (adShowListener = this.b.getAdShowListener()) != null) {
                    adShowListener.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.a(gVar));
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticBannerView$prepareAdViewForDisplay$1$2", f = "StaticBanner.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$b, reason: collision with other inner class name */
        public static final class C0215b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7373a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F b;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$b$b$a */
            public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F f7374a;

                public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F f) {
                    this.f7374a = f;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e adShowListener = this.f7374a.getAdShowListener();
                    if (adShowListener != null) {
                        adShowListener.b();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0215b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F f, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.C0215b> continuation) {
                super(2, continuation);
                this.b = f;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.C0215b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.C0215b(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7373a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> clickthroughEvent = this.b.j.getClickthroughEvent();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.C0215b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.C0215b.a(this.b);
                    this.f7373a = 1;
                    if (clickthroughEvent.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7370a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.this, null), 3, null);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b.C0215b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.this, null), 3, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.this;
            android.widget.FrameLayout a2 = f.m.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.this.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.this.j);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.this.getWatermark().a(a2);
            f.setAdView(a2);
            return kotlin.Unit.INSTANCE;
        }
    }

    public /* synthetic */ F(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E e, kotlinx.coroutines.CoroutineScope coroutineScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d dVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, yVar, aVar, e, coroutineScope, (i & 32) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d() : dVar);
    }

    public static final kotlinx.coroutines.flow.StateFlow d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F f) {
        return kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flowCombine(super.l(), f.j.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.a(null)), f.l, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        super.destroy();
        this.j.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.n;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y getWatermark() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        kotlinx.coroutines.BuildersKt.launch(this.l, kotlin.coroutines.EmptyCoroutineContext.INSTANCE, kotlinx.coroutines.CoroutineStart.DEFAULT, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.b(null));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return (kotlinx.coroutines.flow.StateFlow) this.o.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E getAdLoader() {
        return this.k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a staticWebView, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E adLoader, kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.d webViewWrapper) {
        super(context, scope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(staticWebView, "staticWebView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewWrapper, "webViewWrapper");
        this.h = context;
        this.i = watermark;
        this.j = staticWebView;
        this.k = adLoader;
        this.l = scope;
        this.m = webViewWrapper;
        setTag("MolocoStaticBannerView");
        this.n = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c;
        this.o = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.F.this);
            }
        });
    }
}
