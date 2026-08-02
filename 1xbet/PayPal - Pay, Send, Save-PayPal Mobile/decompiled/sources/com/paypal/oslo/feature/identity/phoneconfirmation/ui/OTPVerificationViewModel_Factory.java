package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

/* loaded from: classes13.dex */
public final class OTPVerificationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase> getHighSpeedVideoSizes;

    private OTPVerificationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase> provider2, dagger.internal.Provider<androidx.view.SavedStateHandle> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase> provider2, dagger.internal.Provider<androidx.view.SavedStateHandle> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer> provider4) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel newInstance(com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase completePhoneConfirmationUseCase, com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase initiatePhoneConfirmationUseCase, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.OTPVerificationReducer oTPVerificationReducer) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.OTPVerificationViewModel(completePhoneConfirmationUseCase, initiatePhoneConfirmationUseCase, savedStateHandle, oTPVerificationReducer);
    }
}
