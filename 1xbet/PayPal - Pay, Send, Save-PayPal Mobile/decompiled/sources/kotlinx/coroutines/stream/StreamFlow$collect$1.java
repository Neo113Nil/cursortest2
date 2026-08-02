package kotlinx.coroutines.stream;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class StreamFlow$collect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ kotlinx.coroutines.stream.StreamFlow<T> getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.collect(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StreamFlow$collect$1(kotlinx.coroutines.stream.StreamFlow<T> streamFlow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.stream.StreamFlow$collect$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = streamFlow;
    }
}
