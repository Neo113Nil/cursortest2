package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl", f = "AuthTokenImpl.kt", i = {}, l = {47}, m = "getToken", n = {}, nl = {67}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AuthTokenImpl$getToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getToken(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthTokenImpl$getToken$1(com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl authTokenImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.register.AuthTokenImpl$getToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = authTokenImpl;
    }
}
