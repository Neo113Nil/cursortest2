package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096A¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096A¢\u0006\u0004\b\u000b\u0010\tJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\b\u001a\u00020\fH\u0096A¢\u0006\u0004\b\u000b\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/CardSyncStore;", "", "T", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ReadWriteStore;", "p0", "<init>", "(Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ReadWriteStore;)V", "", "clear", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "read", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "write", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/AddCardStore;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/DeleteCardStore;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/ResumeCardStore;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/SuspendCardStore;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/UpdateCardStore;", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/store/UploadTncStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CardSyncStore<T> implements com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadWriteStore<T> {
    public static final int $stable = 8;
    private final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadWriteStore<T> Camera2StreamConfigurationMap;

    private CardSyncStore(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadWriteStore<T> readWriteStore) {
        this.Camera2StreamConfigurationMap = readWriteStore;
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.WriteStore
    public java.lang.Object write(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.Camera2StreamConfigurationMap.write(t, continuation);
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore
    public java.lang.Object read(boolean z, kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        return this.Camera2StreamConfigurationMap.read(z, continuation);
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore
    public java.lang.Object read(kotlin.coroutines.Continuation<? super java.util.Set<? extends T>> continuation) {
        return this.Camera2StreamConfigurationMap.read(continuation);
    }

    @Override // com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadStore
    public java.lang.Object clear(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.Camera2StreamConfigurationMap.clear(continuation);
    }

    public /* synthetic */ CardSyncStore(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.store.ReadWriteStore readWriteStore, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(readWriteStore);
    }
}
