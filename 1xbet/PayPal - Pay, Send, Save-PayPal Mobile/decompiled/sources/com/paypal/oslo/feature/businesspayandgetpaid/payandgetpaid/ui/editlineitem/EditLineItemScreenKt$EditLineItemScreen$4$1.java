package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class EditLineItemScreenKt$EditLineItemScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate fieldUpdate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldUpdate, "");
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel) this.receiver).onFieldChange(fieldUpdate);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.FieldUpdate fieldUpdate) {
        getHighSpeedVideoSizes(fieldUpdate);
        return kotlin.Unit.INSTANCE;
    }

    EditLineItemScreenKt$EditLineItemScreen$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.class, "onFieldChange", "onFieldChange(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/editlineitem/FieldUpdate;)V", 0);
    }
}
