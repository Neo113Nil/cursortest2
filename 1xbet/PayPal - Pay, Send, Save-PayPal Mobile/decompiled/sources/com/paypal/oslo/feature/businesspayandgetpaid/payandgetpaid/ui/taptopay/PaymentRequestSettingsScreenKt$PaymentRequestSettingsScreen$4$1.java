package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(boolean z) {
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel) this.receiver).onTaxCalculatedAfterDiscountChanged(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighSpeedVideoSizes(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel.class, "onTaxCalculatedAfterDiscountChanged", "onTaxCalculatedAfterDiscountChanged(Z)V", 0);
    }
}
