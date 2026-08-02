package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096A¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/coroutines/flow/ReadonlySharedFlow;", "T", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "p0", "Lkotlinx/coroutines/Job;", "p1", "<init>", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlinx/coroutines/Job;)V", "Lkotlin/coroutines/CoroutineContext;", "", "Lkotlinx/coroutines/channels/BufferOverflow;", "p2", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges", "", "getReplayCache", "()Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ReadonlySharedFlow<T> implements kotlinx.coroutines.flow.SharedFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private final /* synthetic */ kotlinx.coroutines.flow.SharedFlow<T> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ReadonlySharedFlow(kotlinx.coroutines.flow.SharedFlow<? extends T> sharedFlow, kotlinx.coroutines.Job job) {
        this.getHighSpeedVideoFpsRanges = sharedFlow;
        this.getHighSpeedVideoFpsRanges = job;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext p0, int p1, kotlinx.coroutines.channels.BufferOverflow p2) {
        return kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(this, p0, p1, p2);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final java.util.List<T> getReplayCache() {
        return this.getHighSpeedVideoFpsRanges.getReplayCache();
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        return this.getHighSpeedVideoFpsRanges.collect(flowCollector, continuation);
    }
}
