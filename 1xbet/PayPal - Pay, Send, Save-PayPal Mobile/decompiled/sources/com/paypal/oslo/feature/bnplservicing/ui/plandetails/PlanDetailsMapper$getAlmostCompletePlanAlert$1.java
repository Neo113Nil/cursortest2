package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper", f = "PlanDetailsMapper.kt", i = {0, 0, 0, 0, 0, 0}, l = {698}, m = "getAlmostCompletePlanAlert", n = {"$this$getAlmostCompletePlanAlert", "refundAmount", "amount", "amountValue", "positiveAmount", "$i$a$-let-PlanDetailsMapper$getAlmostCompletePlanAlert$2"}, nl = {697}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsMapper$getAlmostCompletePlanAlert$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlmostCompletePlan) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSimpleHeaderAlertModel>) this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanDetailsMapper$getAlmostCompletePlanAlert$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper planDetailsMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper$getAlmostCompletePlanAlert$1> continuation) {
        super(continuation);
        this.getOutputFormats = planDetailsMapper;
    }
}
