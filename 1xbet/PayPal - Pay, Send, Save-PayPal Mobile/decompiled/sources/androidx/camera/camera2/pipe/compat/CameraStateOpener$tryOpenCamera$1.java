package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener", f = "RetryingCameraStateOpener.kt", i = {0, 0, 0, 0, 0}, l = {236, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "tryOpenCamera-7pD7j80$camera_camera2_pipe", n = {"cameraId", "camera2DeviceCloser", "audioRestrictionController", "attempts", "requestTimestamp"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0"}, v = 1)
/* loaded from: classes6.dex */
final class CameraStateOpener$tryOpenCamera$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.CameraStateOpener getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.m821tryOpenCamera7pD7j80$camera_camera2_pipe(null, 0, 0L, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$1(androidx.camera.camera2.pipe.compat.CameraStateOpener cameraStateOpener, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$1> continuation) {
        super(continuation);
        this.getOutputFormats = cameraStateOpener;
    }
}
