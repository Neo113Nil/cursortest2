package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper", f = "PlanDetailsMapper.kt", i = {0, 0, 0, 0, 1, 1}, l = {633, 660}, m = "getSimpleHeaderAlertModel$bnpl_servicing_prodRelease", n = {"$this$getSimpleHeaderAlertModel", "it", "isPayIn30", "$i$a$-let-PlanDetailsMapper$getSimpleHeaderAlertModel$amount$1", "$this$getSimpleHeaderAlertModel", "isPayIn30"}, nl = {633, 667}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsMapper$getSimpleHeaderAlertModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.getSimpleHeaderAlertModel$bnpl_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanDetailsMapper$getSimpleHeaderAlertModel$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper planDetailsMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper$getSimpleHeaderAlertModel$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = planDetailsMapper;
    }
}
