package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSampleWithObservable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<?> getHighSpeedVideoFpsRangesFor;

    public ObservableSampleWithObservable(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<?> observableSource2, boolean z) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = observableSource2;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        if (this.Camera2StreamConfigurationMap) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainEmitLast(serializedObserver, this.getHighSpeedVideoFpsRangesFor));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainNoLast(serializedObserver, this.getHighSpeedVideoFpsRangesFor));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class SampleMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3517602651313910099L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;
        final io.reactivex.ObservableSource<?> getOutputFormats;

        abstract void Camera2StreamConfigurationMap();

        abstract void getHighResolutionOutputSizeshNQ4ISI();

        abstract void getHighSpeedVideoFpsRangesFor();

        SampleMainObserver(io.reactivex.Observer<? super T> observer, io.reactivex.ObservableSource<?> observableSource) {
            this.getHighSpeedVideoSizes = observer;
            this.getOutputFormats = observableSource;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                if (this.getHighSpeedVideoFpsRanges.get() == null) {
                    this.getOutputFormats.subscribe(new io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SamplerObserver(this));
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }

    /* loaded from: classes17.dex */
    static final class SamplerObserver<T> implements io.reactivex.Observer<java.lang.Object> {
        final io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> getHighResolutionOutputSizeshNQ4ISI;

        SamplerObserver(io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> sampleMainObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = sampleMainObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> sampleMainObserver = this.getHighResolutionOutputSizeshNQ4ISI;
            sampleMainObserver.getHighSpeedVideoFpsRangesFor.dispose();
            sampleMainObserver.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> sampleMainObserver = this.getHighResolutionOutputSizeshNQ4ISI;
            sampleMainObserver.getHighSpeedVideoFpsRangesFor.dispose();
            sampleMainObserver.Camera2StreamConfigurationMap();
        }
    }

    /* loaded from: classes17.dex */
    static final class SampleMainNoLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(io.reactivex.Observer<? super T> observer, io.reactivex.ObservableSource<?> observableSource) {
            super(observer, observableSource);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void Camera2StreamConfigurationMap() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void getHighResolutionOutputSizeshNQ4ISI() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.getHighSpeedVideoSizes.onNext(andSet);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SampleMainEmitLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;

        SampleMainEmitLast(io.reactivex.Observer<? super T> observer, io.reactivex.ObservableSource<?> observableSource) {
            super(observer, observableSource);
            this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void getHighSpeedVideoFpsRangesFor() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.getHighSpeedVideoSizes.onNext(andSet);
                }
                this.getHighSpeedVideoSizes.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void Camera2StreamConfigurationMap() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.getHighSpeedVideoSizes.onNext(andSet);
                }
                this.getHighSpeedVideoSizes.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                do {
                    boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                    T andSet = getAndSet(null);
                    if (andSet != null) {
                        this.getHighSpeedVideoSizes.onNext(andSet);
                    }
                    if (z) {
                        this.getHighSpeedVideoSizes.onComplete();
                        return;
                    }
                } while (this.Camera2StreamConfigurationMap.decrementAndGet() != 0);
            }
        }
    }
}
