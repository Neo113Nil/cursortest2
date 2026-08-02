package com.paypal.oslo.feature.identity.unifiedalert.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor", f = "AlertsForegroundMonitor.kt", i = {3, 4}, l = {82, 87, 94, 96, 99}, m = "checkForAlerts", n = {"e", "e"}, nl = {83, 88, 95, 97, 100}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes5.dex */
final class AlertsForegroundMonitor$checkForAlerts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertsForegroundMonitor$checkForAlerts$1(com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor alertsForegroundMonitor, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor$checkForAlerts$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = alertsForegroundMonitor;
    }
}
