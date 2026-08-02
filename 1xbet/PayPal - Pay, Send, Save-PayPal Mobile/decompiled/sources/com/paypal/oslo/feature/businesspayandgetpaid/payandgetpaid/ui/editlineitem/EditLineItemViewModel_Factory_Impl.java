package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

/* loaded from: classes11.dex */
public final class EditLineItemViewModel_Factory_Impl implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.Factory {
    private final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.C0324EditLineItemViewModel_Factory Camera2StreamConfigurationMap;

    private EditLineItemViewModel_Factory_Impl(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.C0324EditLineItemViewModel_Factory c0324EditLineItemViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0324EditLineItemViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.Factory
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        return this.Camera2StreamConfigurationMap.get(lineItem);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.Factory> create(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.C0324EditLineItemViewModel_Factory c0324EditLineItemViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel_Factory_Impl(c0324EditLineItemViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.C0324EditLineItemViewModel_Factory c0324EditLineItemViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel_Factory_Impl(c0324EditLineItemViewModel_Factory));
    }
}
