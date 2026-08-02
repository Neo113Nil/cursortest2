package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableBuffer<T, C extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, C> {
    final java.util.concurrent.Callable<C> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;

    public FlowableBuffer(io.reactivex.Flowable<T> flowable, int i, int i2, java.util.concurrent.Callable<C> callable) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super C> subscriber) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == i2) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBuffer.PublisherBufferExactSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
        } else if (i2 > i) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBuffer.PublisherBufferSkipSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBuffer.PublisherBufferOverlappingSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
        }
    }

    /* loaded from: classes17.dex */
    static final class PublisherBufferExactSubscriber<T, C extends java.util.Collection<? super T>> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final java.util.concurrent.Callable<C> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super C> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        C getHighSpeedVideoSizes;
        org.reactivestreams.Subscription getHighSpeedVideoSizesFor;
        final int getOutputFormats;

        PublisherBufferExactSubscriber(org.reactivestreams.Subscriber<? super C> subscriber, int i, java.util.concurrent.Callable<C> callable) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getOutputFormats = i;
            this.Camera2StreamConfigurationMap = callable;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                this.getHighSpeedVideoSizesFor.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(j, this.getOutputFormats));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizesFor.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            C c = this.getHighSpeedVideoSizes;
            if (c == null) {
                try {
                    c = (C) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The bufferSupplier returned a null buffer");
                    this.getHighSpeedVideoSizes = c;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c.add(t);
            int i = this.getHighSpeedVideoFpsRangesFor + 1;
            if (i == this.getOutputFormats) {
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges.onNext(c);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            C c = this.getHighSpeedVideoSizes;
            if (c != null && !c.isEmpty()) {
                this.getHighSpeedVideoFpsRanges.onNext(c);
            }
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class PublisherBufferSkipSubscriber<T, C extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5616169793639412593L;
        C Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super C> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.Callable<C> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        final int getInputFormats;
        org.reactivestreams.Subscription getOutputFormats;
        final int getOutputMinFrameDuration;

        PublisherBufferSkipSubscriber(org.reactivestreams.Subscriber<? super C> subscriber, int i, int i2, java.util.concurrent.Callable<C> callable) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getOutputMinFrameDuration = i;
            this.getInputFormats = i2;
            this.getHighSpeedVideoFpsRanges = callable;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.getOutputFormats.request(io.reactivex.internal.util.BackpressureHelper.addCap(io.reactivex.internal.util.BackpressureHelper.multiplyCap(j, this.getOutputMinFrameDuration), io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getInputFormats - this.getOutputMinFrameDuration, j - 1)));
                    return;
                }
                this.getOutputFormats.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getInputFormats, j));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getOutputFormats.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            C c = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoSizes;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    c = (C) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The bufferSupplier returned a null buffer");
                    this.Camera2StreamConfigurationMap = c;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c != null) {
                c.add(t);
                if (c.size() == this.getOutputMinFrameDuration) {
                    this.Camera2StreamConfigurationMap = null;
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(c);
                }
            }
            if (i2 == this.getInputFormats) {
                i2 = 0;
            }
            this.getHighSpeedVideoSizes = i2;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            C c = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            if (c != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(c);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class PublisherBufferOverlappingSubscriber<T, C extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.functions.BooleanSupplier {
        private static final long serialVersionUID = -7370244972039324525L;
        boolean Camera2StreamConfigurationMap;
        final java.util.concurrent.Callable<C> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super C> getHighSpeedVideoSizes;
        long getInputFormats;
        int getInputSizeshNQ4ISI;
        org.reactivestreams.Subscription getOutputFormats;
        final int getOutputMinFrameDuration;
        final int getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.ArrayDeque<C> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayDeque<>();

        PublisherBufferOverlappingSubscriber(org.reactivestreams.Subscriber<? super C> subscriber, int i, int i2, java.util.concurrent.Callable<C> callable) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getOutputMinFrameDuration = i;
            this.getOutputStallDurationlomOqCM = i2;
            this.getHighSpeedVideoFpsRanges = callable;
        }

        @Override // io.reactivex.functions.BooleanSupplier
        public final boolean getAsBoolean() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (!io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) || io.reactivex.internal.util.QueueDrainHelper.postCompleteRequest(j, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this, this)) {
                return;
            }
            if (!this.getHighSpeedVideoSizesFor.get() && this.getHighSpeedVideoSizesFor.compareAndSet(false, true)) {
                this.getOutputFormats.request(io.reactivex.internal.util.BackpressureHelper.addCap(this.getOutputMinFrameDuration, io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getOutputStallDurationlomOqCM, j - 1)));
            } else {
                this.getOutputFormats.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getOutputStallDurationlomOqCM, j));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getOutputFormats.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            java.util.ArrayDeque<C> arrayDeque = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getInputSizeshNQ4ISI;
            int i2 = i + 1;
            if (i == 0) {
                try {
                    arrayDeque.offer((java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The bufferSupplier returned a null buffer"));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            java.util.Collection collection = (java.util.Collection) arrayDeque.peek();
            if (collection != null && collection.size() + 1 == this.getOutputMinFrameDuration) {
                arrayDeque.poll();
                collection.add(t);
                this.getInputFormats++;
                this.getHighSpeedVideoSizes.onNext(collection);
            }
            java.util.Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((java.util.Collection) it.next()).add(t);
            }
            if (i2 == this.getOutputStallDurationlomOqCM) {
                i2 = 0;
            }
            this.getInputSizeshNQ4ISI = i2;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            long j = this.getInputFormats;
            if (j != 0) {
                io.reactivex.internal.util.BackpressureHelper.produced(this, j);
            }
            io.reactivex.internal.util.QueueDrainHelper.postComplete(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this, this);
        }
    }
}
