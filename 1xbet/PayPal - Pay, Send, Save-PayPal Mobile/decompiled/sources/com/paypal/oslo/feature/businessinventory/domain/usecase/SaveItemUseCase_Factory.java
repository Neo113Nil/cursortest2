package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class SaveItemUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> getHighResolutionOutputSizeshNQ4ISI;

    private SaveItemUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider2) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository, com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase(businessInventoryItemsRepository, businessInventoryUpdatesEventBus);
    }
}
