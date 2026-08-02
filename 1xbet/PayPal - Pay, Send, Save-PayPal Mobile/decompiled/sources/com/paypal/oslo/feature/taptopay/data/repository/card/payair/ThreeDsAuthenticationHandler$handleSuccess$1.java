package com.paypal.oslo.feature.taptopay.data.repository.card.payair;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler", f = "ThreeDsAuthenticationHandler.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5}, l = {136, 142, 155, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 176}, m = "handleSuccess", n = {"$this$handleSuccess", "networkTokenReference", "proofOfAuth", "$this$handleSuccess", "networkTokenReference", "proofOfAuth", "result", "$this$handleSuccess", "networkTokenReference", "proofOfAuth", "result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "$this$handleSuccess", "networkTokenReference", "proofOfAuth", "result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "$this$handleSuccess", "networkTokenReference", "proofOfAuth", "result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "$this$handleSuccess", "networkTokenReference", "proofOfAuth", "result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 143, 156, 165, 176, 179}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes5.dex */
final class ThreeDsAuthenticationHandler$handleSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler.access$handleSuccess(this.getOutputMinFrameDuration, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThreeDsAuthenticationHandler$handleSuccess$1(com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler threeDsAuthenticationHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.card.payair.ThreeDsAuthenticationHandler$handleSuccess$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = threeDsAuthenticationHandler;
    }
}
