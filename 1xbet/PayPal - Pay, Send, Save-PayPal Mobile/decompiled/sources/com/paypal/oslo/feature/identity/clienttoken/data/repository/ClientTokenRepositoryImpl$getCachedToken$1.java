package com.paypal.oslo.feature.identity.clienttoken.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl", f = "ClientTokenRepositoryImpl.kt", i = {}, l = {86}, m = "getCachedToken", n = {}, nl = {87}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class ClientTokenRepositoryImpl$getCachedToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClientTokenRepositoryImpl$getCachedToken$1(com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl clientTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getCachedToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = clientTokenRepositoryImpl;
    }
}
