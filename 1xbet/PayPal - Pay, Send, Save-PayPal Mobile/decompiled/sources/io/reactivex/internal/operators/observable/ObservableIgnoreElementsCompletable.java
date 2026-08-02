package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableIgnoreElementsCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final io.reactivex.ObservableSource<T> getHighSpeedVideoFpsRanges;

    public ObservableIgnoreElementsCompletable(io.reactivex.ObservableSource<T> observableSource) {
        this.getHighSpeedVideoFpsRanges = observableSource;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable.IgnoreObservable(completableObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<T> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableIgnoreElements(this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class IgnoreObservable<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
        }

        IgnoreObservable(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor = disposable;
            this.getHighSpeedVideoFpsRanges.onSubscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }
    }
}
