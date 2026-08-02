package com.paypal.oslo.app.navigation;

/* loaded from: classes10.dex */
public final class NavigationConfigProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.app.navigation.NavigationConfigProviderImpl> {
    private final dagger.internal.Provider<java.util.Optional<com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider>> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationFlowProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private NavigationConfigProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationFlowProvider> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider3, dagger.internal.Provider<java.util.Optional<com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider>> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.navigation.NavigationConfigProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.navigation.NavigationConfigProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider, dagger.internal.Provider<com.paypal.oslo.app.navigation.NavigationFlowProvider> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider3, dagger.internal.Provider<java.util.Optional<com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider>> provider4) {
        return new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.app.navigation.NavigationConfigProviderImpl newInstance(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.app.navigation.NavigationFlowProvider navigationFlowProvider, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, java.util.Optional<com.paypal.oslo.core.navigation.ui.NavigationBadgeProvider> optional) {
        return new com.paypal.oslo.app.navigation.NavigationConfigProviderImpl(userStore, navigationFlowProvider, featureGate, optional);
    }
}
