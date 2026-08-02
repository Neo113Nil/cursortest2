package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR0\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRangesFor", "", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class UndispatchedContextCollector<T> implements kotlinx.coroutines.flow.FlowCollector<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;

    public UndispatchedContextCollector(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.getHighSpeedVideoFpsRangesFor = coroutineContext;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(coroutineContext);
        this.getHighSpeedVideoFpsRanges = new kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContextUndispatched = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(this.getHighSpeedVideoFpsRangesFor, t, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        return withContextUndispatched == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContextUndispatched : kotlin.Unit.INSTANCE;
    }
}
