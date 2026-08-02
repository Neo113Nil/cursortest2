package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper", f = "PlanListMapper.kt", i = {0}, l = {120}, m = "toAfterPurchasePlanModel$bnpl_servicing_prodRelease", n = {"$this$toAfterPurchasePlanModel"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PlanListMapper$toAfterPurchasePlanModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.toAfterPurchasePlanModel$bnpl_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanListMapper$toAfterPurchasePlanModel$1(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper planListMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toAfterPurchasePlanModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = planListMapper;
    }
}
