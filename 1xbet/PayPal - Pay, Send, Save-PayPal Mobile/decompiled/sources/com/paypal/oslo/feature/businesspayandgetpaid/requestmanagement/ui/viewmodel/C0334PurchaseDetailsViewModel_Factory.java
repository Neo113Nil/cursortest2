package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

/* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0334PurchaseDetailsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase> getHighSpeedVideoSizes;

    private C0334PurchaseDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel get(java.lang.String str) {
        return newInstance(str, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0334PurchaseDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase> provider3) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0334PurchaseDetailsViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.GetPurchaseDetailsUseCase getPurchaseDetailsUseCase, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.SendReceiptUseCase sendReceiptUseCase, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.usecase.RefundPurchaseUseCase refundPurchaseUseCase) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel(str, getPurchaseDetailsUseCase, sendReceiptUseCase, refundPurchaseUseCase);
    }
}
