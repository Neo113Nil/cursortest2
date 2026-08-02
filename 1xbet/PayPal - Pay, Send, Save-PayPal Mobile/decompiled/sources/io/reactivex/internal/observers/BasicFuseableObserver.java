package io.reactivex.internal.observers;

/* loaded from: classes17.dex */
public abstract class BasicFuseableObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.internal.fuseable.QueueDisposable<R> {
    protected final io.reactivex.Observer<? super R> actual;
    protected boolean done;
    protected io.reactivex.internal.fuseable.QueueDisposable<T> qs;
    protected io.reactivex.disposables.Disposable s;
    protected int sourceMode;

    protected void afterDownstream() {
    }

    protected boolean beforeDownstream() {
        return true;
    }

    public BasicFuseableObserver(io.reactivex.Observer<? super R> observer) {
        this.actual = observer;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.validate(this.s, disposable)) {
            this.s = disposable;
            if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                this.qs = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
            }
            if (beforeDownstream()) {
                this.actual.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        } else {
            this.done = true;
            this.actual.onError(th);
        }
    }

    protected final void fail(java.lang.Throwable th) {
        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
        this.s.dispose();
        onError(th);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.actual.onComplete();
    }

    protected final int transitiveBoundaryFusion(int i) {
        io.reactivex.internal.fuseable.QueueDisposable<T> queueDisposable = this.qs;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = queueDisposable.requestFusion(i);
        if (requestFusion != 0) {
            this.sourceMode = requestFusion;
        }
        return requestFusion;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.s.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.s.isDisposed();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.qs.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.qs.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r, R r2) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }
}
