package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDoFinally<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Action Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRanges;

    public SingleDoFinally(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Action action) {
        this.getHighSpeedVideoFpsRanges = singleSource;
        this.Camera2StreamConfigurationMap = action;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.single.SingleDoFinally.DoFinallyObserver(singleObserver, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class DoFinallyObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.SingleObserver<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.functions.Action getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        DoFinallyObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.functions.Action action) {
            this.Camera2StreamConfigurationMap = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = action;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.Camera2StreamConfigurationMap.onSuccess(t);
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.run();
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }
    }
}
