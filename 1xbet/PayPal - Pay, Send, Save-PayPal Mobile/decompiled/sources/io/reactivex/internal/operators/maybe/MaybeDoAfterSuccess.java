package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeDoAfterSuccess<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoFpsRangesFor;

    public MaybeDoAfterSuccess(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Consumer<? super T> consumer) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRangesFor = consumer;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess.DoAfterObserver(maybeObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class DoAfterObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoFpsRanges;

        DoAfterObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Consumer<? super T> consumer) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
            this.getHighSpeedVideoFpsRanges = consumer;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            try {
                this.getHighSpeedVideoFpsRanges.accept(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }
    }
}
