package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class LinkExternalBankAccountsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> Camera2StreamConfigurationMap;

    private LinkExternalBankAccountsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.ExternalBankAccessRepository externalBankAccessRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.LinkExternalBankAccountsUseCase(externalBankAccessRepository);
    }
}
