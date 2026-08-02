package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel;

/* loaded from: classes12.dex */
public final class StepupOtpVerificationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> getOutputFormats;

    private StepupOtpVerificationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer> provider5, dagger.internal.Provider<androidx.view.SavedStateHandle> provider6) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getOutputFormats = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getOutputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer> provider5, dagger.internal.Provider<androidx.view.SavedStateHandle> provider6) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel newInstance(com.paypal.oslo.feature.identity.shared.domain.provider.StringProvider stringProvider, com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase notifyChallengeUseCase, com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.StepupOtpContentProvider stepupOtpContentProvider, com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpReducer stepupOtpReducer, androidx.view.SavedStateHandle savedStateHandle) {
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.viewmodel.StepupOtpVerificationViewModel(stringProvider, notifyChallengeUseCase, validateChallengeUseCase, stepupOtpContentProvider, stepupOtpReducer, savedStateHandle);
    }
}
