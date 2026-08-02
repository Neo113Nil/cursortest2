package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorObserveOn<T> implements rx.Observable.Operator<T, T> {
    private final rx.Scheduler Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;

    public OperatorObserveOn(rx.Scheduler scheduler, boolean z) {
        this(scheduler, z, rx.internal.util.RxRingBuffer.SIZE);
    }

    public OperatorObserveOn(rx.Scheduler scheduler, boolean z, int i) {
        this.Camera2StreamConfigurationMap = scheduler;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = i <= 0 ? rx.internal.util.RxRingBuffer.SIZE : i;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.Scheduler scheduler = this.Camera2StreamConfigurationMap;
        if ((scheduler instanceof rx.internal.schedulers.ImmediateScheduler) || (scheduler instanceof rx.internal.schedulers.TrampolineScheduler)) {
            return subscriber;
        }
        rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber observeOnSubscriber = new rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber(scheduler, subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
        rx.Subscriber<? super T> subscriber2 = observeOnSubscriber.getHighSpeedVideoSizes;
        subscriber2.setProducer(new rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber.AnonymousClass1());
        subscriber2.add(observeOnSubscriber.getOutputMinFrameDuration);
        subscriber2.add(observeOnSubscriber);
        return observeOnSubscriber;
    }

    public static <T> rx.Observable.Operator<T, T> rebatch(final int i) {
        return new rx.Observable.Operator<T, T>() { // from class: rx.internal.operators.OperatorObserveOn.1
            @Override // rx.functions.Func1
            public final /* synthetic */ java.lang.Object call(java.lang.Object obj) {
                rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber observeOnSubscriber = new rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber(rx.schedulers.Schedulers.immediate(), (rx.Subscriber) obj, false, i);
                rx.Subscriber<? super T> subscriber = observeOnSubscriber.getHighSpeedVideoSizes;
                subscriber.setProducer(new rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber.AnonymousClass1());
                subscriber.add(observeOnSubscriber.getOutputMinFrameDuration);
                subscriber.add(observeOnSubscriber);
                return observeOnSubscriber;
            }
        };
    }

    static final class ObserveOnSubscriber<T> extends rx.Subscriber<T> implements rx.functions.Action0 {
        java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super T> getHighSpeedVideoSizes;
        final int getHighSpeedVideoSizesFor;
        final java.util.Queue<java.lang.Object> getInputSizeshNQ4ISI;
        volatile boolean getOutputFormats;
        final rx.Scheduler.Worker getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicLong();

        public ObserveOnSubscriber(rx.Scheduler scheduler, rx.Subscriber<? super T> subscriber, boolean z, int i) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getOutputMinFrameDuration = scheduler.createWorker();
            this.getHighSpeedVideoFpsRanges = z;
            i = i <= 0 ? rx.internal.util.RxRingBuffer.SIZE : i;
            this.getHighSpeedVideoSizesFor = i - (i >> 2);
            if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
                this.getInputSizeshNQ4ISI = new rx.internal.util.unsafe.SpscArrayQueue(i);
            } else {
                this.getInputSizeshNQ4ISI = new rx.internal.util.atomic.SpscAtomicArrayQueue(i);
            }
            request(i);
        }

        /* renamed from: rx.internal.operators.OperatorObserveOn$ObserveOnSubscriber$1, reason: invalid class name */
        class AnonymousClass1 implements rx.Producer {
            AnonymousClass1() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j > 0) {
                    rx.internal.operators.BackpressureUtils.getAndAddRequest(rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber.this.getInputFormats, j);
                    rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber observeOnSubscriber = rx.internal.operators.OperatorObserveOn.ObserveOnSubscriber.this;
                    if (observeOnSubscriber.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                        observeOnSubscriber.getOutputMinFrameDuration.schedule(observeOnSubscriber);
                    }
                }
            }
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (isUnsubscribed() || this.getOutputFormats) {
                return;
            }
            if (!this.getInputSizeshNQ4ISI.offer(rx.internal.operators.NotificationLite.next(t))) {
                onError(new rx.exceptions.MissingBackpressureException());
            } else if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.schedule(this);
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (isUnsubscribed() || this.getOutputFormats) {
                return;
            }
            this.getOutputFormats = true;
            if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.schedule(this);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (isUnsubscribed() || this.getOutputFormats) {
                rx.plugins.RxJavaHooks.onError(th);
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = th;
            this.getOutputFormats = true;
            if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.schedule(this);
            }
        }

        @Override // rx.functions.Action0
        public final void call() {
            long j = this.getHighSpeedVideoFpsRangesFor;
            java.util.Queue<java.lang.Object> queue = this.getInputSizeshNQ4ISI;
            rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
            long j2 = 1;
            do {
                long j3 = this.getInputFormats.get();
                while (j3 != j) {
                    boolean z = this.getOutputFormats;
                    java.lang.Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!Camera2StreamConfigurationMap(z, z2, subscriber, queue)) {
                        if (z2) {
                            break;
                        }
                        subscriber.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll));
                        j++;
                        if (j == this.getHighSpeedVideoSizesFor) {
                            j3 = rx.internal.operators.BackpressureUtils.produced(this.getInputFormats, j);
                            request(j);
                            j = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (j3 == j && Camera2StreamConfigurationMap(this.getOutputFormats, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = j;
                j2 = this.Camera2StreamConfigurationMap.addAndGet(-j2);
            } while (j2 != 0);
        }

        private boolean Camera2StreamConfigurationMap(boolean z, boolean z2, rx.Subscriber<? super T> subscriber, java.util.Queue<java.lang.Object> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.getHighSpeedVideoFpsRanges) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
                try {
                    if (th != null) {
                        subscriber.onError(th);
                    } else {
                        subscriber.onCompleted();
                    }
                    return false;
                } finally {
                }
            }
            java.lang.Throwable th2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (th2 != null) {
                queue.clear();
                try {
                    subscriber.onError(th2);
                    return true;
                } finally {
                }
            }
            if (!z2) {
                return false;
            }
            try {
                subscriber.onCompleted();
                return true;
            } finally {
            }
        }
    }
}
