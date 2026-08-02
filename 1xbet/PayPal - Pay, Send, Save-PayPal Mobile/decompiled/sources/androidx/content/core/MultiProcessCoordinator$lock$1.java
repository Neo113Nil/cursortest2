package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", i = {0, 0, 1, 1, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 47, 48}, m = "lock", n = {"block", "$this$withLock_u24default$iv", "block", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "lock"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$2"}, v = 1)
/* loaded from: classes7.dex */
final class MultiProcessCoordinator$lock$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.content.core.MultiProcessCoordinator getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.lock(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiProcessCoordinator$lock$1(androidx.content.core.MultiProcessCoordinator multiProcessCoordinator, kotlin.coroutines.Continuation<? super androidx.content.core.MultiProcessCoordinator$lock$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = multiProcessCoordinator;
    }
}
