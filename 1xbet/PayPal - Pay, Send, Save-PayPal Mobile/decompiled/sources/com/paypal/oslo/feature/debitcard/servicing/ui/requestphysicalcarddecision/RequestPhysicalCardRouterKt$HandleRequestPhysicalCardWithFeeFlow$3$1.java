package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class RequestPhysicalCardRouterKt$HandleRequestPhysicalCardWithFeeFlow$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent requestPhysicalCardDecisionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardDecisionEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel) this.receiver).processEvent(requestPhysicalCardDecisionEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent requestPhysicalCardDecisionEvent) {
        getHighResolutionOutputSizeshNQ4ISI(requestPhysicalCardDecisionEvent);
        return kotlin.Unit.INSTANCE;
    }

    RequestPhysicalCardRouterKt$HandleRequestPhysicalCardWithFeeFlow$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
