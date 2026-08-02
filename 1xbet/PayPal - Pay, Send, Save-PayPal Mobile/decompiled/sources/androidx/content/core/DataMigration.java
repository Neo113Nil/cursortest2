package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/datastore/core/DataMigration;", "T", "", "currentData", "", "shouldMigrate", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "migrate", "", "cleanUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DataMigration<T> {
    java.lang.Object cleanUp(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object migrate(T t, kotlin.coroutines.Continuation<? super T> continuation);

    java.lang.Object shouldMigrate(T t, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
}
