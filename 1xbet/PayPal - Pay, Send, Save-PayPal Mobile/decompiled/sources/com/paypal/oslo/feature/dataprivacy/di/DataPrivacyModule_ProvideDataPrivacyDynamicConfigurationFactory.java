package com.paypal.oslo.feature.dataprivacy.di;

/* loaded from: classes12.dex */
public final class DataPrivacyModule_ProvideDataPrivacyDynamicConfigurationFactory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRangesFor;

    private DataPrivacyModule_ProvideDataPrivacyDynamicConfigurationFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration get() {
        return provideDataPrivacyDynamicConfiguration(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.di.DataPrivacyModule_ProvideDataPrivacyDynamicConfigurationFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.dataprivacy.di.DataPrivacyModule_ProvideDataPrivacyDynamicConfigurationFactory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration provideDataPrivacyDynamicConfiguration(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return (com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.dataprivacy.di.DataPrivacyModule.INSTANCE.provideDataPrivacyDynamicConfiguration(dynamicConfiguration));
    }
}
