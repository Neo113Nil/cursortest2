package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite", f = "DataStoreReadWrite.kt", i = {}, l = {35}, m = "read", n = {}, nl = {36}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class DataStoreReadWrite$read$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite<T> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.read(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreReadWrite$read$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite<T> dataStoreReadWrite, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$read$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = dataStoreReadWrite;
    }
}
