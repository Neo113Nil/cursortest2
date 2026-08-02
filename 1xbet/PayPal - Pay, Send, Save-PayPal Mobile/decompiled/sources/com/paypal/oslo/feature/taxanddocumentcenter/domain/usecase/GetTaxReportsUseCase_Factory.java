package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class GetTaxReportsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository> Camera2StreamConfigurationMap;

    private GetTaxReportsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportsRepository taxReportsRepository) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxReportsUseCase(taxReportsRepository);
    }
}
