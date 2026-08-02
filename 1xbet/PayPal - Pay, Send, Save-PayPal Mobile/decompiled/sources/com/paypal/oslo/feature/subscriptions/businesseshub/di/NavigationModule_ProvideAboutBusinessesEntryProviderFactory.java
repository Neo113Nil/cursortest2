package com.paypal.oslo.feature.subscriptions.businesseshub.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideAboutBusinessesEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideAboutBusinessesEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideAboutBusinessesEntryProvider(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule_ProvideAboutBusinessesEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> provider2) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule_ProvideAboutBusinessesEntryProviderFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAboutBusinessesEntryProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.INSTANCE.provideAboutBusinessesEntryProvider(analyticsScreenProvider, configuredBottomSheetConfigProvider));
    }
}
