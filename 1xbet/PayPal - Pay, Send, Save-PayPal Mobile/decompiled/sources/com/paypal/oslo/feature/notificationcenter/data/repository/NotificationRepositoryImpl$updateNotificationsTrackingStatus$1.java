package com.paypal.oslo.feature.notificationcenter.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl", f = "NotificationRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {135}, m = "updateNotificationsTrackingStatus", n = {"trackingTokens", "notificationIdentifierList", "status", "raise$iv$iv$iv", "$this$updateNotificationsTrackingStatus_u24lambda_u240", "notificationStatus", "input", "graphQLNotificationIdentifiers", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-NotificationRepositoryImpl$updateNotificationsTrackingStatus$2"}, nl = {134}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class NotificationRepositoryImpl$updateNotificationsTrackingStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.updateNotificationsTrackingStatus(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationRepositoryImpl$updateNotificationsTrackingStatus$1(com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl notificationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$updateNotificationsTrackingStatus$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = notificationRepositoryImpl;
    }
}
