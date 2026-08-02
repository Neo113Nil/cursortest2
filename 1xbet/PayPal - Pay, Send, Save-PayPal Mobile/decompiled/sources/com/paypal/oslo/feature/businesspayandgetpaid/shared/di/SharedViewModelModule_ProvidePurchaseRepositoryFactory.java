package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

/* loaded from: classes11.dex */
public final class SharedViewModelModule_ProvidePurchaseRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake> getHighSpeedVideoSizes;

    private SharedViewModelModule_ProvidePurchaseRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository get() {
        return providePurchaseRepository(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.di.SharedViewModelModule_ProvidePurchaseRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl> provider2) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.SharedViewModelModule_ProvidePurchaseRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository providePurchaseRepository(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake purchaseRepositoryFake, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl purchaseRepositoryImpl) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesspayandgetpaid.shared.di.SharedViewModelModule.INSTANCE.providePurchaseRepository(purchaseRepositoryFake, purchaseRepositoryImpl));
    }
}
