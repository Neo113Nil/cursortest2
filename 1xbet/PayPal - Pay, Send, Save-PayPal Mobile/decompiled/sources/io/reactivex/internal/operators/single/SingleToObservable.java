package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleToObservable<T> extends io.reactivex.Observable<T> {
    final io.reactivex.SingleSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public SingleToObservable(io.reactivex.SingleSource<? extends T> singleSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(create(observer));
    }

    public static <T> io.reactivex.SingleObserver<T> create(io.reactivex.Observer<? super T> observer) {
        return new io.reactivex.internal.operators.single.SingleToObservable.SingleToObservableObserver(observer);
    }

    /* loaded from: classes17.dex */
    static final class SingleToObservableObserver<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;

        SingleToObservableObserver(io.reactivex.Observer<? super T> observer) {
            super(observer);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.actual.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            error(th);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }
    }
}
