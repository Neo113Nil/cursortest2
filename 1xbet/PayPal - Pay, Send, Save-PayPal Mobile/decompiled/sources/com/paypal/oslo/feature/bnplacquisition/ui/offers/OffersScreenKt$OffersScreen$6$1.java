package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class OffersScreenKt$OffersScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent offersEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offersEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel) this.receiver).processEvent(offersEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent offersEvent) {
        getHighResolutionOutputSizeshNQ4ISI(offersEvent);
        return kotlin.Unit.INSTANCE;
    }

    OffersScreenKt$OffersScreen$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/offers/OffersEvent;)V", 0);
    }
}
