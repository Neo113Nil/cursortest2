package com.paypal.oslo.feature.subscriptions.bulkfi.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideBulkUpdateFiEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideBulkUpdateFiEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideBulkUpdateFiEntryProvider(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule_ProvideBulkUpdateFiEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider3) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule_ProvideBulkUpdateFiEntryProviderFactory(provider, provider2, provider3);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBulkUpdateFiEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.INSTANCE.provideBulkUpdateFiEntryProvider(appNavigator, bulkUpdateFiNavigationCache, analyticsScreenProvider));
    }
}
