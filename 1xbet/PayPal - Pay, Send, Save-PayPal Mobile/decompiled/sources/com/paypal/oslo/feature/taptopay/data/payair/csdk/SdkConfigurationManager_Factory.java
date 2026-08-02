package com.paypal.oslo.feature.taptopay.data.payair.csdk;

/* loaded from: classes15.dex */
public final class SdkConfigurationManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager> {
    private final dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> getHighResolutionOutputSizeshNQ4ISI;

    private SdkConfigurationManager_Factory(dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager_Factory create(dagger.internal.Provider<com.payair.logic.managers.ConfigurationManager> provider) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager newInstance(com.payair.logic.managers.ConfigurationManager configurationManager) {
        return new com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkConfigurationManager(configurationManager);
    }
}
