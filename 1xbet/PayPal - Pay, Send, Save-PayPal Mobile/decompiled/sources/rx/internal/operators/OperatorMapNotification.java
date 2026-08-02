package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorMapNotification<T, R> implements rx.Observable.Operator<R, T> {
    final rx.functions.Func0<? extends R> Camera2StreamConfigurationMap;
    final rx.functions.Func1<? super T, ? extends R> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<? super java.lang.Throwable, ? extends R> getHighSpeedVideoFpsRangesFor;

    public OperatorMapNotification(rx.functions.Func1<? super T, ? extends R> func1, rx.functions.Func1<? super java.lang.Throwable, ? extends R> func12, rx.functions.Func0<? extends R> func0) {
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
        this.getHighSpeedVideoFpsRangesFor = func12;
        this.Camera2StreamConfigurationMap = func0;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super R> subscriber) {
        final rx.internal.operators.OperatorMapNotification.MapNotificationSubscriber mapNotificationSubscriber = new rx.internal.operators.OperatorMapNotification.MapNotificationSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        subscriber.add(mapNotificationSubscriber);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorMapNotification.1
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.OperatorMapNotification.MapNotificationSubscriber mapNotificationSubscriber2 = mapNotificationSubscriber;
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
                }
                if (j == 0) {
                    return;
                }
                while (true) {
                    long j2 = mapNotificationSubscriber2.getHighSpeedVideoSizesFor.get();
                    if ((j2 & Long.MIN_VALUE) != 0) {
                        long j3 = Long.MAX_VALUE & j2;
                        if (mapNotificationSubscriber2.getHighSpeedVideoSizesFor.compareAndSet(j2, Long.MIN_VALUE | rx.internal.operators.BackpressureUtils.addCap(j3, j))) {
                            if (j3 == 0) {
                                if (!mapNotificationSubscriber2.getHighSpeedVideoSizes.isUnsubscribed()) {
                                    mapNotificationSubscriber2.getHighSpeedVideoSizes.onNext(mapNotificationSubscriber2.getInputSizeshNQ4ISI);
                                }
                                if (mapNotificationSubscriber2.getHighSpeedVideoSizes.isUnsubscribed()) {
                                    return;
                                }
                                mapNotificationSubscriber2.getHighSpeedVideoSizes.onCompleted();
                                return;
                            }
                            return;
                        }
                    } else {
                        if (mapNotificationSubscriber2.getHighSpeedVideoSizesFor.compareAndSet(j2, rx.internal.operators.BackpressureUtils.addCap(j2, j))) {
                            java.util.concurrent.atomic.AtomicReference<rx.Producer> atomicReference = mapNotificationSubscriber2.getOutputFormats;
                            rx.Producer producer = atomicReference.get();
                            if (producer != null) {
                                producer.request(j);
                                return;
                            }
                            rx.internal.operators.BackpressureUtils.getAndAddRequest(mapNotificationSubscriber2.Camera2StreamConfigurationMap, j);
                            rx.Producer producer2 = atomicReference.get();
                            if (producer2 != null) {
                                long andSet = mapNotificationSubscriber2.Camera2StreamConfigurationMap.getAndSet(0L);
                                if (andSet != 0) {
                                    producer2.request(andSet);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        });
        return mapNotificationSubscriber;
    }

    static final class MapNotificationSubscriber<T, R> extends rx.Subscriber<T> {
        final rx.functions.Func0<? extends R> getHighResolutionOutputSizeshNQ4ISI;
        final rx.functions.Func1<? super java.lang.Throwable, ? extends R> getHighSpeedVideoFpsRanges;
        final rx.functions.Func1<? super T, ? extends R> getHighSpeedVideoFpsRangesFor;
        final rx.Subscriber<? super R> getHighSpeedVideoSizes;
        R getInputSizeshNQ4ISI;
        long getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<rx.Producer> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();

        public MapNotificationSubscriber(rx.Subscriber<? super R> subscriber, rx.functions.Func1<? super T, ? extends R> func1, rx.functions.Func1<? super java.lang.Throwable, ? extends R> func12, rx.functions.Func0<? extends R> func0) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRangesFor = func1;
            this.getHighSpeedVideoFpsRanges = func12;
            this.getHighResolutionOutputSizeshNQ4ISI = func0;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                this.getOutputMinFrameDuration++;
                this.getHighSpeedVideoSizes.onNext(this.getHighSpeedVideoFpsRangesFor.call(t));
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this.getHighSpeedVideoSizes, t);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputFormats, null, producer)) {
                long andSet = this.Camera2StreamConfigurationMap.getAndSet(0L);
                if (andSet != 0) {
                    producer.request(andSet);
                    return;
                }
                return;
            }
            throw new java.lang.IllegalStateException("Producer already set!");
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            long j;
            do {
                j = this.getHighSpeedVideoSizesFor.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.getHighSpeedVideoSizesFor.compareAndSet(j, Long.MIN_VALUE | j));
            if (j != 0 || this.getOutputFormats.get() == null) {
                if (!this.getHighSpeedVideoSizes.isUnsubscribed()) {
                    this.getHighSpeedVideoSizes.onNext(this.getInputSizeshNQ4ISI);
                }
                if (this.getHighSpeedVideoSizes.isUnsubscribed()) {
                    return;
                }
                this.getHighSpeedVideoSizes.onCompleted();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            long j = this.getOutputMinFrameDuration;
            if (j != 0 && this.getOutputFormats.get() != null) {
                rx.internal.operators.BackpressureUtils.produced(this.getHighSpeedVideoSizesFor, j);
            }
            try {
                this.getInputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.call();
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, this.getHighSpeedVideoSizes);
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            long j = this.getOutputMinFrameDuration;
            if (j != 0 && this.getOutputFormats.get() != null) {
                rx.internal.operators.BackpressureUtils.produced(this.getHighSpeedVideoSizesFor, j);
            }
            try {
                this.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.call(th);
            } catch (java.lang.Throwable th2) {
                rx.exceptions.Exceptions.throwOrReport(th2, this.getHighSpeedVideoSizes, th);
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }
}
