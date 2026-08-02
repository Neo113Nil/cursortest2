package androidx.content.core.handlers;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/datastore/core/handlers/NoOpCorruptionHandler;", "T", "Landroidx/datastore/core/CorruptionHandler;", "<init>", "()V", "Landroidx/datastore/core/CorruptionException;", "ex", "handleCorruption", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpCorruptionHandler<T> implements androidx.content.core.CorruptionHandler<T> {
    @Override // androidx.content.core.CorruptionHandler
    public final java.lang.Object handleCorruption(androidx.content.core.CorruptionException corruptionException, kotlin.coroutines.Continuation<? super T> continuation) throws androidx.content.core.CorruptionException {
        throw corruptionException;
    }
}
