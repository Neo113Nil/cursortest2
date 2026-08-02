package com.paypal.oslo.feature.identity.emailconfirmation.ui;

/* loaded from: classes12.dex */
public final class EmailConfirmationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase> getHighSpeedVideoSizes;

    private EmailConfirmationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationReducer> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationReducer> provider2) {
        return new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel newInstance(com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase confirmEmailUseCase, com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationReducer emailConfirmationReducer) {
        return new com.paypal.oslo.feature.identity.emailconfirmation.ui.EmailConfirmationViewModel(confirmEmailUseCase, emailConfirmationReducer);
    }
}
