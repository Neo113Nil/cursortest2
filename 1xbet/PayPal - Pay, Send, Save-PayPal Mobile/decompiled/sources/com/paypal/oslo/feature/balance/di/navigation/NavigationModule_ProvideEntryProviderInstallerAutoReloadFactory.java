package com.paypal.oslo.feature.balance.di.navigation;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideEntryProviderInstallerAutoReloadFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideEntryProviderInstallerAutoReloadFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstallerAutoReload(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.balance.di.navigation.NavigationModule_ProvideEntryProviderInstallerAutoReloadFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider> provider2) {
        return new com.paypal.oslo.feature.balance.di.navigation.NavigationModule_ProvideEntryProviderInstallerAutoReloadFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstallerAutoReload(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.autoReload.AutoReloadConfigProvider autoReloadConfigProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.navigation.NavigationModule.INSTANCE.provideEntryProviderInstallerAutoReload(appNavigator, autoReloadConfigProvider));
    }
}
