package com.paypal.oslo.feature.qrc.di;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/di/QrScannerController;", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "", "canScan", "Lcom/paypal/oslo/feature/qrc/di/QrScanResult;", "onBarcodeDetected", "(Lcom/google/mlkit/vision/barcode/common/Barcode;Z)Lcom/paypal/oslo/feature/qrc/di/QrScanResult;", "result", "shouldStopScanning", "(Lcom/paypal/oslo/feature/qrc/di/QrScanResult;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface QrScannerController {
    com.paypal.oslo.feature.qrc.di.QrScanResult onBarcodeDetected(com.google.mlkit.vision.barcode.common.Barcode barcode, boolean canScan);

    boolean shouldStopScanning(com.paypal.oslo.feature.qrc.di.QrScanResult result);
}
