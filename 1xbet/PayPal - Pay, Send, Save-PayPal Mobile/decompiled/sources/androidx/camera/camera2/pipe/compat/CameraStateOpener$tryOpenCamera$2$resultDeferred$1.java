package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1", f = "RetryingCameraStateOpener.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class CameraStateOpener$tryOpenCamera$2$resultDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.AndroidCameraState getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = kotlinx.coroutines.flow.FlowKt.first(this.getHighResolutionOutputSizeshNQ4ISI.getState(), new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1(null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.camera.camera2.pipe.compat.CameraState cameraState = (androidx.camera.camera2.pipe.compat.CameraState) obj;
        if (cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateOpen) {
            return new androidx.camera.camera2.pipe.compat.OpenCameraResult(this.getHighResolutionOutputSizeshNQ4ISI, null, 2, null);
        }
        if (cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateClosing) {
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            return new androidx.camera.camera2.pipe.compat.OpenCameraResult(null, ((androidx.camera.camera2.pipe.compat.CameraStateClosing) cameraState).m820getCameraErrorCodemVEW8x0(), 1, null);
        }
        if (cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateClosed) {
            this.getHighResolutionOutputSizeshNQ4ISI.close();
            return new androidx.camera.camera2.pipe.compat.OpenCameraResult(null, ((androidx.camera.camera2.pipe.compat.CameraStateClosed) cameraState).m813getCameraErrorCodemVEW8x0(), 1, null);
        }
        if (!(cameraState instanceof androidx.camera.camera2.pipe.compat.CameraStateUnopened)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.close();
        throw new java.lang.IllegalStateException("Unexpected CameraState: ".concat(java.lang.String.valueOf(cameraState)));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> continuation) {
        return ((androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$resultDeferred$1(androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = androidCameraState;
    }
}
