package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler", f = "ActivationCodeRequestHandler.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 199, 205}, m = "handleOtp", n = {"$this$handleOtp", "activationMethod", "networkTokenReference", "$this$handleOtp", "activationMethod", "networkTokenReference", "result", "$this$handleOtp", "activationMethod", "networkTokenReference", "result"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, 200, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class ActivationCodeRequestHandler$handleOtp$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDuration.getHighSpeedVideoSizes(null, null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivationCodeRequestHandler$handleOtp$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler activationCodeRequestHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ActivationCodeRequestHandler$handleOtp$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = activationCodeRequestHandler;
    }
}
