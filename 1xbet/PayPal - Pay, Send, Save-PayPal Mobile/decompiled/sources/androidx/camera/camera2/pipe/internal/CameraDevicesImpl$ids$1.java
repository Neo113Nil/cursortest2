package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.CameraDevicesImpl", f = "CameraDevicesImpl.kt", i = {}, l = {49}, m = "ids", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class CameraDevicesImpl$ids$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.camera.camera2.pipe.internal.CameraDevicesImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.ids(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraDevicesImpl$ids$1(androidx.camera.camera2.pipe.internal.CameraDevicesImpl cameraDevicesImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.CameraDevicesImpl$ids$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cameraDevicesImpl;
    }
}
