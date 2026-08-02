package com.paypal.oslo.feature.revolvingcreditacquisition.di;

/* loaded from: classes14.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2, provider3);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(appNavigator, nativeDestinationResolver, webViewDestinationResolver));
    }
}
