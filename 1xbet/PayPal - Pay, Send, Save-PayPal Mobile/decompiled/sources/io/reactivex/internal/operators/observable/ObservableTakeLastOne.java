package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTakeLastOne<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    public ObservableTakeLastOne(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableTakeLastOne.TakeLastOneObserver(observer));
    }

    /* loaded from: classes17.dex */
    static final class TakeLastOneObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        T getHighSpeedVideoSizes;

        TakeLastOneObserver(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoFpsRanges = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes = t;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = null;
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            T t = this.getHighSpeedVideoSizes;
            if (t != null) {
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges.onNext(t);
            }
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
