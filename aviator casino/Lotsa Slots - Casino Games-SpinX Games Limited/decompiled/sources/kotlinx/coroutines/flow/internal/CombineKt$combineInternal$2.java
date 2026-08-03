package kotlinx.coroutines.flow.internal;

/* compiled from: Combine.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes6.dex */
final class CombineKt$combineInternal$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<T[]> $arrayFactory;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_combineInternal;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$combineInternal$2(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, kotlin.jvm.functions.Function0<T[]> function0, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.$flows = flowArr;
        this.$arrayFactory = function0;
        this.$transform = function3;
        this.$this_combineInternal = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 combineKt$combineInternal$2 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, continuation);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf A[LOOP:0: B:19:0x00cf->B:37:?, LOOP_START, PHI: r6 r10
      0x00cf: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:16:0x00ca, B:37:?] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r10v8 kotlin.collections.IndexedValue) = (r10v7 kotlin.collections.IndexedValue), (r10v21 kotlin.collections.IndexedValue) binds: [B:16:0x00ca, B:37:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlinx.coroutines.flow.Flow<T>[], kotlinx.coroutines.flow.Flow[]] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.Flow<T>[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x013a -> B:10:0x013c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object[] objArr;
        byte b;
        byte[] bArr;
        int i;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object obj2;
        java.lang.Object[] objArr2;
        byte b2;
        kotlin.collections.IndexedValue indexedValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            int length = this.$flows.length;
            if (length == 0) {
                return kotlin.Unit.INSTANCE;
            }
            objArr = new java.lang.Object[length];
            kotlin.collections.ArraysKt.fill$default(objArr, kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED, 0, 0, 6, (java.lang.Object) null);
            kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(length, null, null, 6, null);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(length);
            b = 0;
            int i3 = 0;
            while (i3 < length) {
                int i4 = i3;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1(this.$flows, i4, atomicInteger, Channel$default, null), 3, null);
                i3 = i4 + 1;
                atomicInteger = atomicInteger;
            }
            bArr = new byte[length];
            i = length;
            channel = Channel$default;
            b2 = (byte) (b + 1);
            this.L$0 = objArr;
            this.L$1 = channel;
            this.L$2 = bArr;
            this.I$0 = i;
            this.I$1 = b2;
            this.label = 1;
            obj2 = channel.mo12310receiveCatchingJP2dKIU(this);
            if (obj2 == coroutine_suspended) {
            }
        } else if (i2 == 1) {
            ?? r2 = this.I$1;
            i = this.I$0;
            byte[] bArr2 = (byte[]) this.L$2;
            kotlinx.coroutines.channels.Channel channel2 = (kotlinx.coroutines.channels.Channel) this.L$1;
            objArr2 = (java.lang.Object[]) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder();
            b2 = r2;
            bArr = bArr2;
            channel = channel2;
            indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(obj2);
            if (indexedValue == null) {
            }
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r22 = this.I$1;
            i = this.I$0;
            byte[] bArr3 = (byte[]) this.L$2;
            kotlinx.coroutines.channels.Channel channel3 = (kotlinx.coroutines.channels.Channel) this.L$1;
            objArr2 = (java.lang.Object[]) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            b = r22;
            bArr = bArr3;
            channel = channel3;
            objArr = objArr2;
            b2 = (byte) (b + 1);
            this.L$0 = objArr;
            this.L$1 = channel;
            this.L$2 = bArr;
            this.I$0 = i;
            this.I$1 = b2;
            this.label = 1;
            obj2 = channel.mo12310receiveCatchingJP2dKIU(this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            objArr2 = objArr;
            indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(obj2);
            if (indexedValue == null) {
                do {
                    int index = indexedValue.getIndex();
                    java.lang.Object obj3 = objArr2[index];
                    objArr2[index] = indexedValue.getValue();
                    if (obj3 == kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED) {
                        i--;
                    }
                    if (bArr[index] == b2) {
                        break;
                    }
                    bArr[index] = b2;
                    indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(channel.mo12311tryReceivePtdJZtk());
                } while (indexedValue != null);
                if (i == 0) {
                    java.lang.Object[] objArr3 = (java.lang.Object[]) this.$arrayFactory.invoke();
                    if (objArr3 == null) {
                        kotlin.jvm.functions.Function3 function3 = this.$transform;
                        java.lang.Object obj4 = this.$this_combineInternal;
                        this.L$0 = objArr2;
                        this.L$1 = channel;
                        this.L$2 = bArr;
                        this.I$0 = i;
                        this.I$1 = b2;
                        this.label = 2;
                        if (function3.invoke(obj4, objArr2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        kotlin.collections.ArraysKt.copyInto$default(objArr2, objArr3, 0, 0, 0, 14, (java.lang.Object) null);
                        kotlin.jvm.functions.Function3 function32 = this.$transform;
                        java.lang.Object obj5 = this.$this_combineInternal;
                        this.L$0 = objArr2;
                        this.L$1 = channel;
                        this.L$2 = bArr;
                        this.I$0 = i;
                        this.I$1 = b2;
                        this.label = 3;
                        if (function32.invoke(obj5, objArr3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                b = b2;
                objArr = objArr2;
                b2 = (byte) (b + 1);
                this.L$0 = objArr;
                this.L$1 = channel;
                this.L$2 = bArr;
                this.I$0 = i;
                this.I$1 = b2;
                this.label = 1;
                obj2 = channel.mo12310receiveCatchingJP2dKIU(this);
                if (obj2 == coroutine_suspended) {
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    /* compiled from: Combine.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger $nonClosed;
        final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, int i, java.util.concurrent.atomic.AtomicInteger atomicInteger, kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$flows = flowArr;
            this.$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow[] flowArr = this.$flows;
                    int i2 = this.$i;
                    this.label = 1;
                    if (flowArr[i2].collect(new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C03351(this.$resultChannel, i2), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                }
                return kotlin.Unit.INSTANCE;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                }
            }
        }

        /* compiled from: Combine.kt */
        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C03351<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ int $i;
            final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;

            C03351(kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel, int i) {
                this.$resultChannel = channel;
                this.$i = i;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                java.lang.Object coroutine_suspended;
                int i;
                if (continuation instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) continuation;
                    if ((combineKt$combineInternal$2$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.label -= Integer.MIN_VALUE;
                        java.lang.Object obj = combineKt$combineInternal$2$1$1$emit$1.result;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = combineKt$combineInternal$2$1$1$emit$1.label;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel = this.$resultChannel;
                            kotlin.collections.IndexedValue<java.lang.Object> indexedValue = new kotlin.collections.IndexedValue<>(this.$i, t);
                            combineKt$combineInternal$2$1$1$emit$1.label = 1;
                            if (channel.send(indexedValue, combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        combineKt$combineInternal$2$1$1$emit$1.label = 2;
                        if (kotlinx.coroutines.YieldKt.yield(combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                combineKt$combineInternal$2$1$1$emit$1 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                java.lang.Object obj2 = combineKt$combineInternal$2$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i != 0) {
                }
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
                if (kotlinx.coroutines.YieldKt.yield(combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
    }
}
