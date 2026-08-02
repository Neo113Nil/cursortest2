package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {127, 129}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class FlowKt__TransformKt$runningReduce$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$runningReduce$1$1$emit$1(kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1<? super T> flowKt__TransformKt$runningReduce$1$1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = flowKt__TransformKt$runningReduce$1$1;
    }
}
