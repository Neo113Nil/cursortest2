package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl", f = "AuthRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {95}, m = "getOneShotAuthentication", n = {"checkoutToken", "flowContext", "authContext", "checkoutAuthenticationContext"}, nl = {97}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes13.dex */
final class AuthRepositoryImpl$getOneShotAuthentication$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getOneShotAuthentication(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthRepositoryImpl$getOneShotAuthentication$1(com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl authRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$getOneShotAuthentication$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = authRepositoryImpl;
    }
}
