package com.paypal.oslo.feature.debitcard.servicing.ui.widget;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DebitCardWidgetComposableKt$DebitCardWidgetContent$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent debitCardWidgetEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel) this.receiver).processEvent(debitCardWidgetEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent debitCardWidgetEvent) {
        getHighSpeedVideoSizes(debitCardWidgetEvent);
        return kotlin.Unit.INSTANCE;
    }

    DebitCardWidgetComposableKt$DebitCardWidgetContent$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
