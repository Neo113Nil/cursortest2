package com.paypal.oslo.feature.identity.challenges.shared.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl", f = "NotifyChallengeRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {103}, m = "notifyChallengeWithAuthenticate", n = {"input", "loginRequest", "authInput", "mutation", "mutationCall", "callConfig"}, nl = {104}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes5.dex */
final class NotifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.notifyChallengeWithAuthenticate(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1(com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl notifyChallengeRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.shared.data.repository.NotifyChallengeRepositoryImpl$notifyChallengeWithAuthenticate$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = notifyChallengeRepositoryImpl;
    }
}
