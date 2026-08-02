package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {154}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class FlowKt__ErrorsKt$catchImpl$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ErrorsKt$catchImpl$2$emit$1(kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2<? super T> flowKt__ErrorsKt$catchImpl$2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = flowKt__ErrorsKt$catchImpl$2;
    }
}
