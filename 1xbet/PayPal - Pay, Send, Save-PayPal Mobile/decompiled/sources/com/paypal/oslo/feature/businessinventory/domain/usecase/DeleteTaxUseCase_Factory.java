package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class DeleteTaxUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> getHighSpeedVideoSizes;

    private DeleteTaxUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus> provider2) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository, com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase(businessInventoryTaxesRepository, businessInventoryUpdatesEventBus);
    }
}
