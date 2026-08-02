package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", i = {0, 0, 1}, l = {62, 40}, m = "lock", n = {"block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0"}, v = 1)
/* loaded from: classes3.dex */
final class SingleProcessCoordinator$lock$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.content.core.SingleProcessCoordinator getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.lock(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessCoordinator$lock$1(androidx.content.core.SingleProcessCoordinator singleProcessCoordinator, kotlin.coroutines.Continuation<? super androidx.content.core.SingleProcessCoordinator$lock$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = singleProcessCoordinator;
    }
}
