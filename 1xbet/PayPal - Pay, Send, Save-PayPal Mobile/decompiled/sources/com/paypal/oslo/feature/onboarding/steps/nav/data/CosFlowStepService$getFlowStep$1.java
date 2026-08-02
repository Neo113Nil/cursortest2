package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService", f = "CosFlowStepService.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {51}, m = "getFlowStep-vm54Raw", n = {com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", "raise$iv$iv$iv", "$this$getFlowStep_vm54Raw_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-CosFlowStepService$getFlowStep$2"}, nl = {55}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class CosFlowStepService$getFlowStep$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.mo16512getFlowStepvm54Raw(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CosFlowStepService$getFlowStep$1(com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService cosFlowStepService, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepService$getFlowStep$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = cosFlowStepService;
    }
}
