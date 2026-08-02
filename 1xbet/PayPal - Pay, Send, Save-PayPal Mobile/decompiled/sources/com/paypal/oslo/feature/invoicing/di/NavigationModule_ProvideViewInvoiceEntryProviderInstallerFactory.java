package com.paypal.oslo.feature.invoicing.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvideViewInvoiceEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideViewInvoiceEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2, dagger.internal.Provider<com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideViewInvoiceEntryProviderInstaller(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.invoicing.di.NavigationModule_ProvideViewInvoiceEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider2, dagger.internal.Provider<com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder> provider3) {
        return new com.paypal.oslo.feature.invoicing.di.NavigationModule_ProvideViewInvoiceEntryProviderInstallerFactory(provider, provider2, provider3);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideViewInvoiceEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.invoicing.domain.InvoiceUrlBuilder invoiceUrlBuilder) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.invoicing.di.NavigationModule.INSTANCE.provideViewInvoiceEntryProviderInstaller(appNavigator, featureGate, invoiceUrlBuilder));
    }
}
