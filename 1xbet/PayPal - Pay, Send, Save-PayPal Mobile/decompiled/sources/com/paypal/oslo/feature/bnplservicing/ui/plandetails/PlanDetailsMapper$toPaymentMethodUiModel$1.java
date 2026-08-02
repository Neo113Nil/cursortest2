package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper", f = "PlanDetailsMapper.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_VALUE}, m = "toPaymentMethodUiModel$bnpl_servicing_prodRelease", n = {"$this$toPaymentMethodUiModel", "autopay", "fundingInstrument", "alertUiModel"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsMapper$toPaymentMethodUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.toPaymentMethodUiModel$bnpl_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanDetailsMapper$toPaymentMethodUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper planDetailsMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper$toPaymentMethodUiModel$1> continuation) {
        super(continuation);
        this.getInputFormats = planDetailsMapper;
    }
}
