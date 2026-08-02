package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class SyncTaxOptionsUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> Camera2StreamConfigurationMap;

    private SyncTaxOptionsUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCaseImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository> provider) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCaseImpl newInstance(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCaseImpl(businessInventoryTaxesRepository);
    }
}
