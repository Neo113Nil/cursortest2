package com.paypal.oslo.core.telemetry.vendors.adjust;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager", f = "AdjustThirdPartySharingManager.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {87, 94}, m = "onUpdateThirdPartySharing", n = {"user", "primaryAddress", "isInRestrictedLocation", "shouldEnableThirdParty", "user", "primaryAddress", "logAttributes", "isInRestrictedLocation", "shouldEnableThirdParty"}, nl = {89, 96}, s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "L$2", "Z$0", "I$0"}, v = 2)
/* loaded from: classes10.dex */
final class AdjustThirdPartySharingManager$onUpdateThirdPartySharing$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdjustThirdPartySharingManager$onUpdateThirdPartySharing$2(com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager adjustThirdPartySharingManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager$onUpdateThirdPartySharing$2> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = adjustThirdPartySharingManager;
    }
}
