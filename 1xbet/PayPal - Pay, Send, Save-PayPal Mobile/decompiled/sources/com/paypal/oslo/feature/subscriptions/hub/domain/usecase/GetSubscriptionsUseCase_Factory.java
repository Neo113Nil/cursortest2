package com.paypal.oslo.feature.subscriptions.hub.domain.usecase;

/* loaded from: classes15.dex */
public final class GetSubscriptionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager> getHighSpeedVideoSizes;

    private GetSubscriptionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager> provider2) {
        return new com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase newInstance(com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository subscriptionsHubRepository, com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager subscriptionsFeatureManager) {
        return new com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase(subscriptionsHubRepository, subscriptionsFeatureManager);
    }
}
