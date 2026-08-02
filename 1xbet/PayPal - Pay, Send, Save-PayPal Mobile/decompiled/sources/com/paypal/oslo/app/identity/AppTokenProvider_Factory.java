package com.paypal.oslo.app.identity;

/* loaded from: classes10.dex */
public final class AppTokenProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.identity.AppTokenProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityTokenProvider> getHighSpeedVideoSizes;

    private AppTokenProvider_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityTokenProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.identity.AppTokenProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.identity.AppTokenProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentityTokenProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2) {
        return new com.paypal.oslo.app.identity.AppTokenProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.identity.AppTokenProvider newInstance(com.paypal.oslo.feature.identity.api.IdentityTokenProvider identityTokenProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.app.identity.AppTokenProvider(identityTokenProvider, appNavigator);
    }
}
