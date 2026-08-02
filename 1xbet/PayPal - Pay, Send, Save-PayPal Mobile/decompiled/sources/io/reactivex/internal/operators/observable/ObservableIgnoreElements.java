package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableIgnoreElements<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    public ObservableIgnoreElements(io.reactivex.ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableIgnoreElements.IgnoreObservable(observer));
    }

    /* loaded from: classes17.dex */
    static final class IgnoreObservable<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
        }

        IgnoreObservable(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.Camera2StreamConfigurationMap = disposable;
            this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }
    }
}
