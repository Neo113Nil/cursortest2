package com.paypal.oslo.feature.qrc.ui.getpaid;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class GetPaidScreenKt$GetPaidScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent getPaidEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPaidEvent, "");
        ((com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel) this.receiver).handleIntent(getPaidEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidEvent getPaidEvent) {
        Camera2StreamConfigurationMap(getPaidEvent);
        return kotlin.Unit.INSTANCE;
    }

    GetPaidScreenKt$GetPaidScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.qrc.ui.getpaid.GetPaidViewModel.class, "handleIntent", "handleIntent(Lcom/paypal/oslo/feature/qrc/ui/getpaid/GetPaidEvent;)V", 0);
    }
}
