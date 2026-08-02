package androidx.content.core;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "getExclusiveFileLockWithRetryIfDeadlock", n = {"lockFileStream", "backoff"}, s = {"L$0", "J$0"}, v = 1)
/* loaded from: classes7.dex */
final class MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.content.core.MultiProcessCoordinator.Companion getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(androidx.content.core.MultiProcessCoordinator.Companion companion, kotlin.coroutines.Continuation<? super androidx.content.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = companion;
    }
}
