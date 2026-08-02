package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class TapToPayMainScreenKt$TapToPayMainScreen$9$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel) this.receiver).updateAmount$business_pay_and_get_paid_prodRelease(str2);
        return kotlin.Unit.INSTANCE;
    }

    TapToPayMainScreenKt$TapToPayMainScreen$9$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayCustomAmountViewModel.class, "updateAmount", "updateAmount$business_pay_and_get_paid_prodRelease(Ljava/lang/String;)V", 0);
    }
}
