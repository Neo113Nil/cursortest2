package com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel;

/* loaded from: classes15.dex */
public final class FaceTecLivenessCaptureViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.reducer.FaceTecLivenessCaptureReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository> getHighSpeedVideoSizes;

    private FaceTecLivenessCaptureViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.reducer.FaceTecLivenessCaptureReducer> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.reducer.FaceTecLivenessCaptureReducer> provider3) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel newInstance(com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase startLivenessCheckUseCase, com.paypal.oslo.feature.verificationcapture.domain.repository.LivenessRepository livenessRepository, com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.reducer.FaceTecLivenessCaptureReducer faceTecLivenessCaptureReducer) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.facetecliveness.viewmodel.FaceTecLivenessCaptureViewModel(startLivenessCheckUseCase, livenessRepository, faceTecLivenessCaptureReducer);
    }
}
