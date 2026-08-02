package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSkipLastTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public ObservableSkipLastTimed(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, boolean z) {
        super(observableSource);
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSkipLastTimed.SkipLastTimedObserver(observer, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class SkipLastTimedObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        final boolean Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizesFor;
        final java.util.concurrent.TimeUnit getInputFormats;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getInputSizeshNQ4ISI;
        final io.reactivex.Scheduler getOutputFormats;
        final long getOutputMinFrameDuration;

        SkipLastTimedObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getOutputMinFrameDuration = j;
            this.getInputFormats = timeUnit;
            this.getOutputFormats = scheduler;
            this.getInputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizesFor, disposable)) {
                this.getHighSpeedVideoSizesFor = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getInputSizeshNQ4ISI.offer(java.lang.Long.valueOf(this.getOutputFormats.now(this.getInputFormats)), t);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor.dispose();
            if (getAndIncrement() == 0) {
                this.getInputSizeshNQ4ISI.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        private void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super T> observer = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getInputSizeshNQ4ISI;
                boolean z = this.Camera2StreamConfigurationMap;
                java.util.concurrent.TimeUnit timeUnit = this.getInputFormats;
                io.reactivex.Scheduler scheduler = this.getOutputFormats;
                long j = this.getOutputMinFrameDuration;
                int i = 1;
                while (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    boolean z2 = this.getHighSpeedVideoFpsRanges;
                    java.lang.Long l = (java.lang.Long) spscLinkedArrayQueue.peek();
                    boolean z3 = l == null;
                    long now = scheduler.now(timeUnit);
                    if (!z3 && l.longValue() > now - j) {
                        z3 = true;
                    }
                    if (z2) {
                        if (!z) {
                            java.lang.Throwable th = this.getHighSpeedVideoSizes;
                            if (th != null) {
                                this.getInputSizeshNQ4ISI.clear();
                                observer.onError(th);
                                return;
                            } else if (z3) {
                                observer.onComplete();
                                return;
                            }
                        } else if (z3) {
                            java.lang.Throwable th2 = this.getHighSpeedVideoSizes;
                            if (th2 != null) {
                                observer.onError(th2);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    }
                    if (!z3) {
                        spscLinkedArrayQueue.poll();
                        observer.onNext(spscLinkedArrayQueue.poll());
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                this.getInputSizeshNQ4ISI.clear();
            }
        }
    }
}
