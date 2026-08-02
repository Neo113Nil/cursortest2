package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableConcatWithMaybe<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> getHighSpeedVideoSizes;

    public ObservableConcatWithMaybe(io.reactivex.Observable<T> observable, io.reactivex.MaybeSource<? extends T> maybeSource) {
        super(observable);
        this.getHighSpeedVideoSizes = maybeSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableConcatWithMaybe.ConcatWithObserver(observer, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class ConcatWithObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -1953724749712440952L;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.MaybeSource<? extends T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;

        ConcatWithObserver(io.reactivex.Observer<? super T> observer, io.reactivex.MaybeSource<? extends T> maybeSource) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoFpsRanges = maybeSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (!io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable) || this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.internal.disposables.DisposableHelper.replace(this, null);
            io.reactivex.MaybeSource<? extends T> maybeSource = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = null;
            maybeSource.subscribe(this);
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
