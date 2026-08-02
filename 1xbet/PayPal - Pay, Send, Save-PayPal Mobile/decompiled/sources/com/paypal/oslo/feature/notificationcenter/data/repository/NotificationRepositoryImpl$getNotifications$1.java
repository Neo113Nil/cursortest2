package com.paypal.oslo.feature.notificationcenter.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl", f = "NotificationRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {75}, m = "getNotifications", n = {"raise$iv$iv$iv", "$this$getNotifications_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-NotificationRepositoryImpl$getNotifications$2"}, nl = {73}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class NotificationRepositoryImpl$getNotifications$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputFormats.getNotifications(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationRepositoryImpl$getNotifications$1(com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl notificationRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.data.repository.NotificationRepositoryImpl$getNotifications$1> continuation) {
        super(continuation);
        this.getOutputFormats = notificationRepositoryImpl;
    }
}
