package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSamplePublisher<T> extends io.reactivex.Flowable<T> {
    final boolean Camera2StreamConfigurationMap;
    final org.reactivestreams.Publisher<?> getHighResolutionOutputSizeshNQ4ISI;
    final org.reactivestreams.Publisher<T> getHighSpeedVideoFpsRangesFor;

    public FlowableSamplePublisher(org.reactivestreams.Publisher<T> publisher, org.reactivestreams.Publisher<?> publisher2, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.getHighResolutionOutputSizeshNQ4ISI = publisher2;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.subscribers.SerializedSubscriber serializedSubscriber = new io.reactivex.subscribers.SerializedSubscriber(subscriber);
        if (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SampleMainEmitLast(serializedSubscriber, this.getHighResolutionOutputSizeshNQ4ISI));
        } else {
            this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SampleMainNoLast(serializedSubscriber, this.getHighResolutionOutputSizeshNQ4ISI));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class SamplePublisherSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3517602651313910099L;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Publisher<?> getInputFormats;
        org.reactivestreams.Subscription getOutputFormats;
        final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();

        abstract void Camera2StreamConfigurationMap();

        abstract void getHighSpeedVideoFpsRanges();

        abstract void getHighSpeedVideoSizes();

        SamplePublisherSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, org.reactivestreams.Publisher<?> publisher) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getInputFormats = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                if (this.getHighSpeedVideoFpsRangesFor.get() == null) {
                    this.getInputFormats.subscribe(new io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplerSubscriber(this));
                    subscription.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.Camera2StreamConfigurationMap, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
            this.getOutputFormats.cancel();
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.Camera2StreamConfigurationMap.get() != 0) {
                    this.getHighSpeedVideoFpsRanges.onNext(andSet);
                    io.reactivex.internal.util.BackpressureHelper.produced(this.Camera2StreamConfigurationMap, 1L);
                } else {
                    cancel();
                    this.getHighSpeedVideoFpsRanges.onError(new io.reactivex.exceptions.MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SamplerSubscriber<T> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        final io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> getHighSpeedVideoSizes;

        SamplerSubscriber(io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> samplePublisherSubscriber) {
            this.getHighSpeedVideoSizes = samplePublisherSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> samplePublisherSubscriber = this.getHighSpeedVideoSizes;
            samplePublisherSubscriber.getOutputFormats.cancel();
            samplePublisherSubscriber.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> samplePublisherSubscriber = this.getHighSpeedVideoSizes;
            samplePublisherSubscriber.getOutputFormats.cancel();
            samplePublisherSubscriber.Camera2StreamConfigurationMap();
        }
    }

    /* loaded from: classes17.dex */
    static final class SampleMainNoLast<T> extends io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        SampleMainNoLast(org.reactivestreams.Subscriber<? super T> subscriber, org.reactivestreams.Publisher<?> publisher) {
            super(subscriber, publisher);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        final void getHighSpeedVideoFpsRanges() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        final void Camera2StreamConfigurationMap() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        final void getHighSpeedVideoSizes() {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    /* loaded from: classes17.dex */
    static final class SampleMainEmitLast<T> extends io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber<T> {
        private static final long serialVersionUID = -3029755663834015785L;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes;

        SampleMainEmitLast(org.reactivestreams.Subscriber<? super T> subscriber, org.reactivestreams.Publisher<?> publisher) {
            super(subscriber, publisher);
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        final void getHighSpeedVideoFpsRanges() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (this.getHighSpeedVideoSizes.getAndIncrement() == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        final void Camera2StreamConfigurationMap() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (this.getHighSpeedVideoSizes.getAndIncrement() == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSamplePublisher.SamplePublisherSubscriber
        final void getHighSpeedVideoSizes() {
            if (this.getHighSpeedVideoSizes.getAndIncrement() == 0) {
                do {
                    boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                    getHighResolutionOutputSizeshNQ4ISI();
                    if (z) {
                        this.getHighSpeedVideoFpsRanges.onComplete();
                        return;
                    }
                } while (this.getHighSpeedVideoSizes.decrementAndGet() != 0);
            }
        }
    }
}
