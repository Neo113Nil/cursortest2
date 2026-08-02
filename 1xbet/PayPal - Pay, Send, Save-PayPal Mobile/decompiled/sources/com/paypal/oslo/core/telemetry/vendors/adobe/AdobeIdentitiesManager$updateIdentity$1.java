package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager", f = "AdobeIdentitiesManager.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2}, l = {64, 73, 79}, m = "updateIdentity", n = {"user", "newUserId", "user", "newUserId", "previousUserId", "user", "newUserId", "previousUserId", "identityItem", "identityMap"}, nl = {66, 76, 80}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes10.dex */
final class AdobeIdentitiesManager$updateIdentity$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdobeIdentitiesManager$updateIdentity$1(com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager adobeIdentitiesManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager$updateIdentity$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = adobeIdentitiesManager;
    }
}
