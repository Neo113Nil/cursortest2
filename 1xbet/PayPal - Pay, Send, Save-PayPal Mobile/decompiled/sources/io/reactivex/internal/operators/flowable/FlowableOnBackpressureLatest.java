package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureLatest<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableOnBackpressureLatest(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest.BackpressureLatestSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class BackpressureLatestSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 163080509307634843L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoSizes;
        org.reactivestreams.Subscription getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<T> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();

        BackpressureLatestSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.Camera2StreamConfigurationMap = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.lazySet(t);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputMinFrameDuration, j);
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor.cancel();
            if (getAndIncrement() == 0) {
                this.getHighSpeedVideoFpsRangesFor.lazySet(null);
            }
        }

        private void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super T> subscriber = this.Camera2StreamConfigurationMap;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getOutputMinFrameDuration;
                java.util.concurrent.atomic.AtomicReference<T> atomicReference = this.getHighSpeedVideoFpsRangesFor;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z = this.getHighSpeedVideoFpsRanges;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z2 = andSet == null;
                        if (!getHighResolutionOutputSizeshNQ4ISI(z, z2, subscriber, atomicReference)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        if (getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, atomicReference.get() == null, subscriber, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        io.reactivex.internal.util.BackpressureHelper.produced(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        private boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, java.util.concurrent.atomic.AtomicReference<T> atomicReference) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.getHighSpeedVideoSizes;
            if (th != null) {
                atomicReference.lazySet(null);
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }
    }
}
