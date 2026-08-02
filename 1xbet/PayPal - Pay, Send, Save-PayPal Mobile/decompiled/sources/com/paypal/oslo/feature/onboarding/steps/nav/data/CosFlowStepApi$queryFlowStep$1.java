package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi", f = "CosFlowStepApi.kt", i = {0, 0, 0, 0, 0}, l = {89}, m = "queryFlowStep-3FChOw0", n = {com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", "cosStep", "cosTransition"}, nl = {98}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes13.dex */
final class CosFlowStepApi$queryFlowStep$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.m16511queryFlowStep3FChOw0(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CosFlowStepApi$queryFlowStep$1(com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi cosFlowStepApi, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.steps.nav.data.CosFlowStepApi$queryFlowStep$1> continuation) {
        super(continuation);
        this.getOutputFormats = cosFlowStepApi;
    }
}
