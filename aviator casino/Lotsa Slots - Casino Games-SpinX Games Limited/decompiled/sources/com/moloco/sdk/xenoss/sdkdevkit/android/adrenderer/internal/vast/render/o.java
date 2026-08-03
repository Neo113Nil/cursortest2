package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

/* loaded from: classes5.dex */
public final class o implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y f7934a;
    public final java.lang.String b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r d;
    public final kotlin.jvm.functions.Function0<kotlin.Unit> e;
    public final kotlin.jvm.functions.Function0<kotlin.Unit> f;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k> g;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> h;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.VastPrivacyIconImpl$1", f = "VastPrivacyIcon.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7935a;
        public final /* synthetic */ android.content.Context c;
        public final /* synthetic */ java.lang.Integer d;
        public final /* synthetic */ java.lang.Integer e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(android.content.Context context, java.lang.Integer num, java.lang.Integer num2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.a> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = num;
            this.e = num2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.this.new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object a2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7935a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = null;
            try {
            } catch (java.lang.Exception unused) {
                if (kVar != null) {
                    kVar.destroy();
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.this.destroy();
            }
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.this.f7934a;
                if (yVar != null) {
                    android.content.Context context = this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.this.c;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.this.d;
                    java.lang.Integer num = this.d;
                    int intValue = num != null ? num.intValue() : 0;
                    java.lang.Integer num2 = this.e;
                    int intValue2 = num2 != null ? num2.intValue() : 0;
                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.a.a();
                        }
                    };
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$a$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                        }
                    };
                    this.f7935a = 1;
                    a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l.a(yVar, context, aVar, rVar, intValue, intValue2, function0, function1, (r24 & 128) != 0 ? false : false, (r24 & 256) != 0 ? null : null, this);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.this.g.setValue(kVar);
                return kotlin.Unit.INSTANCE;
            }
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a2 = obj;
            kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) a2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.this.g.setValue(kVar);
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a() {
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class b implements kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.Flow f7936a;

        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f7937a;

            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.VastPrivacyIconImpl$special$$inlined$map$1$2", f = "VastPrivacyIcon.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o$b$a$a, reason: collision with other inner class name */
            public static final class C0315a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ java.lang.Object f7938a;
                public int b;
                public java.lang.Object c;

                public C0315a(kotlin.coroutines.Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    this.f7938a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                this.f7937a = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a.C0315a c0315a;
                int i;
                if (continuation instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a.C0315a) {
                    c0315a = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a.C0315a) continuation;
                    int i2 = c0315a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0315a.b = i2 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = c0315a.f7938a;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = c0315a.b;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj2);
                            kotlinx.coroutines.flow.FlowCollector flowCollector = this.f7937a;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) obj;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j k = kVar != null ? kVar.k() : null;
                            c0315a.b = 1;
                            if (flowCollector.emit(k, c0315a) == coroutine_suspended) {
                                return coroutine_suspended;
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
                c0315a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a.C0315a(continuation);
                java.lang.Object obj22 = c0315a.f7938a;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0315a.b;
                if (i != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        public b(kotlinx.coroutines.flow.Flow flow) {
            this.f7936a = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> flowCollector, kotlin.coroutines.Continuation continuation) {
            java.lang.Object collect = this.f7936a.collect(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b.a(flowCollector), continuation);
            return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
        }
    }

    public o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, kotlinx.coroutines.CoroutineScope scope, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f7934a = yVar;
        this.b = str;
        this.c = customUserEventBuilderService;
        this.d = externalLinkHandler;
        this.e = function0;
        this.f = function02;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.g = MutableStateFlow;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.a(context, num, num2, null), 3, null);
        this.h = kotlinx.coroutines.flow.FlowKt.stateIn(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o.b(MutableStateFlow), scope, kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> O() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k> mutableStateFlow = this.g;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k value = mutableStateFlow.getValue();
        if (value != null) {
            value.destroy();
        }
        mutableStateFlow.setValue(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void i() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.f;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void u() {
        java.lang.String str = this.b;
        if (str != null) {
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.e;
            if (function0 != null) {
                function0.invoke();
            }
            this.d.a(str);
        }
    }
}
