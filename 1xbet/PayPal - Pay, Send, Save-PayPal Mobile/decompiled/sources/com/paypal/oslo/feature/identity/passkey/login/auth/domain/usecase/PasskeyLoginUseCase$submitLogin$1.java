package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase", f = "PasskeyLoginUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {215}, m = "submitLogin", n = {com.visa.cbp.getDeviceCerts.ReplenishRequest, "authIntent", "raise$iv$iv$iv", "$this$submitLogin_u24lambda_u240", "passkeyLoginRequest", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyLoginUseCase$submitLogin$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyLoginUseCase$submitLogin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase getOutputSizes;
    int getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputSizes.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyLoginUseCase$submitLogin$1(com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$submitLogin$1> continuation) {
        super(continuation);
        this.getOutputSizes = passkeyLoginUseCase;
    }
}
