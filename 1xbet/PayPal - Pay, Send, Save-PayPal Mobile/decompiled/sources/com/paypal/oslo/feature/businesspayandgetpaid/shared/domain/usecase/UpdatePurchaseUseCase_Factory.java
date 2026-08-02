package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

/* loaded from: classes11.dex */
public final class UpdatePurchaseUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> getHighSpeedVideoFpsRanges;

    private UpdatePurchaseUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository purchaseRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdatePurchaseUseCase(purchaseRepository);
    }
}
