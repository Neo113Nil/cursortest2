package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableAmb extends io.reactivex.Completable {
    private final io.reactivex.CompletableSource[] Camera2StreamConfigurationMap;
    private final java.lang.Iterable<? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRangesFor;

    public CompletableAmb(io.reactivex.CompletableSource[] completableSourceArr, java.lang.Iterable<? extends io.reactivex.CompletableSource> iterable) {
        this.Camera2StreamConfigurationMap = completableSourceArr;
        this.getHighSpeedVideoFpsRangesFor = iterable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        int length;
        io.reactivex.CompletableSource[] completableSourceArr = this.Camera2StreamConfigurationMap;
        if (completableSourceArr == null) {
            completableSourceArr = new io.reactivex.CompletableSource[8];
            try {
                length = 0;
                for (io.reactivex.CompletableSource completableSource : this.getHighSpeedVideoFpsRangesFor) {
                    if (completableSource == null) {
                        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), completableObserver);
                        return;
                    }
                    if (length == completableSourceArr.length) {
                        io.reactivex.CompletableSource[] completableSourceArr2 = new io.reactivex.CompletableSource[(length >> 2) + length];
                        java.lang.System.arraycopy(completableSourceArr, 0, completableSourceArr2, 0, length);
                        completableSourceArr = completableSourceArr2;
                    }
                    completableSourceArr[length] = completableSource;
                    length++;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, completableObserver);
                return;
            }
        } else {
            length = completableSourceArr.length;
        }
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        io.reactivex.internal.operators.completable.CompletableAmb.Amb amb = new io.reactivex.internal.operators.completable.CompletableAmb.Amb(atomicBoolean, compositeDisposable, completableObserver);
        for (int i = 0; i < length; i++) {
            io.reactivex.CompletableSource completableSource2 = completableSourceArr[i];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource2 == null) {
                java.lang.Throwable nullPointerException = new java.lang.NullPointerException("One of the sources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    compositeDisposable.dispose();
                    completableObserver.onError(nullPointerException);
                    return;
                } else {
                    io.reactivex.plugins.RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            completableSource2.subscribe(amb);
        }
        if (length == 0) {
            completableObserver.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class Amb implements io.reactivex.CompletableObserver {
        private final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;
        private final io.reactivex.disposables.CompositeDisposable getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor;

        Amb(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, io.reactivex.disposables.CompositeDisposable compositeDisposable, io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRangesFor = atomicBoolean;
            this.getHighResolutionOutputSizeshNQ4ISI = compositeDisposable;
            this.Camera2StreamConfigurationMap = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                this.Camera2StreamConfigurationMap.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(disposable);
        }
    }
}
