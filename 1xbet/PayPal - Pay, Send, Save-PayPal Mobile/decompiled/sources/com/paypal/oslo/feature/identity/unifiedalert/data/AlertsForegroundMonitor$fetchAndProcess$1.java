package com.paypal.oslo.feature.identity.unifiedalert.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor", f = "AlertsForegroundMonitor.kt", i = {1, 1, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {107, 109, 113, 115, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 135, 142, 159}, m = "fetchAndProcess", n = {"$this$fetchAndProcess_u24lambda_u240", "$i$a$-run-AlertsForegroundMonitor$fetchAndProcess$deviceToken$1", "deviceToken", "deviceToken", "$this$fetchAndProcess_u24lambda_u241", "$i$a$-run-AlertsForegroundMonitor$fetchAndProcess$publicCredential$1", "deviceToken", "publicCredential", "input", "deviceToken", "publicCredential", "input", "alert", "deviceToken", "publicCredential", "input", "alert", "action", "deviceToken", "publicCredential", "input", "alert", "action"}, nl = {108, 110, 114, 116, 183, 136, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {"L$0", "I$0", "L$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes5.dex */
final class AlertsForegroundMonitor$fetchAndProcess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputMinFrameDuration = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputFormats.Camera2StreamConfigurationMap(this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AlertsForegroundMonitor$fetchAndProcess$1(com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor alertsForegroundMonitor, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.AlertsForegroundMonitor$fetchAndProcess$1> continuation) {
        super(continuation);
        this.getInputFormats = alertsForegroundMonitor;
    }
}
