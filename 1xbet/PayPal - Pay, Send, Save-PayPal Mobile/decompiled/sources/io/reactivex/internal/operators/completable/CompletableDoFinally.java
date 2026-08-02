package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableDoFinally extends io.reactivex.Completable {
    final io.reactivex.CompletableSource Camera2StreamConfigurationMap;
    final io.reactivex.functions.Action getHighSpeedVideoSizes;

    public CompletableDoFinally(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Action action) {
        this.Camera2StreamConfigurationMap = completableSource;
        this.getHighSpeedVideoSizes = action;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.completable.CompletableDoFinally.DoFinallyObserver(completableObserver, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class DoFinallyObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.functions.Action getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        DoFinallyObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Action action) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = action;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.run();
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
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
