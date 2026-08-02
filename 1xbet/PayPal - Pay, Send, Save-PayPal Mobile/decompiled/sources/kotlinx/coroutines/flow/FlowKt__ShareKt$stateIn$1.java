package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", i = {}, l = {326}, m = "stateIn", n = {}, s = {})
/* loaded from: classes3.dex */
final class FlowKt__ShareKt$stateIn$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return kotlinx.coroutines.flow.FlowKt.stateIn(null, null, this);
    }

    FlowKt__ShareKt$stateIn$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$stateIn$1> continuation) {
        super(continuation);
    }
}
