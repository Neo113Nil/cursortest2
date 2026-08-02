package com.paypal.oslo.feature.bankingbundle.di.navigation;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideSuccessSheetEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private NavigationModule_ProvideSuccessSheetEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideSuccessSheetEntryProviderInstaller(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideSuccessSheetEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideSuccessSheetEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSuccessSheetEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.INSTANCE.provideSuccessSheetEntryProviderInstaller(appNavigator));
    }
}
