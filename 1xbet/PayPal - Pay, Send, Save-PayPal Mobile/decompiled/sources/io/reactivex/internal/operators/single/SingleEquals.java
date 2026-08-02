package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleEquals<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.SingleSource<? extends T> Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRangesFor;

    public SingleEquals(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.SingleSource<? extends T> singleSource2) {
        this.Camera2StreamConfigurationMap = singleSource;
        this.getHighSpeedVideoFpsRangesFor = singleSource2;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        java.lang.Object[] objArr = {null, null};
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        singleObserver.onSubscribe(compositeDisposable);
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.single.SingleEquals.InnerObserver(0, compositeDisposable, objArr, singleObserver, atomicInteger));
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.single.SingleEquals.InnerObserver(1, compositeDisposable, objArr, singleObserver, atomicInteger));
    }

    /* loaded from: classes17.dex */
    static class InnerObserver<T> implements io.reactivex.SingleObserver<T> {
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap;
        final io.reactivex.disposables.CompositeDisposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        final java.lang.Object[] getHighSpeedVideoSizes;

        InnerObserver(int i, io.reactivex.disposables.CompositeDisposable compositeDisposable, java.lang.Object[] objArr, io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = compositeDisposable;
            this.getHighSpeedVideoSizes = objArr;
            this.getHighSpeedVideoFpsRanges = singleObserver;
            this.Camera2StreamConfigurationMap = atomicInteger;
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t) {
            this.getHighSpeedVideoSizes[this.getHighSpeedVideoFpsRangesFor] = t;
            if (this.Camera2StreamConfigurationMap.incrementAndGet() == 2) {
                io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver = this.getHighSpeedVideoFpsRanges;
                java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
                singleObserver.onSuccess(java.lang.Boolean.valueOf(io.reactivex.internal.functions.ObjectHelper.equals(objArr[0], objArr[1])));
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable th) {
            int i;
            do {
                i = this.Camera2StreamConfigurationMap.get();
                if (i >= 2) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
            } while (!this.Camera2StreamConfigurationMap.compareAndSet(i, 2));
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighSpeedVideoFpsRanges.onError(th);
        }
    }
}
