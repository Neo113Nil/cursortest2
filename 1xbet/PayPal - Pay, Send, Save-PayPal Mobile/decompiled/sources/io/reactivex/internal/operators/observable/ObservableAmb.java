package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableAmb<T> extends io.reactivex.Observable<T> {
    final java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<? extends T>[] getHighSpeedVideoSizes;

    public ObservableAmb(io.reactivex.ObservableSource<? extends T>[] observableSourceArr, java.lang.Iterable<? extends io.reactivex.ObservableSource<? extends T>> iterable) {
        this.getHighSpeedVideoSizes = observableSourceArr;
        this.Camera2StreamConfigurationMap = iterable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        int length;
        io.reactivex.ObservableSource<? extends T>[] observableSourceArr = this.getHighSpeedVideoSizes;
        if (observableSourceArr == null) {
            observableSourceArr = new io.reactivex.Observable[8];
            try {
                length = 0;
                for (io.reactivex.ObservableSource<? extends T> observableSource : this.Camera2StreamConfigurationMap) {
                    if (observableSource == null) {
                        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.NullPointerException("One of the sources is null"), observer);
                        return;
                    }
                    if (length == observableSourceArr.length) {
                        io.reactivex.ObservableSource<? extends T>[] observableSourceArr2 = new io.reactivex.ObservableSource[(length >> 2) + length];
                        java.lang.System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                        observableSourceArr = observableSourceArr2;
                    }
                    observableSourceArr[length] = observableSource;
                    length++;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
            return;
        }
        if (length == 1) {
            observableSourceArr[0].subscribe(observer);
            return;
        }
        io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator ambCoordinator = new io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator(observer, length);
        io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T>[] ambInnerObserverArr = ambCoordinator.Camera2StreamConfigurationMap;
        int length2 = ambInnerObserverArr.length;
        int i = 0;
        while (i < length2) {
            int i2 = i + 1;
            ambInnerObserverArr[i] = new io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<>(ambCoordinator, i2, ambCoordinator.getHighSpeedVideoFpsRangesFor);
            i = i2;
        }
        ambCoordinator.getHighResolutionOutputSizeshNQ4ISI.lazySet(0);
        ambCoordinator.getHighSpeedVideoFpsRangesFor.onSubscribe(ambCoordinator);
        for (int i3 = 0; i3 < length2 && ambCoordinator.getHighResolutionOutputSizeshNQ4ISI.get() == 0; i3++) {
            observableSourceArr[i3].subscribe(ambInnerObserverArr[i3]);
        }
    }

    /* loaded from: classes17.dex */
    static final class AmbCoordinator<T> implements io.reactivex.disposables.Disposable {
        final io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T>[] Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;

        AmbCoordinator(io.reactivex.Observer<? super T> observer, int i) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver[i];
        }

        public final boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI.get();
            int i3 = 0;
            if (i2 != 0) {
                return i2 == i;
            }
            if (!this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(0, i)) {
                return false;
            }
            io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T>[] ambInnerObserverArr = this.Camera2StreamConfigurationMap;
            int length = ambInnerObserverArr.length;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (i4 != i) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(ambInnerObserverArr[i3]);
                }
                i3 = i4;
            }
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.get() != -1) {
                this.getHighResolutionOutputSizeshNQ4ISI.lazySet(-1);
                for (io.reactivex.internal.operators.observable.ObservableAmb.AmbInnerObserver<T> ambInnerObserver : this.Camera2StreamConfigurationMap) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(ambInnerObserver);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.get() == -1;
        }
    }

    /* loaded from: classes17.dex */
    static final class AmbInnerObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator<T> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;

        AmbInnerObserver(io.reactivex.internal.operators.observable.ObservableAmb.AmbCoordinator<T> ambCoordinator, int i, io.reactivex.Observer<? super T> observer) {
            this.Camera2StreamConfigurationMap = ambCoordinator;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = observer;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
            } else if (this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor)) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRanges.onNext(t);
            } else {
                get().dispose();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRanges.onError(th);
            } else if (this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor)) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRanges.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRanges.onComplete();
            } else if (this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor)) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }
    }
}
