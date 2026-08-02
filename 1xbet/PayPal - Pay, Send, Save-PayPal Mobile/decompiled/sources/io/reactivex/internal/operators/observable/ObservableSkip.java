package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSkip<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long getHighSpeedVideoFpsRanges;

    public ObservableSkip(io.reactivex.ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = j;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSkip.SkipObserver(observer, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class SkipObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        long getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        SkipObserver(io.reactivex.Observer<? super T> observer, long j) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = j - 1;
            } else {
                this.getHighSpeedVideoFpsRanges.onNext(t);
            }
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
