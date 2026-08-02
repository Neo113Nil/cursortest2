package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper", f = "PlanAccordionMapper.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {143}, m = "buildBackupSubtitle", n = {"plan", "backup", "instrument", "typeLabel", "masked", "feeAmount", "isInternationalFormat"}, nl = {144}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"}, v = 2)
/* loaded from: classes13.dex */
final class PlanAccordionMapper$buildBackupSubtitle$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.moneymovement.api.domain.PaymentPlan) null, false, (kotlin.coroutines.Continuation<? super java.lang.String>) this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanAccordionMapper$buildBackupSubtitle$1(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildBackupSubtitle$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = planAccordionMapper;
    }
}
