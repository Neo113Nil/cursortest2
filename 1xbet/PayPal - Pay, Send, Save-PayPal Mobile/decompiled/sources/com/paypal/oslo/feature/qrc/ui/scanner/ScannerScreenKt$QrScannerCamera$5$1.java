package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1", f = "ScannerScreen.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO}, m = "invokeSuspend", n = {}, nl = {619}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ScannerScreenKt$QrScannerCamera$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.LifecycleOwner getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.camera.core.SurfaceRequest> getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
            if (!booleanValue) {
                this.getHighSpeedVideoSizes.pauseAnalysis();
            } else if (com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt.access$QrScannerCamera$lambda$2(this.getOutputMinFrameDuration) == null) {
                com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider cameraProvider = this.getHighSpeedVideoSizes;
                android.content.Context context = this.getHighSpeedVideoFpsRangesFor;
                androidx.view.LifecycleOwner lifecycleOwner = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.runtime.MutableState<androidx.camera.core.SurfaceRequest> mutableState = this.getOutputMinFrameDuration;
                kotlin.jvm.functions.Function1<? super androidx.camera.core.SurfaceRequest, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, (androidx.camera.core.SurfaceRequest) obj2);
                    }
                };
                final com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler barcodeAnalysisHandler = this.getHighSpeedVideoFpsRanges;
                final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.Camera2StreamConfigurationMap;
                this.getInputFormats = 1;
                if (cameraProvider.initialize(context, lifecycleOwner, function1, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1.getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler.this, mutableState2, (java.util.List) obj2);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider cameraProvider2 = this.getHighSpeedVideoSizes;
                android.content.Context context2 = this.getHighSpeedVideoFpsRangesFor;
                final com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler barcodeAnalysisHandler2 = this.getHighSpeedVideoFpsRanges;
                final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState3 = this.Camera2StreamConfigurationMap;
                cameraProvider2.resumeAnalysis(context2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler.this, mutableState3, (java.util.List) obj2);
                    }
                });
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState, androidx.camera.core.SurfaceRequest surfaceRequest) {
        mutableState.setValue(surfaceRequest);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler barcodeAnalysisHandler, androidx.compose.runtime.MutableState mutableState, java.util.List list) {
        boolean booleanValue;
        booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
        barcodeAnalysisHandler.handleBarcodeAnalysis(list, booleanValue);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler barcodeAnalysisHandler, androidx.compose.runtime.MutableState mutableState, java.util.List list) {
        boolean booleanValue;
        booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
        barcodeAnalysisHandler.handleBarcodeAnalysis(list, booleanValue);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerScreenKt$QrScannerCamera$5$1(com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider cameraProvider, android.content.Context context, androidx.view.LifecycleOwner lifecycleOwner, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<androidx.camera.core.SurfaceRequest> mutableState2, com.paypal.oslo.feature.qrc.ui.scanner.BarcodeAnalysisHandler barcodeAnalysisHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$QrScannerCamera$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cameraProvider;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycleOwner;
        this.Camera2StreamConfigurationMap = mutableState;
        this.getOutputMinFrameDuration = mutableState2;
        this.getHighSpeedVideoFpsRanges = barcodeAnalysisHandler;
    }
}
