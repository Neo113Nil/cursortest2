package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {79}, m = "emit", n = {}, s = {})
/* loaded from: classes17.dex */
final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1<T> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__MergeKt$flattenConcat$1$1$emit$1(kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1<? super T> flowKt__MergeKt$flattenConcat$1$1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = flowKt__MergeKt$flattenConcat$1$1;
    }
}
