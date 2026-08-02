package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager", f = "SdkTokenManager.kt", i = {0}, l = {67}, m = "getCardMetadata", n = {"digitizedCardId"}, nl = {69}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class SdkTokenManager$getCardMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getCardMetadata(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkTokenManager$getCardMetadata$1(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager sdkTokenManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkTokenManager$getCardMetadata$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = sdkTokenManager;
    }
}
