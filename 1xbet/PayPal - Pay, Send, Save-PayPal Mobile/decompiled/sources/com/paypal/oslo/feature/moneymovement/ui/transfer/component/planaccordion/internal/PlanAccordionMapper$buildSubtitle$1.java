package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper", f = "PlanAccordionMapper.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "buildSubtitle", n = {"source", "instrument", "it", "isInternationalFormat", "$i$a$-let-PlanAccordionMapper$buildSubtitle$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0"}, v = 2)
/* loaded from: classes13.dex */
final class PlanAccordionMapper$buildSubtitle$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(null, null, false, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanAccordionMapper$buildSubtitle$1(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$buildSubtitle$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = planAccordionMapper;
    }
}
