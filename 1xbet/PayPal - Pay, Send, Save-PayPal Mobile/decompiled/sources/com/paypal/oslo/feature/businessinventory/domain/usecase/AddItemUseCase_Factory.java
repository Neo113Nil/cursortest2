package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class AddItemUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> getHighResolutionOutputSizeshNQ4ISI;

    private AddItemUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider2) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository, com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase(businessInventoryItemsRepository, businessInventoryUpdatesEventBus);
    }
}
