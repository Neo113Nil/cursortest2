package androidx.datastore.core;

/* compiled from: StorageConnection.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@¢\u0006\u0002\u0010\u0003\u001a&\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0006\u001a\u0002H\u0001H\u0086@¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"readData", "T", "Landroidx/datastore/core/StorageConnection;", "(Landroidx/datastore/core/StorageConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "", "value", "(Landroidx/datastore/core/StorageConnection;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StorageConnectionKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.lang.Object readData(androidx.datastore.core.StorageConnection<T> storageConnection, kotlin.coroutines.Continuation<? super T> continuation) {
        return storageConnection.readScope(new androidx.datastore.core.StorageConnectionKt$readData$2(null), continuation);
    }

    public static final <T> java.lang.Object writeData(androidx.datastore.core.StorageConnection<T> storageConnection, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object writeScope = storageConnection.writeScope(new androidx.datastore.core.StorageConnectionKt$writeData$2(t, null), continuation);
        return writeScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeScope : kotlin.Unit.INSTANCE;
    }
}
