package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class D {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f7363a;
    public final kotlinx.coroutines.flow.MutableStateFlow<kotlinx.coroutines.flow.StateFlow<kotlin.UInt>> b;
    public final kotlinx.coroutines.flow.StateFlow<kotlin.UInt> c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ResettableCountdownSecondsStateFlow$countdownSecondsStateFlow$1", f = "CountdownFlow.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7364a;
        public /* synthetic */ java.lang.Object b;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ResettableCountdownSecondsStateFlow$countdownSecondsStateFlow$1$1", f = "CountdownFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D$a$a, reason: collision with other inner class name */
        public static final class C0212a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.StateFlow<? extends kotlin.UInt>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7365a;
            public /* synthetic */ java.lang.Object b;
            public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<kotlin.UInt> c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D$a$a$a, reason: collision with other inner class name */
            public static final class C0213a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<kotlin.UInt> f7366a;

                /* JADX WARN: Multi-variable type inference failed */
                public C0213a(kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt> producerScope) {
                    this.f7366a = producerScope;
                }

                public final java.lang.Object a(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    java.lang.Object send = this.f7366a.send(kotlin.UInt.m10890boximpl(i), continuation);
                    return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    return a(((kotlin.UInt) obj).getData(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0212a(kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt> producerScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a.C0212a> continuation) {
                super(2, continuation);
                this.c = producerScope;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.flow.StateFlow<kotlin.UInt> stateFlow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a.C0212a) create(stateFlow, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a.C0212a c0212a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a.C0212a(this.c, continuation);
                c0212a.b = obj;
                return c0212a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7365a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.StateFlow stateFlow = (kotlinx.coroutines.flow.StateFlow) this.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a.C0212a.C0213a c0213a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a.C0212a.C0213a(this.c);
                    this.f7365a = 1;
                    if (stateFlow.collect(c0213a, this) == coroutine_suspended) {
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

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7364a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.this.b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a.C0212a c0212a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a.C0212a(producerScope, null);
                this.f7364a = 1;
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(mutableStateFlow, c0212a, this) == coroutine_suspended) {
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

    public /* synthetic */ D(int i, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, coroutineScope);
    }

    public D(int i, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7363a = scope;
        kotlinx.coroutines.flow.MutableStateFlow<kotlinx.coroutines.flow.StateFlow<kotlin.UInt>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a(i, scope, null, 4, null));
        this.b = MutableStateFlow;
        this.c = kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.channelFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D.a(null)), scope, kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null), MutableStateFlow.getValue().getValue());
    }

    public final void a(int i) {
        this.b.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a(i, this.f7363a, null, 4, null));
    }

    public final kotlinx.coroutines.flow.StateFlow<kotlin.UInt> a() {
        return this.c;
    }
}
