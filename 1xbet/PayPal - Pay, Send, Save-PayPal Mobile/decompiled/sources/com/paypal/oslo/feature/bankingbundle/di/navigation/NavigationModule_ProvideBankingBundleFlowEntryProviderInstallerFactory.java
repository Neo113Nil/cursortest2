package com.paypal.oslo.feature.bankingbundle.di.navigation;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideBankingBundleFlowEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideBankingBundleFlowEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideBankingBundleFlowEntryProviderInstaller(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideBankingBundleFlowEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager> provider3) {
        return new com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideBankingBundleFlowEntryProviderInstallerFactory(provider, provider2, provider3);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBankingBundleFlowEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator, com.paypal.oslo.feature.bankingbundle.manager.BankingBundleFeatureManager bankingBundleFeatureManager) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.INSTANCE.provideBankingBundleFlowEntryProviderInstaller(appNavigator, bankingBundleNavigator, bankingBundleFeatureManager));
    }
}
