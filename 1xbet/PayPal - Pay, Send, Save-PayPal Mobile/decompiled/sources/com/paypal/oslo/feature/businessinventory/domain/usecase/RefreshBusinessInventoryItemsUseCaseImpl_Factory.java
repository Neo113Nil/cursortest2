package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class RefreshBusinessInventoryItemsUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.RefreshBusinessInventoryItemsUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> getHighSpeedVideoFpsRangesFor;

    private RefreshBusinessInventoryItemsUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.RefreshBusinessInventoryItemsUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.RefreshBusinessInventoryItemsUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> provider) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.RefreshBusinessInventoryItemsUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.RefreshBusinessInventoryItemsUseCaseImpl newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.RefreshBusinessInventoryItemsUseCaseImpl(businessInventoryItemsRepository);
    }
}
