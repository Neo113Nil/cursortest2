package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CameraController$tryRestart$2", f = "Camera2CameraController.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2CameraController$tryRestart$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraController getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        androidx.camera.camera2.pipe.SurfaceTracker surfaceTracker;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.DelayKt.delay(this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        obj2 = this.getHighSpeedVideoSizes.getValidOutputFormatsForInputhNQ4ISI;
        androidx.camera.camera2.pipe.compat.Camera2CameraController camera2CameraController = this.getHighSpeedVideoSizes;
        synchronized (obj2) {
            if (!androidx.camera.camera2.pipe.compat.Camera2CameraController.access$isClosed(camera2CameraController) && !kotlin.jvm.internal.Intrinsics.areEqual(camera2CameraController.getControllerState(), androidx.camera.camera2.pipe.CameraController.ControllerState.STOPPING.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(camera2CameraController.getControllerState(), androidx.camera.camera2.pipe.CameraController.ControllerState.STOPPED.INSTANCE)) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
                surfaceTracker = camera2CameraController.getInputSizeshNQ4ISI;
                surfaceTracker.registerAllSurfaces();
                camera2CameraController.getHighSpeedVideoFpsRanges();
                camera2CameraController.getHighSpeedVideoFpsRangesFor();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2CameraController$tryRestart$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraController$tryRestart$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraController$tryRestart$2(long j, androidx.camera.camera2.pipe.compat.Camera2CameraController camera2CameraController, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CameraController$tryRestart$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = camera2CameraController;
    }
}
