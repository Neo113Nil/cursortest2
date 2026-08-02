package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2", f = "RetryingCameraStateOpener.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "awaitAvailableCamera", n = {com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2 getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.awaitAvailableCamera(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1(androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = camera2CameraAvailabilityMonitor$startMonitoring$2;
    }
}
