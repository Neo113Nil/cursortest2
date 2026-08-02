package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class GetBusinessInventoryTaxesUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryTaxesUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> getHighSpeedVideoFpsRanges;

    private GetBusinessInventoryTaxesUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryTaxesUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryTaxesUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> provider) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryTaxesUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryTaxesUseCaseImpl newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryTaxesUseCaseImpl(businessInventoryTaxesRepository);
    }
}
