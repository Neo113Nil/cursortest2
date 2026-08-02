package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager", f = "SdkTokenManager.kt", i = {0}, l = {58}, m = "getCard", n = {"digitizedCardId"}, nl = {60}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class SdkTokenManager$getCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getCard(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkTokenManager$getCard$1(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCard$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = sdkTokenManager;
    }
}
