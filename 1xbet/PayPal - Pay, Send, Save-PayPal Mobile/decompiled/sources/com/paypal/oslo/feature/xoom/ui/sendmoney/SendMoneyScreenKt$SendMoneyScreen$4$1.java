package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class SendMoneyScreenKt$SendMoneyScreen$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent sendMoneyEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendMoneyEvent, "");
        ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel) this.receiver).processEvent(sendMoneyEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent sendMoneyEvent) {
        getHighSpeedVideoSizes(sendMoneyEvent);
        return kotlin.Unit.INSTANCE;
    }

    SendMoneyScreenKt$SendMoneyScreen$4$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/xoom/ui/sendmoney/SendMoneyEvent;)V", 0);
    }
}
