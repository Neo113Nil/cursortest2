package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTake<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long getHighSpeedVideoSizes;

    public ObservableTake(io.reactivex.ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.getHighSpeedVideoSizes = j;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableTake.TakeObserver(observer, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class TakeObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        long getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        TakeObserver(io.reactivex.Observer<? super T> observer, long j) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.complete(this.getHighSpeedVideoFpsRanges);
                    return;
                }
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            long j2 = j - 1;
            this.getHighResolutionOutputSizeshNQ4ISI = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.getHighSpeedVideoFpsRanges.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }
    }
}
