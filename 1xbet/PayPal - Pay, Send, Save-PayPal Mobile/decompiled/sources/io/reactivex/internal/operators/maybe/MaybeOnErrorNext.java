package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeOnErrorNext<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoSizes;

    public MaybeOnErrorNext(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> function, boolean z) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeOnErrorNext.OnErrorNextMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class OnErrorNextMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2026620218879969836L;
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> getHighSpeedVideoFpsRanges;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

        OnErrorNextMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> function, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
            this.getHighSpeedVideoFpsRanges = function;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI && !(th instanceof java.lang.Exception)) {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                return;
            }
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(th), "The resumeFunction returned a null MaybeSource");
                io.reactivex.internal.disposables.DisposableHelper.replace(this, null);
                maybeSource.subscribe(new io.reactivex.internal.operators.maybe.MaybeOnErrorNext.OnErrorNextMaybeObserver.NextMaybeObserver(this.getHighSpeedVideoFpsRangesFor, this));
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoFpsRangesFor.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        static final class NextMaybeObserver<T> implements io.reactivex.MaybeObserver<T> {
            final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
            final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

            NextMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference) {
                this.getHighSpeedVideoFpsRangesFor = maybeObserver;
                this.getHighResolutionOutputSizeshNQ4ISI = atomicReference;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(T t) {
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            }
        }
    }
}
