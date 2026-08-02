package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase", f = "PasskeyLoginUseCase.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, m = "resolvePartyId", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyLoginUseCase$resolvePartyId$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyLoginUseCase$resolvePartyId$1(com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase$resolvePartyId$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = passkeyLoginUseCase;
    }
}
