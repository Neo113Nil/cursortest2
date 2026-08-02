package com.paypal.oslo.feature.dataprivacy.domain.usecase;

/* loaded from: classes12.dex */
public final class GetLinkedAccountsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetLinkedAccountsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository> provider) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase newInstance(com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository userAccountRepository) {
        return new com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase(userAccountRepository);
    }
}
