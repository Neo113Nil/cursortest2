package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase", f = "PasskeyLoginUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "getPasskeyAssertion", n = {"activityContext", "passkeyLoginChallengeSuccess", "raise$iv$iv$iv", "$this$getPasskeyAssertion_u24lambda_u240", "passkeyAssertionRequest", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyLoginUseCase$getPasskeyAssertion$2"}, nl = {185}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyLoginUseCase$getPasskeyAssertion$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputStallDurationlomOqCM.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyLoginUseCase$getPasskeyAssertion$1(com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$getPasskeyAssertion$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = passkeyLoginUseCase;
    }
}
