package com.paypal.oslo.feature.subscriptions.details.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideAboutAgreementDetailsEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> getHighSpeedVideoSizes;

    private NavigationModule_ProvideAboutAgreementDetailsEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideAboutAgreementDetailsEntryProvider(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.subscriptions.details.di.NavigationModule_ProvideAboutAgreementDetailsEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider2) {
        return new com.paypal.oslo.feature.subscriptions.details.di.NavigationModule_ProvideAboutAgreementDetailsEntryProviderFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAboutAgreementDetailsEntryProvider(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.INSTANCE.provideAboutAgreementDetailsEntryProvider(configuredBottomSheetConfigProvider, analyticsScreenProvider));
    }
}
