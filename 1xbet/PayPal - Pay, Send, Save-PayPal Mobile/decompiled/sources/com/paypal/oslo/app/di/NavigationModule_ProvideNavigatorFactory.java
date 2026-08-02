package com.paypal.oslo.app.di;

/* loaded from: classes4.dex */
public final class NavigationModule_ProvideNavigatorFactory implements dagger.internal.Factory<com.paypal.oslo.core.navigation.AppNavigator> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideNavigatorFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.navigation.AppNavigator get() {
        return provideNavigator(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.di.NavigationModule_ProvideNavigatorFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider) {
        return new com.paypal.oslo.app.di.NavigationModule_ProvideNavigatorFactory(provider);
    }

    public static com.paypal.oslo.core.navigation.AppNavigator provideNavigator(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager) {
        return (com.paypal.oslo.core.navigation.AppNavigator) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.NavigationModule.INSTANCE.provideNavigator(navResultManager));
    }
}
