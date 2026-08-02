package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSkipLast<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final int Camera2StreamConfigurationMap;

    public ObservableSkipLast(io.reactivex.ObservableSource<T> observableSource, int i) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSkipLast.SkipLastObserver(observer, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class SkipLastObserver<T> extends java.util.ArrayDeque<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3807491841935125653L;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        SkipLastObserver(io.reactivex.Observer<? super T> observer, int i) {
            super(i);
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == size()) {
                this.getHighSpeedVideoFpsRanges.onNext(poll());
            }
            offer(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
