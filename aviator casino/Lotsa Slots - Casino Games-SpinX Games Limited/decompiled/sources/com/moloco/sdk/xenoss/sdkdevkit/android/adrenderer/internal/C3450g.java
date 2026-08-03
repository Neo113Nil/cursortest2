package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3450g {

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsFlow$1", f = "CountdownFlow.kt", i = {0, 0, 1, 1, 2, 2}, l = {30, 33, 34}, m = "invokeSuspend", n = {"$this$flow", "secondsLeft", "$this$flow", "secondsLeft", "$this$flow", "secondsLeft"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$a */
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super kotlin.UInt>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7453a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a> continuation) {
            super(2, continuation);
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlin.UInt> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a(this.d, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0073 -> B:12:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            int i;
            kotlinx.coroutines.flow.FlowCollector flowCollector;
            int compare;
            kotlin.UInt m10890boximpl;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.f7453a;
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.c;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i = kotlin.UInt.m10896constructorimpl(i - 1);
                        m10890boximpl = kotlin.UInt.m10890boximpl(i);
                        this.c = flowCollector;
                        this.f7453a = i;
                        this.b = 3;
                        if (flowCollector.emit(m10890boximpl, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                i = this.f7453a;
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.c;
                i = this.d;
                kotlin.UInt m10890boximpl2 = kotlin.UInt.m10890boximpl(i);
                this.c = flowCollector2;
                this.f7453a = i;
                this.b = 1;
                if (flowCollector2.emit(m10890boximpl2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector = flowCollector2;
            }
            compare = java.lang.Integer.compare(i ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
            if (compare <= 0) {
                this.c = flowCollector;
                this.f7453a = i;
                this.b = 2;
                if (kotlinx.coroutines.DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = kotlin.UInt.m10896constructorimpl(i - 1);
                m10890boximpl = kotlin.UInt.m10890boximpl(i);
                this.c = flowCollector;
                this.f7453a = i;
                this.b = 3;
                if (flowCollector.emit(m10890boximpl, this) == coroutine_suspended) {
                }
                compare = java.lang.Integer.compare(i ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
                if (compare <= 0) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsStateFlow$1", f = "CountdownFlow.kt", i = {0, 0}, l = {83, 87, 89}, m = "invokeSuspend", n = {"$this$channelFlow", "countdownJob"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b */
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7454a;
        public int b;
        public /* synthetic */ java.lang.Object c;
        public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef d;
        public final /* synthetic */ kotlinx.coroutines.flow.Flow<java.lang.Boolean> e;
        public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef f;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$a */
        public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef f7455a;
            public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> b;
            public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<kotlin.UInt> c;
            public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef, kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt> producerScope, kotlin.jvm.internal.Ref.IntRef intRef2) {
                this.f7455a = intRef;
                this.b = objectRef;
                this.c = producerScope;
                this.d = intRef2;
            }

            public final java.lang.Object a(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                if (z) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.b(this.f7455a, this.b, this.c, this.d);
                } else {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.c(this.b);
                }
                return kotlin.Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                return a(((java.lang.Boolean) obj).booleanValue(), continuation);
            }
        }

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsStateFlow$1$startCountdown$1", f = "CountdownFlow.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$b, reason: collision with other inner class name */
        public static final class C0231b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f7456a;
            public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef b;
            public final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> c;
            public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef d;
            public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<kotlin.UInt> e;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$b$a */
            public static final class a<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef f7457a;
                public final /* synthetic */ kotlin.jvm.internal.Ref.IntRef b;
                public final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<kotlin.UInt> c;

                /* JADX WARN: Multi-variable type inference failed */
                public a(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.IntRef intRef2, kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt> producerScope) {
                    this.f7457a = intRef;
                    this.b = intRef2;
                    this.c = producerScope;
                }

                public final java.lang.Object a(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    this.f7457a.element = i;
                    kotlin.jvm.internal.Ref.IntRef intRef = this.b;
                    if (i == intRef.element) {
                        return kotlin.Unit.INSTANCE;
                    }
                    intRef.element = i;
                    java.lang.Object send = this.c.send(kotlin.UInt.m10890boximpl(i), continuation);
                    return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    return a(((kotlin.UInt) obj).getData(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0231b(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef, kotlin.jvm.internal.Ref.IntRef intRef2, kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt> producerScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.C0231b> continuation) {
                super(2, continuation);
                this.b = intRef;
                this.c = objectRef;
                this.d = intRef2;
                this.e = producerScope;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.C0231b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.C0231b(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f7456a;
                try {
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.Flow<kotlin.UInt> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a(this.b.element);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.C0231b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.C0231b.a(this.b, this.d, this.e);
                        this.f7456a = 1;
                        if (a2.collect(aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.c.element = null;
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    this.c.element = null;
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.Ref.IntRef intRef, kotlinx.coroutines.flow.Flow<java.lang.Boolean> flow, kotlin.jvm.internal.Ref.IntRef intRef2, kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b> continuation) {
            super(2, continuation);
            this.d = intRef;
            this.e = flow;
            this.f = intRef2;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [T, kotlinx.coroutines.Job] */
        public static final void b(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef, kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt> producerScope, kotlin.jvm.internal.Ref.IntRef intRef2) {
            ?? launch$default;
            if (intRef.element == 0 || objectRef.element != null) {
                return;
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.C0231b(intRef, objectRef, intRef2, producerScope, null), 3, null);
            objectRef.element = launch$default;
        }

        public static final void c(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef) {
            kotlinx.coroutines.Job job = objectRef.element;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            objectRef.element = null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b(this.d, this.e, this.f, continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final kotlin.jvm.internal.Ref.ObjectRef objectRef;
            kotlinx.coroutines.channels.ProducerScope producerScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.c;
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                kotlin.UInt m10890boximpl = kotlin.UInt.m10890boximpl(this.d.element);
                this.c = producerScope2;
                this.f7454a = objectRef;
                this.b = 1;
                if (producerScope2.send(m10890boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.f7454a;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> flow = this.e;
            if (flow == null) {
                b(this.f, objectRef, producerScope, this.d);
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.b(kotlin.jvm.internal.Ref.ObjectRef.this);
                    }
                };
                this.c = null;
                this.f7454a = null;
                this.b = 2;
                if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                kotlinx.coroutines.flow.Flow distinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(flow);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b.a(this.f, objectRef, producerScope, this.d);
                this.c = null;
                this.f7454a = null;
                this.b = 3;
                if (distinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static final kotlin.Unit b(kotlin.jvm.internal.Ref.ObjectRef objectRef) {
            c(objectRef);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.UInt> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }
    }

    public static final kotlinx.coroutines.flow.Flow<kotlin.UInt> a(int i) {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.a(i, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.StateFlow a(int i, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.Flow flow, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            flow = null;
        }
        return a(i, coroutineScope, flow);
    }

    public static final kotlinx.coroutines.flow.StateFlow<kotlin.UInt> a(int i, kotlinx.coroutines.CoroutineScope scope, kotlinx.coroutines.flow.Flow<java.lang.Boolean> flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = i;
        kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        intRef2.element = i;
        return kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.FlowKt.channelFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3450g.b(intRef2, flow, intRef, null)), scope, kotlinx.coroutines.flow.SharingStarted.Companion.WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.INSTANCE, 0L, 0L, 3, null), kotlin.UInt.m10890boximpl(i));
    }
}
