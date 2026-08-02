package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorOnBackpressureLatest<T> implements rx.Observable.Operator<T, T> {

    static final class Holder {
        static final rx.internal.operators.OperatorOnBackpressureLatest<java.lang.Object> Camera2StreamConfigurationMap = new rx.internal.operators.OperatorOnBackpressureLatest<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorOnBackpressureLatest<T> instance() {
        return (rx.internal.operators.OperatorOnBackpressureLatest<T>) rx.internal.operators.OperatorOnBackpressureLatest.Holder.Camera2StreamConfigurationMap;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter latestEmitter = new rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter(subscriber);
        rx.internal.operators.OperatorOnBackpressureLatest.LatestSubscriber<? super T> latestSubscriber = new rx.internal.operators.OperatorOnBackpressureLatest.LatestSubscriber<>(latestEmitter);
        latestEmitter.getOutputMinFrameDuration = latestSubscriber;
        subscriber.add(latestSubscriber);
        subscriber.add(latestEmitter);
        subscriber.setProducer(latestEmitter);
        return latestSubscriber;
    }

    static final class LatestEmitter<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Subscription, rx.Observer<T> {
        static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
        private static final long serialVersionUID = -1364393685005146274L;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(Camera2StreamConfigurationMap);
        java.lang.Throwable getOutputFormats;
        rx.internal.operators.OperatorOnBackpressureLatest.LatestSubscriber<? super T> getOutputMinFrameDuration;

        public LatestEmitter(rx.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            lazySet(androidx.collection.SieveCacheKt.NodeMetaMask);
        }

        @Override // rx.Producer
        public final void request(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == androidx.collection.SieveCacheKt.NodeMetaMask) {
                        j3 = j;
                    } else {
                        j3 = j2 + j;
                        if (j3 < 0) {
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } while (!compareAndSet(j2, j3));
                if (j2 == androidx.collection.SieveCacheKt.NodeMetaMask) {
                    this.getOutputMinFrameDuration.request(Long.MAX_VALUE);
                }
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getInputSizeshNQ4ISI.lazySet(t);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getOutputFormats = th;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            getHighSpeedVideoFpsRangesFor();
        }

        private void getHighSpeedVideoFpsRangesFor() {
            java.lang.Object obj;
            long j;
            synchronized (this) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    this.getHighSpeedVideoSizes = true;
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getHighSpeedVideoSizes = false;
                while (true) {
                    try {
                        long j2 = get();
                        if (j2 == Long.MIN_VALUE) {
                            return;
                        }
                        java.lang.Object obj2 = this.getInputSizeshNQ4ISI.get();
                        if (j2 > 0 && obj2 != (obj = Camera2StreamConfigurationMap)) {
                            this.getHighSpeedVideoFpsRanges.onNext(obj2);
                            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, obj2, obj);
                            do {
                                j = get();
                                if (j < 0) {
                                    break;
                                }
                            } while (!compareAndSet(j, j - 1));
                            obj2 = obj;
                        }
                        if (obj2 == Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI) {
                            java.lang.Throwable th = this.getOutputFormats;
                            if (th != null) {
                                this.getHighSpeedVideoFpsRanges.onError(th);
                            } else {
                                this.getHighSpeedVideoFpsRanges.onCompleted();
                            }
                        }
                        synchronized (this) {
                            if (!this.getHighSpeedVideoSizes) {
                                this.getHighSpeedVideoFpsRangesFor = false;
                                return;
                            }
                            this.getHighSpeedVideoSizes = false;
                        }
                    } catch (java.lang.Throwable th2) {
                        synchronized (this) {
                            this.getHighSpeedVideoFpsRangesFor = false;
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    static final class LatestSubscriber<T> extends rx.Subscriber<T> {
        private final rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter<T> getHighSpeedVideoFpsRanges;

        LatestSubscriber(rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter<T> latestEmitter) {
            this.getHighSpeedVideoFpsRanges = latestEmitter;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(0L);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges.onNext(t);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRanges.onCompleted();
        }
    }
}
