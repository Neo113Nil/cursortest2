package com.paypal.oslo.core.telemetry.vendors.adjust;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager", f = "AdjustThirdPartySharingManager.kt", i = {0, 0}, l = {105}, m = "updateThirdPartySharing", n = {"adjustThirdPartySharing", "enable"}, nl = {106}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes10.dex */
final class AdjustThirdPartySharingManager$updateThirdPartySharing$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(false, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdjustThirdPartySharingManager$updateThirdPartySharing$1(com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager adjustThirdPartySharingManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$updateThirdPartySharing$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = adjustThirdPartySharingManager;
    }
}
