package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class GetBusinessInventoryUpdatesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> getHighResolutionOutputSizeshNQ4ISI;

    private GetBusinessInventoryUpdatesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase(businessInventoryUpdatesEventBus);
    }
}
