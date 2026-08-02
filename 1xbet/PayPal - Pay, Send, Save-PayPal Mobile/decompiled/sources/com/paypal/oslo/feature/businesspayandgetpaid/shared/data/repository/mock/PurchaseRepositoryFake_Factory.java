package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock;

/* loaded from: classes11.dex */
public final class PurchaseRepositoryFake_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;

    private PurchaseRepositoryFake_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.PurchaseRepositoryImpl purchaseRepositoryImpl) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.mock.PurchaseRepositoryFake(purchaseRepositoryImpl);
    }
}
