package com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt$CameraShutterScreen$2$1", f = "ManualCaptureScreen.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, nl = {160}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManualCaptureScreenKt$CameraShutterScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.view.LifecycleOwner Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.camera.lifecycle.ProcessCameraProvider> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.core.ImageCapture getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.camera.core.Preview getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizesFor = 1;
                obj = kotlinx.coroutines.guava.ListenableFutureKt.await(androidx.camera.lifecycle.ProcessCameraProvider.INSTANCE.getInstance(this.getHighResolutionOutputSizeshNQ4ISI), this);
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
            processCameraProvider.unbindAll();
            androidx.view.LifecycleOwner lifecycleOwner = this.Camera2StreamConfigurationMap;
            androidx.camera.core.CameraSelector cameraSelector = androidx.camera.core.CameraSelector.DEFAULT_BACK_CAMERA;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraSelector, "");
            processCameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRanges.setValue(processCameraProvider);
            this.getHighSpeedVideoSizes.setValue(java.lang.Boolean.valueOf(true));
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ManualCapture] CameraX bound to lifecycle", null, null, 6, null);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "[ManualCapture] CameraX bind failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt$CameraShutterScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt$CameraShutterScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualCaptureScreenKt$CameraShutterScreen$2$1(android.content.Context context, androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.Preview preview, androidx.camera.core.ImageCapture imageCapture, androidx.compose.runtime.MutableState<androidx.camera.lifecycle.ProcessCameraProvider> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.manualcapture.ManualCaptureScreenKt$CameraShutterScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.Camera2StreamConfigurationMap = lifecycleOwner;
        this.getInputFormats = preview;
        this.getHighSpeedVideoFpsRangesFor = imageCapture;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
    }
}
