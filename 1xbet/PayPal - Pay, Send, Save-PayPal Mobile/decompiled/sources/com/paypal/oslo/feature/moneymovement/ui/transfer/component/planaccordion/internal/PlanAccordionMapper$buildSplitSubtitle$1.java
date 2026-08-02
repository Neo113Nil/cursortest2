package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper", f = "PlanAccordionMapper.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {111}, m = "buildSplitSubtitle", n = {"sources", "parts", "source", "name", "it", "isInternationalFormat", "$i$a$-let-PlanAccordionMapper$buildSplitSubtitle$amount$1"}, nl = {111}, s = {"L$0", "L$1", "L$3", "L$4", "L$5", "Z$0", "I$0"}, v = 2)
/* loaded from: classes13.dex */
final class PlanAccordionMapper$buildSplitSubtitle$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges((java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.FundingSource>) null, false, (kotlin.coroutines.Continuation<? super java.lang.String>) this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanAccordionMapper$buildSplitSubtitle$1(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSplitSubtitle$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = planAccordionMapper;
    }
}
