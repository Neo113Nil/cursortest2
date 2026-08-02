package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeDoFinally<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;

    public MaybeDoFinally(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Action action) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRanges = action;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDoFinally.DoFinallyObserver(maybeObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class DoFinallyObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Action getHighSpeedVideoSizes;

        DoFinallyObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Action action) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
            this.getHighSpeedVideoSizes = action;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRanges.onSuccess(t);
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoSizes.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoSizes.run();
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoSizes.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoSizes.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }
    }
}
