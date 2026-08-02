package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FlowKt__ErrorsKt$catchImpl$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return kotlinx.coroutines.flow.FlowKt.catchImpl(null, null, this);
    }

    FlowKt__ErrorsKt$catchImpl$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$1> continuation) {
        super(continuation);
    }
}
