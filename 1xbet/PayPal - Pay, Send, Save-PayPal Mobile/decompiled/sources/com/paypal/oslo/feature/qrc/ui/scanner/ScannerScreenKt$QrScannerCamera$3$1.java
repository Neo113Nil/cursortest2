package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$3$1", f = "ScannerScreen.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.SYNC_REPLENISH_NOT_SUPPORTED}, m = "invokeSuspend", n = {}, nl = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_EXPIRED}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ScannerScreenKt$QrScannerCamera$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.LifecycleOwner getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.camera.core.SurfaceRequest> getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider cameraProvider = this.getHighResolutionOutputSizeshNQ4ISI;
            android.content.Context context = this.Camera2StreamConfigurationMap;
            androidx.view.LifecycleOwner lifecycleOwner = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.runtime.MutableState<androidx.camera.core.SurfaceRequest> mutableState = this.getInputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<? super androidx.camera.core.SurfaceRequest, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$3$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this, (androidx.camera.core.SurfaceRequest) obj2);
                }
            };
            final com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler barcodeAnalysisHandler = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.getHighSpeedVideoFpsRangesFor;
            this.getOutputFormats = 1;
            if (cameraProvider.initialize(context, lifecycleOwner, function1, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$3$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler.this, mutableState2, (java.util.List) obj2);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState, androidx.camera.core.SurfaceRequest surfaceRequest) {
        mutableState.setValue(surfaceRequest);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler barcodeAnalysisHandler, androidx.compose.runtime.MutableState mutableState, java.util.List list) {
        boolean booleanValue;
        booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
        barcodeAnalysisHandler.handleBarcodeAnalysis(list, booleanValue);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerScreenKt$QrScannerCamera$3$1(com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider cameraProvider, android.content.Context context, androidx.view.LifecycleOwner lifecycleOwner, androidx.compose.runtime.MutableState<androidx.camera.core.SurfaceRequest> mutableState, com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler barcodeAnalysisHandler, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = cameraProvider;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = lifecycleOwner;
        this.getInputSizeshNQ4ISI = mutableState;
        this.getHighSpeedVideoSizes = barcodeAnalysisHandler;
        this.getHighSpeedVideoFpsRangesFor = mutableState2;
    }
}
