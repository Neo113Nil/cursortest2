package com.paypal.oslo.feature.taptopay.data.worker.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier", f = "FailedNotificationRetrier.kt", i = {}, l = {86}, m = "retrySuspendCardNotifications", n = {}, nl = {111}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class FailedNotificationRetrier$retrySuspendCardNotifications$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier.access$retrySuspendCardNotifications(this.getHighResolutionOutputSizeshNQ4ISI, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FailedNotificationRetrier$retrySuspendCardNotifications$1(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$retrySuspendCardNotifications$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = failedNotificationRetrier;
    }
}
