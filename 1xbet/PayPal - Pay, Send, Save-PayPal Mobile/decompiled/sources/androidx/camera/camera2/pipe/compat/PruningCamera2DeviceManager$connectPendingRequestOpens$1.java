package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager", f = "Camera2DeviceManager.kt", i = {0}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO}, m = "connectPendingRequestOpens", n = {"pendingRequestOpen"}, s = {"L$1"}, v = 1)
/* loaded from: classes6.dex */
final class PruningCamera2DeviceManager$connectPendingRequestOpens$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningCamera2DeviceManager$connectPendingRequestOpens$1(androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager pruningCamera2DeviceManager, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$connectPendingRequestOpens$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = pruningCamera2DeviceManager;
    }
}
