package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableBuffer<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public ObservableBuffer(io.reactivex.ObservableSource<T> observableSource, int i, int i2, java.util.concurrent.Callable<U> callable) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        if (this.getHighSpeedVideoSizes == this.getHighSpeedVideoFpsRangesFor) {
            io.reactivex.internal.operators.observable.ObservableBuffer.BufferExactObserver bufferExactObserver = new io.reactivex.internal.operators.observable.ObservableBuffer.BufferExactObserver(observer, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
            if (bufferExactObserver.getHighResolutionOutputSizeshNQ4ISI()) {
                this.source.subscribe(bufferExactObserver);
                return;
            }
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBuffer.BufferSkipObserver(observer, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class BufferExactObserver<T, U extends java.util.Collection<? super T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super U> getHighSpeedVideoFpsRangesFor;
        U getHighSpeedVideoSizes;
        int getOutputFormats;

        BufferExactObserver(io.reactivex.Observer<? super U> observer, int i, java.util.concurrent.Callable<U> callable) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRanges = callable;
        }

        final boolean getHighResolutionOutputSizeshNQ4ISI() {
            try {
                this.getHighSpeedVideoSizes = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "Empty buffer supplied");
                return true;
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizes = null;
                io.reactivex.disposables.Disposable disposable = this.Camera2StreamConfigurationMap;
                if (disposable == null) {
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.getHighSpeedVideoFpsRangesFor);
                    return false;
                }
                disposable.dispose();
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                return false;
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            U u = this.getHighSpeedVideoSizes;
            if (u != null) {
                u.add(t);
                int i = this.getOutputFormats + 1;
                this.getOutputFormats = i;
                if (i >= this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRangesFor.onNext(u);
                    this.getOutputFormats = 0;
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u = this.getHighSpeedVideoSizes;
            if (u != null) {
                this.getHighSpeedVideoSizes = null;
                if (!u.isEmpty()) {
                    this.getHighSpeedVideoFpsRangesFor.onNext(u);
                }
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferSkipObserver<T, U extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8223395059921494546L;
        long Camera2StreamConfigurationMap;
        final java.util.concurrent.Callable<U> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super U> getHighSpeedVideoFpsRanges;
        final java.util.ArrayDeque<U> getHighSpeedVideoFpsRangesFor = new java.util.ArrayDeque<>();
        final int getHighSpeedVideoSizes;
        final int getInputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputFormats;

        BufferSkipObserver(io.reactivex.Observer<? super U> observer, int i, int i2, java.util.concurrent.Callable<U> callable) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighSpeedVideoSizes = i;
            this.getInputSizeshNQ4ISI = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = callable;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputFormats, disposable)) {
                this.getOutputFormats = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getOutputFormats.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getOutputFormats.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            long j = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1 + j;
            if (j % this.getInputSizeshNQ4ISI == 0) {
                try {
                    this.getHighSpeedVideoFpsRangesFor.offer((java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (java.lang.Throwable th) {
                    this.getHighSpeedVideoFpsRangesFor.clear();
                    this.getOutputFormats.dispose();
                    this.getHighSpeedVideoFpsRanges.onError(th);
                    return;
                }
            }
            java.util.Iterator<U> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t);
                if (this.getHighSpeedVideoSizes <= next.size()) {
                    it.remove();
                    this.getHighSpeedVideoFpsRanges.onNext(next);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.clear();
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            while (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                this.getHighSpeedVideoFpsRanges.onNext(this.getHighSpeedVideoFpsRangesFor.poll());
            }
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
