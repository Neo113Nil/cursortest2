package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount;

/* loaded from: classes11.dex */
public final class CustomAmountViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.C0323CustomAmountViewModel_Factory Camera2StreamConfigurationMap;

    private CustomAmountViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.C0323CustomAmountViewModel_Factory c0323CustomAmountViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0323CustomAmountViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        return this.Camera2StreamConfigurationMap.get(lineItem);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.C0323CustomAmountViewModel_Factory c0323CustomAmountViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel_Factory_Impl(c0323CustomAmountViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.C0323CustomAmountViewModel_Factory c0323CustomAmountViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel_Factory_Impl(c0323CustomAmountViewModel_Factory));
    }
}
