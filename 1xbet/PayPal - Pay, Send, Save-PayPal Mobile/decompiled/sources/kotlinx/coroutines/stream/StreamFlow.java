package kotlinx.coroutines.stream;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0002\u0010\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "stream", "Ljava/util/stream/Stream;", "<init>", "(Ljava/util/stream/Stream;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class StreamFlow<T> implements kotlinx.coroutines.flow.Flow<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.stream.StreamFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    private final java.util.stream.Stream<T> getHighSpeedVideoFpsRanges;

    public StreamFlow(java.util.stream.Stream<T> stream) {
        this.getHighSpeedVideoFpsRanges = stream;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:11:0x0032, B:13:0x0055, B:15:0x005b), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.stream.StreamFlow$collect$1 streamFlow$collect$1;
        int i;
        kotlinx.coroutines.stream.StreamFlow<T> streamFlow;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        java.util.Iterator<T> it;
        if (continuation instanceof kotlinx.coroutines.stream.StreamFlow$collect$1) {
            streamFlow$collect$1 = (kotlinx.coroutines.stream.StreamFlow$collect$1) continuation;
            if ((streamFlow$collect$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                streamFlow$collect$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = streamFlow$collect$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = streamFlow$collect$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!getHighResolutionOutputSizeshNQ4ISI.compareAndSet(this, 0, 1)) {
                        throw new java.lang.IllegalStateException("Stream.consumeAsFlow can be collected only once".toString());
                    }
                    try {
                        streamFlow = this;
                        flowCollector2 = flowCollector;
                        it = this.getHighSpeedVideoFpsRanges.iterator();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        streamFlow = this;
                        streamFlow.getHighSpeedVideoFpsRanges.close();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) streamFlow$collect$1.getHighResolutionOutputSizeshNQ4ISI;
                    flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) streamFlow$collect$1.getHighSpeedVideoFpsRangesFor;
                    streamFlow = (kotlinx.coroutines.stream.StreamFlow) streamFlow$collect$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        streamFlow.getHighSpeedVideoFpsRanges.close();
                        throw th;
                    }
                }
                while (it.hasNext()) {
                    T next = it.next();
                    streamFlow$collect$1.getHighSpeedVideoFpsRanges = streamFlow;
                    streamFlow$collect$1.getHighSpeedVideoFpsRangesFor = flowCollector2;
                    streamFlow$collect$1.getHighResolutionOutputSizeshNQ4ISI = it;
                    streamFlow$collect$1.getHighSpeedVideoSizes = 1;
                    if (flowCollector2.emit(next, streamFlow$collect$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                streamFlow.getHighSpeedVideoFpsRanges.close();
                return kotlin.Unit.INSTANCE;
            }
        }
        streamFlow$collect$1 = new kotlinx.coroutines.stream.StreamFlow$collect$1(this, continuation);
        java.lang.Object obj2 = streamFlow$collect$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = streamFlow$collect$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        streamFlow.getHighSpeedVideoFpsRanges.close();
        return kotlin.Unit.INSTANCE;
    }
}
