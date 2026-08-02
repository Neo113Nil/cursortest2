package com.paypal.oslo.feature.debitcard.cardacquisition.ui.success;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$4$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent debitCardCreationSuccessScreenEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardCreationSuccessScreenEvent, "");
        ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel) this.receiver).processEvent(debitCardCreationSuccessScreenEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.mvi.DebitCardCreationSuccessScreenEvent debitCardCreationSuccessScreenEvent) {
        getHighSpeedVideoFpsRangesFor(debitCardCreationSuccessScreenEvent);
        return kotlin.Unit.INSTANCE;
    }

    DebitCardCreationSuccessScreenKt$DebitCardCreationSuccessScreen$4$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.cardacquisition.ui.success.viewmodel.DebitCardCreationSuccessScreenViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
