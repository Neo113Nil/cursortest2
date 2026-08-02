package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager", f = "Camera2DeviceManager.kt", i = {0, 0, 0, 1, 1, 2, 2, 3}, l = {391, 398, 404, 436, 437, 445}, m = "processRequestOpen", n = {"request", "cameraIdToOpen", "camerasToClose", "request", "cameraIdToOpen", "request", "cameraIdToOpen", "request"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class PruningCamera2DeviceManager$processRequestOpen$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningCamera2DeviceManager$processRequestOpen$1(androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager pruningCamera2DeviceManager, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$processRequestOpen$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = pruningCamera2DeviceManager;
    }
}
