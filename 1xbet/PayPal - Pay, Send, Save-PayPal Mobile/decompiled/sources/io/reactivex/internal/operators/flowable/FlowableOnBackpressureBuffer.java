package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureBuffer<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public FlowableOnBackpressureBuffer(io.reactivex.Flowable<T> flowable, int i, boolean z, boolean z2, io.reactivex.functions.Action action) {
        super(flowable);
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
        this.getHighSpeedVideoFpsRangesFor = action;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer.BackpressureBufferSubscriber(subscriber, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class BackpressureBufferSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        final boolean Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> getHighSpeedVideoSizesFor;
        final io.reactivex.functions.Action getInputFormats;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        org.reactivestreams.Subscription getOutputFormats;
        boolean getOutputMinFrameDuration;

        BackpressureBufferSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, int i, boolean z, boolean z2, io.reactivex.functions.Action action) {
            io.reactivex.internal.fuseable.SimplePlainQueue<T> spscArrayQueue;
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getInputFormats = action;
            this.Camera2StreamConfigurationMap = z2;
            if (z) {
                spscArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            } else {
                spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue<>(i);
            }
            this.getHighSpeedVideoSizesFor = spscArrayQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (!this.getHighSpeedVideoSizesFor.offer(t)) {
                this.getOutputFormats.cancel();
                io.reactivex.exceptions.MissingBackpressureException missingBackpressureException = new io.reactivex.exceptions.MissingBackpressureException("Buffer is full");
                try {
                    this.getInputFormats.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
                return;
            }
            if (this.getOutputMinFrameDuration) {
                this.getHighSpeedVideoFpsRangesFor.onNext(null);
            } else {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = th;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (this.getOutputMinFrameDuration) {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (this.getOutputMinFrameDuration) {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            } else {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.getOutputMinFrameDuration || !io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                return;
            }
            io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputFormats.cancel();
            if (getAndIncrement() == 0) {
                this.getHighSpeedVideoSizesFor.clear();
            }
        }

        private void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getHighSpeedVideoSizesFor;
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
                int i = 1;
                while (!Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, simplePlainQueue.isEmpty(), subscriber)) {
                    long j = this.getInputSizeshNQ4ISI.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                        T poll = simplePlainQueue.poll();
                        boolean z2 = poll == null;
                        if (!Camera2StreamConfigurationMap(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI, simplePlainQueue.isEmpty(), subscriber)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.getInputSizeshNQ4ISI.addAndGet(-j2);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        private boolean Camera2StreamConfigurationMap(boolean z, boolean z2, org.reactivestreams.Subscriber<? super T> subscriber) {
            if (this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoSizesFor.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.Camera2StreamConfigurationMap) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            java.lang.Throwable th2 = this.getHighSpeedVideoFpsRanges;
            if (th2 != null) {
                this.getHighSpeedVideoSizesFor.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getOutputMinFrameDuration = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            return this.getHighSpeedVideoSizesFor.poll();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoSizesFor.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoSizesFor.isEmpty();
        }
    }
}
