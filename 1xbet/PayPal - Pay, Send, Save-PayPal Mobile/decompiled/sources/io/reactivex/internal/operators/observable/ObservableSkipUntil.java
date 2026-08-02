package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSkipUntil<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<U> Camera2StreamConfigurationMap;

    public ObservableSkipUntil(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<U> observableSource2) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = observableSource2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable = new io.reactivex.internal.disposables.ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver skipUntilObserver = new io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver(serializedObserver, arrayCompositeDisposable);
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntil(arrayCompositeDisposable, skipUntilObserver, serializedObserver));
        this.source.subscribe(skipUntilObserver);
    }

    /* loaded from: classes17.dex */
    static final class SkipUntilObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable getHighSpeedVideoSizes;

        SkipUntilObserver(io.reactivex.Observer<? super T> observer, io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoSizes = arrayCompositeDisposable;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoSizes.setResource(0, disposable);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap.onNext(t);
            } else if (this.getHighSpeedVideoFpsRanges) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.Camera2StreamConfigurationMap.onNext(t);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.dispose();
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoSizes.dispose();
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    final class SkipUntil implements io.reactivex.Observer<U> {
        private final io.reactivex.internal.disposables.ArrayCompositeDisposable Camera2StreamConfigurationMap;
        private final io.reactivex.observers.SerializedObserver<T> getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        private final io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver<T> getHighSpeedVideoSizes;

        SkipUntil(io.reactivex.internal.disposables.ArrayCompositeDisposable arrayCompositeDisposable, io.reactivex.internal.operators.observable.ObservableSkipUntil.SkipUntilObserver<T> skipUntilObserver, io.reactivex.observers.SerializedObserver<T> serializedObserver) {
            this.Camera2StreamConfigurationMap = arrayCompositeDisposable;
            this.getHighSpeedVideoSizes = skipUntilObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = serializedObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.Camera2StreamConfigurationMap.setResource(1, disposable);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u) {
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = true;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.dispose();
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = true;
        }
    }
}
