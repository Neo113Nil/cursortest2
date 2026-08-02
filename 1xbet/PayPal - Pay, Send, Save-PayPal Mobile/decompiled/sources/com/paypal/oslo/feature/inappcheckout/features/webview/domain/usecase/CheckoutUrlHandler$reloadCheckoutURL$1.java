package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler", f = "CheckoutUrlHandler.kt", i = {0, 0}, l = {101}, m = "reloadCheckoutURL", n = {"universalLinkData", "checkoutToken"}, nl = {102}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class CheckoutUrlHandler$reloadCheckoutURL$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.reloadCheckoutURL(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutUrlHandler$reloadCheckoutURL$1(com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler checkoutUrlHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.CheckoutUrlHandler$reloadCheckoutURL$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = checkoutUrlHandler;
    }
}
