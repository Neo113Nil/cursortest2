package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class G implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7375a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i c;
    public final kotlinx.coroutines.CoroutineScope d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E f;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> g;
    public final kotlin.Lazy h;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> i;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> j;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$isAdDisplaying$2$1", f = "StaticFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7376a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.a> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object a(boolean z, boolean z2, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.a(continuation);
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
            if (this.f7376a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.b && this.c);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1", f = "StaticFullscreenAd.kt", i = {0}, l = {100}, m = "invokeSuspend", n = {"eventHandlers"}, s = {"L$0"})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7377a;
        public /* synthetic */ java.lang.Object b;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f d;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e e;

        public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
            public a(java.lang.Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G) this.receiver).n();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                a();
                return kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$1", f = "StaticFullscreenAd.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$b$b, reason: collision with other inner class name */
        public static final class C0216b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7378a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e c;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$1$error$1", f = "StaticFullscreenAd.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$b$b$a */
            public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f7379a;
                public /* synthetic */ java.lang.Object b;

                public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b.a> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
                    return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b.a) create(gVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b.a(continuation);
                    aVar.b = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f7379a != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.b) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0216b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b> continuation) {
                super(2, continuation);
                this.b = g;
                this.c = eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7378a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.b.e.getUnrecoverableError();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b.a(null);
                    this.f7378a = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(unrecoverableError, aVar, this);
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
                if (gVar != null && (eVar = this.c) != null) {
                    eVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.b(gVar));
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.StaticFullscreenAdImpl$show$1$eventHandlers$2", f = "StaticFullscreenAd.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7380a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G b;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e c;

            public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e f7381a;

                public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
                    this.f7381a = eVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final java.lang.Object emit(kotlin.Unit unit, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.f7381a;
                    if (eVar != null) {
                        eVar.b();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.c> continuation) {
                super(2, continuation);
                this.b = g;
                this.c = eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.c(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7380a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> clickthroughEvent = this.b.e.getClickthroughEvent();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.c.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.c.a(this.c);
                    this.f7380a = 1;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b> continuation) {
            super(2, continuation);
            this.d = fVar;
            this.e = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b bVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this.new b(this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00c6 A[LOOP:1: B:18:0x00c0->B:20:0x00c6, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Job launch$default;
            kotlinx.coroutines.Job launch$default2;
            java.util.List list;
            java.util.Iterator it;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7377a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.C0216b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this, this.e, null), 3, null);
                launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this, this.e, null), 3, null);
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.Job[]{launch$default, launch$default2});
                try {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this.g.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.Companion companion = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity.INSTANCE;
                    android.content.Context context = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this.f7375a;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this.e;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.a aVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this);
                    final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar = this.e;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$b$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e.this);
                        }
                    };
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f fVar = this.d;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this.b;
                    this.b = listOf;
                    this.f7377a = 1;
                    if (companion.a(context, aVar, aVar2, function0, fVar, yVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = listOf;
                } catch (java.lang.Throwable th) {
                    th = th;
                    list = listOf;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this.g.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) this.b;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    it = list.iterator();
                    while (it.hasNext()) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this.g.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
                    throw th;
                }
            }
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it2.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this.g.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
            if (eVar != null) {
                eVar.a();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public G(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.lang.String adm, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.f7375a = context;
        this.b = watermark;
        this.c = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.c;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.d = CoroutineScope;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, new com.moloco.sdk.internal.services.t(externalLinkHandler, customUserEventBuilderService), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a(), false, null, 50, null);
        this.e = aVar;
        this.f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E(adm, CoroutineScope, aVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.g = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.h = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.this);
            }
        });
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool);
        this.i = MutableStateFlow;
        this.j = MutableStateFlow;
    }

    public static final kotlinx.coroutines.flow.StateFlow f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G g) {
        return kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.flowCombine(g.g, g.e.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.a(null)), g.d, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), java.lang.Boolean.FALSE);
    }

    public static java.lang.Object g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G g) {
        return kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(g.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.E.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.d, null, 1, null);
        this.e.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoaded() {
        return this.f.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> k() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3442a
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l() {
        return (kotlinx.coroutines.flow.StateFlow) this.h.getValue();
    }

    public final void n() {
        this.g.setValue(java.lang.Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b
    public void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC3443b.a aVar) {
        this.f.a(j, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G.b(options, eVar, null), 3, null);
    }
}
