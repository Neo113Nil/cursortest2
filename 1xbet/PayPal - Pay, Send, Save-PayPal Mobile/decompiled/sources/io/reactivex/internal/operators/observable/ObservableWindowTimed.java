package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableWindowTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;
    final long getOutputFormats;
    final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

    public ObservableWindowTimed(io.reactivex.ObservableSource<T> observableSource, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, long j3, int i, boolean z) {
        super(observableSource);
        this.getOutputFormats = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getOutputMinFrameDuration = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
        this.getHighResolutionOutputSizeshNQ4ISI = j3;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        if (this.getOutputFormats != this.getHighSpeedVideoFpsRanges) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver(serializedObserver, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes.createWorker(), this.Camera2StreamConfigurationMap));
        } else if (this.getHighResolutionOutputSizeshNQ4ISI == Long.MAX_VALUE) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver(serializedObserver, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver(serializedObserver, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowExactUnboundedObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
        final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizesFor;
        volatile boolean getInputFormats;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getInputSizeshNQ4ISI;
        io.reactivex.subjects.UnicastSubject<T> getOutputFormats;
        final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

        WindowExactUnboundedObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighSpeedVideoSizesFor = j;
            this.getOutputMinFrameDuration = timeUnit;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getOutputFormats = io.reactivex.subjects.UnicastSubject.create(this.getHighSpeedVideoFpsRanges);
                io.reactivex.Observer<? super V> observer = this.actual;
                observer.onSubscribe(this);
                observer.onNext(this.getOutputFormats);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.Scheduler scheduler = this.getHighResolutionOutputSizeshNQ4ISI;
                long j = this.getHighSpeedVideoSizesFor;
                io.reactivex.internal.disposables.DisposableHelper.replace(this.getInputSizeshNQ4ISI, scheduler.schedulePeriodicallyDirect(this, j, j, this.getOutputMinFrameDuration));
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getInputFormats) {
                return;
            }
            if (fastEnter()) {
                this.getOutputFormats.onNext(t);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            this.actual.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            this.actual.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                this.getInputFormats = true;
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            }
            this.queue.offer(Camera2StreamConfigurationMap);
            if (enter()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            r7.getOutputFormats = null;
            r0.clear();
            io.reactivex.internal.disposables.DisposableHelper.dispose(r7.getInputSizeshNQ4ISI);
            r0 = r7.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            if (r0 == null) goto L12;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.queue.MpscLinkedQueue mpscLinkedQueue = (io.reactivex.internal.queue.MpscLinkedQueue) this.queue;
            io.reactivex.Observer<? super V> observer = this.actual;
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.getOutputFormats;
            int i = 1;
            while (true) {
                boolean z = this.getInputFormats;
                boolean z2 = this.done;
                java.lang.Object poll = mpscLinkedQueue.poll();
                if (!z2 || (poll != null && poll != Camera2StreamConfigurationMap)) {
                    if (poll != null) {
                        if (poll == Camera2StreamConfigurationMap) {
                            unicastSubject.onComplete();
                            if (!z) {
                                unicastSubject = (io.reactivex.subjects.UnicastSubject<T>) io.reactivex.subjects.UnicastSubject.create(this.getHighSpeedVideoFpsRanges);
                                this.getOutputFormats = unicastSubject;
                                observer.onNext(unicastSubject);
                            } else {
                                this.getHighSpeedVideoFpsRangesFor.dispose();
                            }
                        } else {
                            unicastSubject.onNext(io.reactivex.internal.util.NotificationLite.getValue(poll));
                        }
                    } else {
                        i = leave(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowExactBoundedObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable {
        long Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Scheduler getHighSpeedVideoSizesFor;
        final boolean getInputFormats;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getInputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputFormats;
        volatile boolean getOutputMinFrameDuration;
        final io.reactivex.Scheduler.Worker getOutputSizes;
        final long getOutputSizeshNQ4ISI;
        final java.util.concurrent.TimeUnit getOutputStallDuration;
        io.reactivex.subjects.UnicastSubject<T> getOutputStallDurationlomOqCM;

        WindowExactBoundedObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, long j2, boolean z) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
            this.getOutputSizeshNQ4ISI = j;
            this.getOutputStallDuration = timeUnit;
            this.getHighSpeedVideoSizesFor = scheduler;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = j2;
            this.getInputFormats = z;
            if (z) {
                this.getOutputSizes = scheduler.createWorker();
            } else {
                this.getOutputSizes = null;
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.disposables.Disposable schedulePeriodicallyDirect;
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputFormats, disposable)) {
                this.getOutputFormats = disposable;
                io.reactivex.Observer<? super V> observer = this.actual;
                observer.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.subjects.UnicastSubject<T> create = io.reactivex.subjects.UnicastSubject.create(this.getHighSpeedVideoFpsRanges);
                this.getOutputStallDurationlomOqCM = create;
                observer.onNext(create);
                io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder consumerIndexHolder = new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder(this.Camera2StreamConfigurationMap, this);
                if (this.getInputFormats) {
                    io.reactivex.Scheduler.Worker worker = this.getOutputSizes;
                    long j = this.getOutputSizeshNQ4ISI;
                    schedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j, j, this.getOutputStallDuration);
                } else {
                    io.reactivex.Scheduler scheduler = this.getHighSpeedVideoSizesFor;
                    long j2 = this.getOutputSizeshNQ4ISI;
                    schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j2, j2, this.getOutputStallDuration);
                }
                io.reactivex.internal.disposables.DisposableHelper.replace(this.getInputSizeshNQ4ISI, schedulePeriodicallyDirect);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getOutputMinFrameDuration) {
                return;
            }
            if (fastEnter()) {
                io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.getOutputStallDurationlomOqCM;
                unicastSubject.onNext(t);
                long j = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                if (j >= this.getHighSpeedVideoFpsRangesFor) {
                    this.Camera2StreamConfigurationMap++;
                    this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                    unicastSubject.onComplete();
                    io.reactivex.subjects.UnicastSubject<T> create = io.reactivex.subjects.UnicastSubject.create(this.getHighSpeedVideoFpsRanges);
                    this.getOutputStallDurationlomOqCM = create;
                    this.actual.onNext(create);
                    if (this.getInputFormats) {
                        this.getInputSizeshNQ4ISI.get().dispose();
                        io.reactivex.Scheduler.Worker worker = this.getOutputSizes;
                        io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder consumerIndexHolder = new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder(this.Camera2StreamConfigurationMap, this);
                        long j2 = this.getOutputSizeshNQ4ISI;
                        io.reactivex.internal.disposables.DisposableHelper.replace(this.getInputSizeshNQ4ISI, worker.schedulePeriodically(consumerIndexHolder, j2, j2, this.getOutputStallDuration));
                    }
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = j;
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                getHighSpeedVideoFpsRangesFor();
            }
            this.actual.onError(th);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            io.reactivex.Scheduler.Worker worker = this.getOutputSizes;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                getHighSpeedVideoFpsRangesFor();
            }
            this.actual.onComplete();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            io.reactivex.Scheduler.Worker worker = this.getOutputSizes;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.subjects.UnicastSubject<T>] */
        final void getHighSpeedVideoFpsRangesFor() {
            io.reactivex.internal.queue.MpscLinkedQueue mpscLinkedQueue = (io.reactivex.internal.queue.MpscLinkedQueue) this.queue;
            io.reactivex.Observer<? super V> observer = this.actual;
            io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.getOutputStallDurationlomOqCM;
            int i = 1;
            while (!this.getOutputMinFrameDuration) {
                boolean z = this.done;
                java.lang.Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder;
                if (z && (z2 || z3)) {
                    this.getOutputStallDurationlomOqCM = null;
                    mpscLinkedQueue.clear();
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
                    io.reactivex.Scheduler.Worker worker = this.getOutputSizes;
                    if (worker != null) {
                        worker.dispose();
                    }
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        unicastSubject.onError(th);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                }
                if (z2) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder consumerIndexHolder = (io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder) poll;
                    if (this.getInputFormats || this.Camera2StreamConfigurationMap == consumerIndexHolder.getHighSpeedVideoFpsRangesFor) {
                        unicastSubject.onComplete();
                        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                        unicastSubject = (io.reactivex.subjects.UnicastSubject<T>) io.reactivex.subjects.UnicastSubject.create(this.getHighSpeedVideoFpsRanges);
                        this.getOutputStallDurationlomOqCM = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(io.reactivex.internal.util.NotificationLite.getValue(poll));
                    long j = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                    if (j >= this.getHighSpeedVideoFpsRangesFor) {
                        this.Camera2StreamConfigurationMap++;
                        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                        unicastSubject.onComplete();
                        unicastSubject = (io.reactivex.subjects.UnicastSubject<T>) io.reactivex.subjects.UnicastSubject.create(this.getHighSpeedVideoFpsRanges);
                        this.getOutputStallDurationlomOqCM = unicastSubject;
                        this.actual.onNext(unicastSubject);
                        if (this.getInputFormats) {
                            io.reactivex.disposables.Disposable disposable = this.getInputSizeshNQ4ISI.get();
                            disposable.dispose();
                            io.reactivex.Scheduler.Worker worker2 = this.getOutputSizes;
                            io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder consumerIndexHolder2 = new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver.ConsumerIndexHolder(this.Camera2StreamConfigurationMap, this);
                            long j2 = this.getOutputSizeshNQ4ISI;
                            io.reactivex.disposables.Disposable schedulePeriodically = worker2.schedulePeriodically(consumerIndexHolder2, j2, j2, this.getOutputStallDuration);
                            if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, disposable, schedulePeriodically)) {
                                schedulePeriodically.dispose();
                            }
                        }
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI = j;
                    }
                }
            }
            this.getOutputFormats.dispose();
            mpscLinkedQueue.clear();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            io.reactivex.Scheduler.Worker worker3 = this.getOutputSizes;
            if (worker3 != null) {
                worker3.dispose();
            }
        }

        static final class ConsumerIndexHolder implements java.lang.Runnable {
            final io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver<?> Camera2StreamConfigurationMap;
            final long getHighSpeedVideoFpsRangesFor;

            ConsumerIndexHolder(long j, io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver<?> windowExactBoundedObserver) {
                this.getHighSpeedVideoFpsRangesFor = j;
                this.Camera2StreamConfigurationMap = windowExactBoundedObserver;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactBoundedObserver<?> windowExactBoundedObserver = this.Camera2StreamConfigurationMap;
                if (!windowExactBoundedObserver.cancelled) {
                    windowExactBoundedObserver.queue.offer(this);
                } else {
                    windowExactBoundedObserver.getOutputMinFrameDuration = true;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(windowExactBoundedObserver.getInputSizeshNQ4ISI);
                    io.reactivex.Scheduler.Worker worker = windowExactBoundedObserver.getOutputSizes;
                    if (worker != null) {
                        worker.dispose();
                    }
                }
                if (windowExactBoundedObserver.enter()) {
                    windowExactBoundedObserver.getHighSpeedVideoFpsRangesFor();
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowSkipObserver<T> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        final int Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final long getInputFormats;
        final io.reactivex.Scheduler.Worker getInputSizeshNQ4ISI;
        final java.util.List<io.reactivex.subjects.UnicastSubject<T>> getOutputFormats;
        final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

        WindowSkipObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, int i) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getInputFormats = j;
            this.getHighResolutionOutputSizeshNQ4ISI = j2;
            this.getOutputMinFrameDuration = timeUnit;
            this.getInputSizeshNQ4ISI = worker;
            this.Camera2StreamConfigurationMap = i;
            this.getOutputFormats = new java.util.LinkedList();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.actual.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.subjects.UnicastSubject<T> create = io.reactivex.subjects.UnicastSubject.create(this.Camera2StreamConfigurationMap);
                this.getOutputFormats.add(create);
                this.actual.onNext(create);
                this.getInputSizeshNQ4ISI.schedule(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.CompletionTask(create), this.getInputFormats, this.getOutputMinFrameDuration);
                io.reactivex.Scheduler.Worker worker = this.getInputSizeshNQ4ISI;
                long j = this.getHighResolutionOutputSizeshNQ4ISI;
                worker.schedulePeriodically(this, j, j, this.getOutputMinFrameDuration);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (fastEnter()) {
                java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = this.getOutputFormats.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(t);
                if (!enter()) {
                    return;
                }
            }
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                getHighSpeedVideoSizes();
            }
            this.actual.onError(th);
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                getHighSpeedVideoSizes();
            }
            this.actual.onComplete();
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void getHighSpeedVideoFpsRangesFor(io.reactivex.subjects.UnicastSubject<T> unicastSubject) {
            this.queue.offer(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork(unicastSubject, false));
            if (enter()) {
                getHighSpeedVideoSizes();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void getHighSpeedVideoSizes() {
            io.reactivex.internal.queue.MpscLinkedQueue mpscLinkedQueue = (io.reactivex.internal.queue.MpscLinkedQueue) this.queue;
            io.reactivex.Observer<? super V> observer = this.actual;
            java.util.List<io.reactivex.subjects.UnicastSubject<T>> list = this.getOutputFormats;
            int i = 1;
            while (!this.getHighSpeedVideoFpsRanges) {
                boolean z = this.done;
                java.lang.Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork;
                if (z && (z2 || z3)) {
                    mpscLinkedQueue.clear();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    this.getInputSizeshNQ4ISI.dispose();
                    list.clear();
                    return;
                }
                if (z2) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork subjectWork = (io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork) poll;
                    if (subjectWork.getHighSpeedVideoFpsRangesFor) {
                        if (!this.cancelled) {
                            io.reactivex.subjects.UnicastSubject<T> create = io.reactivex.subjects.UnicastSubject.create(this.Camera2StreamConfigurationMap);
                            list.add(create);
                            observer.onNext(create);
                            this.getInputSizeshNQ4ISI.schedule(new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.CompletionTask(create), this.getInputFormats, this.getOutputMinFrameDuration);
                        }
                    } else {
                        list.remove(subjectWork.Camera2StreamConfigurationMap);
                        subjectWork.Camera2StreamConfigurationMap.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.getHighSpeedVideoFpsRanges = true;
                        }
                    }
                } else {
                    java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getInputSizeshNQ4ISI.dispose();
            mpscLinkedQueue.clear();
            list.clear();
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork subjectWork = new io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.SubjectWork(io.reactivex.subjects.UnicastSubject.create(this.Camera2StreamConfigurationMap), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                getHighSpeedVideoSizes();
            }
        }

        static final class SubjectWork<T> {
            final io.reactivex.subjects.UnicastSubject<T> Camera2StreamConfigurationMap;
            final boolean getHighSpeedVideoFpsRangesFor;

            SubjectWork(io.reactivex.subjects.UnicastSubject<T> unicastSubject, boolean z) {
                this.Camera2StreamConfigurationMap = unicastSubject;
                this.getHighSpeedVideoFpsRangesFor = z;
            }
        }

        final class CompletionTask implements java.lang.Runnable {
            private final io.reactivex.subjects.UnicastSubject<T> getHighSpeedVideoFpsRangesFor;

            CompletionTask(io.reactivex.subjects.UnicastSubject<T> unicastSubject) {
                this.getHighSpeedVideoFpsRangesFor = unicastSubject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowSkipObserver.this.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }
}
