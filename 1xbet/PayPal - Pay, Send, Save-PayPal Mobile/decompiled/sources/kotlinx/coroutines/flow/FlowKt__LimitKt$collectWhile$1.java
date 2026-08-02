package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {134}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FlowKt__LimitKt$collectWhile$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return kotlinx.coroutines.flow.FlowKt__LimitKt.collectWhile(null, null, this);
    }

    FlowKt__LimitKt$collectWhile$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1> continuation) {
        super(continuation);
    }
}
