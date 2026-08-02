package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideSkipScreenLockConfirmationEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private NavigationModule_ProvideSkipScreenLockConfirmationEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideSkipScreenLockConfirmationEntryProviderInstaller(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.NavigationModule_ProvideSkipScreenLockConfirmationEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.taptopay.di.NavigationModule_ProvideSkipScreenLockConfirmationEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSkipScreenLockConfirmationEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.NavigationModule.INSTANCE.provideSkipScreenLockConfirmationEntryProviderInstaller(appNavigator));
    }
}
