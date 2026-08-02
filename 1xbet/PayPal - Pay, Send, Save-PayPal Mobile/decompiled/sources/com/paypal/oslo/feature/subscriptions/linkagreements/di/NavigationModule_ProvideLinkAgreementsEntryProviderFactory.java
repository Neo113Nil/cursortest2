package com.paypal.oslo.feature.subscriptions.linkagreements.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideLinkAgreementsEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvideLinkAgreementsEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideLinkAgreementsEntryProvider(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule_ProvideLinkAgreementsEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider2) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule_ProvideLinkAgreementsEntryProviderFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideLinkAgreementsEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.INSTANCE.provideLinkAgreementsEntryProvider(appNavigator, analyticsScreenProvider));
    }
}
