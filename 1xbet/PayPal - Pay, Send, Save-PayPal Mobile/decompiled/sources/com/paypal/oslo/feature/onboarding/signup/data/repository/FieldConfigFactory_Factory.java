package com.paypal.oslo.feature.onboarding.signup.data.repository;

/* loaded from: classes13.dex */
public final class FieldConfigFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> Camera2StreamConfigurationMap;

    private FieldConfigFactory_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory_Factory(provider);
    }

    public static com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory(dynamicConfiguration);
    }
}
