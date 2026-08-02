package com.paypal.oslo.feature.qrc.di;

/* loaded from: classes14.dex */
public final class MLKitImageQrScanner_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.di.QrScannerController> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory> getHighSpeedVideoSizes;

    private MLKitImageQrScanner_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.di.QrScannerController> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.di.QrScannerController> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory> provider4) {
        return new com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner newInstance(android.content.Context context, com.paypal.oslo.feature.qrc.di.QrScannerController qrScannerController, com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider imageProvider, com.paypal.oslo.feature.qrc.domain.scanner.BarcodeScannerFactory barcodeScannerFactory) {
        return new com.paypal.oslo.feature.qrc.di.MLKitImageQrScanner(context, qrScannerController, imageProvider, barcodeScannerFactory);
    }
}
