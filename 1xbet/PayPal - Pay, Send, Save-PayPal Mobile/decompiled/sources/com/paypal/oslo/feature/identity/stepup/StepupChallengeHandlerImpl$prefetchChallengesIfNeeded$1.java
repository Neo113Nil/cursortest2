package com.paypal.oslo.feature.identity.stepup;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl", f = "StepupChallengeHandlerImpl.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m = "prefetchChallengesIfNeeded-Mpu6F-A", n = {"challengeResult", "requestId"}, nl = {140}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class StepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1(com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl stepupChallengeHandlerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.stepup.StepupChallengeHandlerImpl$prefetchChallengesIfNeeded$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = stepupChallengeHandlerImpl;
    }
}
