package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvidePayModeRouterEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvidePayModeRouterEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return providePayModeRouterEntryProviderInstaller(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.NavigationModule_ProvidePayModeRouterEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher> provider2) {
        return new com.paypal.oslo.feature.taptopay.di.NavigationModule_ProvidePayModeRouterEntryProviderInstallerFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePayModeRouterEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher payModeLauncher) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.NavigationModule.INSTANCE.providePayModeRouterEntryProviderInstaller(appNavigator, payModeLauncher));
    }
}
