package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker", f = "NotifyCardDeletedWorker.kt", i = {}, l = {40}, m = "doWork", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class NotifyCardDeletedWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyCardDeletedWorker$doWork$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker notifyCardDeletedWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardDeletedWorker$doWork$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = notifyCardDeletedWorker;
    }
}
