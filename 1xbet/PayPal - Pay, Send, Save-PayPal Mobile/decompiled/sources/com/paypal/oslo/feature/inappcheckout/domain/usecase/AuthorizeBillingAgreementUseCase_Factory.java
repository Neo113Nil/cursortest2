package com.paypal.oslo.feature.inappcheckout.domain.usecase;

/* loaded from: classes13.dex */
public final class AuthorizeBillingAgreementUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository> Camera2StreamConfigurationMap;

    private AuthorizeBillingAgreementUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository> provider) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.repository.AuthorizeBillingAgreementRepository authorizeBillingAgreementRepository) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.AuthorizeBillingAgreementUseCase(authorizeBillingAgreementRepository);
    }
}
