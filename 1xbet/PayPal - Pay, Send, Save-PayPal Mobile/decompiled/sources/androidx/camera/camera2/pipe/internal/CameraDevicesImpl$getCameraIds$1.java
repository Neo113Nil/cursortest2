package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.CameraDevicesImpl", f = "CameraDevicesImpl.kt", i = {0}, l = {72}, m = "getCameraIds-iAq86To", n = {"cameraBackend"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class CameraDevicesImpl$getCameraIds$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.CameraDevicesImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.mo301getCameraIdsiAq86To(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraDevicesImpl$getCameraIds$1(androidx.camera.camera2.pipe.internal.CameraDevicesImpl cameraDevicesImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getCameraIds$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cameraDevicesImpl;
    }
}
