package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PlanDetailsScreenKt$PlanDetailsScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent planDetailsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDetailsEvent, "");
        ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel) this.receiver).processEvent(planDetailsEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsEvent planDetailsEvent) {
        getHighResolutionOutputSizeshNQ4ISI(planDetailsEvent);
        return kotlin.Unit.INSTANCE;
    }

    PlanDetailsScreenKt$PlanDetailsScreen$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/PlanDetailsEvent;)V", 0);
    }
}
