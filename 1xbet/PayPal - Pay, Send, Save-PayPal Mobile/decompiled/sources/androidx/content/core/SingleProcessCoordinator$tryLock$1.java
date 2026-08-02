package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0}, l = {47}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv"}, s = {"L$0", "Z$0"}, v = 1)
/* loaded from: classes3.dex */
final class SingleProcessCoordinator$tryLock$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.content.core.SingleProcessCoordinator getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.tryLock(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessCoordinator$tryLock$1(androidx.content.core.SingleProcessCoordinator singleProcessCoordinator, kotlin.coroutines.Continuation<? super androidx.content.core.SingleProcessCoordinator$tryLock$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = singleProcessCoordinator;
    }
}
