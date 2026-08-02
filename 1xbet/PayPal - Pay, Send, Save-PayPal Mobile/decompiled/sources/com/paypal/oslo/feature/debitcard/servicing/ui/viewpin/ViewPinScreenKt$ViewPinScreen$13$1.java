package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ViewPinScreenKt$ViewPinScreen$13$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent viewPinEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPinEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel) this.receiver).processEvent(viewPinEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.mvi.ViewPinEvent viewPinEvent) {
        getHighSpeedVideoSizes(viewPinEvent);
        return kotlin.Unit.INSTANCE;
    }

    ViewPinScreenKt$ViewPinScreen$13$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
