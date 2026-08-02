package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class InitiateEmailConfirmationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> getHighSpeedVideoSizes;

    private InitiateEmailConfirmationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository emailRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.InitiateEmailConfirmationUseCase(emailRepository);
    }
}
