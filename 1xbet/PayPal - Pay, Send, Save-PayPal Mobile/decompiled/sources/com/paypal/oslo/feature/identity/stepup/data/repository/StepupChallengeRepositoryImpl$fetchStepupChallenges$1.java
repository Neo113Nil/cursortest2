package com.paypal.oslo.feature.identity.stepup.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl", f = "StepupChallengeRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {99}, m = "fetchStepupChallenges", n = {"transactionContext", "raise$iv$iv$iv", "$this$fetchStepupChallenges_u24lambda_u240", "input", "query", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-StepupChallengeRepositoryImpl$fetchStepupChallenges$2"}, nl = {114}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class StepupChallengeRepositoryImpl$fetchStepupChallenges$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputSizes.fetchStepupChallenges(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupChallengeRepositoryImpl$fetchStepupChallenges$1(com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl stepupChallengeRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.stepup.data.repository.StepupChallengeRepositoryImpl$fetchStepupChallenges$1> continuation) {
        super(continuation);
        this.getOutputSizes = stepupChallengeRepositoryImpl;
    }
}
