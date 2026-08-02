package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl", f = "PushTokenDataServiceImpl.kt", i = {0, 0, 0, 0}, l = {40}, m = "subscribePushToken", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "deviceId", "cloudIdentity", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY}, nl = {51}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class PushTokenDataServiceImpl$subscribePushToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.subscribePushToken(null, false, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushTokenDataServiceImpl$subscribePushToken$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl pushTokenDataServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl$subscribePushToken$1> continuation) {
        super(continuation);
        this.getInputFormats = pushTokenDataServiceImpl;
    }
}
