package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

/* loaded from: classes11.dex */
public final class SendReceiptUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> getHighResolutionOutputSizeshNQ4ISI;

    private SendReceiptUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository purchaseRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase(purchaseRepository);
    }
}
