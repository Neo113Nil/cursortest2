package com.paypal.oslo.feature.identity.sso.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl", f = "TokenToCodeRepositoryImpl.kt", i = {0, 0, 0}, l = {58}, m = "getAuthorizationCode", n = {"request", "input", "mutation"}, nl = {63}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class TokenToCodeRepositoryImpl$getAuthorizationCode$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.getAuthorizationCode(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TokenToCodeRepositoryImpl$getAuthorizationCode$1(com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl tokenToCodeRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl$getAuthorizationCode$1> continuation) {
        super(continuation);
        this.getInputFormats = tokenToCodeRepositoryImpl;
    }
}
