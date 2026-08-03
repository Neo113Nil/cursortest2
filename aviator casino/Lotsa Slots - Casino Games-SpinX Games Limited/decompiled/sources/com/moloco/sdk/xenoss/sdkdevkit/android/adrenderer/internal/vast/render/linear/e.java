package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c {
    public static final int D = 8;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g A;
    public boolean B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f f7922a;
    public final boolean b;
    public final boolean c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l f;
    public final kotlinx.coroutines.CoroutineScope g;
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d> h;
    public final kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d> i;
    public final java.lang.String j;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> k;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> l;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long>> m;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long>> n;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> o;
    public int p;
    public final boolean q;
    public final java.lang.String r;
    public final boolean s;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b t;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n u;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> v;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> w;
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> x;
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> y;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j z;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$1", f = "LinearControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7923a;
        public /* synthetic */ boolean b;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.a> continuation) {
            super(2, continuation);
        }

        public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.a) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.new a(continuation);
            aVar.b = ((java.lang.Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7923a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.b) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.z.d(kotlin.coroutines.jvm.internal.Boxing.boxInt(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.R()), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.j);
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.z.c(kotlin.coroutines.jvm.internal.Boxing.boxInt(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.R()), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.j);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$onEvent$1", f = "LinearControllerImpl.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7924a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.b> continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7924a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this.h;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar = this.c;
                this.f7924a = 1;
                if (mutableSharedFlow.emit(dVar, this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$vastPrivacyIcon$1", f = "LinearControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<java.lang.Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7925a;
        public /* synthetic */ boolean b;
        public /* synthetic */ java.lang.Object c;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.c> continuation) {
            super(3, continuation);
        }

        public final java.lang.Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.c(continuation);
            cVar.b = z;
            cVar.c = jVar;
            return cVar.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> continuation) {
            return a(bool.booleanValue(), jVar, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7925a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) this.c;
            if (z) {
                return jVar;
            }
            return null;
        }
    }

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f linear, int i, boolean z, java.lang.Boolean bool, int i2, boolean z2, boolean z3, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l linkHandler) {
        java.lang.String absolutePath;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linear, "linear");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.f7922a = linear;
        this.b = z2;
        this.c = z3;
        this.d = customUserEventBuilderService;
        this.e = externalLinkHandler;
        this.f = linkHandler;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.g = CoroutineScope;
        kotlinx.coroutines.flow.MutableSharedFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.h = MutableSharedFlow$default;
        this.i = MutableSharedFlow$default;
        this.j = linear.l();
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.valueOf(z));
        this.k = MutableStateFlow;
        this.l = MutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m(java.lang.Long.valueOf(i)));
        this.m = MutableStateFlow2;
        this.n = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        this.o = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool2);
        this.q = com.moloco.sdk.service_locator.a.g.f7348a.b().h();
        if (L()) {
            absolutePath = linear.l();
        } else {
            absolutePath = linear.j().getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        }
        this.r = absolutePath;
        this.s = linear.h() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i3 = linear.i();
        java.util.List<java.lang.String> b2 = i3 != null ? i3.b() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i4 = linear.i();
        this.t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b(b2, i4 != null ? i4.g() : null, null, 4, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i5 = linear.i();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y f = i5 != null ? i5.f() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i6 = linear.i();
        java.lang.Integer valueOf = i6 != null ? java.lang.Integer.valueOf(i6.h()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i7 = linear.i();
        java.lang.Integer valueOf2 = i7 != null ? java.lang.Integer.valueOf(i7.d()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i8 = linear.i();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p.a(f, valueOf, valueOf2, i8 != null ? i8.a() : null, CoroutineScope, context, customUserEventBuilderService, externalLinkHandler, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.this);
            }
        });
        this.u = a2;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool2);
        this.v = MutableStateFlow3;
        this.w = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.combine(MutableStateFlow3, a2.O(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.c(null)), CoroutineScope, kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null), null);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(bool2);
        this.x = MutableStateFlow4;
        this.y = MutableStateFlow4;
        this.z = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j.p.a(linear.n(), customUserEventBuilderService);
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(isPlaying(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.a(null)), CoroutineScope);
        this.A = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.a(bool, i2, linear.m());
    }

    public static final kotlin.Unit e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar) {
        eVar.t.a(java.lang.Integer.valueOf(eVar.R()), eVar.j);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar) {
        eVar.t.b(java.lang.Integer.valueOf(eVar.R()), eVar.j);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void D() {
        this.A.s();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void F() {
        int i;
        this.A.pause();
        this.m.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<>(java.lang.Long.valueOf((!this.o.getValue().booleanValue() || (i = this.p) <= 0) ? R() : i - 10)));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public java.lang.String G() {
        return this.r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public boolean L() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> O() {
        return this.w;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<java.lang.Long>> Q() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public int R() {
        return this.C;
    }

    public final void S() {
        this.v.setValue(java.lang.Boolean.FALSE);
    }

    public final void T() {
        if (this.c) {
            a(false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
        }
    }

    public final void U() {
        if (this.b) {
            a(false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void d(boolean z) {
        this.x.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.g, null, 1, null);
        this.u.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void h() {
        this.B = true;
        this.z.f(java.lang.Integer.valueOf(R()), this.j);
        java.lang.String h = this.f7922a.h();
        if (h != null) {
            this.f.c(h);
        }
        a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d.e.b);
        U();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void i() {
        this.u.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPlaying() {
        return this.y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a> l() {
        return this.A.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> q() {
        return this.l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public void r() {
        if (!isPlaying().getValue().booleanValue() && this.m.getValue().a().longValue() == 0 && R() == 0) {
            return;
        }
        this.m.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<>(0L));
        this.o.setValue(java.lang.Boolean.FALSE);
        this.z.e(java.lang.Integer.valueOf(R()), this.j);
        this.B = false;
        this.C = 0;
        this.A.I();
        S();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void u() {
        this.u.u();
    }

    public static java.lang.Object d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar) {
        return kotlin.jvm.internal.Reflection.property0(new kotlin.jvm.internal.PropertyReference0Impl(eVar.A, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d> a() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
        a(true, position);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void c(boolean z) {
        this.k.setValue(java.lang.Boolean.valueOf(z));
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.j jVar = this.z;
        if (z) {
            jVar.b(java.lang.Integer.valueOf(R()), this.j);
        } else {
            jVar.g(java.lang.Integer.valueOf(R()), this.j);
        }
    }

    public final kotlinx.coroutines.Job a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d dVar) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e.b(dVar, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void b() {
        a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d.c.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "button");
        this.z.a(button);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r9 >= r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r9 <= r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2) {
        int b2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i3 = this.f7922a.i();
        if (i3 == null) {
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r e = i3.e();
        java.lang.Long c2 = i3.c();
        boolean z = false;
        if (e instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a) {
            b2 = (i2 / 100) * ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.a) e).b();
        } else {
            b2 = e instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b ? (int) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b) e).b() : 0;
        }
        int coerceIn = kotlin.ranges.RangesKt.coerceIn(b2, (kotlin.ranges.ClosedRange<java.lang.Integer>) new kotlin.ranges.IntRange(0, i2));
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.v;
        if (c2 != null) {
            long j = coerceIn;
            long longValue = c2.longValue() + j;
            long j2 = i;
            if (j <= j2) {
            }
        }
        mutableStateFlow.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.c.EnumC0327a buttonType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.z.a(buttonType);
    }

    public final void a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a.AbstractC0325a.f fVar) {
        java.lang.String h = this.f7922a.h();
        if (h != null) {
            if (z) {
                this.z.a(fVar, java.lang.Integer.valueOf(R()), this.j);
            }
            this.f.a(h);
            a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d.a.b);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d.C0313d(error));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress) {
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
        boolean z = progress instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a;
        if (z) {
            int a2 = (int) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.a) progress).a();
            pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(a2), java.lang.Integer.valueOf(a2));
        } else if (progress instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.c) progress;
            pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf((int) cVar.c()), java.lang.Integer.valueOf((int) cVar.d()));
        } else if (progress instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d) {
            pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(R()), java.lang.Integer.valueOf((int) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d) progress).b()));
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(progress, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.b.b)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return;
        }
        int intValue = ((java.lang.Number) pair.component1()).intValue();
        int intValue2 = ((java.lang.Number) pair.component2()).intValue();
        this.C = intValue;
        if (!this.B && !(progress instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i.d)) {
            this.z.a(this.j, intValue, intValue2);
        }
        if (z) {
            this.p = intValue2;
            boolean booleanValue = this.o.getValue().booleanValue();
            this.o.setValue(java.lang.Boolean.TRUE);
            if (!this.B && !booleanValue) {
                a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d.b.b);
                java.lang.String h = this.f7922a.h();
                if (h != null) {
                    this.f.b(h);
                }
                T();
            }
            this.B = false;
        }
        this.A.a(intValue, intValue2);
        b(intValue, intValue2);
    }
}
