package com.paypal.oslo.feature.identity.stepup;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl", f = "StepupChallengeHandlerImpl.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {107, 119}, m = "handleStepup", n = {"input", "requestId", "challengeResult", "input", "requestId", "challengeResult", "finalChallengeResult"}, nl = {108, -1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class StepupChallengeHandlerImpl$handleStepup$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.handleStepup(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupChallengeHandlerImpl$handleStepup$1(com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl stepupChallengeHandlerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$handleStepup$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = stepupChallengeHandlerImpl;
    }
}
