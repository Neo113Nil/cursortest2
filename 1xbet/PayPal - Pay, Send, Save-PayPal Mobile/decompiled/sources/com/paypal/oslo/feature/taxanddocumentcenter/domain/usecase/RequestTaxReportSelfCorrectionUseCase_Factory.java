package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class RequestTaxReportSelfCorrectionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportSelfCorrectionRepository> getHighSpeedVideoSizes;

    private RequestTaxReportSelfCorrectionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportSelfCorrectionRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportSelfCorrectionRepository> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxReportSelfCorrectionRepository taxReportSelfCorrectionRepository) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestTaxReportSelfCorrectionUseCase(taxReportSelfCorrectionRepository);
    }
}
