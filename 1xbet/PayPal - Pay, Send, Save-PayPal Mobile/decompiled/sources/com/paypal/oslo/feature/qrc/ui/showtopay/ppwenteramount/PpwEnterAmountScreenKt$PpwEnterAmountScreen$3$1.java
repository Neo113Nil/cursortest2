package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class PpwEnterAmountScreenKt$PpwEnterAmountScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent ppwEnterAmountEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppwEnterAmountEvent, "");
        ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel) this.receiver).handleEvent(ppwEnterAmountEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent ppwEnterAmountEvent) {
        Camera2StreamConfigurationMap(ppwEnterAmountEvent);
        return kotlin.Unit.INSTANCE;
    }

    PpwEnterAmountScreenKt$PpwEnterAmountScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModel.class, "handleEvent", "handleEvent(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;)V", 0);
    }
}
