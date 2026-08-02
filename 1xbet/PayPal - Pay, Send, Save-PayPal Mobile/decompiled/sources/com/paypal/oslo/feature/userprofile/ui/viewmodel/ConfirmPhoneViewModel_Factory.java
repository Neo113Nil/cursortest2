package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class ConfirmPhoneViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.VerifyPhoneUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.InitiatePhoneConfirmationUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private ConfirmPhoneViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.InitiatePhoneConfirmationUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.VerifyPhoneUseCase> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.InitiatePhoneConfirmationUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.VerifyPhoneUseCase> provider4) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel newInstance(android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.InitiatePhoneConfirmationUseCase initiatePhoneConfirmationUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiatePhoneConfirmationUseCase reinitiatePhoneConfirmationUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.VerifyPhoneUseCase verifyPhoneUseCase) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel(context, initiatePhoneConfirmationUseCase, reinitiatePhoneConfirmationUseCase, verifyPhoneUseCase);
    }
}
