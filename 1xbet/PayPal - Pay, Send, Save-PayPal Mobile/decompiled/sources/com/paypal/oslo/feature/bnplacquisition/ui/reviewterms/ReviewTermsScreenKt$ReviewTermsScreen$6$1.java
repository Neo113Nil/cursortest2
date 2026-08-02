package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ReviewTermsScreenKt$ReviewTermsScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent reviewTermsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewTermsEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel) this.receiver).processEvent(reviewTermsEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsEvent reviewTermsEvent) {
        getHighResolutionOutputSizeshNQ4ISI(reviewTermsEvent);
        return kotlin.Unit.INSTANCE;
    }

    ReviewTermsScreenKt$ReviewTermsScreen$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsEvent;)V", 0);
    }
}
