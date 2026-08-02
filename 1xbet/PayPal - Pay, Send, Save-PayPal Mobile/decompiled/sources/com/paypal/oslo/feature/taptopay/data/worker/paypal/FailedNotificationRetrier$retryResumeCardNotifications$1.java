package com.paypal.oslo.feature.taptopay.data.worker.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier", f = "FailedNotificationRetrier.kt", i = {}, l = {76}, m = "retryResumeCardNotifications", n = {}, nl = {111}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class FailedNotificationRetrier$retryResumeCardNotifications$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier.access$retryResumeCardNotifications(this.getHighSpeedVideoSizes, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FailedNotificationRetrier$retryResumeCardNotifications$1(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryResumeCardNotifications$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = failedNotificationRetrier;
    }
}
