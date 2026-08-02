package com.paypal.oslo.feature.subscriptions.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideSuccessModalNavigationHandlerFactory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvideSuccessModalNavigationHandlerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler get() {
        return provideSuccessModalNavigationHandler(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.subscriptions.di.NavigationModule_ProvideSuccessModalNavigationHandlerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.subscriptions.di.NavigationModule_ProvideSuccessModalNavigationHandlerFactory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler provideSuccessModalNavigationHandler(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (com.paypal.oslo.feature.subscriptions.shared.navigation.SuccessModalNavigationHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.di.NavigationModule.INSTANCE.provideSuccessModalNavigationHandler(appNavigator));
    }
}
