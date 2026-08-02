package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

/* loaded from: classes13.dex */
public final class PhoneConfirmationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase> getHighSpeedVideoFpsRangesFor;

    private PhoneConfirmationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase> provider, dagger.internal.Provider<androidx.view.SavedStateHandle> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase> provider, dagger.internal.Provider<androidx.view.SavedStateHandle> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer> provider3) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel newInstance(com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase initiatePhoneConfirmationUseCase, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer phoneConfirmationReducer) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel(initiatePhoneConfirmationUseCase, savedStateHandle, phoneConfirmationReducer);
    }
}
