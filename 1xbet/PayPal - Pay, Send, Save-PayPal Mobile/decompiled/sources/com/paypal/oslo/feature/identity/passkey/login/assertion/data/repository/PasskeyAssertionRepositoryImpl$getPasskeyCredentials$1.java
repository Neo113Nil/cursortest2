package com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl", f = "PasskeyAssertionRepositoryImpl.kt", i = {0, 0, 0}, l = {118}, m = "getPasskeyCredentials", n = {"activityContext", "passkeyAssertionRequest", "requestJson"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class PasskeyAssertionRepositoryImpl$getPasskeyCredentials$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.getPasskeyCredentials(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyAssertionRepositoryImpl$getPasskeyCredentials$1(com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl passkeyAssertionRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.login.assertion.data.repository.PasskeyAssertionRepositoryImpl$getPasskeyCredentials$1> continuation) {
        super(continuation);
        this.getOutputFormats = passkeyAssertionRepositoryImpl;
    }
}
