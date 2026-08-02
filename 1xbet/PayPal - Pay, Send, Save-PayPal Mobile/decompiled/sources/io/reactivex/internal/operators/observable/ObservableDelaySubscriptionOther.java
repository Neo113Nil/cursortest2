package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableSource<U> Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoSizes;

    public ObservableDelaySubscriptionOther(io.reactivex.ObservableSource<? extends T> observableSource, io.reactivex.ObservableSource<U> observableSource2) {
        this.getHighSpeedVideoSizes = observableSource;
        this.Camera2StreamConfigurationMap = observableSource2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver(sequentialDisposable, observer));
    }

    /* loaded from: classes17.dex */
    final class DelayObserver implements io.reactivex.Observer<U> {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoSizes;

        DelayObserver(io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable, io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoSizes = sequentialDisposable;
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.update(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u) {
            onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.OnComplete());
        }

        final class OnComplete implements io.reactivex.Observer<T> {
            OnComplete() {
            }

            @Override // io.reactivex.Observer
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.this.getHighSpeedVideoSizes.update(disposable);
            }

            @Override // io.reactivex.Observer
            public final void onNext(T t) {
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.this.getHighSpeedVideoFpsRangesFor.onNext(t);
            }

            @Override // io.reactivex.Observer
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.this.getHighSpeedVideoFpsRangesFor.onError(th);
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther.DelayObserver.this.getHighSpeedVideoFpsRangesFor.onComplete();
            }
        }
    }
}
