package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(boolean z) {
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel) this.receiver).onTaxInclusiveChanged(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        getHighSpeedVideoFpsRanges(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    PaymentRequestSettingsScreenKt$PaymentRequestSettingsScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.PaymentRequestSettingsViewModel.class, "onTaxInclusiveChanged", "onTaxInclusiveChanged(Z)V", 0);
    }
}
