package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager", f = "AdobeIdentitiesManager.kt", i = {1}, l = {84, 85}, m = "removeIdentity", n = {"previousUserId"}, nl = {85, 86}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class AdobeIdentitiesManager$removeIdentity$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdobeIdentitiesManager$removeIdentity$1(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager adobeIdentitiesManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = adobeIdentitiesManager;
    }
}
