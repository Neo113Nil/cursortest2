package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableMapNotification<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.ObservableSource<? extends R>> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> Camera2StreamConfigurationMap;
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> getHighSpeedVideoSizes;

    public ObservableMapNotification(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> function2, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> callable) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoSizes = function2;
        this.getHighSpeedVideoFpsRanges = callable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableMapNotification.MapNotificationObserver(observer, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class MapNotificationObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> getHighSpeedVideoSizes;

        MapNotificationObserver(io.reactivex.Observer<? super io.reactivex.ObservableSource<? extends R>> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends R>> function2, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<? extends R>> callable) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoFpsRangesFor = function;
            this.getHighSpeedVideoSizes = function2;
            this.Camera2StreamConfigurationMap = callable;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
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
        public final void onNext(T t) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(t), "The onNext ObservableSource returned is null"));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(th), "The onError ObservableSource returned is null"));
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The onComplete ObservableSource returned is null"));
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }
    }
}
