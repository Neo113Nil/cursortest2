package com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase", f = "SavePasskeyCredentialsUseCase.kt", i = {0, 0, 0}, l = {42}, m = "invoke", n = {"passkeyAssertionSuccess", "credentials", "$i$a$-let-SavePasskeyCredentialsUseCase$invoke$2"}, nl = {43}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class SavePasskeyCredentialsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavePasskeyCredentialsUseCase$invoke$1(com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase savePasskeyCredentialsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = savePasskeyCredentialsUseCase;
    }
}
