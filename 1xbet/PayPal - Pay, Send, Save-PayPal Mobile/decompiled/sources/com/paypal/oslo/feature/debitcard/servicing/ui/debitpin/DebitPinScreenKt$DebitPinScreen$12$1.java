package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DebitPinScreenKt$DebitPinScreen$12$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent debitPinEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitPinEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel) this.receiver).processEvent(debitPinEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEvent debitPinEvent) {
        getHighSpeedVideoSizes(debitPinEvent);
        return kotlin.Unit.INSTANCE;
    }

    DebitPinScreenKt$DebitPinScreen$12$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
