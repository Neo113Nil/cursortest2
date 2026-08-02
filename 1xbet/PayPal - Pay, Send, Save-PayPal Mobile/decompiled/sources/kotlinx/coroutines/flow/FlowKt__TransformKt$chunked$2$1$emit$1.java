package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1", f = "Transform.kt", i = {0}, l = {159}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class FlowKt__TransformKt$chunked$2$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__TransformKt$chunked$2$1$emit$1(kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1<? super T> flowKt__TransformKt$chunked$2$1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = flowKt__TransformKt$chunked$2$1;
    }
}
