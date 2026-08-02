package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableObserveOn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean getHighSpeedVideoFpsRanges;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public ObservableObserveOn(io.reactivex.ObservableSource<T> observableSource, io.reactivex.Scheduler scheduler, boolean z, int i) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.Scheduler scheduler = this.getHighSpeedVideoFpsRangesFor;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            this.source.subscribe(observer);
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableObserveOn.ObserveOnObserver(observer, scheduler.createWorker(), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
        }
    }

    /* loaded from: classes17.dex */
    static final class ObserveOnObserver<T> extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> implements io.reactivex.Observer<T>, java.lang.Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        volatile boolean Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        java.lang.Throwable getHighSpeedVideoSizesFor;
        boolean getInputFormats;
        int getInputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputFormats;
        io.reactivex.internal.fuseable.SimpleQueue<T> getOutputMinFrameDuration;
        final io.reactivex.Scheduler.Worker getOutputStallDurationlomOqCM;

        ObserveOnObserver(io.reactivex.Observer<? super T> observer, io.reactivex.Scheduler.Worker worker, boolean z, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getOutputStallDurationlomOqCM = worker;
            this.getHighSpeedVideoFpsRanges = z;
            this.getHighSpeedVideoSizes = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputFormats, disposable)) {
                this.getOutputFormats = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(7);
                    if (requestFusion == 1) {
                        this.getInputSizeshNQ4ISI = requestFusion;
                        this.getOutputMinFrameDuration = queueDisposable;
                        this.Camera2StreamConfigurationMap = true;
                        this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.getOutputStallDurationlomOqCM.schedule(this);
                            return;
                        }
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getInputSizeshNQ4ISI = requestFusion;
                        this.getOutputMinFrameDuration = queueDisposable;
                        this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                        return;
                    }
                }
                this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.getHighSpeedVideoSizes);
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            if (this.getInputSizeshNQ4ISI != 2) {
                this.getOutputMinFrameDuration.offer(t);
            }
            if (getAndIncrement() == 0) {
                this.getOutputStallDurationlomOqCM.schedule(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoSizesFor = th;
            this.Camera2StreamConfigurationMap = true;
            if (getAndIncrement() == 0) {
                this.getOutputStallDurationlomOqCM.schedule(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            if (getAndIncrement() == 0) {
                this.getOutputStallDurationlomOqCM.schedule(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getOutputFormats.dispose();
            this.getOutputStallDurationlomOqCM.dispose();
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x006e, code lost:
        
            if (r3 != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int i = 1;
            if (this.getInputFormats) {
                while (!this.getHighSpeedVideoFpsRangesFor) {
                    boolean z = this.Camera2StreamConfigurationMap;
                    java.lang.Throwable th = this.getHighSpeedVideoSizesFor;
                    if (!this.getHighSpeedVideoFpsRanges && z && th != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                        this.getOutputStallDurationlomOqCM.dispose();
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(null);
                    if (z) {
                        java.lang.Throwable th2 = this.getHighSpeedVideoSizesFor;
                        if (th2 != null) {
                            this.getHighResolutionOutputSizeshNQ4ISI.onError(th2);
                        } else {
                            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                        }
                        this.getOutputStallDurationlomOqCM.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                return;
            }
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputMinFrameDuration;
            io.reactivex.Observer<? super T> observer = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = 1;
            while (!getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, simpleQueue.isEmpty(), observer)) {
                while (true) {
                    boolean z2 = this.Camera2StreamConfigurationMap;
                    try {
                        T poll = simpleQueue.poll();
                        boolean z3 = poll == null;
                        if (getHighResolutionOutputSizeshNQ4ISI(z2, z3, observer)) {
                            return;
                        }
                        if (z3) {
                            break;
                        } else {
                            observer.onNext(poll);
                        }
                    } catch (java.lang.Throwable th3) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                        this.getOutputFormats.dispose();
                        simpleQueue.clear();
                        observer.onError(th3);
                        this.getOutputStallDurationlomOqCM.dispose();
                        return;
                    }
                }
            }
        }

        private boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2, io.reactivex.Observer<? super T> observer) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getOutputMinFrameDuration.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.getHighSpeedVideoSizesFor;
            if (this.getHighSpeedVideoFpsRanges) {
                if (!z2) {
                    return false;
                }
                if (th != null) {
                    observer.onError(th);
                } else {
                    observer.onComplete();
                }
                this.getOutputStallDurationlomOqCM.dispose();
                return true;
            }
            if (th != null) {
                this.getOutputMinFrameDuration.clear();
                observer.onError(th);
                this.getOutputStallDurationlomOqCM.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            observer.onComplete();
            this.getOutputStallDurationlomOqCM.dispose();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getInputFormats = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            return this.getOutputMinFrameDuration.poll();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getOutputMinFrameDuration.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getOutputMinFrameDuration.isEmpty();
        }
    }
}
