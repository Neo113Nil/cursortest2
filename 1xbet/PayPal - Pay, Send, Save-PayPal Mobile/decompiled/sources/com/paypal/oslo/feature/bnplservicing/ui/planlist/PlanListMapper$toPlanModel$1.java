package com.paypal.oslo.feature.bnplservicing.ui.planlist;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper", f = "PlanListMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {82, 83}, m = "toPlanModel$bnpl_servicing_prodRelease", n = {"$this$toPlanModel", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$map", "$i$f$mapTo", "$i$a$-map-PlanListMapper$toPlanModel$2", "$this$toPlanModel", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$map", "$i$f$mapTo", "$i$a$-map-PlanListMapper$toPlanModel$2"}, nl = {83, 84}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class PlanListMapper$toPlanModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.toPlanModel$bnpl_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanListMapper$toPlanModel$1(com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper planListMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.planlist.PlanListMapper$toPlanModel$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = planListMapper;
    }
}
