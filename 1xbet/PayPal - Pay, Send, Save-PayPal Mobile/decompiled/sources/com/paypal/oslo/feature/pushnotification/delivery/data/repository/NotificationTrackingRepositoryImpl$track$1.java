package com.paypal.oslo.feature.pushnotification.delivery.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl", f = "NotificationTrackingRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {56}, m = "track", n = {"trackingTokens", "status", "input", "mutation"}, nl = {64}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class NotificationTrackingRepositoryImpl$track$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationTrackingRepositoryImpl$track$1(com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl notificationTrackingRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.data.repository.NotificationTrackingRepositoryImpl$track$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = notificationTrackingRepositoryImpl;
    }
}
