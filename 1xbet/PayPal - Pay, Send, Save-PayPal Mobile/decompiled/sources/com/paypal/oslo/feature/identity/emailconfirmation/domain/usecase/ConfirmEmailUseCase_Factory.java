package com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase;

/* loaded from: classes12.dex */
public final class ConfirmEmailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.domain.repository.EmailConfirmationRepository> getHighSpeedVideoFpsRangesFor;

    private ConfirmEmailUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.domain.repository.EmailConfirmationRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.emailconfirmation.domain.repository.EmailConfirmationRepository> provider) {
        return new com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase newInstance(com.paypal.oslo.feature.identity.emailconfirmation.domain.repository.EmailConfirmationRepository emailConfirmationRepository) {
        return new com.paypal.oslo.feature.identity.emailconfirmation.domain.usecase.ConfirmEmailUseCase(emailConfirmationRepository);
    }
}
