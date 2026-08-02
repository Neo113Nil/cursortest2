package com.paypal.oslo.feature.identity.clienttoken.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl", f = "ClientTokenRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {64, 71}, m = "fetchFreshToken", n = {"config", "credentials", "authHeader", "config", "credentials", "authHeader", "this_$iv", "response", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "$i$f$fold", "$i$a$-fold-ClientTokenRepositoryImpl$fetchFreshToken$3"}, nl = {67, 72}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class ClientTokenRepositoryImpl$fetchFreshToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputSizes.getHighSpeedVideoSizes(this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClientTokenRepositoryImpl$fetchFreshToken$1(com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl clientTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$fetchFreshToken$1> continuation) {
        super(continuation);
        this.getOutputSizes = clientTokenRepositoryImpl;
    }
}
