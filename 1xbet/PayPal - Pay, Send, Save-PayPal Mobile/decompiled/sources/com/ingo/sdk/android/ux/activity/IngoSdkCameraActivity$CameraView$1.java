package com.ingo.sdk.android.ux.activity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$CameraView$1", f = "IngoSdkCameraActivity.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class IngoSdkCameraActivity$CameraView$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.core.ImageCapture getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.core.CameraSelector getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.view.LifecycleOwner getHighSpeedVideoSizes;
    final /* synthetic */ com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.camera.view.PreviewView getInputFormats;
    final /* synthetic */ androidx.camera.core.Preview getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity = this.getHighSpeedVideoSizesFor;
            this.getOutputMinFrameDuration = 1;
            obj = com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider = (androidx.camera.lifecycle.ProcessCameraProvider) obj;
        if (processCameraProvider == null) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error getting camera provider", null, null, 6, null);
            this.getHighSpeedVideoFpsRangesFor.setValue("Camera not available on this device.");
            return kotlin.Unit.INSTANCE;
        }
        processCameraProvider.unbindAll();
        processCameraProvider.bindToLifecycle(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getOutputFormats.setSurfaceProvider(this.getInputFormats.getSurfaceProvider());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$CameraView$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$CameraView$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IngoSdkCameraActivity$CameraView$1(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity ingoSdkCameraActivity, android.content.Context context, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.Preview preview, androidx.camera.core.ImageCapture imageCapture, androidx.camera.view.PreviewView previewView, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity$CameraView$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = ingoSdkCameraActivity;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoSizes = lifecycleOwner;
        this.getHighSpeedVideoFpsRanges = cameraSelector;
        this.getOutputFormats = preview;
        this.getHighResolutionOutputSizeshNQ4ISI = imageCapture;
        this.getInputFormats = previewView;
    }
}
