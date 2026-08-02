package com.paypal.oslo.feature.taxfiling.provider;

/* loaded from: classes15.dex */
public final class TaxFillingConfigurationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Manager> Camera2StreamConfigurationMap;

    private TaxFillingConfigurationProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Manager> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Manager> provider) {
        return new com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider newInstance(com.paypal.oslo.feature.taxfiling.domain.remoteconfig.TaxFillingConfig.Manager manager) {
        return new com.paypal.oslo.feature.taxfiling.provider.TaxFillingConfigurationProvider(manager);
    }
}
