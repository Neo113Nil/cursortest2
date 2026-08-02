package com.paypal.oslo.feature.identity.devicebinding;

/* loaded from: classes12.dex */
public final class BiometricBindSchemeProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private BiometricBindSchemeProvider_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage> provider2) {
        return new com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider newInstance(android.content.Context context, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage) {
        return new com.paypal.oslo.feature.identity.devicebinding.BiometricBindSchemeProvider(context, deviceBindingTokenStorage);
    }
}
