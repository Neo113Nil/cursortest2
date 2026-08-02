package com.paypal.oslo.feature.balance.ui.autoReload;

/* loaded from: classes11.dex */
public final class AutoReloadConfigProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private AutoReloadConfigProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider(appNavigator);
    }
}
