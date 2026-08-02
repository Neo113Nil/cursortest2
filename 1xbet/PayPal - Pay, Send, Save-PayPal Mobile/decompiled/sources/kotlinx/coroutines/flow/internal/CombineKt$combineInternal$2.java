package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes5.dex */
final class CombineKt$combineInternal$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<T[]> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0117, code lost:
    
        if (r9.invoke(r10, r15, r23) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0140, code lost:
    
        if (r9.invoke(r10, r14, r23) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0149, code lost:
    
        r21 = r2;
        r13 = r5;
        r2 = r7;
        r7 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1 A[LOOP:0: B:18:0x00d1->B:36:?, LOOP_START, PHI: r6 r9
      0x00d1: PHI (r6v7 int) = (r6v6 int), (r6v8 int) binds: [B:15:0x00cc, B:36:?] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r9v5 kotlin.collections.IndexedValue) = (r9v4 kotlin.collections.IndexedValue), (r9v18 kotlin.collections.IndexedValue) binds: [B:15:0x00cc, B:36:?] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object[] objArr;
        int i;
        byte[] bArr;
        int i2;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object[] objArr2;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.Channel channel2;
        byte[] bArr2;
        int i3;
        kotlin.collections.IndexedValue indexedValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.getOutputMinFrameDuration;
        int i5 = 2;
        int i6 = 1;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
            int length = this.getHighSpeedVideoFpsRangesFor.length;
            if (length == 0) {
                return kotlin.Unit.INSTANCE;
            }
            objArr = new java.lang.Object[length];
            kotlin.collections.ArraysKt.fill$default(objArr, kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED, 0, 0, 6, (java.lang.Object) null);
            kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(length, null, null, 6, null);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(length);
            i = 0;
            int i7 = 0;
            while (i7 < length) {
                int i8 = i7;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, i8, atomicInteger, Channel$default, null), 3, null);
                i7 = i8 + 1;
                atomicInteger = atomicInteger;
            }
            bArr = new byte[length];
            i2 = length;
            channel = Channel$default;
            byte b = (byte) (i + 1);
            this.getHighSpeedVideoSizesFor = objArr;
            this.getOutputFormats = channel;
            this.getInputFormats = bArr;
            this.getHighSpeedVideoSizes = i2;
            this.getInputSizeshNQ4ISI = b;
            this.getOutputMinFrameDuration = i6;
            obj2 = channel.mo24072receiveCatchingJP2dKIU(this);
            if (obj2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = this.getInputSizeshNQ4ISI;
            i2 = this.getHighSpeedVideoSizes;
            byte[] bArr3 = (byte[]) this.getInputFormats;
            kotlinx.coroutines.channels.Channel channel3 = (kotlinx.coroutines.channels.Channel) this.getOutputFormats;
            java.lang.Object[] objArr3 = (java.lang.Object[]) this.getHighSpeedVideoSizesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            i = i9;
            bArr = bArr3;
            channel = channel3;
            objArr = objArr3;
            i5 = 2;
            i6 = 1;
            byte b2 = (byte) (i + 1);
            this.getHighSpeedVideoSizesFor = objArr;
            this.getOutputFormats = channel;
            this.getInputFormats = bArr;
            this.getHighSpeedVideoSizes = i2;
            this.getInputSizeshNQ4ISI = b2;
            this.getOutputMinFrameDuration = i6;
            obj2 = channel.mo24072receiveCatchingJP2dKIU(this);
            if (obj2 != coroutine_suspended) {
                objArr2 = objArr;
                kotlinx.coroutines.channels.Channel channel4 = channel;
                bArr2 = bArr;
                i3 = b2;
                channel2 = channel4;
                indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(obj2);
                if (indexedValue == null) {
                    do {
                        int index = indexedValue.getIndex();
                        java.lang.Object obj3 = objArr2[index];
                        objArr2[index] = indexedValue.getValue();
                        if (obj3 == kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED) {
                            i2--;
                        }
                        if (bArr2[index] == i3) {
                            break;
                        }
                        bArr2[index] = (byte) i3;
                        indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(channel2.mo24073tryReceivePtdJZtk());
                    } while (indexedValue != null);
                    if (i2 == 0) {
                        java.lang.Object[] objArr4 = (java.lang.Object[]) this.getHighResolutionOutputSizeshNQ4ISI.invoke();
                        if (objArr4 == null) {
                            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.getHighSpeedVideoFpsRanges;
                            java.lang.Object obj4 = this.Camera2StreamConfigurationMap;
                            this.getHighSpeedVideoSizesFor = objArr2;
                            this.getOutputFormats = channel2;
                            this.getInputFormats = bArr2;
                            this.getHighSpeedVideoSizes = i2;
                            this.getInputSizeshNQ4ISI = i3;
                            this.getOutputMinFrameDuration = i5;
                        } else {
                            java.lang.Object[] objArr5 = objArr2;
                            kotlin.collections.ArraysKt.copyInto$default(objArr2, objArr4, 0, 0, 0, 14, (java.lang.Object) null);
                            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function32 = this.getHighSpeedVideoFpsRanges;
                            java.lang.Object obj5 = this.Camera2StreamConfigurationMap;
                            this.getHighSpeedVideoSizesFor = objArr5;
                            this.getOutputFormats = channel2;
                            this.getInputFormats = bArr2;
                            this.getHighSpeedVideoSizes = i2;
                            this.getInputSizeshNQ4ISI = i3;
                            this.getOutputMinFrameDuration = 3;
                        }
                    }
                    i = i3;
                    objArr = objArr2;
                    bArr = bArr2;
                    channel = channel2;
                    i5 = 2;
                    i6 = 1;
                    byte b22 = (byte) (i + 1);
                    this.getHighSpeedVideoSizesFor = objArr;
                    this.getOutputFormats = channel;
                    this.getInputFormats = bArr;
                    this.getHighSpeedVideoSizes = i2;
                    this.getInputSizeshNQ4ISI = b22;
                    this.getOutputMinFrameDuration = i6;
                    obj2 = channel.mo24072receiveCatchingJP2dKIU(this);
                    if (obj2 != coroutine_suspended) {
                    }
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
        i3 = this.getInputSizeshNQ4ISI;
        i2 = this.getHighSpeedVideoSizes;
        bArr2 = (byte[]) this.getInputFormats;
        channel2 = (kotlinx.coroutines.channels.Channel) this.getOutputFormats;
        java.lang.Object[] objArr6 = (java.lang.Object[]) this.getHighSpeedVideoSizesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        obj2 = ((kotlinx.coroutines.channels.ChannelResult) obj).getGetHighSpeedVideoFpsRanges();
        objArr2 = objArr6;
        indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(obj2);
        if (indexedValue == null) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] Camera2StreamConfigurationMap;
        final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoSizes = 1;
                    if (this.Camera2StreamConfigurationMap[this.getHighResolutionOutputSizeshNQ4ISI].collect(new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C02171(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
                }
                return kotlin.Unit.INSTANCE;
            } finally {
                if (this.getHighSpeedVideoFpsRanges.decrementAndGet() == 0) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighSpeedVideoFpsRangesFor, null, 1, null);
                }
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C02171<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ int Camera2StreamConfigurationMap;
            final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> getHighSpeedVideoFpsRangesFor;

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
            
                if (kotlinx.coroutines.YieldKt.yield(r0) != r1) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
            
                if (r8.send(r2, r0) != r1) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                int i;
                if (continuation instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) continuation;
                    if ((combineKt$combineInternal$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                        java.lang.Object obj = combineKt$combineInternal$2$1$1$emit$1.getHighSpeedVideoFpsRanges;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = combineKt$combineInternal$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel = this.getHighSpeedVideoFpsRangesFor;
                            kotlin.collections.IndexedValue<java.lang.Object> indexedValue = new kotlin.collections.IndexedValue<>(this.Camera2StreamConfigurationMap, t);
                            combineKt$combineInternal$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
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
                        combineKt$combineInternal$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    }
                }
                combineKt$combineInternal$2$1$1$emit$1 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                java.lang.Object obj2 = combineKt$combineInternal$2$1$1$emit$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = combineKt$combineInternal$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                }
                combineKt$combineInternal$2$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }

            C02171(kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel, int i) {
                this.getHighSpeedVideoFpsRangesFor = channel;
                this.Camera2StreamConfigurationMap = i;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, int i, java.util.concurrent.atomic.AtomicInteger atomicInteger, kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = flowArr;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRanges = atomicInteger;
            this.getHighSpeedVideoFpsRangesFor = channel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 combineKt$combineInternal$2 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        combineKt$combineInternal$2.getHighSpeedVideoSizesFor = obj;
        return combineKt$combineInternal$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$combineInternal$2(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, kotlin.jvm.functions.Function0<T[]> function0, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = flowArr;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRanges = function3;
        this.Camera2StreamConfigurationMap = flowCollector;
    }
}
