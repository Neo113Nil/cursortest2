package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", i = {0, 0}, l = {119}, m = "any", n = {"found", "collector$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class FlowKt__LogicKt$any$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return kotlinx.coroutines.flow.FlowKt.any(null, null, this);
    }

    FlowKt__LogicKt$any$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__LogicKt$any$1> continuation) {
        super(continuation);
    }
}
