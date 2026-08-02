package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {73}, m = "emit", n = {}, s = {})
/* loaded from: classes5.dex */
final class DistinctFlowImpl$collect$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ kotlinx.coroutines.flow.DistinctFlowImpl$collect$2<T> Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DistinctFlowImpl$collect$2$emit$1(kotlinx.coroutines.flow.DistinctFlowImpl$collect$2<? super T> distinctFlowImpl$collect$2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = distinctFlowImpl$collect$2;
    }
}
