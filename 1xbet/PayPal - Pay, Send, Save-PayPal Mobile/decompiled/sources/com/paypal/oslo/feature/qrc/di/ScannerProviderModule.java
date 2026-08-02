package com.paypal.oslo.feature.qrc.di;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/di/ScannerProviderModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;", "provideImageProvider", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/BarcodeScannerFactory;", "provideBarcodeScannerFactory", "()Lcom/paypal/oslo/feature/qrc/domain/scanner/BarcodeScannerFactory;", "scannerFactory", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "provideBarcodeScanner", "(Lcom/paypal/oslo/feature/qrc/domain/scanner/BarcodeScannerFactory;)Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "barcodeScanner", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProvider;", "provideCameraProvider", "(Lcom/google/mlkit/vision/barcode/BarcodeScanner;)Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class ScannerProviderModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.di.ScannerProviderModule INSTANCE = new com.paypal.oslo.feature.qrc.di.ScannerProviderModule();

    private ScannerProviderModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider provideImageProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.feature.qrc.data.scanner.PreprocessedImageProvider(context, null, null, 6, null);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory provideBarcodeScannerFactory() {
        return new com.paypal.oslo.feature.qrc.data.scanner.MLKitBarcodeScannerFactory();
    }

    @dagger.Provides
    public final com.google.mlkit.vision.barcode.BarcodeScanner provideBarcodeScanner(com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory scannerFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scannerFactory, "");
        return scannerFactory.createScanner();
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider provideCameraProvider(com.google.mlkit.vision.barcode.BarcodeScanner barcodeScanner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barcodeScanner, "");
        return new com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider(barcodeScanner, null, null, 6, null);
    }
}
