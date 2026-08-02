package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl", f = "RetryingCameraStateOpener.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {418, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD, 476}, m = "openCameraWithRetry-aeCOTgg", n = {"cameraId", "camera2DeviceCloser", "isForegroundObserver", "attempts", "requestTimestamp", "cameraId", "camera2DeviceCloser", "isForegroundObserver", "attempts", "it", "requestTimestamp", "cameraId", "camera2DeviceCloser", "isForegroundObserver", "attempts", "it", "requestTimestamp"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$5", "J$0"}, v = 1)
/* loaded from: classes6.dex */
final class RetryingCameraStateOpenerImpl$openCameraWithRetry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.mo846openCameraWithRetryaeCOTgg(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetryingCameraStateOpenerImpl$openCameraWithRetry$1(androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openCameraWithRetry$1> continuation) {
        super(continuation);
        this.getInputFormats = retryingCameraStateOpenerImpl;
    }
}
