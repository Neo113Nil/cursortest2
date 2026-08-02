package com.paypal.oslo.feature.qrc.ui.enteramount;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class EnterAmountScreenKt$EnterAmountScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent enterAmountEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enterAmountEvent, "");
        ((com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel) this.receiver).handleIntent(enterAmountEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountEvent enterAmountEvent) {
        Camera2StreamConfigurationMap(enterAmountEvent);
        return kotlin.Unit.INSTANCE;
    }

    EnterAmountScreenKt$EnterAmountScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.qrc.ui.enteramount.EnterAmountViewModel.class, "handleIntent", "handleIntent(Lcom/paypal/oslo/feature/qrc/ui/enteramount/EnterAmountEvent;)V", 0);
    }
}
