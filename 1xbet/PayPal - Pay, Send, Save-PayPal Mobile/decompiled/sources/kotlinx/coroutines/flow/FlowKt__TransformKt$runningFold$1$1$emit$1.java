package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {105, 106}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class FlowKt__TransformKt$runningFold$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1<T> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningFold$1$1$emit$1(kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1<? super T> flowKt__TransformKt$runningFold$1$1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = flowKt__TransformKt$runningFold$1$1;
    }
}
