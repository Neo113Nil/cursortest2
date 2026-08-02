package com.paypal.oslo.feature.identity.clienttoken.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl", f = "ClientTokenRepositoryImpl.kt", i = {0, 1, 2}, l = {48, 52, 52}, m = "getClientToken", n = {"forceRefresh", "forceRefresh", "forceRefresh"}, nl = {54, 52, 54}, s = {"Z$0", "Z$0", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class ClientTokenRepositoryImpl$getClientToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getClientToken(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClientTokenRepositoryImpl$getClientToken$1(com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl clientTokenRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.clienttoken.data.repository.ClientTokenRepositoryImpl$getClientToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = clientTokenRepositoryImpl;
    }
}
