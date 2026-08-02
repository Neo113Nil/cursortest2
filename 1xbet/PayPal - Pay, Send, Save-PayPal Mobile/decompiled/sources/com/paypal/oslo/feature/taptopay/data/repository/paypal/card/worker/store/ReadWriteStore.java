package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ReadWriteStore;", "T", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ReadStore;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/WriteStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ReadWriteStore<T> extends com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore<T>, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.WriteStore<T> {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> java.lang.Object read(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadWriteStore<T> readWriteStore, boolean z, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
            return com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadWriteStore.super.read(z, continuation);
        }
    }
}
