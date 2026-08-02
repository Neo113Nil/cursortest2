package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Landroidx/datastore/core/StorageConnection;", "readData", "(Landroidx/datastore/core/StorageConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "writeData", "(Landroidx/datastore/core/StorageConnection;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StorageConnectionKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.lang.Object readData(androidx.content.core.StorageConnection<T> storageConnection, kotlin.coroutines.Continuation<? super T> continuation) {
        return storageConnection.readScope(new androidx.content.core.StorageConnectionKt$readData$2(null), continuation);
    }

    public static final <T> java.lang.Object writeData(androidx.content.core.StorageConnection<T> storageConnection, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object writeScope = storageConnection.writeScope(new androidx.content.core.StorageConnectionKt$writeData$2(t, null), continuation);
        return writeScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? writeScope : kotlin.Unit.INSTANCE;
    }
}
