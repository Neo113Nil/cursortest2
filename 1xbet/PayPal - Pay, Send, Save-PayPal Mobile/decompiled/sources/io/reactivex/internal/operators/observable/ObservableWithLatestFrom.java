package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.ObservableSource<? extends U> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> getHighSpeedVideoSizes;

    public ObservableWithLatestFrom(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, io.reactivex.ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.getHighSpeedVideoSizes = biFunction;
        this.getHighSpeedVideoFpsRanges = observableSource2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        io.reactivex.internal.operators.observable.ObservableWithLatestFrom.WithLatestFromObserver withLatestFromObserver = new io.reactivex.internal.operators.observable.ObservableWithLatestFrom.WithLatestFromObserver(serializedObserver, this.getHighSpeedVideoSizes);
        serializedObserver.onSubscribe(withLatestFromObserver);
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.observable.ObservableWithLatestFrom.WithLastFrom(withLatestFromObserver));
        this.source.subscribe(withLatestFromObserver);
    }

    /* loaded from: classes17.dex */
    static final class WithLatestFromObserver<T, U, R> extends java.util.concurrent.atomic.AtomicReference<U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -312246233408980075L;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super R> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

        WithLatestFromObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.Camera2StreamConfigurationMap = biFunction;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRanges, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(t, u), "The combiner returned a null value"));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    dispose();
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRanges.get());
        }
    }

    /* loaded from: classes17.dex */
    final class WithLastFrom implements io.reactivex.Observer<U> {
        private final io.reactivex.internal.operators.observable.ObservableWithLatestFrom.WithLatestFromObserver<T, U, R> Camera2StreamConfigurationMap;

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        WithLastFrom(io.reactivex.internal.operators.observable.ObservableWithLatestFrom.WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.Camera2StreamConfigurationMap = withLatestFromObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u) {
            this.Camera2StreamConfigurationMap.lazySet(u);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.observable.ObservableWithLatestFrom.WithLatestFromObserver<T, U, R> withLatestFromObserver = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.disposables.DisposableHelper.dispose(withLatestFromObserver.getHighSpeedVideoFpsRanges);
            withLatestFromObserver.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }
    }
}
