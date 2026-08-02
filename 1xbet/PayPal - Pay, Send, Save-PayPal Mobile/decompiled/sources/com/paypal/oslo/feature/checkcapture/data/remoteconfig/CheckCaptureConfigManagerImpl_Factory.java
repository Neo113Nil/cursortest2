package com.paypal.oslo.feature.checkcapture.data.remoteconfig;

/* loaded from: classes11.dex */
public final class CheckCaptureConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.data.remoteconfig.CheckCaptureConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> Camera2StreamConfigurationMap;

    private CheckCaptureConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.data.remoteconfig.CheckCaptureConfigManagerImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.checkcapture.data.remoteconfig.CheckCaptureConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider) {
        return new com.paypal.oslo.feature.checkcapture.data.remoteconfig.CheckCaptureConfigManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.checkcapture.data.remoteconfig.CheckCaptureConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.checkcapture.data.remoteconfig.CheckCaptureConfigManagerImpl(dynamicConfiguration);
    }
}
