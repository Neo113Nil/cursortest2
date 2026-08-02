package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager", f = "AdobeIdentitiesManager.kt", i = {0, 0}, l = {91}, m = "removeIdentity", n = {"previousUserId", "item"}, nl = {92}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class AdobeIdentitiesManager$removeIdentity$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdobeIdentitiesManager$removeIdentity$2(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager adobeIdentitiesManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$removeIdentity$2> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = adobeIdentitiesManager;
    }
}
