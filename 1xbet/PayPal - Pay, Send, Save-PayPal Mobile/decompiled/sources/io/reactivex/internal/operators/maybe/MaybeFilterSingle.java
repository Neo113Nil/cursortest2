package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFilterSingle<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRangesFor;

    public MaybeFilterSingle(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Predicate<? super T> predicate) {
        this.getHighSpeedVideoFpsRangesFor = singleSource;
        this.getHighSpeedVideoFpsRanges = predicate;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.maybe.MaybeFilterSingle.FilterMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class FilterMaybeObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

        FilterMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
            this.getHighSpeedVideoFpsRanges = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.disposables.Disposable disposable = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                if (this.getHighSpeedVideoFpsRanges.test(t)) {
                    this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
                } else {
                    this.getHighSpeedVideoFpsRangesFor.onComplete();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }
    }
}
