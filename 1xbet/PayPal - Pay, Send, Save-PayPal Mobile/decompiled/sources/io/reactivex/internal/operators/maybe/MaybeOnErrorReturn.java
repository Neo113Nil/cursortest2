package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeOnErrorReturn<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeOnErrorReturn(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function) {
        super(maybeSource);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeOnErrorReturn.OnErrorReturnMaybeObserver(maybeObserver, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class OnErrorReturnMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        OnErrorReturnMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(th), "The valueSupplier returned a null value"));
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }
    }
}
