package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class CardReplacementScreenKt$CardReplacementScreen$3$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent cardReplacementEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel) this.receiver).processEvent(cardReplacementEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.mvi.CardReplacementEvent cardReplacementEvent) {
        getHighResolutionOutputSizeshNQ4ISI(cardReplacementEvent);
        return kotlin.Unit.INSTANCE;
    }

    CardReplacementScreenKt$CardReplacementScreen$3$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
