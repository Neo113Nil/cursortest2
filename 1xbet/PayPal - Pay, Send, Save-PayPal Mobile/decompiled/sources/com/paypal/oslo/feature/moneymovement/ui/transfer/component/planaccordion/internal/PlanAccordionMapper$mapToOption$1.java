package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper", f = "PlanAccordionMapper.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {68, 70, 73, 83}, m = "mapToOption", n = {"plan", "primarySource", "instrument", "isInternationalFormat", "isSplit", "plan", "primarySource", "instrument", "isInternationalFormat", "isSplit", "plan", "primarySource", "instrument", "fee", "isInternationalFormat", "isSplit", "$i$a$-let-PlanAccordionMapper$mapToOption$2", "plan", "primarySource", "instrument", "isInternationalFormat", "isSplit"}, nl = {70, 67, 72, 60}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0", "L$0", "L$1", "L$2", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$10", "Z$0", "I$0", "I$1", "L$0", "L$1", "L$2", "Z$0", "I$0"}, v = 2)
/* loaded from: classes13.dex */
final class PlanAccordionMapper$mapToOption$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
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
    /* synthetic */ java.lang.Object isOutputSupportedFor;
    boolean toString;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.isOutputSupportedFor = obj;
        this.getValidOutputFormatsForInputhNQ4ISI |= Integer.MIN_VALUE;
        return this.unwrapAs.mapToOption(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanAccordionMapper$mapToOption$1(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOption$1> continuation) {
        super(continuation);
        this.unwrapAs = planAccordionMapper;
    }
}
