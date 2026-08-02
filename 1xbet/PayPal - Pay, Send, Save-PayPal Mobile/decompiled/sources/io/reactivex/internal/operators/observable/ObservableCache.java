package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableCache<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> getHighSpeedVideoFpsRanges;

    public static <T> io.reactivex.Observable<T> from(io.reactivex.Observable<T> observable) {
        return from(observable, 16);
    }

    public static <T> io.reactivex.Observable<T> from(io.reactivex.Observable<T> observable, int i) {
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableCache(observable, new io.reactivex.internal.operators.observable.ObservableCache.CacheState(observable, i)));
    }

    private ObservableCache(io.reactivex.Observable<T> observable, io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> cacheState) {
        super(observable);
        this.getHighSpeedVideoFpsRanges = cacheState;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T>[] replayDisposableArr;
        io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[] replayDisposableArr2;
        io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable replayDisposable = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable(observer, this.getHighSpeedVideoFpsRanges);
        observer.onSubscribe(replayDisposable);
        io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> cacheState = this.getHighSpeedVideoFpsRanges;
        do {
            replayDisposableArr = cacheState.getHighResolutionOutputSizeshNQ4ISI.get();
            if (replayDisposableArr == io.reactivex.internal.operators.observable.ObservableCache.CacheState.Camera2StreamConfigurationMap) {
                break;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[length + 1];
            java.lang.System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(cacheState.getHighResolutionOutputSizeshNQ4ISI, replayDisposableArr, replayDisposableArr2));
        if (!this.getHighResolutionOutputSizeshNQ4ISI.get() && this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> cacheState2 = this.getHighSpeedVideoFpsRanges;
            cacheState2.getHighSpeedVideoSizesFor.subscribe(cacheState2);
            cacheState2.getHighSpeedVideoFpsRangesFor = true;
        }
        replayDisposable.getHighSpeedVideoFpsRanges();
    }

    /* loaded from: classes17.dex */
    static final class CacheState<T> extends io.reactivex.internal.util.LinkedArrayList implements io.reactivex.Observer<T> {
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T>[]> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observable<? extends T> getHighSpeedVideoSizesFor;
        boolean getOutputFormats;
        static final io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[] getHighSpeedVideoSizes = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[0];
        static final io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[] Camera2StreamConfigurationMap = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[0];

        CacheState(io.reactivex.Observable<? extends T> observable, int i) {
            super(i);
            this.getHighSpeedVideoSizesFor = observable;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRanges = new io.reactivex.internal.disposables.SequentialDisposable();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRanges.update(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getOutputFormats) {
                return;
            }
            add(io.reactivex.internal.util.NotificationLite.next(t));
            for (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T> replayDisposable : this.getHighResolutionOutputSizeshNQ4ISI.get()) {
                replayDisposable.getHighSpeedVideoFpsRanges();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats) {
                return;
            }
            this.getOutputFormats = true;
            add(io.reactivex.internal.util.NotificationLite.error(th));
            this.getHighSpeedVideoFpsRanges.dispose();
            for (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T> replayDisposable : this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(Camera2StreamConfigurationMap)) {
                replayDisposable.getHighSpeedVideoFpsRanges();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getOutputFormats) {
                return;
            }
            this.getOutputFormats = true;
            add(io.reactivex.internal.util.NotificationLite.complete());
            this.getHighSpeedVideoFpsRanges.dispose();
            for (io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T> replayDisposable : this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(Camera2StreamConfigurationMap)) {
                replayDisposable.getHighSpeedVideoFpsRanges();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplayDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 7058506693698832024L;
        int Camera2StreamConfigurationMap;
        java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;
        final io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> getHighSpeedVideoSizesFor;

        ReplayDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> cacheState) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoSizesFor = cacheState;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable<T>[] replayDisposableArr;
            io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[] replayDisposableArr2;
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            io.reactivex.internal.operators.observable.ObservableCache.CacheState<T> cacheState = this.getHighSpeedVideoSizesFor;
            do {
                replayDisposableArr = cacheState.getHighResolutionOutputSizeshNQ4ISI.get();
                int length = replayDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (replayDisposableArr[i].equals(this)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    replayDisposableArr2 = io.reactivex.internal.operators.observable.ObservableCache.CacheState.getHighSpeedVideoSizes;
                } else {
                    io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[] replayDisposableArr3 = new io.reactivex.internal.operators.observable.ObservableCache.ReplayDisposable[length - 1];
                    java.lang.System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i);
                    java.lang.System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr3, i, (length - i) - 1);
                    replayDisposableArr2 = replayDisposableArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(cacheState.getHighResolutionOutputSizeshNQ4ISI, replayDisposableArr, replayDisposableArr2));
        }

        public final void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super T> observer = this.getHighSpeedVideoSizes;
                int i = 1;
                while (!this.getHighSpeedVideoFpsRanges) {
                    int size = this.getHighSpeedVideoSizesFor.size();
                    if (size != 0) {
                        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (objArr == null) {
                            objArr = this.getHighSpeedVideoSizesFor.head();
                            this.getHighResolutionOutputSizeshNQ4ISI = objArr;
                        }
                        int length = objArr.length - 1;
                        int i2 = this.getHighSpeedVideoFpsRangesFor;
                        int i3 = this.Camera2StreamConfigurationMap;
                        while (i2 < size) {
                            if (this.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            if (i3 == length) {
                                objArr = (java.lang.Object[]) objArr[length];
                                i3 = 0;
                            }
                            if (io.reactivex.internal.util.NotificationLite.accept(objArr[i3], observer)) {
                                return;
                            }
                            i3++;
                            i2++;
                        }
                        if (this.getHighSpeedVideoFpsRanges) {
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor = i2;
                        this.Camera2StreamConfigurationMap = i3;
                        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
