package io.reactivex.internal.observers;

/* loaded from: classes17.dex */
public abstract class DeferredScalarObserver<T, R> extends io.reactivex.internal.observers.DeferredScalarDisposable<R> implements io.reactivex.Observer<T> {
    private static final long serialVersionUID = -266195175408988651L;
    protected io.reactivex.disposables.Disposable s;

    public DeferredScalarObserver(io.reactivex.Observer<? super R> observer) {
        super(observer);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.validate(this.s, disposable)) {
            this.s = disposable;
            this.actual.onSubscribe(this);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        this.value = null;
        error(th);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        T t = this.value;
        if (t != null) {
            this.value = null;
            complete(t);
        } else {
            complete();
        }
    }

    @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
    public void dispose() {
        super.dispose();
        this.s.dispose();
    }
}
