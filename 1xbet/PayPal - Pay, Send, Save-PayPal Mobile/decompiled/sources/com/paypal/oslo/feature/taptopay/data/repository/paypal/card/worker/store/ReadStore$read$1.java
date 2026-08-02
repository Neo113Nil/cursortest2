package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore", f = "ReadWriteStore.kt", i = {0, 0, 1, 1, 1, 1}, l = {19, 22}, m = "read$suspendImpl", n = {"$this", "clear", "$this", "it", "clear", "$i$a$-also-ReadStore$read$2"}, nl = {20, 24}, s = {"L$0", "Z$0", "L$0", "L$2", "Z$0", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class ReadStore$read$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore<T> getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore.read$suspendImpl(this.getInputFormats, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadStore$read$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore<T> readStore, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore$read$1> continuation) {
        super(continuation);
        this.getInputFormats = readStore;
    }
}
