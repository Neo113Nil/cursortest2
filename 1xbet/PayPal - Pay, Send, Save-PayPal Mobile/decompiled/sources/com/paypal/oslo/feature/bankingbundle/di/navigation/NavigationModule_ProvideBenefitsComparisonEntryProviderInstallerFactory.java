package com.paypal.oslo.feature.bankingbundle.di.navigation;

/* loaded from: classes11.dex */
public final class NavigationModule_ProvideBenefitsComparisonEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideBenefitsComparisonEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideBenefitsComparisonEntryProviderInstaller(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideBenefitsComparisonEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator> provider2) {
        return new com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule_ProvideBenefitsComparisonEntryProviderInstallerFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBenefitsComparisonEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bankingbundle.ui.navigation.BankingBundleNavigator bankingBundleNavigator) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bankingbundle.di.navigation.NavigationModule.INSTANCE.provideBenefitsComparisonEntryProviderInstaller(appNavigator, bankingBundleNavigator));
    }
}
