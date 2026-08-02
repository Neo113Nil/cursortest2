package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class GetYearDropdownDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.YearDropdownRepository> getHighSpeedVideoFpsRanges;

    private GetYearDropdownDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.YearDropdownRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.YearDropdownRepository> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.repository.YearDropdownRepository yearDropdownRepository) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetYearDropdownDataUseCase(yearDropdownRepository);
    }
}
