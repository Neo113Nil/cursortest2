package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager", f = "Camera2DeviceManager.kt", i = {0, 0, 0}, l = {576}, m = "openCameraWithRetry-zDSwpeU", n = {"cameraId", "sharedCameraIds", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY}, s = {"L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes6.dex */
final class PruningCamera2DeviceManager$openCameraWithRetry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(null, null, null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PruningCamera2DeviceManager$openCameraWithRetry$1(androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager pruningCamera2DeviceManager, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$openCameraWithRetry$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = pruningCamera2DeviceManager;
    }
}
