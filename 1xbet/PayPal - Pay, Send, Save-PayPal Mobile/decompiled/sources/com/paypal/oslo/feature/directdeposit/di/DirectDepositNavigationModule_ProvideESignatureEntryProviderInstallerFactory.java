package com.paypal.oslo.feature.directdeposit.di;

/* loaded from: classes12.dex */
public final class DirectDepositNavigationModule_ProvideESignatureEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizes;

    private DirectDepositNavigationModule_ProvideESignatureEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideESignatureEntryProviderInstaller(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule_ProvideESignatureEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule_ProvideESignatureEntryProviderInstallerFactory(provider);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideESignatureEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.INSTANCE.provideESignatureEntryProviderInstaller(appNavigator));
    }
}
