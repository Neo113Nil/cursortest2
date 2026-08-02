package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleAmb<T> extends io.reactivex.Single<T> {
    private final java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> Camera2StreamConfigurationMap;
    private final io.reactivex.SingleSource<? extends T>[] getHighResolutionOutputSizeshNQ4ISI;

    public SingleAmb(io.reactivex.SingleSource<? extends T>[] singleSourceArr, java.lang.Iterable<? extends io.reactivex.SingleSource<? extends T>> iterable) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSourceArr;
        this.Camera2StreamConfigurationMap = iterable;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        int length;
        io.reactivex.SingleSource<? extends T>[] singleSourceArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (singleSourceArr == null) {
            singleSourceArr = new io.reactivex.SingleSource[8];
            try {
                length = 0;
                for (io.reactivex.SingleSource<? extends T> singleSource : this.Camera2StreamConfigurationMap) {
                    if (singleSource == null) {
                        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), singleObserver);
                        return;
                    }
                    if (length == singleSourceArr.length) {
                        io.reactivex.SingleSource<? extends T>[] singleSourceArr2 = new io.reactivex.SingleSource[(length >> 2) + length];
                        java.lang.System.arraycopy(singleSourceArr, 0, singleSourceArr2, 0, length);
                        singleSourceArr = singleSourceArr2;
                    }
                    singleSourceArr[length] = singleSource;
                    length++;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
                return;
            }
        } else {
            length = singleSourceArr.length;
        }
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.internal.operators.single.SingleAmb.AmbSingleObserver ambSingleObserver = new io.reactivex.internal.operators.single.SingleAmb.AmbSingleObserver(singleObserver, compositeDisposable);
        singleObserver.onSubscribe(compositeDisposable);
        for (int i = 0; i < length; i++) {
            io.reactivex.SingleSource<? extends T> singleSource2 = singleSourceArr[i];
            if (ambSingleObserver.get()) {
                return;
            }
            if (singleSource2 == null) {
                compositeDisposable.dispose();
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("One of the sources is null");
                if (ambSingleObserver.compareAndSet(false, true)) {
                    singleObserver.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            singleSource2.subscribe(ambSingleObserver);
        }
    }

    /* loaded from: classes17.dex */
    static final class AmbSingleObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = -1944085461036028108L;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizes;

        AmbSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.disposables.CompositeDisposable compositeDisposable) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.getHighSpeedVideoSizes = compositeDisposable;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.add(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
