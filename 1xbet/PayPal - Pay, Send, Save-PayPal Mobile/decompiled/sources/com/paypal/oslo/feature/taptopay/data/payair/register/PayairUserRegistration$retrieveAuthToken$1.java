package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration", f = "PayairUserRegistration.kt", i = {1}, l = {89, 95}, m = "retrieveAuthToken", n = {"currentToken"}, nl = {90, 96}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayairUserRegistration$retrieveAuthToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration.access$retrieveAuthToken(this.getHighSpeedVideoFpsRangesFor, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairUserRegistration$retrieveAuthToken$1(com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration payairUserRegistration, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$retrieveAuthToken$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = payairUserRegistration;
    }
}
