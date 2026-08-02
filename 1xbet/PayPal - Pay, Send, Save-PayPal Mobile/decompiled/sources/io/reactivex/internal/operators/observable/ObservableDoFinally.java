package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDoFinally<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Action Camera2StreamConfigurationMap;

    public ObservableDoFinally(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Action action) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = action;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDoFinally.DoFinallyObserver(observer, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class DoFinallyObserver<T> extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        io.reactivex.internal.fuseable.QueueDisposable<T> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        DoFinallyObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Action action) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoFpsRanges = action;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    this.Camera2StreamConfigurationMap = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            io.reactivex.internal.fuseable.QueueDisposable<T> queueDisposable = this.Camera2StreamConfigurationMap;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = queueDisposable.requestFusion(i);
            if (requestFusion != 0) {
                this.getHighSpeedVideoSizes = requestFusion == 1;
            }
            return requestFusion;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.Camera2StreamConfigurationMap.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.Camera2StreamConfigurationMap.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll = this.Camera2StreamConfigurationMap.poll();
            if (poll == null && this.getHighSpeedVideoSizes && compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
            return poll;
        }
    }
}
