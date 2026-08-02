package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker", f = "NotifyCardResumedWorker.kt", i = {}, l = {40}, m = "doWork", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class NotifyCardResumedWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyCardResumedWorker$doWork$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker notifyCardResumedWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardResumedWorker$doWork$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = notifyCardResumedWorker;
    }
}
