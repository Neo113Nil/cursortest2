package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper", f = "PlanAccordionMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {94}, m = "mapToOptions", n = {"plans", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "isInternationalFormat", "$i$f$map", "$i$f$mapTo", "$i$a$-map-PlanAccordionMapper$mapToOptions$2"}, nl = {238}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "Z$0", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes13.dex */
final class PlanAccordionMapper$mapToOptions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.mapToOptions(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanAccordionMapper$mapToOptions$1(com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper planAccordionMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion.internal.PlanAccordionMapper$mapToOptions$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = planAccordionMapper;
    }
}
