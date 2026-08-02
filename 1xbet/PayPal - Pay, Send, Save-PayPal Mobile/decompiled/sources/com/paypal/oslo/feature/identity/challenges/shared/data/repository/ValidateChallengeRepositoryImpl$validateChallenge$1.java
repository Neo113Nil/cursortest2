package com.paypal.oslo.feature.identity.challenges.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl", f = "ValidateChallengeRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {60, 66}, m = "validateChallenge", n = {"input", "domainInput", "graphQLInput", "mutation", "mutationCall", "input", "domainInput", "graphQLInput", "mutation", "mutationCall", "callConfig"}, nl = {64, 67}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class ValidateChallengeRepositoryImpl$validateChallenge$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.validateChallenge(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidateChallengeRepositoryImpl$validateChallenge$1(com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl validateChallengeRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.shared.data.repository.ValidateChallengeRepositoryImpl$validateChallenge$1> continuation) {
        super(continuation);
        this.getInputFormats = validateChallengeRepositoryImpl;
    }
}
