package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class ConfirmEmailViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiateEmailConfirmationUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ConfirmEmailUseCase> getHighSpeedVideoSizes;

    private ConfirmEmailViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ConfirmEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiateEmailConfirmationUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ConfirmEmailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiateEmailConfirmationUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler> provider5) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel newInstance(android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.ConfirmEmailUseCase confirmEmailUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase initiateEmailConfirmationUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.ReinitiateEmailConfirmationUseCase reinitiateEmailConfirmationUseCase, com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorHandler emailErrorHandler) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmEmailViewModel(context, confirmEmailUseCase, initiateEmailConfirmationUseCase, reinitiateEmailConfirmationUseCase, emailErrorHandler);
    }
}
