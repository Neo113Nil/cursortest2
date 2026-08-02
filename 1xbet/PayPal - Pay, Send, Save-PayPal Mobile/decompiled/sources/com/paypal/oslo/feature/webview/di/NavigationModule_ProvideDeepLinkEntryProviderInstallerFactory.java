package com.paypal.oslo.feature.webview.di;

/* loaded from: classes16.dex */
public final class NavigationModule_ProvideDeepLinkEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private NavigationModule_ProvideDeepLinkEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideDeepLinkEntryProviderInstaller(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.webview.di.NavigationModule_ProvideDeepLinkEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.webview.di.NavigationModule_ProvideDeepLinkEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDeepLinkEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.webview.di.NavigationModule.INSTANCE.provideDeepLinkEntryProviderInstaller(appNavigator));
    }
}
