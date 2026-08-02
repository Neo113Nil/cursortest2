package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class ReviewPlanScreenKt$ReviewPlanScreen$7$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent, kotlin.Unit> {
    public final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent reviewPlanEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPlanEvent, "");
        ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel) this.receiver).processEvent(reviewPlanEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanEvent reviewPlanEvent) {
        Camera2StreamConfigurationMap(reviewPlanEvent);
        return kotlin.Unit.INSTANCE;
    }

    ReviewPlanScreenKt$ReviewPlanScreen$7$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanEvent;)V", 0);
    }
}
