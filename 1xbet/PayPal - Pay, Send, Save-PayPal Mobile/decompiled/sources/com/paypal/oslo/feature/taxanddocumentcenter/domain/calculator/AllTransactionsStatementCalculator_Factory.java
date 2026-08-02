package com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator;

/* loaded from: classes15.dex */
public final class AllTransactionsStatementCalculator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private AllTransactionsStatementCalculator_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator newInstance(com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig allTransactionsConfig, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.calculator.AllTransactionsStatementCalculator(allTransactionsConfig, userStore);
    }
}
