package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/camera/camera2/pipe/compat/CameraState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1", f = "RetryingCameraStateOpener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.compat.CameraState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(!(((androidx.camera.camera2.pipe.compat.CameraState) this.getHighSpeedVideoFpsRanges) instanceof androidx.camera.camera2.pipe.compat.CameraStateUnopened));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.compat.CameraState cameraState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1) create(cameraState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1 cameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1 = new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1(continuation);
        cameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1.getHighSpeedVideoFpsRanges = obj;
        return cameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1;
    }

    CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1> continuation) {
        super(2, continuation);
    }
}
