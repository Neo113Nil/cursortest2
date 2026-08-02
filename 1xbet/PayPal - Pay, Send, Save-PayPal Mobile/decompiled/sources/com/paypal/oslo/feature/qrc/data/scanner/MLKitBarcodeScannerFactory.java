package com.paypal.oslo.feature.qrc.data.scanner;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/scanner/MLKitBarcodeScannerFactory;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/BarcodeScannerFactory;", "<init>", "()V", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "createScanner", "()Lcom/google/mlkit/vision/barcode/BarcodeScanner;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MLKitBarcodeScannerFactory implements com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory
    public final com.google.mlkit.vision.barcode.BarcodeScanner createScanner() {
        com.google.mlkit.vision.barcode.BarcodeScanner client = com.google.mlkit.vision.barcode.BarcodeScanning.getClient(new com.google.mlkit.vision.barcode.BarcodeScannerOptions.Builder().setBarcodeFormats(256, new int[0]).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(client, "");
        return client;
    }
}
