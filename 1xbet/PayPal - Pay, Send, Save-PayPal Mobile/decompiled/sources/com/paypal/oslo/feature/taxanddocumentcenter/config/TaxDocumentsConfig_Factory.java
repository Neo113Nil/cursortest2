package com.paypal.oslo.feature.taxanddocumentcenter.config;

/* loaded from: classes15.dex */
public final class TaxDocumentsConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRanges;

    private TaxDocumentsConfig_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentsConfig(dynamicConfiguration);
    }
}
