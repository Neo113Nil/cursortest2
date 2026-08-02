package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(appNavigator, iActivityWidgetProvider));
    }
}
