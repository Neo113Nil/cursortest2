package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvideEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> getOutputMinFrameDuration;

    private NavigationModule_ProvideEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getOutputMinFrameDuration = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideEntryProviderInstaller(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.NavigationModule_ProvideEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider3, dagger.internal.Provider<com.paypal.oslo.core.navigation.result.NavResultManager> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer> provider5, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker> provider6) {
        return new com.paypal.oslo.feature.inappcheckout.di.NavigationModule_ProvideEntryProviderInstallerFactory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker nativeInAppWebViewAnalyticsTracker) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.NavigationModule.INSTANCE.provideEntryProviderInstaller(inAppCheckoutCoordinator, inAppCheckoutWebViewCoordinator, checkoutLogger, navResultManager, analyticsTracer, nativeInAppWebViewAnalyticsTracker));
    }
}
