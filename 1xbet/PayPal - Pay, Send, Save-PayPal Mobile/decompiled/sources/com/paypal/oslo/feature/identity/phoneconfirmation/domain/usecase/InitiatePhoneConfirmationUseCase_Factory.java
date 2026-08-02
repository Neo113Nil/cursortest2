package com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase;

/* loaded from: classes13.dex */
public final class InitiatePhoneConfirmationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationInitiationRepository> getHighSpeedVideoFpsRanges;

    private InitiatePhoneConfirmationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationInitiationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationInitiationRepository> provider) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase newInstance(com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationInitiationRepository phoneConfirmationInitiationRepository) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase(phoneConfirmationInitiationRepository);
    }
}
