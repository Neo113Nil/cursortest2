package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration", f = "PayairUserRegistration.kt", i = {0, 0, 1, 1, 1}, l = {116, 125}, m = "performRegistration", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "refreshToken", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "result", "refreshToken"}, nl = {117, 128}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayairUserRegistration$performRegistration$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration.access$performRegistration(this.getInputFormats, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairUserRegistration$performRegistration$1(com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration payairUserRegistration, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$performRegistration$1> continuation) {
        super(continuation);
        this.getInputFormats = payairUserRegistration;
    }
}
