package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$4$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent debitCardInContextAcquisitionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardInContextAcquisitionEvent, "");
        ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel) this.receiver).processEvent(debitCardInContextAcquisitionEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.DebitCardInContextAcquisitionEvent debitCardInContextAcquisitionEvent) {
        getHighSpeedVideoFpsRanges(debitCardInContextAcquisitionEvent);
        return kotlin.Unit.INSTANCE;
    }

    DebitCardInContextAcquisitionScreenKt$DebitCardInContextAcquisitionScreen$4$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.viewmodel.DebitCardInContextAcquisitionViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
