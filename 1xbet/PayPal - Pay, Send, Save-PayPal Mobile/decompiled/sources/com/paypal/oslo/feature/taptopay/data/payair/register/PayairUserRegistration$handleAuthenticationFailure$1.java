package com.paypal.oslo.feature.taptopay.data.payair.register;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration", f = "PayairUserRegistration.kt", i = {0, 0, 1, 1}, l = {171, 175}, m = "handleAuthenticationFailure", n = {"refreshToken", "errorCode", "refreshToken", "errorCode"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {"Z$0", "I$0", "Z$0", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayairUserRegistration$handleAuthenticationFailure$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(false, 0, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayairUserRegistration$handleAuthenticationFailure$1(com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration payairUserRegistration, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.register.PayairUserRegistration$handleAuthenticationFailure$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = payairUserRegistration;
    }
}
