package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

/* loaded from: classes11.dex */
public final class PurchaseRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService> getHighSpeedVideoSizes;

    private PurchaseRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.api.UprPurchaseService uprPurchaseService) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl(uprPurchaseService);
    }
}
