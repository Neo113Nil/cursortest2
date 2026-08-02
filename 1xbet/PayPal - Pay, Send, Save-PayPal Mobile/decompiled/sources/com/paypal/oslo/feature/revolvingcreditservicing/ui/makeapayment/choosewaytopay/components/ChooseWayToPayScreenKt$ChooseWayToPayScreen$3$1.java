package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class ChooseWayToPayScreenKt$ChooseWayToPayScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent chooseWayToPayEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chooseWayToPayEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel) this.receiver).processEvent(chooseWayToPayEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayEvent chooseWayToPayEvent) {
        getHighSpeedVideoFpsRangesFor(chooseWayToPayEvent);
        return kotlin.Unit.INSTANCE;
    }

    ChooseWayToPayScreenKt$ChooseWayToPayScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/choosewaytopay/viewmodel/ChooseWayToPayEvent;)V", 0);
    }
}
