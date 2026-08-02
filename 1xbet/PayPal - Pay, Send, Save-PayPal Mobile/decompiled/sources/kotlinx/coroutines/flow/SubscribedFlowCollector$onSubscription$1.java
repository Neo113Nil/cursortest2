package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {422, 426}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class SubscribedFlowCollector$onSubscription$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.SubscribedFlowCollector<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.onSubscription(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribedFlowCollector$onSubscription$1(kotlinx.coroutines.flow.SubscribedFlowCollector<T> subscribedFlowCollector, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = subscribedFlowCollector;
    }
}
