package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/camera/camera2/pipe/compat/CameraState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1", f = "RetryingCameraStateOpener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.compat.CameraState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!kotlin.jvm.internal.Intrinsics.areEqual((androidx.camera.camera2.pipe.compat.CameraState) this.getHighResolutionOutputSizeshNQ4ISI, androidx.camera.camera2.pipe.compat.CameraStateUnopened.INSTANCE));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.compat.CameraState cameraState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1) create(cameraState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1 retryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1 = new androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1(continuation);
        retryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return retryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1;
    }

    RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1> continuation) {
        super(2, continuation);
    }
}
