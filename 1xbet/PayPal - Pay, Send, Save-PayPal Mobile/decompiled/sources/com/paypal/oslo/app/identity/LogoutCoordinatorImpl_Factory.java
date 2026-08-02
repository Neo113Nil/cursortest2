package com.paypal.oslo.app.identity;

/* loaded from: classes10.dex */
public final class LogoutCoordinatorImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.app.identity.LogoutCoordinatorImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> getHighSpeedVideoSizes;

    private LogoutCoordinatorImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.identity.LogoutCoordinatorImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.identity.LogoutCoordinatorImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.api.IdentitySession> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2) {
        return new com.paypal.oslo.app.identity.LogoutCoordinatorImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.identity.LogoutCoordinatorImpl newInstance(com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.app.identity.LogoutCoordinatorImpl(identitySession, appNavigator);
    }
}
