package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel;

/* loaded from: classes11.dex */
public final class PurchaseDetailsViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0334PurchaseDetailsViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private PurchaseDetailsViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0334PurchaseDetailsViewModel_Factory c0334PurchaseDetailsViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0334PurchaseDetailsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel create(java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0334PurchaseDetailsViewModel_Factory c0334PurchaseDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel_Factory_Impl(c0334PurchaseDetailsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.C0334PurchaseDetailsViewModel_Factory c0334PurchaseDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.PurchaseDetailsViewModel_Factory_Impl(c0334PurchaseDetailsViewModel_Factory));
    }
}
