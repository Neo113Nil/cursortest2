package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutModule_ProvideInAppCheckoutWebViewCoordinatorFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> getHighSpeedVideoSizes;

    private InAppCheckoutModule_ProvideInAppCheckoutWebViewCoordinatorFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator get() {
        return provideInAppCheckoutWebViewCoordinator(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideInAppCheckoutWebViewCoordinatorFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger> provider2) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideInAppCheckoutWebViewCoordinatorFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator provideInAppCheckoutWebViewCoordinator(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger) {
        return (com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule.INSTANCE.provideInAppCheckoutWebViewCoordinator(appNavigator, checkoutLogger));
    }
}
