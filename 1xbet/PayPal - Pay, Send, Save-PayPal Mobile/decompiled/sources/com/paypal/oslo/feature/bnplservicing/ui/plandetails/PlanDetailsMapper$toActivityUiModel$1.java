package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper", f = "PlanDetailsMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {493}, m = "toActivityUiModel", n = {"$this$toActivityUiModel", "merchantName", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "activity", "content", "it", "$i$f$map", "$i$f$mapTo", "$i$a$-map-PlanDetailsMapper$toActivityUiModel$activities$1", "$i$a$-let-PlanDetailsMapper$toActivityUiModel$activities$1$1"}, nl = {492}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "L$12", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsMapper$toActivityUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper CoroutineDebuggingKt;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
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
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    int unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.isOutputSupportedForhNQ4ISI = obj;
        this.unwrapAs |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.CoroutineDebuggingKt.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlanDetailsMapper$toActivityUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper planDetailsMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsMapper$toActivityUiModel$1> continuation) {
        super(continuation);
        this.CoroutineDebuggingKt = planDetailsMapper;
    }
}
