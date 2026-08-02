package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class InvoiceDetailsScreenKt$InvoiceDetailsScreen$11$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(boolean z) {
        ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel) this.receiver).onSendCopyOnReminderChanged(z);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.lang.Boolean bool) {
        Camera2StreamConfigurationMap(bool.booleanValue());
        return kotlin.Unit.INSTANCE;
    }

    InvoiceDetailsScreenKt$InvoiceDetailsScreen$11$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.class, "onSendCopyOnReminderChanged", "onSendCopyOnReminderChanged(Z)V", 0);
    }
}
