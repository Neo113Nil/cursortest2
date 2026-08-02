package com.paypal.oslo.feature.identity.sso.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl", f = "CodeToTokenRepositoryImpl.kt", i = {0, 0, 0}, l = {51}, m = "exchangeCodeForToken", n = {"request", "input", "mutation"}, nl = {54}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class CodeToTokenRepositoryImpl$exchangeCodeForToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.exchangeCodeForToken(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CodeToTokenRepositoryImpl$exchangeCodeForToken$1(com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl codeToTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl$exchangeCodeForToken$1> continuation) {
        super(continuation);
        this.getOutputFormats = codeToTokenRepositoryImpl;
    }
}
