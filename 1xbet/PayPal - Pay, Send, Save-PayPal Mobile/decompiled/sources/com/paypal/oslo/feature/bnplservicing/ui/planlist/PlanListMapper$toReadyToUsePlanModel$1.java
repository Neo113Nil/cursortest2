package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper", f = "PlanListMapper.kt", i = {0, 0, 0, 1, 1, 1}, l = {88, 95}, m = "toReadyToUsePlanModel$bnpl_servicing_prodRelease", n = {"$this$toReadyToUsePlanModel", "it", "$i$a$-let-PlanListMapper$toReadyToUsePlanModel$3", "$this$toReadyToUsePlanModel", "it", "$i$a$-let-PlanListMapper$toReadyToUsePlanModel$4"}, nl = {88, 94}, s = {"L$0", "L$1", "I$0", "L$0", "L$3", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PlanListMapper$toReadyToUsePlanModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.toReadyToUsePlanModel$bnpl_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanListMapper$toReadyToUsePlanModel$1(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper planListMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toReadyToUsePlanModel$1> continuation) {
        super(continuation);
        this.getOutputFormats = planListMapper;
    }
}
