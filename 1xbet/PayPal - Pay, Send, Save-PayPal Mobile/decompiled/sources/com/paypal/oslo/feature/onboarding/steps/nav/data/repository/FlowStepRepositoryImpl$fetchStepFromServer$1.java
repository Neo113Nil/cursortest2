package com.paypal.oslo.feature.onboarding.steps.nav.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl", f = "FlowStepRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 131, 136, 257, 257, 257}, m = "fetchStepFromServer-4ZGhc2k", n = {com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "stepKey", "$this$withLock_u24default$iv", "$i$f$withLock", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "stepKey", "deferred", "isNewRequest", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "stepKey", "deferred", "isNewRequest", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "stepKey", "deferred", "$this$withLock_u24default$iv", "isNewRequest", "$i$f$withLock", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "stepKey", "deferred", "$this$withLock_u24default$iv", "isNewRequest", "$i$f$withLock", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "stepId", "transition", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "stepKey", "deferred", "$this$withLock_u24default$iv", "isNewRequest", "$i$f$withLock"}, nl = {241, 135, 137, 258, 258, 258}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "Z$0", "I$0"}, v = 2)
/* loaded from: classes13.dex */
final class FlowStepRepositoryImpl$fetchStepFromServer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    boolean getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputStallDuration = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowStepRepositoryImpl$fetchStepFromServer$1(com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl flowStepRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.onboarding.steps.nav.data.repository.FlowStepRepositoryImpl$fetchStepFromServer$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = flowStepRepositoryImpl;
    }
}
