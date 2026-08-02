package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybePeek<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Action getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Action getHighSpeedVideoSizes;
    final io.reactivex.functions.Consumer<? super T> getInputSizeshNQ4ISI;

    public MaybePeek(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer, io.reactivex.functions.Consumer<? super T> consumer2, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer3, io.reactivex.functions.Action action, io.reactivex.functions.Action action2, io.reactivex.functions.Action action3) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRangesFor = consumer;
        this.getInputSizeshNQ4ISI = consumer2;
        this.Camera2StreamConfigurationMap = consumer3;
        this.getHighResolutionOutputSizeshNQ4ISI = action;
        this.getHighSpeedVideoSizes = action2;
        this.getHighSpeedVideoFpsRanges = action3;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybePeek.MaybePeekObserver(maybeObserver, this));
    }

    /* loaded from: classes17.dex */
    static final class MaybePeekObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.maybe.MaybePeek<T> getHighSpeedVideoSizes;

        MaybePeekObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.internal.operators.maybe.MaybePeek<T> maybePeek) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
            this.getHighSpeedVideoSizes = maybePeek;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            try {
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.Camera2StreamConfigurationMap.dispose();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                try {
                    this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.accept(disposable);
                    this.Camera2StreamConfigurationMap = disposable;
                    this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.getHighSpeedVideoFpsRanges);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            if (this.Camera2StreamConfigurationMap == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI.accept(t);
                this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                this.getHighSpeedVideoFpsRanges.onSuccess(t);
                try {
                    this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                Camera2StreamConfigurationMap(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                Camera2StreamConfigurationMap(th);
            }
        }

        private void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            try {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRanges.onError(th);
            try {
                this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.run();
                this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
                this.getHighSpeedVideoFpsRanges.onComplete();
                try {
                    this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                Camera2StreamConfigurationMap(th2);
            }
        }
    }
}
