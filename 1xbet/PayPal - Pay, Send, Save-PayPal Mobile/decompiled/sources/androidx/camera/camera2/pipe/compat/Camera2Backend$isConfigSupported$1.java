package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2Backend", f = "Camera2Backend.kt", i = {0, 1, 1, 1}, l = {111, 129}, m = "isConfigSupported-NpXggIU", n = {"graphConfig", "graphConfig", "cameraDeviceSetupCompat", "sessionConfig"}, s = {"L$0", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes6.dex */
final class Camera2Backend$isConfigSupported$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2Backend getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.mo224isConfigSupportedNpXggIU(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Backend$isConfigSupported$1(androidx.camera.camera2.pipe.compat.Camera2Backend camera2Backend, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2Backend$isConfigSupported$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = camera2Backend;
    }
}
