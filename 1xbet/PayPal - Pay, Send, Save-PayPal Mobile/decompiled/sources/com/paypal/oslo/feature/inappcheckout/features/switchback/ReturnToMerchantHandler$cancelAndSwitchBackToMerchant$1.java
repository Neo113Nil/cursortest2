package com.paypal.oslo.feature.inappcheckout.features.switchback;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler", f = "ReturnToMerchantHandler.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {81, 109}, m = "cancelAndSwitchBackToMerchant", n = {"universalLinkData", "webViewUri", "onEffect", "universalLinkData", "webViewUri", "onEffect", "checkoutUrls", "action"}, nl = {80, 113}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes13.dex */
final class ReturnToMerchantHandler$cancelAndSwitchBackToMerchant$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.cancelAndSwitchBackToMerchant(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnToMerchantHandler$cancelAndSwitchBackToMerchant$1(com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler returnToMerchantHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.features.switchback.ReturnToMerchantHandler$cancelAndSwitchBackToMerchant$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = returnToMerchantHandler;
    }
}
