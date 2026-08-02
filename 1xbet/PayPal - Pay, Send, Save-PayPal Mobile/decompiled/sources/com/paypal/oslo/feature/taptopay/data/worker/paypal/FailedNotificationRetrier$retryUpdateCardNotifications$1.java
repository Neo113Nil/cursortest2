package com.paypal.oslo.feature.taptopay.data.worker.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier", f = "FailedNotificationRetrier.kt", i = {}, l = {96}, m = "retryUpdateCardNotifications", n = {}, nl = {111}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class FailedNotificationRetrier$retryUpdateCardNotifications$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier.access$retryUpdateCardNotifications(this.Camera2StreamConfigurationMap, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FailedNotificationRetrier$retryUpdateCardNotifications$1(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retryUpdateCardNotifications$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = failedNotificationRetrier;
    }
}
