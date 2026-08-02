package io.reactivex.subjects;

/* loaded from: classes17.dex */
public final class UnicastSubject<T> extends io.reactivex.subjects.Subject<T> {
    volatile boolean Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    volatile boolean getHighSpeedVideoSizes;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> getHighSpeedVideoSizesFor;
    final java.util.concurrent.atomic.AtomicBoolean getInputFormats;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> getInputSizeshNQ4ISI;
    java.lang.Throwable getOutputFormats;
    final io.reactivex.internal.observers.BasicIntQueueDisposable<T> getOutputMinFrameDuration;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create() {
        return new io.reactivex.subjects.UnicastSubject<>(bufferSize(), true);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int i) {
        return new io.reactivex.subjects.UnicastSubject<>(i, true);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int i, java.lang.Runnable runnable) {
        return new io.reactivex.subjects.UnicastSubject<>(i, runnable, true);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int i, java.lang.Runnable runnable, boolean z) {
        return new io.reactivex.subjects.UnicastSubject<>(i, runnable, z);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(boolean z) {
        return new io.reactivex.subjects.UnicastSubject<>(bufferSize(), z);
    }

    private UnicastSubject(int i, boolean z) {
        this.getHighSpeedVideoSizesFor = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        this.getInputFormats = new java.util.concurrent.atomic.AtomicBoolean();
        this.getOutputMinFrameDuration = new io.reactivex.subjects.UnicastSubject.UnicastQueueDisposable();
    }

    private UnicastSubject(int i, java.lang.Runnable runnable, boolean z) {
        this.getHighSpeedVideoSizesFor = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "onTerminate"));
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        this.getInputFormats = new java.util.concurrent.atomic.AtomicBoolean();
        this.getOutputMinFrameDuration = new io.reactivex.subjects.UnicastSubject.UnicastQueueDisposable();
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        if (!this.getInputFormats.get() && this.getInputFormats.compareAndSet(false, true)) {
            observer.onSubscribe(this.getOutputMinFrameDuration);
            this.getHighSpeedVideoFpsRanges.lazySet(observer);
            if (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges.lazySet(null);
                return;
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
                return;
            }
        }
        io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.IllegalStateException("Only a single observer allowed."), observer);
    }

    final void getHighSpeedVideoSizes() {
        java.lang.Runnable runnable = this.getInputSizeshNQ4ISI.get();
        if (runnable == null || !androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, runnable, null)) {
            return;
        }
        runnable.run();
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizesFor.offer(t);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getOutputFormats = th;
        this.Camera2StreamConfigurationMap = true;
        getHighSpeedVideoSizes();
        getHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        getHighSpeedVideoSizes();
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private boolean getHighSpeedVideoFpsRanges(io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue, io.reactivex.Observer<? super T> observer) {
        java.lang.Throwable th = this.getOutputFormats;
        if (th == null) {
            return false;
        }
        this.getHighSpeedVideoFpsRanges.lazySet(null);
        simpleQueue.clear();
        observer.onError(th);
        return true;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getOutputMinFrameDuration.getAndIncrement() == 0) {
            io.reactivex.Observer<? super T> observer = this.getHighSpeedVideoFpsRanges.get();
            int i = 1;
            int i2 = 1;
            while (observer == null) {
                i2 = this.getOutputMinFrameDuration.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                } else {
                    observer = this.getHighSpeedVideoFpsRanges.get();
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.getHighSpeedVideoSizesFor;
                boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                while (!this.getHighSpeedVideoSizes) {
                    boolean z2 = this.Camera2StreamConfigurationMap;
                    if (!z && z2 && getHighSpeedVideoFpsRanges(spscLinkedArrayQueue, observer)) {
                        return;
                    }
                    observer.onNext(null);
                    if (!z2) {
                        i = this.getOutputMinFrameDuration.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        this.getHighSpeedVideoFpsRanges.lazySet(null);
                        java.lang.Throwable th = this.getOutputFormats;
                        if (th != null) {
                            observer.onError(th);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                }
                this.getHighSpeedVideoFpsRanges.lazySet(null);
                spscLinkedArrayQueue.clear();
                return;
            }
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.getHighSpeedVideoSizesFor;
            boolean z3 = this.getHighResolutionOutputSizeshNQ4ISI;
            boolean z4 = true;
            int i3 = 1;
            while (!this.getHighSpeedVideoSizes) {
                boolean z5 = this.Camera2StreamConfigurationMap;
                T poll = this.getHighSpeedVideoSizesFor.poll();
                boolean z6 = poll == null;
                if (z5) {
                    if (!z3 && z4) {
                        if (getHighSpeedVideoFpsRanges(spscLinkedArrayQueue2, observer)) {
                            return;
                        } else {
                            z4 = false;
                        }
                    }
                    if (z6) {
                        this.getHighSpeedVideoFpsRanges.lazySet(null);
                        java.lang.Throwable th2 = this.getOutputFormats;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                }
                if (!z6) {
                    observer.onNext(poll);
                } else {
                    i3 = this.getOutputMinFrameDuration.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            this.getHighSpeedVideoFpsRanges.lazySet(null);
            spscLinkedArrayQueue2.clear();
        }
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasObservers() {
        return this.getHighSpeedVideoFpsRanges.get() != null;
    }

    @Override // io.reactivex.subjects.Subject
    public final java.lang.Throwable getThrowable() {
        if (this.Camera2StreamConfigurationMap) {
            return this.getOutputFormats;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasThrowable() {
        return this.Camera2StreamConfigurationMap && this.getOutputFormats != null;
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasComplete() {
        return this.Camera2StreamConfigurationMap && this.getOutputFormats == null;
    }

    final class UnicastQueueDisposable extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoFpsRangesFor = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            return io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoSizesFor.poll();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoSizesFor.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoSizesFor.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoSizes) {
                return;
            }
            io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoSizes = true;
            io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoSizes();
            io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoFpsRanges.lazySet(null);
            if (io.reactivex.subjects.UnicastSubject.this.getOutputMinFrameDuration.getAndIncrement() == 0) {
                io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoFpsRanges.lazySet(null);
                io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoSizesFor.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.subjects.UnicastSubject.this.getHighSpeedVideoSizes;
        }
    }
}
