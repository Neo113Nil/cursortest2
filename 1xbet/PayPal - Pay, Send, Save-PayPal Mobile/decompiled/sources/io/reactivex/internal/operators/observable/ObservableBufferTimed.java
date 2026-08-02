package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableBufferTimed<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRanges;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getInputFormats;
    final long getOutputMinFrameDuration;

    public ObservableBufferTimed(io.reactivex.ObservableSource<T> observableSource, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, java.util.concurrent.Callable<U> callable, int i, boolean z) {
        super(observableSource);
        this.getOutputMinFrameDuration = j;
        this.getHighSpeedVideoSizes = j2;
        this.getInputFormats = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoFpsRanges = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super U> observer) {
        if (this.getOutputMinFrameDuration == this.getHighSpeedVideoSizes && this.getHighResolutionOutputSizeshNQ4ISI == Integer.MAX_VALUE) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferExactUnboundedObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor));
            return;
        }
        io.reactivex.Scheduler.Worker createWorker = this.getHighSpeedVideoFpsRangesFor.createWorker();
        if (this.getOutputMinFrameDuration == this.getHighSpeedVideoSizes) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferExactBoundedObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, createWorker));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getInputFormats, createWorker));
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferExactUnboundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<U> Camera2StreamConfigurationMap;
        final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        U getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.TimeUnit getInputFormats;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getInputSizeshNQ4ISI;
        final long getOutputFormats;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            this.actual.onNext((java.util.Collection) obj);
        }

        BufferExactUnboundedObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
            this.Camera2StreamConfigurationMap = callable;
            this.getOutputFormats = j;
            this.getInputFormats = timeUnit;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                try {
                    this.getHighSpeedVideoFpsRangesFor = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The buffer supplied is null");
                    this.actual.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    io.reactivex.Scheduler scheduler = this.getHighResolutionOutputSizeshNQ4ISI;
                    long j = this.getOutputFormats;
                    io.reactivex.disposables.Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.getInputFormats);
                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, null, schedulePeriodicallyDirect)) {
                        return;
                    }
                    schedulePeriodicallyDirect.dispose();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.actual);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.getHighSpeedVideoFpsRangesFor;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this) {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            this.actual.onError(th);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            if (u != null) {
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    io.reactivex.internal.util.QueueDrainHelper.drainLoop(this.queue, this.actual, false, null, this);
                }
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputSizeshNQ4ISI.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            U u;
            try {
                U u2 = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    u = this.getHighSpeedVideoFpsRangesFor;
                    if (u != null) {
                        this.getHighSpeedVideoFpsRangesFor = u2;
                    }
                }
                if (u == null) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
                } else {
                    fastPathEmit(u, false, this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.actual.onError(th);
                dispose();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferSkipBoundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<U> Camera2StreamConfigurationMap;
        final java.util.List<U> getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final long getInputSizeshNQ4ISI;
        final io.reactivex.Scheduler.Worker getOutputFormats;
        final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            observer.onNext((java.util.Collection) obj);
        }

        BufferSkipBoundedObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.Camera2StreamConfigurationMap = callable;
            this.getInputSizeshNQ4ISI = j;
            this.getHighSpeedVideoFpsRanges = j2;
            this.getOutputMinFrameDuration = timeUnit;
            this.getOutputFormats = worker;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedList();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                try {
                    java.util.Collection collection = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The buffer supplied is null");
                    this.getHighResolutionOutputSizeshNQ4ISI.add(collection);
                    this.actual.onSubscribe(this);
                    io.reactivex.Scheduler.Worker worker = this.getOutputFormats;
                    long j = this.getHighSpeedVideoFpsRanges;
                    worker.schedulePeriodically(this, j, j, this.getOutputMinFrameDuration);
                    this.getOutputFormats.schedule(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.RemoveFromBufferEmit(collection), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.actual);
                    this.getOutputFormats.dispose();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            synchronized (this) {
                java.util.Iterator<U> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.done = true;
            synchronized (this) {
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
            }
            this.actual.onError(th);
            this.getOutputFormats.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            java.util.ArrayList arrayList;
            synchronized (this) {
                arrayList = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((java.util.Collection) it.next());
            }
            this.done = true;
            if (enter()) {
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(this.queue, this.actual, false, this.getOutputFormats, this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            synchronized (this) {
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
            }
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getOutputFormats.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                return;
            }
            try {
                java.util.Collection collection = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.add(collection);
                    this.getOutputFormats.schedule(new io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.RemoveFromBuffer(collection), this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.actual.onError(th);
                dispose();
            }
        }

        final class RemoveFromBuffer implements java.lang.Runnable {
            private final U getHighResolutionOutputSizeshNQ4ISI;

            RemoveFromBuffer(U u) {
                this.getHighResolutionOutputSizeshNQ4ISI = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this) {
                    io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this.getHighResolutionOutputSizeshNQ4ISI.remove(this.getHighResolutionOutputSizeshNQ4ISI);
                }
                io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver bufferSkipBoundedObserver = io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.getHighResolutionOutputSizeshNQ4ISI, false, bufferSkipBoundedObserver.getOutputFormats);
            }
        }

        final class RemoveFromBufferEmit implements java.lang.Runnable {
            private final U getHighSpeedVideoFpsRanges;

            RemoveFromBufferEmit(U u) {
                this.getHighSpeedVideoFpsRanges = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this) {
                    io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this.getHighResolutionOutputSizeshNQ4ISI.remove(this.getHighSpeedVideoFpsRanges);
                }
                io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver bufferSkipBoundedObserver = io.reactivex.internal.operators.observable.ObservableBufferTimed.BufferSkipBoundedObserver.this;
                bufferSkipBoundedObserver.fastPathOrderedEmit(this.getHighSpeedVideoFpsRanges, false, bufferSkipBoundedObserver.getOutputFormats);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferExactBoundedObserver<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.observers.QueueDrainObserver<T, U, U> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        U Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizesFor;
        long getInputFormats;
        final boolean getInputSizeshNQ4ISI;
        final long getOutputFormats;
        io.reactivex.disposables.Disposable getOutputMinFrameDuration;
        final io.reactivex.Scheduler.Worker getOutputStallDuration;
        final java.util.concurrent.TimeUnit getOutputStallDurationlomOqCM;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final /* synthetic */ void accept(io.reactivex.Observer observer, java.lang.Object obj) {
            observer.onNext((java.util.Collection) obj);
        }

        BufferExactBoundedObserver(io.reactivex.Observer<? super U> observer, java.util.concurrent.Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, int i, boolean z, io.reactivex.Scheduler.Worker worker) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighSpeedVideoFpsRangesFor = callable;
            this.getOutputFormats = j;
            this.getOutputStallDurationlomOqCM = timeUnit;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getInputSizeshNQ4ISI = z;
            this.getOutputStallDuration = worker;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputMinFrameDuration, disposable)) {
                this.getOutputMinFrameDuration = disposable;
                try {
                    this.Camera2StreamConfigurationMap = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The buffer supplied is null");
                    this.actual.onSubscribe(this);
                    io.reactivex.Scheduler.Worker worker = this.getOutputStallDuration;
                    long j = this.getOutputFormats;
                    this.getHighSpeedVideoSizesFor = worker.schedulePeriodically(this, j, j, this.getOutputStallDurationlomOqCM);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    disposable.dispose();
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, this.actual);
                    this.getOutputStallDuration.dispose();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.Camera2StreamConfigurationMap;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                this.Camera2StreamConfigurationMap = null;
                this.getInputFormats++;
                if (this.getInputSizeshNQ4ISI) {
                    this.getHighSpeedVideoSizesFor.dispose();
                }
                fastPathOrderedEmit(u, false, this);
                try {
                    U u2 = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The buffer supplied is null");
                    synchronized (this) {
                        this.Camera2StreamConfigurationMap = u2;
                        this.getHighSpeedVideoFpsRanges++;
                    }
                    if (this.getInputSizeshNQ4ISI) {
                        io.reactivex.Scheduler.Worker worker = this.getOutputStallDuration;
                        long j = this.getOutputFormats;
                        this.getHighSpeedVideoSizesFor = worker.schedulePeriodically(this, j, j, this.getOutputStallDurationlomOqCM);
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.actual.onError(th);
                    dispose();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            synchronized (this) {
                this.Camera2StreamConfigurationMap = null;
            }
            this.actual.onError(th);
            this.getOutputStallDuration.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u;
            this.getOutputStallDuration.dispose();
            synchronized (this) {
                u = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = null;
            }
            this.queue.offer(u);
            this.done = true;
            if (enter()) {
                io.reactivex.internal.util.QueueDrainHelper.drainLoop(this.queue, this.actual, false, this, this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.getOutputMinFrameDuration.dispose();
            this.getOutputStallDuration.dispose();
            synchronized (this) {
                this.Camera2StreamConfigurationMap = null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.Camera2StreamConfigurationMap;
                    if (u2 != null && this.getInputFormats == this.getHighSpeedVideoFpsRanges) {
                        this.Camera2StreamConfigurationMap = u;
                        fastPathOrderedEmit(u2, false, this);
                    }
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                dispose();
                this.actual.onError(th);
            }
        }
    }
}
