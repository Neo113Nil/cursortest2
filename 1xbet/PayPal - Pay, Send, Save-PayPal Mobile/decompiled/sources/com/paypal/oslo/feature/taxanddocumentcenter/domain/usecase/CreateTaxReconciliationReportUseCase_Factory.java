package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class CreateTaxReconciliationReportUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReconciliationReportRepository> Camera2StreamConfigurationMap;

    private CreateTaxReconciliationReportUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReconciliationReportRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReconciliationReportRepository> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReconciliationReportRepository taxReconciliationReportRepository) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.CreateTaxReconciliationReportUseCase(taxReconciliationReportRepository);
    }
}
