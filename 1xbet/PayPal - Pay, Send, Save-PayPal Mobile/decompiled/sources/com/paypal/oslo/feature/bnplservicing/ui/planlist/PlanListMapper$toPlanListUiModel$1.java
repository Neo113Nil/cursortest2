package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper", f = "PlanListMapper.kt", i = {0, 1, 1}, l = {52, 62}, m = "toPlanListUiModel", n = {"overview", "overview", "activePlanModels"}, nl = {46, 56}, s = {"L$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class PlanListMapper$toPlanListUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.toPlanListUiModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanListMapper$toPlanListUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper planListMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanListUiModel$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = planListMapper;
    }
}
