package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase;

/* loaded from: classes11.dex */
public final class GetPurchaseDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> Camera2StreamConfigurationMap;

    private GetPurchaseDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PurchaseRepository purchaseRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase(purchaseRepository);
    }
}
