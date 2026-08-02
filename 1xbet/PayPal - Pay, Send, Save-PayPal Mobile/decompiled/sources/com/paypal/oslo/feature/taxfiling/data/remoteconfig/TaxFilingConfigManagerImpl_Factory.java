package com.paypal.oslo.feature.taxfiling.data.remoteconfig;

/* loaded from: classes15.dex */
public final class TaxFilingConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxfiling.data.remoteconfig.TaxFilingConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> Camera2StreamConfigurationMap;

    private TaxFilingConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxfiling.data.remoteconfig.TaxFilingConfigManagerImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxfiling.data.remoteconfig.TaxFilingConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.taxfiling.data.remoteconfig.TaxFilingConfigManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxfiling.data.remoteconfig.TaxFilingConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.taxfiling.data.remoteconfig.TaxFilingConfigManagerImpl(dynamicConfiguration);
    }
}
