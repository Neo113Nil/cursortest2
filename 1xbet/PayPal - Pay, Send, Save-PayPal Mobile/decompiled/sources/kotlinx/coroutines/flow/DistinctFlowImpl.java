package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BS\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012&\u0010\n\u001a\"\u0012\u000b\u0012\t\u0018\u00010\u0005¢\u0006\u0002\b\b\u0012\u000b\u0012\t\u0018\u00010\u0005¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R1\u0010\u0018\u001a\"\u0012\u000b\u0012\t\u0018\u00010\u0005¢\u0006\u0002\b\b\u0012\u000b\u0012\t\u0018\u00010\u0005¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", "T", "Lkotlinx/coroutines/flow/Flow;", "p0", "Lkotlin/Function1;", "", "p1", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "p2", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DistinctFlowImpl<T> implements kotlinx.coroutines.flow.Flow<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    public final kotlin.jvm.functions.Function1<T, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> function2) {
        this.getHighSpeedVideoFpsRangesFor = flow;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizes = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        java.lang.Object collect = this.getHighSpeedVideoFpsRangesFor.collect(new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2(this, objectRef, flowCollector), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }
}
