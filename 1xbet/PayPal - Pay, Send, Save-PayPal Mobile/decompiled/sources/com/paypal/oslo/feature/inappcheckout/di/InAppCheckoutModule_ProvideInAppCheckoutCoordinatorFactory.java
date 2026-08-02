package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutModule_ProvideInAppCheckoutCoordinatorFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;

    private InAppCheckoutModule_ProvideInAppCheckoutCoordinatorFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator get() {
        return provideInAppCheckoutCoordinator(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideInAppCheckoutCoordinatorFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_ProvideInAppCheckoutCoordinatorFactory(provider);
    }

    public static com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator provideInAppCheckoutCoordinator(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        return (com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule.INSTANCE.provideInAppCheckoutCoordinator(appNavigator));
    }
}
