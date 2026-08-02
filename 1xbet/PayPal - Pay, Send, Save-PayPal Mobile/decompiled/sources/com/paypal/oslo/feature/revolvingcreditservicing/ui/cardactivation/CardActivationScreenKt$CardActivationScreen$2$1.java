package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CardActivationScreenKt$CardActivationScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent cardActivationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardActivationEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel) this.receiver).processEvent(cardActivationEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationEvent cardActivationEvent) {
        getHighResolutionOutputSizeshNQ4ISI(cardActivationEvent);
        return kotlin.Unit.INSTANCE;
    }

    CardActivationScreenKt$CardActivationScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cardactivation/viewmodel/CardActivationEvent;)V", 0);
    }
}
