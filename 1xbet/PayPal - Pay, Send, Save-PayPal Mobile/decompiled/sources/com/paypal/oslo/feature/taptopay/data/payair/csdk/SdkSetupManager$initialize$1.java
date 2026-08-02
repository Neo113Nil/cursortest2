package com.paypal.oslo.feature.taptopay.data.payair.csdk;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager", f = "SdkSetupManager.kt", i = {0, 0, 0}, l = {60}, m = "initialize", n = {"schemes", "baseUrl", "paymentActivity"}, nl = {68}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class SdkSetupManager$initialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.initialize(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SdkSetupManager$initialize$1(com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager sdkSetupManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.payair.csdk.SdkSetupManager$initialize$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = sdkSetupManager;
    }
}
