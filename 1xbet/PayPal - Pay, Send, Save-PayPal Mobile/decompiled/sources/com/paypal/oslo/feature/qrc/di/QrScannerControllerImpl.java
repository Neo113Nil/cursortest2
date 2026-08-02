package com.paypal.oslo.feature.qrc.di;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/qrc/di/QrScannerControllerImpl;", "Lcom/paypal/oslo/feature/qrc/di/QrScannerController;", "<init>", "()V", "Lcom/google/mlkit/vision/barcode/common/Barcode;", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "", "canScan", "Lcom/paypal/oslo/feature/qrc/di/QrScanResult;", "onBarcodeDetected", "(Lcom/google/mlkit/vision/barcode/common/Barcode;Z)Lcom/paypal/oslo/feature/qrc/di/QrScanResult;", "result", "shouldStopScanning", "(Lcom/paypal/oslo/feature/qrc/di/QrScanResult;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrScannerControllerImpl implements com.paypal.oslo.feature.qrc.di.QrScannerController {
    public static final int $stable = 0;

    @javax.inject.Inject
    public QrScannerControllerImpl() {
    }

    @Override // com.paypal.oslo.feature.qrc.di.QrScannerController
    public final com.paypal.oslo.feature.qrc.di.QrScanResult onBarcodeDetected(com.google.mlkit.vision.barcode.common.Barcode barcode, boolean canScan) {
        if (!canScan) {
            return com.paypal.oslo.feature.qrc.di.QrScanResult.ScanningPaused.INSTANCE;
        }
        java.lang.String rawValue = barcode != null ? barcode.getRawValue() : null;
        java.lang.String str = rawValue;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return com.paypal.oslo.feature.qrc.di.QrScanResult.NoCodeDetected.INSTANCE;
        }
        return new com.paypal.oslo.feature.qrc.di.QrScanResult.Success(rawValue);
    }

    @Override // com.paypal.oslo.feature.qrc.di.QrScannerController
    public final boolean shouldStopScanning(com.paypal.oslo.feature.qrc.di.QrScanResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        return result instanceof com.paypal.oslo.feature.qrc.di.QrScanResult.Success;
    }
}
