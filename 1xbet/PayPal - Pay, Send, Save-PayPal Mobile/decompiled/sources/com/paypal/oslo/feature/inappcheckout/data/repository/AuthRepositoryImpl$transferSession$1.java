package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl", f = "AuthRepositoryImpl.kt", i = {0, 0, 0}, l = {154}, m = "transferSession", n = {"flowContext", "authContext", "exchangeContext"}, nl = {155}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class AuthRepositoryImpl$transferSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.transferSession(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthRepositoryImpl$transferSession$1(com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl authRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl$transferSession$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = authRepositoryImpl;
    }
}
