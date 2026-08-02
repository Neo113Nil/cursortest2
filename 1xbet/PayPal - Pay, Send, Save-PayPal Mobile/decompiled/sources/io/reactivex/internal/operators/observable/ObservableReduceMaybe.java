package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableReduceMaybe<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.ObservableSource<T> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoFpsRangesFor;

    public ObservableReduceMaybe(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        this.getHighSpeedVideoFpsRanges = observableSource;
        this.getHighSpeedVideoFpsRangesFor = biFunction;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.observable.ObservableReduceMaybe.ReduceObserver(maybeObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ReduceObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;
        T getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoSizes;

        ReduceObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
            this.getHighSpeedVideoSizes = biFunction;
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
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            T t2 = this.getHighSpeedVideoFpsRangesFor;
            if (t2 == null) {
                this.getHighSpeedVideoFpsRangesFor = t;
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(t2, t), "The reducer returned a null value");
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            T t = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = null;
            if (t != null) {
                this.getHighSpeedVideoFpsRanges.onSuccess(t);
            } else {
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }
    }
}
