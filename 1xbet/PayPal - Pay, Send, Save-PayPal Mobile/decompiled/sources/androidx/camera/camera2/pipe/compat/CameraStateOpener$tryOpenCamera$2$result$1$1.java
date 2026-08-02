package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$1", f = "RetryingCameraStateOpener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraStateOpener$tryOpenCamera$2$result$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.compat.OpenCameraResult, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.compat.OpenCameraResult>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.camera.camera2.pipe.compat.OpenCameraResult openCameraResult = (androidx.camera.camera2.pipe.compat.OpenCameraResult) this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.camera.camera2.pipe.core.Log log = androidx.camera.camera2.pipe.core.Log.INSTANCE;
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (log.getDEBUG_LOGGABLE()) {
            androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str);
        }
        this.getHighSpeedVideoFpsRanges.element = null;
        return openCameraResult;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.compat.OpenCameraResult openCameraResult, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> continuation) {
        return ((androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$1) create(openCameraResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$1 cameraStateOpener$tryOpenCamera$2$result$1$1 = new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        cameraStateOpener$tryOpenCamera$2$result$1$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return cameraStateOpener$tryOpenCamera$2$result$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$result$1$1(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.compat.OpenCameraResult>> objectRef, java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = objectRef;
        this.getHighSpeedVideoSizes = str;
    }
}
