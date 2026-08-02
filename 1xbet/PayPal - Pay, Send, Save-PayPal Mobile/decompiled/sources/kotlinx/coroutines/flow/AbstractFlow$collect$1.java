package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {226}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class AbstractFlow$collect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.AbstractFlow<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.collect(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractFlow$collect$1(kotlinx.coroutines.flow.AbstractFlow<T> abstractFlow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.AbstractFlow$collect$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = abstractFlow;
    }
}
