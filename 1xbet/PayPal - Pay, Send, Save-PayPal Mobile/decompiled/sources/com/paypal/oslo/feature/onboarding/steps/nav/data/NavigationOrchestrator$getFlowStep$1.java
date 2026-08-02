package com.paypal.oslo.feature.onboarding.steps.nav.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator", f = "NavigationOrchestrator.kt", i = {0, 0, 0}, l = {48}, m = "getFlowStep-vm54Raw", n = {com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition"}, nl = {49}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class NavigationOrchestrator$getFlowStep$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.mo16512getFlowStepvm54Raw(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationOrchestrator$getFlowStep$1(com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator navigationOrchestrator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.steps.nav.data.NavigationOrchestrator$getFlowStep$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = navigationOrchestrator;
    }
}
