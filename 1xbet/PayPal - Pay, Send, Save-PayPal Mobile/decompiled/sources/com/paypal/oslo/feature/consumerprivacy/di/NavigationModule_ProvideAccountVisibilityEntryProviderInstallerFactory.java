package com.paypal.oslo.feature.consumerprivacy.di;

/* loaded from: classes12.dex */
public final class NavigationModule_ProvideAccountVisibilityEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideAccountVisibilityEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideAccountVisibilityEntryProviderInstaller(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.di.NavigationModule_ProvideAccountVisibilityEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.di.NavigationModule_ProvideAccountVisibilityEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAccountVisibilityEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.consumerprivacy.di.NavigationModule.INSTANCE.provideAccountVisibilityEntryProviderInstaller(appNavigator));
    }
}
