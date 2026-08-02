package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 1, 1, 1}, l = {62, 92}, m = "tryLock", n = {"$this$withTryLock_u24default$iv", "locked$iv", "$this$withTryLock_u24default$iv", "lock", "locked$iv"}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0"}, v = 1)
/* loaded from: classes7.dex */
final class MultiProcessCoordinator$tryLock$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.content.core.MultiProcessCoordinator getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.tryLock(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiProcessCoordinator$tryLock$1(androidx.content.core.MultiProcessCoordinator multiProcessCoordinator, kotlin.coroutines.Continuation<? super androidx.content.core.MultiProcessCoordinator$tryLock$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = multiProcessCoordinator;
    }
}
