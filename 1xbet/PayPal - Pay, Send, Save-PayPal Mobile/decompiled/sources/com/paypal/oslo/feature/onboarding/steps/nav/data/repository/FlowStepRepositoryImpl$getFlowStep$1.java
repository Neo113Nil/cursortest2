package com.paypal.oslo.feature.onboarding.steps.nav.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl", f = "FlowStepRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {74, 84}, m = "getFlowStep-vm54Raw", n = {com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", "raise$iv$iv$iv", "$this$getFlowStep_vm54Raw_u24lambda_u240", "stepKey", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "cached", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FlowStepRepositoryImpl$getFlowStep$2", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", "raise$iv$iv$iv", "$this$getFlowStep_vm54Raw_u24lambda_u240", "stepKey", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "cached", "step", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FlowStepRepositoryImpl$getFlowStep$2"}, nl = {75, 86}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class FlowStepRepositoryImpl$getFlowStep$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl getValidOutputFormatsForInputhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getValidOutputFormatsForInputhNQ4ISI.mo16512getFlowStepvm54Raw(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowStepRepositoryImpl$getFlowStep$1(com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl flowStepRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$getFlowStep$1> continuation) {
        super(continuation);
        this.getValidOutputFormatsForInputhNQ4ISI = flowStepRepositoryImpl;
    }
}
