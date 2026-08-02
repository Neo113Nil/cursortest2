package com.paypal.oslo.feature.subscriptions.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideUpdateFIBottomSheetsEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> getHighSpeedVideoFpsRangesFor;

    private NavigationModule_ProvideUpdateFIBottomSheetsEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider3, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideUpdateFIBottomSheetsEntryProvider(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.subscriptions.di.NavigationModule_ProvideUpdateFIBottomSheetsEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache> provider3, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider4) {
        return new com.paypal.oslo.feature.subscriptions.di.NavigationModule_ProvideUpdateFIBottomSheetsEntryProviderFactory(provider, provider2, provider3, provider4);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideUpdateFIBottomSheetsEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.di.NavigationModule.INSTANCE.provideUpdateFIBottomSheetsEntryProvider(appNavigator, configuredBottomSheetConfigProvider, bulkUpdateFiNavigationCache, analyticsScreenProvider));
    }
}
