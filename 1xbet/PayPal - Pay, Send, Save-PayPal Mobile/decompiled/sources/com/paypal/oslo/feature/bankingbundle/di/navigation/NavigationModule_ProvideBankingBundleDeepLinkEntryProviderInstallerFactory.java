package com.paypal.oslo.feature.bankingbundle.di.navigation;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideBankingBundleDeepLinkEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvideBankingBundleDeepLinkEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideBankingBundleDeepLinkEntryProviderInstaller(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideBankingBundleDeepLinkEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager> provider3) {
        return new com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideBankingBundleDeepLinkEntryProviderInstallerFactory(provider, provider2, provider3);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBankingBundleDeepLinkEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.INSTANCE.provideBankingBundleDeepLinkEntryProviderInstaller(appNavigator, bankingBundleNavigator, bankingBundleFeatureManager));
    }
}
