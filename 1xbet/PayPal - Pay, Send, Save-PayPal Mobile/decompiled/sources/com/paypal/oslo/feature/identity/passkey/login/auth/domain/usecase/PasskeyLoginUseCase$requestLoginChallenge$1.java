package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase", f = "PasskeyLoginUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {155}, m = "requestLoginChallenge", n = {"partyId", "authIntent", "raise$iv$iv$iv", "$this$requestLoginChallenge_u24lambda_u240", "encodedNonce", "passkeyLoginChallengeRequest", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyLoginUseCase$requestLoginChallenge$2"}, nl = {156}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyLoginUseCase$requestLoginChallenge$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputSizes.Camera2StreamConfigurationMap(null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyLoginUseCase$requestLoginChallenge$1(com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$requestLoginChallenge$1> continuation) {
        super(continuation);
        this.getOutputSizes = passkeyLoginUseCase;
    }
}
