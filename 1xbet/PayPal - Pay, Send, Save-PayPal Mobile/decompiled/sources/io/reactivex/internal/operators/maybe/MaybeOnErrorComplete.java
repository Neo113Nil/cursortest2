package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeOnErrorComplete<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> Camera2StreamConfigurationMap;

    public MaybeOnErrorComplete(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate) {
        super(maybeSource);
        this.Camera2StreamConfigurationMap = predicate;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeOnErrorComplete.OnErrorCompleteMaybeObserver(maybeObserver, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class OnErrorCompleteMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Predicate<? super java.lang.Throwable> getHighSpeedVideoFpsRanges;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

        OnErrorCompleteMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
            this.getHighSpeedVideoFpsRanges = predicate;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            try {
                if (this.getHighSpeedVideoFpsRanges.test(th)) {
                    this.getHighSpeedVideoFpsRangesFor.onComplete();
                } else {
                    this.getHighSpeedVideoFpsRangesFor.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoFpsRangesFor.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }
    }
}
