package com.paypal.android.taptopay.data.thales.worker;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker", f = "ReplenishPaymentKeysWorker.kt", i = {0}, l = {34}, m = "doWork", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class ReplenishPaymentKeysWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReplenishPaymentKeysWorker$doWork$1(com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker replenishPaymentKeysWorker, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.worker.ReplenishPaymentKeysWorker$doWork$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = replenishPaymentKeysWorker;
    }
}
