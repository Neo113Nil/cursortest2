package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlinx/coroutines/flow/CancellableFlowImpl;", "T", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/Flow;", "p0", "<init>", "(Lkotlinx/coroutines/flow/Flow;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CancellableFlowImpl<T> implements kotlinx.coroutines.flow.CancellableFlow<T> {
    private final kotlinx.coroutines.flow.Flow<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        this.getHighSpeedVideoFpsRangesFor = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.getHighSpeedVideoFpsRangesFor.collect(new kotlinx.coroutines.flow.CancellableFlowImpl$collect$2(flowCollector), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
