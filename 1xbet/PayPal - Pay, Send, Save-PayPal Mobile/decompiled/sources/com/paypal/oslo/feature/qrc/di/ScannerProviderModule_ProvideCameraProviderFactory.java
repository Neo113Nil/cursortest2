package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class ScannerProviderModule_ProvideCameraProviderFactory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider> {
    private final dagger.internal.Provider<com.google.mlkit.vision.barcode.BarcodeScanner> getHighSpeedVideoFpsRangesFor;

    private ScannerProviderModule_ProvideCameraProviderFactory(dagger.internal.Provider<com.google.mlkit.vision.barcode.BarcodeScanner> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider get() {
        return provideCameraProvider(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideCameraProviderFactory create(dagger.internal.Provider<com.google.mlkit.vision.barcode.BarcodeScanner> provider) {
        return new com.paypal.oslo.feature.qrc.di.ScannerProviderModule_ProvideCameraProviderFactory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider provideCameraProvider(com.google.mlkit.vision.barcode.BarcodeScanner barcodeScanner) {
        return (com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.qrc.di.ScannerProviderModule.INSTANCE.provideCameraProvider(barcodeScanner));
    }
}
