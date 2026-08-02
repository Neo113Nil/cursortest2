package io.reactivex.internal.disposables;

/* loaded from: classes17.dex */
public enum EmptyDisposable implements io.reactivex.internal.fuseable.QueueDisposable<java.lang.Object> {
    INSTANCE,
    NEVER;

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final java.lang.Object poll() throws java.lang.Exception {
        return null;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i) {
        return i & 2;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void complete(io.reactivex.Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onComplete();
    }

    public static void complete(io.reactivex.MaybeObserver<?> maybeObserver) {
        maybeObserver.onSubscribe(INSTANCE);
        maybeObserver.onComplete();
    }

    public static void error(java.lang.Throwable th, io.reactivex.Observer<?> observer) {
        observer.onSubscribe(INSTANCE);
        observer.onError(th);
    }

    public static void complete(io.reactivex.CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onComplete();
    }

    public static void error(java.lang.Throwable th, io.reactivex.CompletableObserver completableObserver) {
        completableObserver.onSubscribe(INSTANCE);
        completableObserver.onError(th);
    }

    public static void error(java.lang.Throwable th, io.reactivex.SingleObserver<?> singleObserver) {
        singleObserver.onSubscribe(INSTANCE);
        singleObserver.onError(th);
    }

    public static void error(java.lang.Throwable th, io.reactivex.MaybeObserver<?> maybeObserver) {
        maybeObserver.onSubscribe(INSTANCE);
        maybeObserver.onError(th);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }
}
