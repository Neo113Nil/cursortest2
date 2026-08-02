package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorScan<R, T> implements rx.Observable.Operator<R, T> {
    private static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    final rx.functions.Func2<R, ? super T, R> getHighSpeedVideoFpsRanges;
    private final rx.functions.Func0<R> getHighSpeedVideoFpsRangesFor;

    public OperatorScan(final R r, rx.functions.Func2<R, ? super T, R> func2) {
        this((rx.functions.Func0) new rx.functions.Func0<R>() { // from class: rx.internal.operators.OperatorScan.1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public R call() {
                return (R) r;
            }
        }, (rx.functions.Func2) func2);
    }

    public OperatorScan(rx.functions.Func0<R> func0, rx.functions.Func2<R, ? super T, R> func2) {
        this.getHighSpeedVideoFpsRangesFor = func0;
        this.getHighSpeedVideoFpsRanges = func2;
    }

    public OperatorScan(rx.functions.Func2<R, ? super T, R> func2) {
        this(getHighResolutionOutputSizeshNQ4ISI, func2);
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super R> subscriber) {
        R call = this.getHighSpeedVideoFpsRangesFor.call();
        if (call == getHighResolutionOutputSizeshNQ4ISI) {
            return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorScan.2
                R Camera2StreamConfigurationMap;
                boolean getHighSpeedVideoSizes;

                @Override // rx.Observer
                public void onNext(T t) {
                    if (!this.getHighSpeedVideoSizes) {
                        this.getHighSpeedVideoSizes = true;
                    } else {
                        try {
                            t = rx.internal.operators.OperatorScan.this.getHighSpeedVideoFpsRanges.call(this.Camera2StreamConfigurationMap, t);
                        } catch (java.lang.Throwable th) {
                            rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
                            return;
                        }
                    }
                    this.Camera2StreamConfigurationMap = (R) t;
                    subscriber.onNext(t);
                }

                @Override // rx.Observer
                public void onError(java.lang.Throwable th) {
                    subscriber.onError(th);
                }

                @Override // rx.Observer
                public void onCompleted() {
                    subscriber.onCompleted();
                }
            };
        }
        rx.internal.operators.OperatorScan.InitialProducer initialProducer = new rx.internal.operators.OperatorScan.InitialProducer(call, subscriber);
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>(call, initialProducer) { // from class: rx.internal.operators.OperatorScan.3
            final /* synthetic */ rx.internal.operators.OperatorScan.InitialProducer Camera2StreamConfigurationMap;
            private R getHighSpeedVideoFpsRanges;
            final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.getHighSpeedVideoFpsRangesFor = call;
                this.Camera2StreamConfigurationMap = initialProducer;
                this.getHighSpeedVideoFpsRanges = call;
            }

            @Override // rx.Observer
            public void onNext(T t) {
                try {
                    R call2 = rx.internal.operators.OperatorScan.this.getHighSpeedVideoFpsRanges.call(this.getHighSpeedVideoFpsRanges, t);
                    this.getHighSpeedVideoFpsRanges = call2;
                    this.Camera2StreamConfigurationMap.onNext(call2);
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this, t);
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                this.Camera2StreamConfigurationMap.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.Camera2StreamConfigurationMap.onCompleted();
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(rx.Producer producer) {
                long j;
                rx.internal.operators.OperatorScan.InitialProducer initialProducer2 = this.Camera2StreamConfigurationMap;
                synchronized (initialProducer2.getOutputFormats) {
                    if (initialProducer2.getOutputMinFrameDuration != null) {
                        throw new java.lang.IllegalStateException("Can't set more than one Producer!");
                    }
                    j = initialProducer2.getHighSpeedVideoSizesFor;
                    if (j != Long.MAX_VALUE) {
                        j--;
                    }
                    initialProducer2.getHighSpeedVideoSizesFor = 0L;
                    initialProducer2.getOutputMinFrameDuration = producer;
                }
                if (j > 0) {
                    producer.request(j);
                }
                initialProducer2.getHighSpeedVideoFpsRanges();
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(initialProducer);
        return subscriber2;
    }

    static final class InitialProducer<R> implements rx.Producer, rx.Observer<R> {
        java.lang.Throwable Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super R> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        long getHighSpeedVideoSizesFor;
        final java.util.Queue<java.lang.Object> getInputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicLong getOutputFormats;
        volatile rx.Producer getOutputMinFrameDuration;

        public InitialProducer(R r, rx.Subscriber<? super R> subscriber) {
            java.util.Queue<java.lang.Object> spscLinkedAtomicQueue;
            this.getHighSpeedVideoFpsRanges = subscriber;
            if (rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable()) {
                spscLinkedAtomicQueue = new rx.internal.util.unsafe.SpscLinkedQueue<>();
            } else {
                spscLinkedAtomicQueue = new rx.internal.util.atomic.SpscLinkedAtomicQueue<>();
            }
            this.getInputSizeshNQ4ISI = spscLinkedAtomicQueue;
            spscLinkedAtomicQueue.offer(rx.internal.operators.NotificationLite.next(r));
            this.getOutputFormats = new java.util.concurrent.atomic.AtomicLong();
        }

        @Override // rx.Observer
        public final void onNext(R r) {
            this.getInputSizeshNQ4ISI.offer(rx.internal.operators.NotificationLite.next(r));
            getHighSpeedVideoFpsRanges();
        }

        private boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2, rx.Subscriber<? super R> subscriber) {
            if (subscriber.isUnsubscribed()) {
                return true;
            }
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.Camera2StreamConfigurationMap;
            if (th != null) {
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = th;
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Producer
        public final void request(long j) {
            rx.Producer producer;
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j != 0) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this.getOutputFormats, j);
                rx.Producer producer2 = this.getOutputMinFrameDuration;
                if (producer2 == null) {
                    synchronized (this.getOutputFormats) {
                        producer = this.getOutputMinFrameDuration;
                        if (producer == null) {
                            this.getHighSpeedVideoSizesFor = rx.internal.operators.BackpressureUtils.addCap(this.getHighSpeedVideoSizesFor, j);
                        }
                    }
                    producer2 = producer;
                }
                if (producer2 != null) {
                    producer2.request(j);
                }
                getHighSpeedVideoFpsRanges();
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            synchronized (this) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                rx.Subscriber<? super R> subscriber = this.getHighSpeedVideoFpsRanges;
                java.util.Queue<java.lang.Object> queue = this.getInputSizeshNQ4ISI;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getOutputFormats;
                long j = atomicLong.get();
                while (!getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, queue.isEmpty(), subscriber)) {
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.getHighSpeedVideoSizes;
                        java.lang.Object poll = queue.poll();
                        boolean z2 = poll == null;
                        if (!getHighResolutionOutputSizeshNQ4ISI(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            a.d dVar = (java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll);
                            try {
                                subscriber.onNext(dVar);
                                j2++;
                            } catch (java.lang.Throwable th) {
                                rx.exceptions.Exceptions.throwOrReport(th, subscriber, dVar);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        j = rx.internal.operators.BackpressureUtils.produced(atomicLong, j2);
                    }
                    synchronized (this) {
                        if (!this.getHighSpeedVideoFpsRangesFor) {
                            this.getHighResolutionOutputSizeshNQ4ISI = false;
                            return;
                        }
                        this.getHighSpeedVideoFpsRangesFor = false;
                    }
                }
            }
        }
    }
}
