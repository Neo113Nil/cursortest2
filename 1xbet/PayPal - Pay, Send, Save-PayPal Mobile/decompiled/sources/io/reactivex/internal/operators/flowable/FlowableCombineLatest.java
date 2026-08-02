package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableCombineLatest<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final org.reactivestreams.Publisher<? extends T>[] getHighSpeedVideoSizes;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> getInputSizeshNQ4ISI;

    public FlowableCombineLatest(org.reactivestreams.Publisher<? extends T>[] publisherArr, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.getHighSpeedVideoSizes = publisherArr;
        this.getInputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public FlowableCombineLatest(java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.getHighSpeedVideoSizes = null;
        this.getInputSizeshNQ4ISI = iterable;
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        int length;
        org.reactivestreams.Publisher<? extends T>[] publisherArr = this.getHighSpeedVideoSizes;
        if (publisherArr == null) {
            publisherArr = new org.reactivestreams.Publisher[8];
            try {
                java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputSizeshNQ4ISI.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            org.reactivestreams.Publisher<? extends T> publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The publisher returned by the iterator is null");
                            if (length == publisherArr.length) {
                                org.reactivestreams.Publisher<? extends T>[] publisherArr2 = new org.reactivestreams.Publisher[(length >> 2) + length];
                                java.lang.System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                                publisherArr = publisherArr2;
                            }
                            publisherArr[length] = publisher;
                            length++;
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                            return;
                        }
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
                        return;
                    }
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th3, subscriber);
                return;
            }
        } else {
            length = publisherArr.length;
        }
        int i = length;
        if (i == 0) {
            io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
            return;
        }
        if (i == 1) {
            publisherArr[0].subscribe(new io.reactivex.internal.operators.flowable.FlowableMap.MapSubscriber(subscriber, new io.reactivex.internal.operators.flowable.FlowableCombineLatest.SingletonArrayFunc()));
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator combineLatestCoordinator = new io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator(subscriber, this.Camera2StreamConfigurationMap, i, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.onSubscribe(combineLatestCoordinator);
        io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = combineLatestCoordinator.getOutputStallDuration;
        for (int i2 = 0; i2 < i && !combineLatestCoordinator.getOutputMinFrameDuration && !combineLatestCoordinator.getHighResolutionOutputSizeshNQ4ISI; i2++) {
            publisherArr[i2].subscribe(combineLatestInnerSubscriberArr[i2]);
        }
    }

    /* loaded from: classes17.dex */
    static final class CombineLatestCoordinator<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> {
        private static final long serialVersionUID = -5082275438355852221L;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getInputFormats;
        boolean getInputSizeshNQ4ISI;
        final java.lang.Object[] getOutputFormats;
        volatile boolean getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDurationlomOqCM;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getOutputSizes;
        final io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] getOutputStallDuration;

        CombineLatestCoordinator(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, int i2, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.Camera2StreamConfigurationMap = function;
            io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = new io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                combineLatestInnerSubscriberArr[i3] = new io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<>(this, i3, i2);
            }
            this.getOutputStallDuration = combineLatestInnerSubscriberArr;
            this.getOutputFormats = new java.lang.Object[i];
            this.getOutputSizes = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i2);
            this.getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicLong();
            this.getInputFormats = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputMinFrameDurationlomOqCM, j);
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            for (io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.getOutputStallDuration) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(combineLatestInnerSubscriber);
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(int i, T t) {
            boolean z;
            synchronized (this) {
                java.lang.Object[] objArr = this.getOutputFormats;
                int i2 = this.getHighSpeedVideoSizesFor;
                if (objArr[i] == null) {
                    i2++;
                    this.getHighSpeedVideoSizesFor = i2;
                }
                objArr[i] = t;
                if (objArr.length == i2) {
                    this.getOutputSizes.offer(this.getOutputStallDuration[i], objArr.clone());
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                this.getOutputStallDuration[i].getHighResolutionOutputSizeshNQ4ISI();
            } else {
                getHighSpeedVideoFpsRangesFor();
            }
        }

        final void Camera2StreamConfigurationMap(int i) {
            synchronized (this) {
                java.lang.Object[] objArr = this.getOutputFormats;
                if (objArr[i] != null) {
                    int i2 = this.getHighSpeedVideoSizes + 1;
                    if (i2 == objArr.length) {
                        this.getOutputMinFrameDuration = true;
                    } else {
                        this.getHighSpeedVideoSizes = i2;
                        return;
                    }
                } else {
                    this.getOutputMinFrameDuration = true;
                }
                getHighSpeedVideoFpsRangesFor();
            }
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            if (this.getInputSizeshNQ4ISI) {
                org.reactivestreams.Subscriber<? super R> subscriber = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getOutputSizes;
                while (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    java.lang.Throwable th = this.getInputFormats.get();
                    if (th != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(th);
                        return;
                    }
                    boolean z = this.getOutputMinFrameDuration;
                    boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                    if (!isEmpty) {
                        subscriber.onNext(null);
                    }
                    if (z && isEmpty) {
                        subscriber.onComplete();
                        return;
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
                return;
            }
            org.reactivestreams.Subscriber<? super R> subscriber2 = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue2 = this.getOutputSizes;
            int i2 = 1;
            do {
                long j = this.getOutputMinFrameDurationlomOqCM.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.getOutputMinFrameDuration;
                    java.lang.Object poll = spscLinkedArrayQueue2.poll();
                    boolean z3 = poll == null;
                    if (getHighSpeedVideoSizes(z2, z3, subscriber2, spscLinkedArrayQueue2)) {
                        return;
                    }
                    if (z3) {
                        break;
                    }
                    try {
                        subscriber2.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply((java.lang.Object[]) spscLinkedArrayQueue2.poll()), "The combiner returned a null value"));
                        ((io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber) poll).getHighResolutionOutputSizeshNQ4ISI();
                        j2++;
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        for (io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : this.getOutputStallDuration) {
                            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(combineLatestInnerSubscriber);
                        }
                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getInputFormats, th2);
                        subscriber2.onError(io.reactivex.internal.util.ExceptionHelper.terminate(this.getInputFormats));
                        return;
                    }
                }
                if (j2 == j && getHighSpeedVideoSizes(this.getOutputMinFrameDuration, spscLinkedArrayQueue2.isEmpty(), subscriber2, spscLinkedArrayQueue2)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.getOutputMinFrameDurationlomOqCM.addAndGet(-j2);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        private boolean getHighSpeedVideoSizes(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            int i = 0;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr = this.getOutputStallDuration;
                int length = combineLatestInnerSubscriberArr.length;
                while (i < length) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(combineLatestInnerSubscriberArr[i]);
                    i++;
                }
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (z) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    java.lang.Throwable terminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.getInputFormats);
                    if (terminate != null && terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr2 = this.getOutputStallDuration;
                        int length2 = combineLatestInnerSubscriberArr2.length;
                        while (i < length2) {
                            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(combineLatestInnerSubscriberArr2[i]);
                            i++;
                        }
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(terminate);
                        return true;
                    }
                    if (z2) {
                        io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr3 = this.getOutputStallDuration;
                        int length3 = combineLatestInnerSubscriberArr3.length;
                        while (i < length3) {
                            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(combineLatestInnerSubscriberArr3[i]);
                            i++;
                        }
                        subscriber.onComplete();
                        return true;
                    }
                } else if (z2) {
                    io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T>[] combineLatestInnerSubscriberArr4 = this.getOutputStallDuration;
                    int length4 = combineLatestInnerSubscriberArr4.length;
                    while (i < length4) {
                        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(combineLatestInnerSubscriberArr4[i]);
                        i++;
                    }
                    java.lang.Throwable terminate2 = io.reactivex.internal.util.ExceptionHelper.terminate(this.getInputFormats);
                    if (terminate2 != null && terminate2 != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        subscriber.onError(terminate2);
                    } else {
                        subscriber.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 4) != 0) {
                return 0;
            }
            int i2 = i & 2;
            this.getInputSizeshNQ4ISI = i2 != 0;
            return i2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final R poll() throws java.lang.Exception {
            java.lang.Object poll = this.getOutputSizes.poll();
            if (poll == null) {
                return null;
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply((java.lang.Object[]) this.getOutputSizes.poll()), "The combiner returned a null value");
            ((io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber) poll).getHighResolutionOutputSizeshNQ4ISI();
            return r;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getOutputSizes.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getOutputSizes.isEmpty();
        }
    }

    /* loaded from: classes17.dex */
    static final class CombineLatestInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -8730235182291002949L;
        final int Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator<T, ?> getHighSpeedVideoSizes;

        CombineLatestInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator<T, ?> combineLatestCoordinator, int i, int i2) {
            this.getHighSpeedVideoSizes = combineLatestCoordinator;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.Camera2StreamConfigurationMap = i2 - (i2 >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestCoordinator<T, ?> combineLatestCoordinator = this.getHighSpeedVideoSizes;
            int i = this.getHighSpeedVideoFpsRanges;
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(combineLatestCoordinator.getInputFormats, th)) {
                if (combineLatestCoordinator.getHighSpeedVideoFpsRanges) {
                    combineLatestCoordinator.Camera2StreamConfigurationMap(i);
                    return;
                }
                for (io.reactivex.internal.operators.flowable.FlowableCombineLatest.CombineLatestInnerSubscriber<T> combineLatestInnerSubscriber : combineLatestCoordinator.getOutputStallDuration) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(combineLatestInnerSubscriber);
                }
                combineLatestCoordinator.getOutputMinFrameDuration = true;
                combineLatestCoordinator.getHighSpeedVideoFpsRangesFor();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
        }

        public final void getHighResolutionOutputSizeshNQ4ISI() {
            int i = this.getHighSpeedVideoFpsRangesFor + 1;
            if (i == this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRangesFor = 0;
                get().request(i);
            } else {
                this.getHighSpeedVideoFpsRangesFor = i;
            }
        }
    }

    /* loaded from: classes17.dex */
    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public final R apply(T t) throws java.lang.Exception {
            return io.reactivex.internal.operators.flowable.FlowableCombineLatest.this.Camera2StreamConfigurationMap.apply(new java.lang.Object[]{t});
        }
    }
}
