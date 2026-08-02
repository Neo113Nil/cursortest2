package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.CameraDevicesImpl", f = "CameraDevicesImpl.kt", i = {0, 0}, l = {105}, m = "getCameraMetadata-_mltaTw", n = {"cameraId", "cameraBackend"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class CameraDevicesImpl$getCameraMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.CameraDevicesImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.mo302getCameraMetadata_mltaTw(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraDevicesImpl$getCameraMetadata$1(androidx.camera.camera2.pipe.internal.CameraDevicesImpl cameraDevicesImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraMetadata$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = cameraDevicesImpl;
    }
}
