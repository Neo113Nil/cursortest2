package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.BackpressureOverflowStrategy Camera2StreamConfigurationMap;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public FlowableOnBackpressureBufferStrategy(io.reactivex.Flowable<T> flowable, long j, io.reactivex.functions.Action action, io.reactivex.BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRangesFor = action;
        this.Camera2StreamConfigurationMap = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.OnBackpressureBufferStrategySubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class OnBackpressureBufferStrategySubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3240706908776709697L;
        volatile boolean Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoSizes;
        java.lang.Throwable getHighSpeedVideoSizesFor;
        final io.reactivex.functions.Action getInputFormats;
        org.reactivestreams.Subscription getOutputFormats;
        final io.reactivex.BackpressureOverflowStrategy getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final java.util.Deque<T> getHighSpeedVideoFpsRangesFor = new java.util.ArrayDeque();

        OnBackpressureBufferStrategySubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Action action, io.reactivex.BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getInputFormats = action;
            this.getOutputMinFrameDuration = backpressureOverflowStrategy;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            boolean z;
            boolean z2;
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            java.util.Deque<T> deque = this.getHighSpeedVideoFpsRangesFor;
            synchronized (deque) {
                z = false;
                if (deque.size() == this.getHighResolutionOutputSizeshNQ4ISI) {
                    int i = io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy.AnonymousClass1.getHighSpeedVideoSizes[this.getOutputMinFrameDuration.ordinal()];
                    z2 = true;
                    if (i == 1) {
                        deque.pollLast();
                        deque.offer(t);
                    } else if (i == 2) {
                        deque.poll();
                        deque.offer(t);
                    }
                    z = true;
                } else {
                    deque.offer(t);
                    z2 = false;
                }
            }
            if (!z) {
                if (z2) {
                    this.getOutputFormats.cancel();
                    onError(new io.reactivex.exceptions.MissingBackpressureException());
                    return;
                } else {
                    Camera2StreamConfigurationMap();
                    return;
                }
            }
            io.reactivex.functions.Action action = this.getInputFormats;
            if (action != null) {
                try {
                    action.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getOutputFormats.cancel();
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoSizesFor = th;
            this.Camera2StreamConfigurationMap = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
                Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes = true;
            this.getOutputFormats.cancel();
            if (getAndIncrement() == 0) {
                java.util.Deque<T> deque = this.getHighSpeedVideoFpsRangesFor;
                synchronized (deque) {
                    deque.clear();
                }
            }
        }

        private void Camera2StreamConfigurationMap() {
            boolean isEmpty;
            T poll;
            if (getAndIncrement() == 0) {
                java.util.Deque<T> deque = this.getHighSpeedVideoFpsRangesFor;
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRanges;
                int i = 1;
                do {
                    long j = this.getInputSizeshNQ4ISI.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (!this.getHighSpeedVideoSizes) {
                            boolean z = this.Camera2StreamConfigurationMap;
                            synchronized (deque) {
                                poll = deque.poll();
                            }
                            boolean z2 = poll == null;
                            if (z) {
                                java.lang.Throwable th = this.getHighSpeedVideoSizesFor;
                                if (th != null) {
                                    synchronized (deque) {
                                        deque.clear();
                                    }
                                    subscriber.onError(th);
                                    return;
                                } else if (z2) {
                                    subscriber.onComplete();
                                    return;
                                }
                            }
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            synchronized (deque) {
                                deque.clear();
                            }
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (!this.getHighSpeedVideoSizes) {
                            boolean z3 = this.Camera2StreamConfigurationMap;
                            synchronized (deque) {
                                isEmpty = deque.isEmpty();
                            }
                            if (z3) {
                                java.lang.Throwable th2 = this.getHighSpeedVideoSizesFor;
                                if (th2 != null) {
                                    synchronized (deque) {
                                        deque.clear();
                                    }
                                    subscriber.onError(th2);
                                    return;
                                } else if (isEmpty) {
                                    subscriber.onComplete();
                                    return;
                                }
                            }
                        } else {
                            synchronized (deque) {
                                deque.clear();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        io.reactivex.internal.util.BackpressureHelper.produced(this.getInputSizeshNQ4ISI, j2);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[io.reactivex.BackpressureOverflowStrategy.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[io.reactivex.BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[io.reactivex.BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }
}
