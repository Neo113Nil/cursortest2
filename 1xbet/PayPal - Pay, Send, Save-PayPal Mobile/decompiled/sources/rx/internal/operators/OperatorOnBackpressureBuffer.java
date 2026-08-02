package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorOnBackpressureBuffer<T> implements rx.Observable.Operator<T, T> {
    private final rx.functions.Action0 Camera2StreamConfigurationMap;
    private final java.lang.Long getHighSpeedVideoFpsRanges;
    private final rx.BackpressureOverflow.Strategy getHighSpeedVideoFpsRangesFor;

    static final class Holder {
        static final rx.internal.operators.OperatorOnBackpressureBuffer<?> getHighSpeedVideoFpsRangesFor = new rx.internal.operators.OperatorOnBackpressureBuffer<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorOnBackpressureBuffer<T> instance() {
        return (rx.internal.operators.OperatorOnBackpressureBuffer<T>) rx.internal.operators.OperatorOnBackpressureBuffer.Holder.getHighSpeedVideoFpsRangesFor;
    }

    OperatorOnBackpressureBuffer() {
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor = rx.BackpressureOverflow.ON_OVERFLOW_DEFAULT;
    }

    public OperatorOnBackpressureBuffer(long j) {
        this(j, null, rx.BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j, rx.functions.Action0 action0) {
        this(j, action0, rx.BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j, rx.functions.Action0 action0, rx.BackpressureOverflow.Strategy strategy) {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("Buffer capacity must be > 0");
        }
        if (strategy == null) {
            throw new java.lang.NullPointerException("The BackpressureOverflow strategy must not be null");
        }
        this.getHighSpeedVideoFpsRanges = java.lang.Long.valueOf(j);
        this.Camera2StreamConfigurationMap = action0;
        this.getHighSpeedVideoFpsRangesFor = strategy;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OperatorOnBackpressureBuffer.BufferSubscriber bufferSubscriber = new rx.internal.operators.OperatorOnBackpressureBuffer.BufferSubscriber(subscriber, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
        subscriber.add(bufferSubscriber);
        subscriber.setProducer(bufferSubscriber.getHighResolutionOutputSizeshNQ4ISI);
        return bufferSubscriber;
    }

    static final class BufferSubscriber<T> extends rx.Subscriber<T> implements rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback {
        private final rx.BackpressureOverflow.Strategy Camera2StreamConfigurationMap;
        final rx.internal.util.BackpressureDrainManager getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges;
        private final rx.functions.Action0 getHighSpeedVideoFpsRangesFor;
        private final rx.Subscriber<? super T> getHighSpeedVideoSizes;
        private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Object> getOutputMinFrameDuration = new java.util.concurrent.ConcurrentLinkedQueue<>();
        private final java.util.concurrent.atomic.AtomicBoolean getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);

        public BufferSubscriber(rx.Subscriber<? super T> subscriber, java.lang.Long l, rx.functions.Action0 action0, rx.BackpressureOverflow.Strategy strategy) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRanges = l != null ? new java.util.concurrent.atomic.AtomicLong(l.longValue()) : null;
            this.getHighSpeedVideoFpsRangesFor = action0;
            this.getHighResolutionOutputSizeshNQ4ISI = new rx.internal.util.BackpressureDrainManager(this);
            this.Camera2StreamConfigurationMap = strategy;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getOutputFormats.get()) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.terminateAndDrain();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats.get()) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.terminateAndDrain(th);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (getHighResolutionOutputSizeshNQ4ISI()) {
                this.getOutputMinFrameDuration.offer(rx.internal.operators.NotificationLite.next(t));
                this.getHighResolutionOutputSizeshNQ4ISI.drain();
            }
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public final boolean accept(java.lang.Object obj) {
            return rx.internal.operators.NotificationLite.accept(this.getHighSpeedVideoSizes, obj);
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public final void complete(java.lang.Throwable th) {
            if (th != null) {
                this.getHighSpeedVideoSizes.onError(th);
            } else {
                this.getHighSpeedVideoSizes.onCompleted();
            }
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public final java.lang.Object peek() {
            return this.getOutputMinFrameDuration.peek();
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public final java.lang.Object poll() {
            java.lang.Object poll = this.getOutputMinFrameDuration.poll();
            java.util.concurrent.atomic.AtomicLong atomicLong = this.getHighSpeedVideoFpsRanges;
            if (atomicLong != null && poll != null) {
                atomicLong.incrementAndGet();
            }
            return poll;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean getHighResolutionOutputSizeshNQ4ISI() {
            long j;
            boolean z;
            rx.functions.Action0 action0;
            if (this.getHighSpeedVideoFpsRanges == null) {
                return true;
            }
            do {
                j = this.getHighSpeedVideoFpsRanges.get();
                if (j <= 0) {
                    try {
                    } catch (rx.exceptions.MissingBackpressureException e) {
                        if (this.getOutputFormats.compareAndSet(false, true)) {
                            unsubscribe();
                            this.getHighSpeedVideoSizes.onError(e);
                        }
                    }
                    if (this.Camera2StreamConfigurationMap.mayAttemptDrop() && poll() != null) {
                        z = true;
                        action0 = this.getHighSpeedVideoFpsRangesFor;
                        if (action0 != null) {
                            try {
                                action0.call();
                            } catch (java.lang.Throwable th) {
                                rx.exceptions.Exceptions.throwIfFatal(th);
                                this.getHighResolutionOutputSizeshNQ4ISI.terminateAndDrain(th);
                                return false;
                            }
                        }
                        if (!z) {
                            return false;
                        }
                    }
                    z = false;
                    action0 = this.getHighSpeedVideoFpsRangesFor;
                    if (action0 != null) {
                    }
                    if (!z) {
                    }
                }
            } while (!this.getHighSpeedVideoFpsRanges.compareAndSet(j, j - 1));
            return true;
        }
    }
}
