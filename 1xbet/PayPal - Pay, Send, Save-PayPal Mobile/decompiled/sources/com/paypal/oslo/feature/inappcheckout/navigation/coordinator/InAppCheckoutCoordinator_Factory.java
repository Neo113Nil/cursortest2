package com.paypal.oslo.feature.inappcheckout.navigation.coordinator;

/* loaded from: classes13.dex */
public final class InAppCheckoutCoordinator_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;

    private InAppCheckoutCoordinator_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator_Factory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return new com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator(appNavigator);
    }
}
