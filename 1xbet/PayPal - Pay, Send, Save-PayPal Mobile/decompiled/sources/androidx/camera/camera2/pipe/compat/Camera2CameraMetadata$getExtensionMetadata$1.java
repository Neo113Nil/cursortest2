package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CameraMetadata", f = "Camera2CameraMetadata.kt", i = {0}, l = {140}, m = "getExtensionMetadata", n = {"extension"}, s = {"I$0"}, v = 1)
/* loaded from: classes6.dex */
final class Camera2CameraMetadata$getExtensionMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraMetadata getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getExtensionMetadata(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraMetadata$getExtensionMetadata$1(androidx.camera.camera2.pipe.compat.Camera2CameraMetadata camera2CameraMetadata, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CameraMetadata$getExtensionMetadata$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = camera2CameraMetadata;
    }
}
