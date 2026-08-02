package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

/* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0324EditLineItemViewModel_Factory {
    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel get(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        return newInstance(lineItem);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.C0324EditLineItemViewModel_Factory create() {
        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.C0324EditLineItemViewModel_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel newInstance(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel(lineItem);
    }

    /* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel_Factory$InstanceHolder */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.C0324EditLineItemViewModel_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.C0324EditLineItemViewModel_Factory();

        private InstanceHolder() {
        }
    }
}
