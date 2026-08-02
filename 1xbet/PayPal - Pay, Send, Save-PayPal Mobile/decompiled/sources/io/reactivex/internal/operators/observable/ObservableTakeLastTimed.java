package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTakeLastTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getInputSizeshNQ4ISI;

    public ObservableTakeLastTimed(io.reactivex.ObservableSource<T> observableSource, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, boolean z) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getInputSizeshNQ4ISI = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableTakeLastTimed.TakeLastTimedObserver(observer, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class TakeLastTimedObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        final boolean Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getHighSpeedVideoSizesFor;
        final long getInputFormats;
        final java.util.concurrent.TimeUnit getInputSizeshNQ4ISI;
        final io.reactivex.Scheduler getOutputFormats;
        java.lang.Throwable getOutputMinFrameDuration;

        TakeLastTimedObserver(io.reactivex.Observer<? super T> observer, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, boolean z) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRanges = j;
            this.getInputFormats = j2;
            this.getInputSizeshNQ4ISI = timeUnit;
            this.getOutputFormats = scheduler;
            this.getHighSpeedVideoSizesFor = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getHighSpeedVideoSizesFor;
            long now = this.getOutputFormats.now(this.getInputSizeshNQ4ISI);
            long j = this.getInputFormats;
            long j2 = this.getHighSpeedVideoFpsRanges;
            boolean z = j2 == Long.MAX_VALUE;
            spscLinkedArrayQueue.offer(java.lang.Long.valueOf(now), t);
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((java.lang.Long) spscLinkedArrayQueue.peek()).longValue() > now - j && (z || (spscLinkedArrayQueue.size() >> 1) <= j2)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getOutputMinFrameDuration = th;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizesFor.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        private void getHighSpeedVideoFpsRangesFor() {
            java.lang.Throwable th;
            if (compareAndSet(false, true)) {
                io.reactivex.Observer<? super T> observer = this.getHighSpeedVideoSizes;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getHighSpeedVideoSizesFor;
                boolean z = this.Camera2StreamConfigurationMap;
                while (!this.getHighSpeedVideoFpsRangesFor) {
                    if (!z && (th = this.getOutputMinFrameDuration) != null) {
                        spscLinkedArrayQueue.clear();
                        observer.onError(th);
                        return;
                    }
                    java.lang.Object poll = spscLinkedArrayQueue.poll();
                    if (poll == null) {
                        java.lang.Throwable th2 = this.getOutputMinFrameDuration;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                    java.lang.Object poll2 = spscLinkedArrayQueue.poll();
                    if (((java.lang.Long) poll).longValue() >= this.getOutputFormats.now(this.getInputSizeshNQ4ISI) - this.getInputFormats) {
                        observer.onNext(poll2);
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }
    }
}
