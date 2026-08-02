package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.CameraDevicesImpl", f = "CameraDevicesImpl.kt", i = {}, l = {57}, m = "getMetadata-0r8Bogc", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class CameraDevicesImpl$getMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.CameraDevicesImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.mo304getMetadata0r8Bogc(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraDevicesImpl$getMetadata$1(androidx.camera.camera2.pipe.internal.CameraDevicesImpl cameraDevicesImpl, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.CameraDevicesImpl$getMetadata$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = cameraDevicesImpl;
    }
}
