package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl", f = "AuthTokenImpl.kt", i = {}, l = {59, 60}, m = "refreshToken", n = {}, nl = {60, 67}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AuthTokenImpl$refreshToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.refreshToken(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthTokenImpl$refreshToken$1(com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl authTokenImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$refreshToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = authTokenImpl;
    }
}
