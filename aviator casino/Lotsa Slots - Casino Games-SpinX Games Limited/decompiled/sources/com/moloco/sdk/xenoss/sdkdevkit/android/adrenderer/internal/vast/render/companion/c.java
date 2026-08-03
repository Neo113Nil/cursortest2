package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a {
    public static final int q = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f7824a;
    public final android.content.Context b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r d;
    public final boolean e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l f;
    public final kotlinx.coroutines.CoroutineScope g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d h;
    public com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g j;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> k;
    public final kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> l;
    public final boolean m;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k n;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> o;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> p;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionControllerImpl$1", f = "CompanionControllerImpl.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7825a;
        public int b;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c cVar;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c cVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y e = cVar2.f7824a.e();
                android.content.Context context = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.d;
                int f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.f7824a.f();
                int d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.f7824a.d();
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c cVar3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this);
                    }
                };
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c cVar4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this;
                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c$a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.a.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                    }
                };
                boolean z = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.e;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.f;
                this.f7825a = cVar2;
                this.b = 1;
                java.lang.Object a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a(e, context, aVar, rVar, f, d, function0, function1, z, lVar, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
                obj = a2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c) this.f7825a;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            cVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) obj);
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c cVar) {
            cVar.j.a(cVar.i);
            cVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.a.b);
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar2) {
            cVar.a(cVar2);
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.CompanionControllerImpl$onEvent$1", f = "CompanionControllerImpl.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7826a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.b> continuation) {
            super(2, continuation);
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7826a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.this.k;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = this.c;
                this.f7826a = 1;
                if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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

    public /* synthetic */ c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, int i, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, i, context, aVar, rVar, z, lVar);
    }

    public static java.lang.Object j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c cVar) {
        return kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(cVar.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> K() {
        return this.p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.g, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = this.n;
        if (kVar != null) {
            kVar.destroy();
        }
        a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> l() {
        return this.h.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.h.reset();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void y() {
        a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.C0295b.b);
    }

    public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c companion, int i, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l linkHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "companion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.f7824a = companion;
        this.b = context;
        this.c = customUserEventBuilderService;
        this.d = externalLinkHandler;
        this.e = z;
        this.f = linkHandler;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.g = CoroutineScope;
        this.h = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f.a(i, CoroutineScope);
        this.i = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f7665a.a(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
        this.j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g(customUserEventBuilderService, companion.b(), companion.c(), null, null, 24, null);
        kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.k = MutableSharedFlow$default;
        this.l = MutableSharedFlow$default;
        this.m = companion.a() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = this.n;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kVar != null ? kVar.k() : null);
        this.o = MutableStateFlow;
        this.p = MutableStateFlow;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.a(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void b() {
        this.j.a();
        a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.c.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a
    public kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b> a() {
        return this.l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
        java.lang.String a2 = this.f7824a.a();
        if (a2 != null) {
            this.j.a(position);
            a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.a.b);
            this.f.a(a2);
        }
    }

    public final kotlinx.coroutines.Job a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c.b(bVar, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b.d(error));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        this.j.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.j.a(buttonType);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
        this.i = position;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar) {
        this.n = kVar;
        this.o.setValue(kVar != null ? kVar.k() : null);
    }
}
