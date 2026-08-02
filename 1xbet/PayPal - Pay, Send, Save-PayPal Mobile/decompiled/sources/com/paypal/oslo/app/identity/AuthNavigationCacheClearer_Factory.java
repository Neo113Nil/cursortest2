package com.paypal.oslo.app.identity;

/* loaded from: classes10.dex */
public final class AuthNavigationCacheClearer_Factory implements dagger.internal.Factory<com.paypal.oslo.app.identity.AuthNavigationCacheClearer> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.session.NetworkCacheClearer> getHighSpeedVideoSizes;

    private AuthNavigationCacheClearer_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.session.NetworkCacheClearer> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.identity.AuthNavigationCacheClearer get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.identity.AuthNavigationCacheClearer_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.session.NetworkCacheClearer> provider2) {
        return new com.paypal.oslo.app.identity.AuthNavigationCacheClearer_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.identity.AuthNavigationCacheClearer newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.session.NetworkCacheClearer networkCacheClearer) {
        return new com.paypal.oslo.app.identity.AuthNavigationCacheClearer(appNavigator, networkCacheClearer);
    }
}
