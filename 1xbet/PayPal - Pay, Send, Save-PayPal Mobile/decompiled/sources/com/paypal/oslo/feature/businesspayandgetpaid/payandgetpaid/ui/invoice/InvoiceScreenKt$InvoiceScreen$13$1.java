package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class InvoiceScreenKt$InvoiceScreen$13$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(boolean z) {
        ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel) this.receiver).onAllowTipsChange(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        Camera2StreamConfigurationMap(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    InvoiceScreenKt$InvoiceScreen$13$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.invoice.InvoiceViewModel.class, "onAllowTipsChange", "onAllowTipsChange(Z)V", 0);
    }
}
