package androidx.paging;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", i = {0, 0}, l = {96}, m = "awaitClose", n = {"block", "job"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class SimpleProducerScopeImpl$awaitClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.SimpleProducerScopeImpl<T> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.awaitClose(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleProducerScopeImpl$awaitClose$1(androidx.paging.SimpleProducerScopeImpl<T> simpleProducerScopeImpl, kotlin.coroutines.Continuation<? super androidx.paging.SimpleProducerScopeImpl$awaitClose$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = simpleProducerScopeImpl;
    }
}
