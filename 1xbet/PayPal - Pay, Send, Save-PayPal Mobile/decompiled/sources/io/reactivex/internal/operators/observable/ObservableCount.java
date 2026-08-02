package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableCount<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, java.lang.Long> {
    public ObservableCount(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Long> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableCount.CountObserver(observer));
    }

    static final class CountObserver implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        long getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super java.lang.Long> getHighSpeedVideoFpsRangesFor;

        CountObserver(io.reactivex.Observer<? super java.lang.Long> observer) {
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onNext(java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }
}
