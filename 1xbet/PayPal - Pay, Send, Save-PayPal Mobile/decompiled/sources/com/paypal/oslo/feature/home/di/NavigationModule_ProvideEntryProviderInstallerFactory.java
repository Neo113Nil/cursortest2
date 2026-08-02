package com.paypal.oslo.feature.home.di;

/* loaded from: classes12.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> getHighSpeedVideoSizes;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.home.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider3) {
        return new com.paypal.oslo.feature.home.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2, provider3);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.ads.api.provider.AdWidgetProvider adWidgetProvider, com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.home.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(appNavigator, adWidgetProvider, homeConfigManager));
    }
}
