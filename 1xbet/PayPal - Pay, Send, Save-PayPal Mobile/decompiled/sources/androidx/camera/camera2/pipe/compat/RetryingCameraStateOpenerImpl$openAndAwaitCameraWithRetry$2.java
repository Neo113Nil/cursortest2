package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/AwaitOpenCameraResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2", f = "RetryingCameraStateOpener.kt", i = {1}, l = {497, 503}, m = "invokeSuspend", n = {"androidCameraState"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2DeviceCloser getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r13 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState;
        androidx.camera.camera2.pipe.compat.CameraState cameraState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener.m844openCameraWithRetryaeCOTgg$default(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null, this, 4, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidCameraState = (androidx.camera.camera2.pipe.compat.AndroidCameraState) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                cameraState = (androidx.camera.camera2.pipe.compat.CameraState) obj;
                if (!(cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateOpen)) {
                    androidx.camera.camera2.pipe.core.Log log = androidx.camera.camera2.pipe.core.Log.INSTANCE;
                    java.lang.String str = this.getHighSpeedVideoSizes;
                    if (log.getINFO_LOGGABLE()) {
                        androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str);
                    }
                    return new androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult(((androidx.camera.camera2.pipe.compat.CameraStateOpen) cameraState).getCameraDevice(), androidCameraState);
                }
                androidx.camera.camera2.pipe.core.Log log2 = androidx.camera.camera2.pipe.core.Log.INSTANCE;
                java.lang.String str2 = this.getHighSpeedVideoSizes;
                if (log2.getERROR_LOGGABLE()) {
                    androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str2);
                }
                return new androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult(null, null);
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.camera.camera2.pipe.compat.AndroidCameraState cameraState2 = ((androidx.camera.camera2.pipe.compat.OpenCameraResult) obj).getCameraState();
        if (cameraState2 == null) {
            androidx.camera.camera2.pipe.core.Log log3 = androidx.camera.camera2.pipe.core.Log.INSTANCE;
            java.lang.String str3 = this.getHighSpeedVideoSizes;
            if (log3.getERROR_LOGGABLE()) {
                androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str3);
            }
            return new androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult(null, null);
        }
        this.getHighSpeedVideoFpsRanges = cameraState2;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(cameraState2.getState(), new androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2$cameraState$1(null), this);
        if (first != coroutine_suspended) {
            androidCameraState = cameraState2;
            obj = first;
            cameraState = (androidx.camera.camera2.pipe.compat.CameraState) obj;
            if (!(cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateOpen)) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult> continuation) {
        return ((androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2(androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl, java.lang.String str, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser camera2DeviceCloser, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl$openAndAwaitCameraWithRetry$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = retryingCameraStateOpenerImpl;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = camera2DeviceCloser;
    }
}
