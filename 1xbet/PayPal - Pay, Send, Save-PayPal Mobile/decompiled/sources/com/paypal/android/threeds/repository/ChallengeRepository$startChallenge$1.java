package com.paypal.android.threeds.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.repository.ChallengeRepository", f = "ChallengeRepository.kt", i = {0, 0, 0}, l = {31}, m = "startChallenge", n = {"acsUrl", "encryptedChallengeRequest", "requestBody"}, nl = {32}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class ChallengeRepository$startChallenge$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.android.threeds.repository.ChallengeRepository getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.startChallenge(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeRepository$startChallenge$1(com.paypal.android.threeds.repository.ChallengeRepository challengeRepository, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.repository.ChallengeRepository$startChallenge$1> continuation) {
        super(continuation);
        this.getOutputFormats = challengeRepository;
    }
}
