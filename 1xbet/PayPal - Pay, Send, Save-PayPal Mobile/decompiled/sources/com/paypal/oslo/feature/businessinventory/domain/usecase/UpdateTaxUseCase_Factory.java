package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class UpdateTaxUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> getHighSpeedVideoSizes;

    private UpdateTaxUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider2) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository, com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase(businessInventoryTaxesRepository, businessInventoryUpdatesEventBus);
    }
}
