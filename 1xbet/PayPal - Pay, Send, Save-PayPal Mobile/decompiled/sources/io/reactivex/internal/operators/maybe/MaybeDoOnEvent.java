package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeDoOnEvent<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeDoOnEvent(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> biConsumer) {
        super(maybeSource);
        this.getHighResolutionOutputSizeshNQ4ISI = biConsumer;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDoOnEvent.DoOnEventMaybeObserver(maybeObserver, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class DoOnEventMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        DoOnEventMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> biConsumer) {
            this.getHighSpeedVideoSizes = maybeObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = biConsumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
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
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(t, null);
                this.getHighSpeedVideoSizes.onSuccess(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(null, th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(null, null);
                this.getHighSpeedVideoSizes.onComplete();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes.onError(th);
            }
        }
    }
}
