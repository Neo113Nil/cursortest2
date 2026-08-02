package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableConcatWithCompletable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRangesFor;

    public ObservableConcatWithCompletable(io.reactivex.Observable<T> observable, io.reactivex.CompletableSource completableSource) {
        super(observable);
        this.getHighSpeedVideoFpsRangesFor = completableSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatWithCompletable.ConcatWithObserver(observer, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ConcatWithObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -1953724749712440952L;
        io.reactivex.CompletableSource getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        ConcatWithObserver(io.reactivex.Observer<? super T> observer, io.reactivex.CompletableSource completableSource) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRanges = completableSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (!io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable) || this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoSizes.onSubscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoSizes.onComplete();
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, null);
            io.reactivex.CompletableSource completableSource = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = null;
            completableSource.subscribe(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
