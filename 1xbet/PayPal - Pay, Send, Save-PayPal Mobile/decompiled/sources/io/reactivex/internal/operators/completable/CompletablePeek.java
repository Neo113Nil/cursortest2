package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletablePeek extends io.reactivex.Completable {
    final io.reactivex.functions.Action Camera2StreamConfigurationMap;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoSizes;
    final io.reactivex.functions.Action getHighSpeedVideoSizesFor;
    final io.reactivex.CompletableSource getOutputFormats;

    public CompletablePeek(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2, io.reactivex.functions.Action action3, io.reactivex.functions.Action action4) {
        this.getOutputFormats = completableSource;
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
        this.getHighSpeedVideoSizes = consumer2;
        this.Camera2StreamConfigurationMap = action;
        this.getHighSpeedVideoSizesFor = action2;
        this.getHighSpeedVideoFpsRangesFor = action3;
        this.getHighSpeedVideoFpsRanges = action4;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getOutputFormats.subscribe(new io.reactivex.internal.operators.completable.CompletablePeek.CompletableObserverImplementation(completableObserver));
    }

    /* loaded from: classes17.dex */
    final class CompletableObserverImplementation implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        CompletableObserverImplementation(io.reactivex.CompletableObserver completableObserver) {
            this.Camera2StreamConfigurationMap = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.getHighResolutionOutputSizeshNQ4ISI.accept(disposable);
                if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                    this.getHighSpeedVideoFpsRangesFor = disposable;
                    this.Camera2StreamConfigurationMap.onSubscribe(this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                disposable.dispose();
                this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                io.reactivex.internal.disposables.EmptyDisposable.error(th, this.Camera2StreamConfigurationMap);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.getHighSpeedVideoSizes.accept(th);
                io.reactivex.internal.operators.completable.CompletablePeek.this.getHighSpeedVideoSizesFor.run();
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.Camera2StreamConfigurationMap.onError(th);
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.getHighSpeedVideoFpsRangesFor.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.Camera2StreamConfigurationMap.run();
                io.reactivex.internal.operators.completable.CompletablePeek.this.getHighSpeedVideoSizesFor.run();
                this.Camera2StreamConfigurationMap.onComplete();
                try {
                    io.reactivex.internal.operators.completable.CompletablePeek.this.getHighSpeedVideoFpsRangesFor.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.Camera2StreamConfigurationMap.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            try {
                io.reactivex.internal.operators.completable.CompletablePeek.this.getHighSpeedVideoFpsRanges.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }
    }
}
