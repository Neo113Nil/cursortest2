package com.paypal.oslo.feature.pushnotification.delivery.data.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker", f = "ProcessNotificationActionWorker.kt", i = {0, 0}, l = {74}, m = "doWork", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "code"}, nl = {95}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class ProcessNotificationActionWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProcessNotificationActionWorker$doWork$1(com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker processNotificationActionWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.delivery.data.worker.ProcessNotificationActionWorker$doWork$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = processNotificationActionWorker;
    }
}
