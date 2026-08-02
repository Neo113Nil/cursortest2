package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$single$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return kotlinx.coroutines.flow.FlowKt.single(null, this);
    }

    FlowKt__ReduceKt$single$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1> continuation) {
        super(continuation);
    }
}
