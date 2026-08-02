package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/BarcodeAnalysisHandler;", "", "Lcom/paypal/oslo/feature/qrc/di/QrScannerController;", "controller", "Lkotlin/Function1;", "", "", "onCodeScanned", "Lkotlin/Function0;", "onStopScanning", "<init>", "(Lcom/paypal/oslo/feature/qrc/di/QrScannerController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "barcodes", "", "canScan", "handleBarcodeAnalysis", "(Ljava/util/List;Z)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/qrc/di/QrScannerController;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BarcodeAnalysisHandler {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.qrc.di.QrScannerController getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeAnalysisHandler(com.paypal.oslo.feature.qrc.di.QrScannerController qrScannerController, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrScannerController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoSizes = qrScannerController;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
    }

    public final void handleBarcodeAnalysis(java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode> barcodes, boolean canScan) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.qrc.LoggerKt.log, "QrScanner Analysis result:", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("barcodesDetected", java.lang.Integer.valueOf(barcodes != null ? barcodes.size() : 0))), null, 4, null);
        com.paypal.oslo.feature.qrc.di.QrScanResult onBarcodeDetected = this.getHighSpeedVideoSizes.onBarcodeDetected(barcodes != null ? (com.google.mlkit.vision.barcode.common.Barcode) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) barcodes) : null, canScan);
        if (onBarcodeDetected instanceof com.paypal.oslo.feature.qrc.di.QrScanResult.Success) {
            com.paypal.oslo.feature.qrc.di.QrScanResult.Success success = (com.paypal.oslo.feature.qrc.di.QrScanResult.Success) onBarcodeDetected;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.qrc.LoggerKt.log, "QR Code Detected from camera", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("qrCode", success.getCode())), null, 4, null);
            java.lang.String code = success.getCode();
            if (this.getHighSpeedVideoSizes.shouldStopScanning(onBarcodeDetected)) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            }
            this.getHighSpeedVideoFpsRangesFor.invoke(code);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(onBarcodeDetected, com.paypal.oslo.feature.qrc.di.QrScanResult.NoCodeDetected.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(onBarcodeDetected, com.paypal.oslo.feature.qrc.di.QrScanResult.ScanningPaused.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
