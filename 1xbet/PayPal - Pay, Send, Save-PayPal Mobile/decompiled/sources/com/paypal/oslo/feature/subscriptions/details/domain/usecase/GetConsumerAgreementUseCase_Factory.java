package com.paypal.oslo.feature.subscriptions.details.domain.usecase;

/* loaded from: classes15.dex */
public final class GetConsumerAgreementUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository> getHighSpeedVideoSizes;

    private GetConsumerAgreementUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository> provider) {
        return new com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase newInstance(com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository subscriptionDetailsRepository) {
        return new com.paypal.oslo.feature.subscriptions.details.domain.usecase.GetConsumerAgreementUseCase(subscriptionDetailsRepository);
    }
}
