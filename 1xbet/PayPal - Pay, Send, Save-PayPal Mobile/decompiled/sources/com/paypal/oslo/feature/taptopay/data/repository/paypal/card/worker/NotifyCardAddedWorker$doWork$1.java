package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker", f = "NotifyCardAddedWorker.kt", i = {}, l = {40}, m = "doWork", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class NotifyCardAddedWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotifyCardAddedWorker$doWork$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker notifyCardAddedWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.NotifyCardAddedWorker$doWork$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = notifyCardAddedWorker;
    }
}
