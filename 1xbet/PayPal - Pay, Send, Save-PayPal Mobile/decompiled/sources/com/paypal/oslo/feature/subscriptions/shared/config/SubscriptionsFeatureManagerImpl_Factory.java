package com.paypal.oslo.feature.subscriptions.shared.config;

/* loaded from: classes15.dex */
public final class SubscriptionsFeatureManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private SubscriptionsFeatureManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManagerImpl(featureGate);
    }
}
