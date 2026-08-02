package com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase;

/* loaded from: classes15.dex */
public final class GetLinkedBusinessesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository> getHighSpeedVideoFpsRangesFor;

    private GetLinkedBusinessesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager> provider2) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase newInstance(com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository businessesHubRepository, com.paypal.oslo.feature.subscriptions.shared.config.SubscriptionsFeatureManager subscriptionsFeatureManager) {
        return new com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase(businessesHubRepository, subscriptionsFeatureManager);
    }
}
