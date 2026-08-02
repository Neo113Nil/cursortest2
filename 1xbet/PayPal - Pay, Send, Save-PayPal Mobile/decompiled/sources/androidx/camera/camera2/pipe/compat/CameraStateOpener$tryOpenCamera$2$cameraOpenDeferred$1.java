package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1", f = "RetryingCameraStateOpener.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.compat.CameraStateOpener Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.AndroidCameraState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.compat.CameraOpener cameraOpener;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                cameraOpener = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (cameraOpener.mo782openCameraRzXb1QE(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.lang.Exception e) {
            androidx.camera.camera2.pipe.core.Log log = androidx.camera.camera2.pipe.core.Log.INSTANCE;
            java.lang.Exception exc = e;
            java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            if (log.getWARN_LOGGABLE()) {
                androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str);
            }
            this.getHighSpeedVideoSizes.closeWith$camera_camera2_pipe(exc);
            new androidx.camera.camera2.pipe.compat.OpenCameraResult(null, androidx.camera.camera2.pipe.CameraError.m320boximpl(androidx.camera.camera2.pipe.CameraError.INSTANCE.m329fromPVuDhNw$camera_camera2_pipe(exc)), 1, null);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> continuation) {
        return ((androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1(androidx.camera.camera2.pipe.compat.CameraStateOpener cameraStateOpener, java.lang.String str, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = cameraStateOpener;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = androidCameraState;
    }
}
