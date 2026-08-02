package androidx.work.impl.utils.futures;

/* loaded from: classes7.dex */
public final class SettableFuture<V> extends androidx.work.impl.utils.futures.AbstractFuture<V> {
    public static <V> androidx.work.impl.utils.futures.SettableFuture<V> create() {
        return new androidx.work.impl.utils.futures.SettableFuture<>();
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public final boolean set(V v) {
        return super.set(v);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public final boolean setException(java.lang.Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.work.impl.utils.futures.AbstractFuture
    public final boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }

    private SettableFuture() {
    }
}
