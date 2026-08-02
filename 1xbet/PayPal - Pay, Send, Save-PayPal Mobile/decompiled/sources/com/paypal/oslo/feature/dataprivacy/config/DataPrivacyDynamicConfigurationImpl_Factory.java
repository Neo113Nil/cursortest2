package com.paypal.oslo.feature.dataprivacy.config;

/* loaded from: classes12.dex */
public final class DataPrivacyDynamicConfigurationImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfigurationImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> Camera2StreamConfigurationMap;

    private DataPrivacyDynamicConfigurationImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfigurationImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfigurationImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfigurationImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfigurationImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfigurationImpl(dynamicConfiguration);
    }
}
