package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler", f = "CheckoutUrlHandler.kt", i = {0, 0, 0}, l = {51}, m = "getCheckoutURL", n = {"checkoutToken", "onEvent", "onEffect"}, nl = {113}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class CheckoutUrlHandler$getCheckoutURL$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.getCheckoutURL(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutUrlHandler$getCheckoutURL$1(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler checkoutUrlHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$getCheckoutURL$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = checkoutUrlHandler;
    }
}
