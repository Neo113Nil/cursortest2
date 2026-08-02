package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class ScannerProviderModule_ProvideBarcodeScannerFactory implements dagger.internal.Factory<com.google.mlkit.vision.barcode.BarcodeScanner> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory> getHighSpeedVideoSizes;

    private ScannerProviderModule_ProvideBarcodeScannerFactory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.google.mlkit.vision.barcode.BarcodeScanner get() {
        return provideBarcodeScanner(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideBarcodeScannerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory> provider) {
        return new com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideBarcodeScannerFactory(provider);
    }

    public static com.google.mlkit.vision.barcode.BarcodeScanner provideBarcodeScanner(com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory barcodeScannerFactory) {
        return (com.google.mlkit.vision.barcode.BarcodeScanner) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.ScannerProviderModule.INSTANCE.provideBarcodeScanner(barcodeScannerFactory));
    }
}
