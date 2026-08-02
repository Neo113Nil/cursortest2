package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleZipIterable<T, R> extends io.reactivex.Single<R> {
    final java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoFpsRangesFor;

    public SingleZipIterable(java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
        this.getHighSpeedVideoFpsRanges = iterable;
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        io.reactivex.SingleSource[] singleSourceArr = new io.reactivex.SingleSource[8];
        try {
            int i = 0;
            for (io.reactivex.SingleSource<? extends T> singleSource : this.getHighSpeedVideoFpsRanges) {
                if (singleSource == null) {
                    io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), singleObserver);
                    return;
                }
                if (i == singleSourceArr.length) {
                    singleSourceArr = (io.reactivex.SingleSource[]) java.util.Arrays.copyOf(singleSourceArr, (i >> 2) + i);
                }
                singleSourceArr[i] = singleSource;
                i++;
            }
            if (i == 0) {
                io.reactivex.internal.disposables.EmptyDisposable.error(new java.util.NoSuchElementException(), singleObserver);
                return;
            }
            if (i == 1) {
                singleSourceArr[0].subscribe(new io.reactivex.internal.operators.single.SingleMap.MapSingleObserver(singleObserver, new io.reactivex.internal.operators.single.SingleZipIterable.SingletonArrayFunc()));
                return;
            }
            io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator zipCoordinator = new io.reactivex.internal.operators.single.SingleZipArray.ZipCoordinator(singleObserver, i, this.getHighSpeedVideoFpsRangesFor);
            singleObserver.onSubscribe(zipCoordinator);
            for (int i2 = 0; i2 < i && !zipCoordinator.isDisposed(); i2++) {
                singleSourceArr[i2].subscribe(zipCoordinator.getHighSpeedVideoFpsRanges[i2]);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }

    /* loaded from: classes17.dex */
    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public final R apply(T t) throws java.lang.Exception {
            return (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(io.reactivex.internal.operators.single.SingleZipIterable.this.getHighSpeedVideoFpsRangesFor.apply(new java.lang.Object[]{t}), "The zipper returned a null value");
        }
    }
}
