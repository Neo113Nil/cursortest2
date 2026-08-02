package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CameraController", f = "Camera2CameraController.kt", i = {}, l = {340}, m = "awaitClosed", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2CameraController$awaitClosed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraController getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.awaitClosed(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraController$awaitClosed$1(androidx.camera.camera2.pipe.compat.Camera2CameraController camera2CameraController, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = camera2CameraController;
    }
}
