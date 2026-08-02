package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class GetStatementAvailabilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator> getHighSpeedVideoSizes;

    private GetStatementAvailabilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase newInstance(com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator allTransactionsStatementCalculator) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase(allTransactionsStatementCalculator);
    }
}
