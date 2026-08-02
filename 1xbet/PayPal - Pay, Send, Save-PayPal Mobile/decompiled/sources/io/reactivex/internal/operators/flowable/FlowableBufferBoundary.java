package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableBufferBoundary<T, U extends java.util.Collection<? super T>, Open, Close> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> getHighSpeedVideoFpsRangesFor;
    final org.reactivestreams.Publisher<? extends Open> getHighSpeedVideoSizes;

    public FlowableBufferBoundary(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<? extends Open> publisher, io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> function, java.util.concurrent.Callable<U> callable) {
        super(flowable);
        this.getHighSpeedVideoSizes = publisher;
        this.getHighSpeedVideoFpsRangesFor = function;
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber bufferBoundarySubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber(subscriber, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.onSubscribe(bufferBoundarySubscriber);
        this.source.subscribe((io.reactivex.FlowableSubscriber) bufferBoundarySubscriber);
    }

    /* loaded from: classes17.dex */
    static final class BufferBoundarySubscriber<T, C extends java.util.Collection<? super T>, Open, Close> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -8466418554264089604L;
        final io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super C> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.Callable<C> getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Publisher<? extends Open> getHighSpeedVideoSizes;
        long getInputFormats;
        volatile boolean getInputSizeshNQ4ISI;
        long getOutputFormats;
        volatile boolean getOutputMinFrameDuration;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<C> getOutputSizes = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Flowable.bufferSize());
        final io.reactivex.disposables.CompositeDisposable getOutputMinFrameDurationlomOqCM = new io.reactivex.disposables.CompositeDisposable();
        final java.util.concurrent.atomic.AtomicLong getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputStallDurationlomOqCM = new java.util.concurrent.atomic.AtomicReference<>();
        java.util.Map<java.lang.Long, C> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizesFor = new io.reactivex.internal.util.AtomicThrowable();

        BufferBoundarySubscriber(org.reactivestreams.Subscriber<? super C> subscriber, org.reactivestreams.Publisher<? extends Open> publisher, io.reactivex.functions.Function<? super Open, ? extends org.reactivestreams.Publisher<? extends Close>> function, java.util.concurrent.Callable<C> callable) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoFpsRangesFor = callable;
            this.getHighSpeedVideoSizes = publisher;
            this.Camera2StreamConfigurationMap = function;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getOutputStallDurationlomOqCM, subscription)) {
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber.BufferOpenSubscriber bufferOpenSubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber.BufferOpenSubscriber(this);
                this.getOutputMinFrameDurationlomOqCM.add(bufferOpenSubscriber);
                this.getHighSpeedVideoSizes.subscribe(bufferOpenSubscriber);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            synchronized (this) {
                java.util.Map<java.lang.Long, C> map = this.getHighSpeedVideoFpsRanges;
                if (map == null) {
                    return;
                }
                java.util.Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.addThrowable(th)) {
                this.getOutputMinFrameDurationlomOqCM.dispose();
                synchronized (this) {
                    this.getHighSpeedVideoFpsRanges = null;
                }
                this.getInputSizeshNQ4ISI = true;
                getHighSpeedVideoFpsRangesFor();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getOutputMinFrameDurationlomOqCM.dispose();
            synchronized (this) {
                java.util.Map<java.lang.Long, C> map = this.getHighSpeedVideoFpsRanges;
                if (map == null) {
                    return;
                }
                java.util.Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.getOutputSizes.offer(it.next());
                }
                this.getHighSpeedVideoFpsRanges = null;
                this.getInputSizeshNQ4ISI = true;
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getOutputSizeshNQ4ISI, j);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDurationlomOqCM)) {
                this.getOutputMinFrameDuration = true;
                this.getOutputMinFrameDurationlomOqCM.dispose();
                synchronized (this) {
                    this.getHighSpeedVideoFpsRanges = null;
                }
                if (getAndIncrement() != 0) {
                    this.getOutputSizes.clear();
                }
            }
        }

        final void getHighSpeedVideoFpsRanges(io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferCloseSubscriber<T, C> bufferCloseSubscriber, long j) {
            boolean z;
            this.getOutputMinFrameDurationlomOqCM.delete(bufferCloseSubscriber);
            if (this.getOutputMinFrameDurationlomOqCM.size() == 0) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDurationlomOqCM);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                java.util.Map<java.lang.Long, C> map = this.getHighSpeedVideoFpsRanges;
                if (map == null) {
                    return;
                }
                this.getOutputSizes.offer(map.remove(java.lang.Long.valueOf(j)));
                if (z) {
                    this.getInputSizeshNQ4ISI = true;
                }
                getHighSpeedVideoFpsRangesFor();
            }
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() == 0) {
                long j = this.getOutputFormats;
                org.reactivestreams.Subscriber<? super C> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.getOutputSizes;
                int i = 1;
                do {
                    long j2 = this.getOutputSizeshNQ4ISI.get();
                    while (j != j2) {
                        if (this.getOutputMinFrameDuration) {
                            spscLinkedArrayQueue.clear();
                            return;
                        }
                        boolean z = this.getInputSizeshNQ4ISI;
                        if (z && this.getHighSpeedVideoSizesFor.get() != null) {
                            spscLinkedArrayQueue.clear();
                            subscriber.onError(this.getHighSpeedVideoSizesFor.terminate());
                            return;
                        }
                        C poll = spscLinkedArrayQueue.poll();
                        boolean z2 = poll == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j++;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (j == j2) {
                        if (this.getOutputMinFrameDuration) {
                            spscLinkedArrayQueue.clear();
                            return;
                        }
                        if (this.getInputSizeshNQ4ISI) {
                            if (this.getHighSpeedVideoSizesFor.get() != null) {
                                spscLinkedArrayQueue.clear();
                                subscriber.onError(this.getHighSpeedVideoSizesFor.terminate());
                                return;
                            } else if (spscLinkedArrayQueue.isEmpty()) {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    }
                    this.getOutputFormats = j;
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        static final class BufferOpenSubscriber<Open> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<Open>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            final io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<?, ?, Open, ?> getHighSpeedVideoFpsRangesFor;

            BufferOpenSubscriber(io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber) {
                this.getHighSpeedVideoFpsRangesFor = bufferBoundarySubscriber;
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(org.reactivestreams.Subscription subscription) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(Open open) {
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber = this.getHighSpeedVideoFpsRangesFor;
                try {
                    java.util.Collection collection = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(bufferBoundarySubscriber.getHighSpeedVideoFpsRangesFor.call(), "The bufferSupplier returned a null Collection");
                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(bufferBoundarySubscriber.Camera2StreamConfigurationMap.apply(open), "The bufferClose returned a null Publisher");
                    long j = bufferBoundarySubscriber.getInputFormats;
                    bufferBoundarySubscriber.getInputFormats = 1 + j;
                    synchronized (bufferBoundarySubscriber) {
                        java.util.Map<java.lang.Long, ?> map = bufferBoundarySubscriber.getHighSpeedVideoFpsRanges;
                        if (map == null) {
                            return;
                        }
                        map.put(java.lang.Long.valueOf(j), collection);
                        io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferCloseSubscriber bufferCloseSubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferCloseSubscriber(bufferBoundarySubscriber, j);
                        bufferBoundarySubscriber.getOutputMinFrameDurationlomOqCM.add(bufferCloseSubscriber);
                        publisher.subscribe(bufferCloseSubscriber);
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(bufferBoundarySubscriber.getOutputStallDurationlomOqCM);
                    bufferBoundarySubscriber.onError(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(java.lang.Throwable th) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(bufferBoundarySubscriber.getOutputStallDurationlomOqCM);
                bufferBoundarySubscriber.getOutputMinFrameDurationlomOqCM.delete(this);
                bufferBoundarySubscriber.onError(th);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber = this.getHighSpeedVideoFpsRangesFor;
                bufferBoundarySubscriber.getOutputMinFrameDurationlomOqCM.delete(this);
                if (bufferBoundarySubscriber.getOutputMinFrameDurationlomOqCM.size() == 0) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(bufferBoundarySubscriber.getOutputStallDurationlomOqCM);
                    bufferBoundarySubscriber.getInputSizeshNQ4ISI = true;
                    bufferBoundarySubscriber.getHighSpeedVideoFpsRangesFor();
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferCloseSubscriber<T, C extends java.util.Collection<? super T>> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        final long Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, C, ?, ?> getHighSpeedVideoSizes;

        BufferCloseSubscriber(io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber, long j) {
            this.getHighSpeedVideoSizes = bufferBoundarySubscriber;
            this.Camera2StreamConfigurationMap = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            org.reactivestreams.Subscription subscription = get();
            if (subscription != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                subscription.cancel();
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this, this.Camera2StreamConfigurationMap);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                io.reactivex.internal.operators.flowable.FlowableBufferBoundary.BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber = this.getHighSpeedVideoSizes;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(bufferBoundarySubscriber.getOutputStallDurationlomOqCM);
                bufferBoundarySubscriber.getOutputMinFrameDurationlomOqCM.delete(this);
                bufferBoundarySubscriber.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this, this.Camera2StreamConfigurationMap);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
