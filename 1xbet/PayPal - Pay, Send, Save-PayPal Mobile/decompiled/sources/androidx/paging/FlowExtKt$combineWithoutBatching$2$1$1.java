package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", f = "FlowExt.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.SimpleProducerScope<R> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.UnbatchedFlowCombiner<T1, T2> getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputMinFrameDuration = 1;
                if (this.Camera2StreamConfigurationMap.collect(new androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            if (this.getHighSpeedVideoSizes.decrementAndGet() == 0) {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.getHighResolutionOutputSizeshNQ4ISI, null, 1, null);
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    /* renamed from: androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ androidx.paging.UnbatchedFlowCombiner<T1, T2> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ int getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (kotlinx.coroutines.YieldKt.yield(r0) != r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            if (r7.onNext(r2, r6, r0) != r1) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 flowExtKt$combineWithoutBatching$2$1$1$1$emit$1;
            int i;
            if (continuation instanceof androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1) {
                flowExtKt$combineWithoutBatching$2$1$1$1$emit$1 = (androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1) continuation;
                if ((flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj2 = flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        androidx.paging.UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner = this.getHighSpeedVideoFpsRangesFor;
                        int i2 = this.getHighSpeedVideoSizes;
                        flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj2);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                }
            }
            flowExtKt$combineWithoutBatching$2$1$1$1$emit$1 = new androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1(this, continuation);
            java.lang.Object obj22 = flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            flowExtKt$combineWithoutBatching$2$1$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = 2;
        }

        public AnonymousClass1(androidx.paging.UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i) {
            this.getHighSpeedVideoFpsRangesFor = unbatchedFlowCombiner;
            this.getHighSpeedVideoSizes = i;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(kotlinx.coroutines.flow.Flow<? extends java.lang.Object> flow, java.util.concurrent.atomic.AtomicInteger atomicInteger, androidx.paging.SimpleProducerScope<R> simpleProducerScope, androidx.paging.UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i, kotlin.coroutines.Continuation<? super androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = flow;
        this.getHighSpeedVideoSizes = atomicInteger;
        this.getHighResolutionOutputSizeshNQ4ISI = simpleProducerScope;
        this.getHighSpeedVideoFpsRanges = unbatchedFlowCombiner;
        this.getHighSpeedVideoFpsRangesFor = i;
    }
}
