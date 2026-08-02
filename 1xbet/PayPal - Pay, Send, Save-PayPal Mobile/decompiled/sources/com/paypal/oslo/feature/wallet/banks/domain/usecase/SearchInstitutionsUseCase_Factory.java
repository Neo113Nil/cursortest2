package com.paypal.oslo.feature.wallet.banks.domain.usecase;

/* loaded from: classes15.dex */
public final class SearchInstitutionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository> Camera2StreamConfigurationMap;

    private SearchInstitutionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository> provider) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase newInstance(com.paypal.oslo.feature.wallet.banks.domain.repository.OpenBankingInstitutionsRepository openBankingInstitutionsRepository) {
        return new com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase(openBankingInstitutionsRepository);
    }
}
