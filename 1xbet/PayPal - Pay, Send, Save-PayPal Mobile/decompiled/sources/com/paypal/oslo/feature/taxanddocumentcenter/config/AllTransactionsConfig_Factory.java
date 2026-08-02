package com.paypal.oslo.feature.taxanddocumentcenter.config;

/* loaded from: classes15.dex */
public final class AllTransactionsConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRanges;

    private AllTransactionsConfig_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.config.AllTransactionsConfig(dynamicConfiguration);
    }
}
