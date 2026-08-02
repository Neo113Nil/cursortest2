package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableCollect<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<? extends U> Camera2StreamConfigurationMap;
    final io.reactivex.functions.BiConsumer<? super U, ? super T> getHighSpeedVideoSizes;

    public ObservableCollect(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<? extends U> callable, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = callable;
        this.getHighSpeedVideoSizes = biConsumer;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        try {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableCollect.CollectObserver(observer, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The initialSupplier returned a null value"), this.getHighSpeedVideoSizes));
        } catch (java.lang.Throwable th) {
            io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
        }
    }

    static final class CollectObserver<T, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiConsumer<? super U, ? super T> getHighResolutionOutputSizeshNQ4ISI;
        final U getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super U> getHighSpeedVideoSizes;

        CollectObserver(io.reactivex.Observer<? super U> observer, U u, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = biConsumer;
            this.getHighSpeedVideoFpsRanges = u;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(this.getHighSpeedVideoFpsRanges, t);
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRangesFor.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizes.onNext(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
