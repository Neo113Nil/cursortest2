package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$callbacks$1$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel) this.receiver).onLocationEnabledChecked$business_pay_and_get_paid_prodRelease(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    TtpPermissionsRationaleScreenKt$TtpPermissionsRationaleScreen$callbacks$1$2(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TtpPermissionsRationaleViewModel.class, "onLocationEnabledChecked", "onLocationEnabledChecked$business_pay_and_get_paid_prodRelease(Z)V", 0);
    }
}
