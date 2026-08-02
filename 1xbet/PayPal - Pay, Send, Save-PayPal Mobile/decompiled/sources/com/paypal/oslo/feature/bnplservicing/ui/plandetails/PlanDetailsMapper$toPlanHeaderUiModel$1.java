package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper", f = "PlanDetailsMapper.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {145, 150, 151}, m = "toPlanHeaderUiModel", n = {"$this$toPlanHeaderUiModel", "plan", "isPayIn30", "isRefundPending", "$this$toPlanHeaderUiModel", "plan", "isPayIn30", "isRefundPending", "$this$toPlanHeaderUiModel", "plan", "isPayIn30", "isRefundPending"}, nl = {146, 151, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsMapper$toPlanHeaderUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputFormats.Camera2StreamConfigurationMap((com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.PlansHeaderUiModel>) this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanDetailsMapper$toPlanHeaderUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper planDetailsMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper$toPlanHeaderUiModel$1> continuation) {
        super(continuation);
        this.getOutputFormats = planDetailsMapper;
    }
}
