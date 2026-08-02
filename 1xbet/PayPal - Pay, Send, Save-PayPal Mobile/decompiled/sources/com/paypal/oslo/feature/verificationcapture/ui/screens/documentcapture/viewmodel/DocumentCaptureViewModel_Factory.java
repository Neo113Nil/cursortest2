package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel;

/* loaded from: classes15.dex */
public final class DocumentCaptureViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.SetScanViewUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase> getOutputMinFrameDuration;

    private DocumentCaptureViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.SetScanViewUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getOutputMinFrameDuration = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.SetScanViewUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer> provider6) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel newInstance(com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase startDocumentCaptureUseCase, com.paypal.oslo.feature.verificationcapture.domain.usecase.StopDocumentCaptureUseCase stopDocumentCaptureUseCase, com.paypal.oslo.feature.verificationcapture.domain.usecase.SetScanViewUseCase setScanViewUseCase, com.paypal.oslo.feature.verificationcapture.domain.usecase.GetCaptureResultUseCase getCaptureResultUseCase, com.paypal.oslo.feature.verificationcapture.domain.usecase.SetFlashEnabledUseCase setFlashEnabledUseCase, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.reducer.DocumentCaptureReducer documentCaptureReducer) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.viewmodel.DocumentCaptureViewModel(startDocumentCaptureUseCase, stopDocumentCaptureUseCase, setScanViewUseCase, getCaptureResultUseCase, setFlashEnabledUseCase, documentCaptureReducer);
    }
}
