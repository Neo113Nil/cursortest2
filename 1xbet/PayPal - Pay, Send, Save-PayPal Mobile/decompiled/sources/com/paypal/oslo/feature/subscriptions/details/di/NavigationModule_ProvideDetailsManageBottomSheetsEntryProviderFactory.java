package com.paypal.oslo.feature.subscriptions.details.di;

/* loaded from: classes15.dex */
public final class NavigationModule_ProvideDetailsManageBottomSheetsEntryProviderFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> getHighSpeedVideoFpsRanges;

    private NavigationModule_ProvideDetailsManageBottomSheetsEntryProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideDetailsManageBottomSheetsEntryProvider(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.subscriptions.details.di.NavigationModule_ProvideDetailsManageBottomSheetsEntryProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider> provider2) {
        return new com.paypal.oslo.feature.subscriptions.details.di.NavigationModule_ProvideDetailsManageBottomSheetsEntryProviderFactory(provider, provider2);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDetailsManageBottomSheetsEntryProvider(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.INSTANCE.provideDetailsManageBottomSheetsEntryProvider(appNavigator, analyticsScreenProvider));
    }
}
