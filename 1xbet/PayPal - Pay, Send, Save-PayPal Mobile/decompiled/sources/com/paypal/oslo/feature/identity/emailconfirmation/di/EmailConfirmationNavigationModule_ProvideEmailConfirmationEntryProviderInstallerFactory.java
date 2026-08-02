package com.paypal.oslo.feature.identity.emailconfirmation.di;

/* loaded from: classes12.dex */
public final class EmailConfirmationNavigationModule_ProvideEmailConfirmationEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;

    private EmailConfirmationNavigationModule_ProvideEmailConfirmationEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEmailConfirmationEntryProviderInstaller(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule_ProvideEmailConfirmationEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule_ProvideEmailConfirmationEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEmailConfirmationEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.emailconfirmation.di.EmailConfirmationNavigationModule.INSTANCE.provideEmailConfirmationEntryProviderInstaller(appNavigator));
    }
}
