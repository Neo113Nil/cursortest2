package com.paypal.oslo.feature.subscriptions.di;

/* loaded from: classes15.dex */
public final class ConfiguredBottomSheetConfigProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private ConfiguredBottomSheetConfigProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider(appNavigator);
    }
}
