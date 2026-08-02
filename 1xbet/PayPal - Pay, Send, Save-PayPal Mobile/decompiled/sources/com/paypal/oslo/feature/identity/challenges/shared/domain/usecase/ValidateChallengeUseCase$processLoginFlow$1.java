package com.paypal.oslo.feature.identity.challenges.shared.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase", f = "ValidateChallengeUseCase.kt", i = {0, 0}, l = {77}, m = "processLoginFlow", n = {"input", "loginRequest"}, nl = {78}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class ValidateChallengeUseCase$processLoginFlow$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidateChallengeUseCase$processLoginFlow$1(com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase validateChallengeUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase$processLoginFlow$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = validateChallengeUseCase;
    }
}
