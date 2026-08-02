package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeZipIterable<T, R> extends io.reactivex.Maybe<R> {
    final java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoFpsRangesFor;

    public MaybeZipIterable(java.lang.Iterable<? extends io.reactivex.MaybeSource<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
        this.getHighSpeedVideoFpsRanges = iterable;
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        io.reactivex.MaybeSource[] maybeSourceArr = new io.reactivex.MaybeSource[8];
        try {
            int i = 0;
            for (io.reactivex.MaybeSource<? extends T> maybeSource : this.getHighSpeedVideoFpsRanges) {
                if (maybeSource == null) {
                    io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), maybeObserver);
                    return;
                }
                if (i == maybeSourceArr.length) {
                    maybeSourceArr = (io.reactivex.MaybeSource[]) java.util.Arrays.copyOf(maybeSourceArr, (i >> 2) + i);
                }
                maybeSourceArr[i] = maybeSource;
                i++;
            }
            if (i == 0) {
                io.reactivex.internal.disposables.EmptyDisposable.complete(maybeObserver);
                return;
            }
            if (i == 1) {
                maybeSourceArr[0].subscribe(new io.reactivex.internal.operators.maybe.MaybeMap.MapMaybeObserver(maybeObserver, new io.reactivex.internal.operators.maybe.MaybeZipIterable.SingletonArrayFunc()));
                return;
            }
            io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator zipCoordinator = new io.reactivex.internal.operators.maybe.MaybeZipArray.ZipCoordinator(maybeObserver, i, this.getHighSpeedVideoFpsRangesFor);
            maybeObserver.onSubscribe(zipCoordinator);
            for (int i2 = 0; i2 < i && !zipCoordinator.isDisposed(); i2++) {
                maybeSourceArr[i2].subscribe(zipCoordinator.getHighResolutionOutputSizeshNQ4ISI[i2]);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, maybeObserver);
        }
    }

    /* loaded from: classes17.dex */
    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public final R apply(T t) throws java.lang.Exception {
            return (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(io.reactivex.internal.operators.maybe.MaybeZipIterable.this.getHighSpeedVideoFpsRangesFor.apply(new java.lang.Object[]{t}), "The zipper returned a null value");
        }
    }
}
