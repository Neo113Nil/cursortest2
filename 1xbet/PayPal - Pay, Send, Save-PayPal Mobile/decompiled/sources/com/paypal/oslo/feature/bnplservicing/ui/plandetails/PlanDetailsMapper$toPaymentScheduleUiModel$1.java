package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper", f = "PlanDetailsMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {444, 461}, m = "toPaymentScheduleUiModel", n = {"$this$toPaymentScheduleUiModel", "remainingInstallments", "overdueStatuses", "overdueInstallments", "overdueAmount", "amount", "hasMultipleOverdueItems", "$i$a$-let-PlanDetailsMapper$toPaymentScheduleUiModel$consolidatedOverdueItem$1", "$this$toPaymentScheduleUiModel", "remainingInstallments", "overdueStatuses", "overdueInstallments", "overdueAmount", "consolidatedOverdueItem", "nonOverdueItems", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "installment", "hasMultipleOverdueItems", "$i$f$map", "$i$f$mapTo", "$i$a$-map-PlanDetailsMapper$toPaymentScheduleUiModel$mappedItems$1"}, nl = {445, 462}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$11", "L$12", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsMapper$toPaymentScheduleUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper CoroutineDebuggingKt;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    /* synthetic */ java.lang.Object toString;
    java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.toString = obj;
        this.getValidOutputFormatsForInputhNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.CoroutineDebuggingKt.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetails) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel>) this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanDetailsMapper$toPaymentScheduleUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper planDetailsMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper$toPaymentScheduleUiModel$1> continuation) {
        super(continuation);
        this.CoroutineDebuggingKt = planDetailsMapper;
    }
}
