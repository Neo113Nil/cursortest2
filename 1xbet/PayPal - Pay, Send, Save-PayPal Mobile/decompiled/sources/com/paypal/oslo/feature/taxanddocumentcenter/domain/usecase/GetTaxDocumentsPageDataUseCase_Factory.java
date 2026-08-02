package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class GetTaxDocumentsPageDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxDocumentsPageRepository> getHighSpeedVideoFpsRangesFor;

    private GetTaxDocumentsPageDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxDocumentsPageRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxDocumentsPageRepository> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.TaxDocumentsPageRepository taxDocumentsPageRepository) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetTaxDocumentsPageDataUseCase(taxDocumentsPageRepository);
    }
}
