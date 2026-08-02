package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTakeLast<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final int getHighResolutionOutputSizeshNQ4ISI;

    public ObservableTakeLast(io.reactivex.ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableTakeLast.TakeLastObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class TakeLastObserver<T> extends java.util.ArrayDeque<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 7240042530241604978L;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        TakeLastObserver(io.reactivex.Observer<? super T> observer, int i) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor == size()) {
                poll();
            }
            offer(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            io.reactivex.Observer<? super T> observer = this.getHighSpeedVideoSizes;
            while (!this.getHighSpeedVideoFpsRanges) {
                T poll = poll();
                if (poll == null) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    observer.onComplete();
                    return;
                }
                observer.onNext(poll);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }
}
