package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class GetEmailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> getHighSpeedVideoSizes;

    private GetEmailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository emailRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.GetEmailsUseCase(emailRepository);
    }
}
