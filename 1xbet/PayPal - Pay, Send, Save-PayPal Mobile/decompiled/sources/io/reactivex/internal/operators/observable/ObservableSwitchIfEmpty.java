package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSwitchIfEmpty<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableSwitchIfEmpty(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty.SwitchIfEmptyObserver switchIfEmptyObserver = new io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty.SwitchIfEmptyObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI);
        observer.onSubscribe(switchIfEmptyObserver.getHighSpeedVideoSizes);
        this.source.subscribe(switchIfEmptyObserver);
    }

    /* loaded from: classes17.dex */
    static final class SwitchIfEmptyObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.ObservableSource<? extends T> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor = true;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoSizes = new io.reactivex.internal.disposables.SequentialDisposable();

        SwitchIfEmptyObserver(io.reactivex.Observer<? super T> observer, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.Camera2StreamConfigurationMap = observableSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.update(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = false;
            }
            this.getHighSpeedVideoFpsRanges.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = false;
                this.Camera2StreamConfigurationMap.subscribe(this);
            } else {
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }
    }
}
