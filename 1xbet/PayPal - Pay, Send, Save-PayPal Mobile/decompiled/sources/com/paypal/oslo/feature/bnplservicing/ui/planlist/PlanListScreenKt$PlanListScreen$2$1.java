package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PlanListScreenKt$PlanListScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent planListEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planListEvent, "");
        ((com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel) this.receiver).processEvent(planListEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListEvent planListEvent) {
        getHighSpeedVideoFpsRangesFor(planListEvent);
        return kotlin.Unit.INSTANCE;
    }

    PlanListScreenKt$PlanListScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/PlanListEvent;)V", 0);
    }
}
