package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite", f = "DataStoreReadWrite.kt", i = {0, 1, 1, 1}, l = {60, 63}, m = "write", n = {com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "pendingList", "jsonString"}, nl = {61, 64}, s = {"L$0", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class DataStoreReadWrite$write$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite<T> getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputFormats.write(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreReadWrite$write$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite<T> dataStoreReadWrite, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.DataStoreReadWrite$write$1> continuation) {
        super(continuation);
        this.getInputFormats = dataStoreReadWrite;
    }
}
