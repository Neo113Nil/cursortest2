package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager", f = "Camera2DeviceManager.kt", i = {0}, l = {465, 469}, m = "processRequestClose", n = {"request"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class PruningCamera2DeviceManager$processRequestClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningCamera2DeviceManager$processRequestClose$1(androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager pruningCamera2DeviceManager, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$processRequestClose$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pruningCamera2DeviceManager;
    }
}
