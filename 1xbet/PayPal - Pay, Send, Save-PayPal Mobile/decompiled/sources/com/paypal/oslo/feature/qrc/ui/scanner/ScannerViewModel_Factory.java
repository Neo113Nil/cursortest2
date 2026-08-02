package com.paypal.oslo.feature.qrc.ui.scanner;

/* loaded from: classes14.dex */
public final class ScannerViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getOutputFormats;

    private ScannerViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher> provider4, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider5, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner> provider6, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider> provider7) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getOutputFormats = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher> provider4, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider5, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner> provider6, dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider> provider7) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel newInstance(com.paypal.oslo.feature.qrc.ui.scanner.ScannerReducer scannerReducer, com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase scanQrCodeUseCase, com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase, com.paypal.oslo.feature.qrc.domain.scanner.LocationMatcher locationMatcher, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.qrc.domain.scanner.ImageQrScanner imageQrScanner, com.paypal.oslo.feature.qrc.domain.scanner.CameraProvider cameraProvider) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel(scannerReducer, scanQrCodeUseCase, pollQrcSessionUseCase, locationMatcher, userStore, imageQrScanner, cameraProvider);
    }
}
