package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class GetBusinessInventoryItemsListUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryItemsListUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> getHighSpeedVideoFpsRanges;

    private GetBusinessInventoryItemsListUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryItemsListUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryItemsListUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository> provider) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryItemsListUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryItemsListUseCaseImpl newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryItemsListUseCaseImpl(businessInventoryItemsRepository);
    }
}
