package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelJoin<T> extends io.reactivex.Flowable<T> {
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.parallel.ParallelFlowable<? extends T> getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public ParallelJoin(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, int i, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = parallelFlowable;
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase joinSubscription;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            joinSubscription = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionDelayError(subscriber, this.getHighSpeedVideoFpsRangesFor.parallelism(), this.getHighSpeedVideoSizes);
        } else {
            joinSubscription = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscription(subscriber, this.getHighSpeedVideoFpsRangesFor.parallelism(), this.getHighSpeedVideoSizes);
        }
        subscriber.onSubscribe(joinSubscription);
        this.getHighSpeedVideoFpsRangesFor.subscribe(joinSubscription.getOutputMinFrameDuration);
    }

    /* loaded from: classes17.dex */
    static abstract class JoinSubscriptionBase<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3100232009247827843L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoFpsRanges = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger();
        final io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] getOutputMinFrameDuration;

        abstract void Camera2StreamConfigurationMap();

        abstract void Camera2StreamConfigurationMap(java.lang.Throwable th);

        abstract void getHighResolutionOutputSizeshNQ4ISI();

        abstract void getHighSpeedVideoFpsRanges(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber, T t);

        JoinSubscriptionBase(org.reactivestreams.Subscriber<? super T> subscriber, int i, int i2) {
            this.Camera2StreamConfigurationMap = subscriber;
            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                joinInnerSubscriberArr[i3] = new io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<>(this, i2);
            }
            this.getOutputMinFrameDuration = joinInnerSubscriberArr;
            this.getHighSpeedVideoSizes.lazySet(i);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getHighSpeedVideoFpsRangesFor, j);
                Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            int i = 0;
            int i2 = 0;
            while (true) {
                io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.getOutputMinFrameDuration;
                if (i2 >= joinInnerSubscriberArr.length) {
                    break;
                }
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(joinInnerSubscriberArr[i2]);
                i2++;
            }
            if (getAndIncrement() != 0) {
                return;
            }
            while (true) {
                io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr2 = this.getOutputMinFrameDuration;
                if (i >= joinInnerSubscriberArr2.length) {
                    return;
                }
                joinInnerSubscriberArr2[i].Camera2StreamConfigurationMap = null;
                i++;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class JoinSubscription<T> extends io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        JoinSubscription(org.reactivestreams.Subscriber<? super T> subscriber, int i, int i2) {
            super(subscriber, i, i2);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public final void getHighSpeedVideoFpsRanges(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber, T t) {
            int i = 0;
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.getHighSpeedVideoFpsRangesFor.get() != 0) {
                    this.Camera2StreamConfigurationMap.onNext(t);
                    if (this.getHighSpeedVideoFpsRangesFor.get() != Long.MAX_VALUE) {
                        this.getHighSpeedVideoFpsRangesFor.decrementAndGet();
                    }
                    joinInnerSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                } else {
                    io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue = joinInnerSubscriber.Camera2StreamConfigurationMap;
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue(joinInnerSubscriber.getHighSpeedVideoFpsRangesFor);
                        joinInnerSubscriber.Camera2StreamConfigurationMap = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(t)) {
                        while (true) {
                            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.getOutputMinFrameDuration;
                            if (i >= joinInnerSubscriberArr.length) {
                                break;
                            }
                            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(joinInnerSubscriberArr[i]);
                            i++;
                        }
                        io.reactivex.exceptions.MissingBackpressureException missingBackpressureException = new io.reactivex.exceptions.MissingBackpressureException("Queue full?!");
                        if (this.getHighSpeedVideoFpsRanges.compareAndSet(null, missingBackpressureException)) {
                            this.Camera2StreamConfigurationMap.onError(missingBackpressureException);
                            return;
                        } else {
                            io.reactivex.plugins.RxJavaPlugins.onError(missingBackpressureException);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue2 = joinInnerSubscriber.Camera2StreamConfigurationMap;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new io.reactivex.internal.queue.SpscArrayQueue(joinInnerSubscriber.getHighSpeedVideoFpsRangesFor);
                    joinInnerSubscriber.Camera2StreamConfigurationMap = spscArrayQueue2;
                }
                if (!spscArrayQueue2.offer(t)) {
                    while (true) {
                        io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr2 = this.getOutputMinFrameDuration;
                        if (i >= joinInnerSubscriberArr2.length) {
                            Camera2StreamConfigurationMap(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
                            return;
                        } else {
                            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(joinInnerSubscriberArr2[i]);
                            i++;
                        }
                    }
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (!this.getHighSpeedVideoFpsRanges.compareAndSet(null, th)) {
                if (th != this.getHighSpeedVideoFpsRanges.get()) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
                return;
            }
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.getOutputMinFrameDuration;
                if (i >= joinInnerSubscriberArr.length) {
                    break;
                }
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(joinInnerSubscriberArr[i]);
                i++;
            }
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoSizes.decrementAndGet();
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() != 0) {
                return;
            }
            getHighSpeedVideoFpsRanges();
        }

        /* JADX WARN: Code restructure failed: missing block: B:86:0x0073, code lost:
        
            if (r12 == false) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0075, code lost:
        
            if (r16 == false) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0077, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x007a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x007b, code lost:
        
            if (r16 == false) goto L100;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void getHighSpeedVideoFpsRanges() {
            boolean z;
            T poll;
            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.getOutputMinFrameDuration;
            int length = joinInnerSubscriberArr.length;
            org.reactivestreams.Subscriber<? super T> subscriber = this.Camera2StreamConfigurationMap;
            int i = 1;
            while (true) {
                long j = this.getHighSpeedVideoFpsRangesFor.get();
                long j2 = 0;
                while (j2 != j) {
                    if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                        java.lang.Throwable th = this.getHighSpeedVideoFpsRanges.get();
                        if (th == null) {
                            boolean z2 = this.getHighSpeedVideoSizes.get() == 0;
                            int i2 = 0;
                            boolean z3 = true;
                            while (true) {
                                if (i2 >= joinInnerSubscriberArr.length) {
                                    break;
                                }
                                io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber = joinInnerSubscriberArr[i2];
                                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.Camera2StreamConfigurationMap;
                                if (simplePlainQueue != null && (poll = simplePlainQueue.poll()) != null) {
                                    subscriber.onNext(poll);
                                    joinInnerSubscriber.Camera2StreamConfigurationMap();
                                    j2++;
                                    if (j2 == j) {
                                        break;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                i2++;
                            }
                        } else {
                            int i3 = 0;
                            while (true) {
                                io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr2 = this.getOutputMinFrameDuration;
                                if (i3 >= joinInnerSubscriberArr2.length) {
                                    subscriber.onError(th);
                                    return;
                                } else {
                                    joinInnerSubscriberArr2[i3].Camera2StreamConfigurationMap = null;
                                    i3++;
                                }
                            }
                        }
                    } else {
                        int i4 = 0;
                        while (true) {
                            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr3 = this.getOutputMinFrameDuration;
                            if (i4 >= joinInnerSubscriberArr3.length) {
                                return;
                            }
                            joinInnerSubscriberArr3[i4].Camera2StreamConfigurationMap = null;
                            i4++;
                        }
                    }
                }
                if (j2 == j) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        int i5 = 0;
                        while (true) {
                            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr4 = this.getOutputMinFrameDuration;
                            if (i5 >= joinInnerSubscriberArr4.length) {
                                return;
                            }
                            joinInnerSubscriberArr4[i5].Camera2StreamConfigurationMap = null;
                            i5++;
                        }
                    } else {
                        java.lang.Throwable th2 = this.getHighSpeedVideoFpsRanges.get();
                        if (th2 != null) {
                            int i6 = 0;
                            while (true) {
                                io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr5 = this.getOutputMinFrameDuration;
                                if (i6 >= joinInnerSubscriberArr5.length) {
                                    subscriber.onError(th2);
                                    return;
                                } else {
                                    joinInnerSubscriberArr5[i6].Camera2StreamConfigurationMap = null;
                                    i6++;
                                }
                            }
                        } else {
                            boolean z4 = this.getHighSpeedVideoSizes.get() == 0;
                            int i7 = 0;
                            while (true) {
                                if (i7 < length) {
                                    io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i7].Camera2StreamConfigurationMap;
                                    if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                                        z = false;
                                        break;
                                    }
                                    i7++;
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z4 && z) {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.getHighSpeedVideoFpsRangesFor.addAndGet(-j2);
                }
                int i8 = get();
                if (i8 == i && (i8 = addAndGet(-i)) == 0) {
                    return;
                } else {
                    i = i8;
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class JoinSubscriptionDelayError<T> extends io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        JoinSubscriptionDelayError(org.reactivestreams.Subscriber<? super T> subscriber, int i, int i2) {
            super(subscriber, i, i2);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        final void getHighSpeedVideoFpsRanges(io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.getHighSpeedVideoFpsRangesFor.get() != 0) {
                    this.Camera2StreamConfigurationMap.onNext(t);
                    if (this.getHighSpeedVideoFpsRangesFor.get() != Long.MAX_VALUE) {
                        this.getHighSpeedVideoFpsRangesFor.decrementAndGet();
                    }
                    joinInnerSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                } else {
                    io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue = joinInnerSubscriber.Camera2StreamConfigurationMap;
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue(joinInnerSubscriber.getHighSpeedVideoFpsRangesFor);
                        joinInnerSubscriber.Camera2StreamConfigurationMap = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(t)) {
                        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(joinInnerSubscriber);
                        this.getHighSpeedVideoFpsRanges.addThrowable(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
                        this.getHighSpeedVideoSizes.decrementAndGet();
                        getHighSpeedVideoFpsRanges();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue2 = joinInnerSubscriber.Camera2StreamConfigurationMap;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new io.reactivex.internal.queue.SpscArrayQueue(joinInnerSubscriber.getHighSpeedVideoFpsRangesFor);
                    joinInnerSubscriber.Camera2StreamConfigurationMap = spscArrayQueue2;
                }
                if (!spscArrayQueue2.offer(t) && io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(joinInnerSubscriber)) {
                    this.getHighSpeedVideoFpsRanges.addThrowable(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
                    this.getHighSpeedVideoSizes.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.addThrowable(th);
            this.getHighSpeedVideoSizes.decrementAndGet();
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoSizes.decrementAndGet();
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() != 0) {
                return;
            }
            getHighSpeedVideoFpsRanges();
        }

        /* JADX WARN: Code restructure failed: missing block: B:77:0x0057, code lost:
        
            if (r12 == false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0059, code lost:
        
            if (r16 == false) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0063, code lost:
        
            if (r19.getHighSpeedVideoFpsRanges.get() == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0065, code lost:
        
            r3.onError(r19.getHighSpeedVideoFpsRanges.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x006e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x006f, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0072, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0073, code lost:
        
            if (r16 == false) goto L89;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void getHighSpeedVideoFpsRanges() {
            boolean z;
            T poll;
            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.getOutputMinFrameDuration;
            int length = joinInnerSubscriberArr.length;
            org.reactivestreams.Subscriber<? super T> subscriber = this.Camera2StreamConfigurationMap;
            int i = 1;
            while (true) {
                long j = this.getHighSpeedVideoFpsRangesFor.get();
                long j2 = 0;
                while (j2 != j) {
                    if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                        boolean z2 = this.getHighSpeedVideoSizes.get() == 0;
                        int i2 = 0;
                        boolean z3 = true;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T> joinInnerSubscriber = joinInnerSubscriberArr[i2];
                            io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.Camera2StreamConfigurationMap;
                            if (simplePlainQueue != null && (poll = simplePlainQueue.poll()) != null) {
                                subscriber.onNext(poll);
                                joinInnerSubscriber.Camera2StreamConfigurationMap();
                                j2++;
                                if (j2 == j) {
                                    break;
                                } else {
                                    z3 = false;
                                }
                            }
                            i2++;
                        }
                    } else {
                        int i3 = 0;
                        while (true) {
                            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr2 = this.getOutputMinFrameDuration;
                            if (i3 >= joinInnerSubscriberArr2.length) {
                                return;
                            }
                            joinInnerSubscriberArr2[i3].Camera2StreamConfigurationMap = null;
                            i3++;
                        }
                    }
                }
                if (j2 == j) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        int i4 = 0;
                        while (true) {
                            io.reactivex.internal.operators.parallel.ParallelJoin.JoinInnerSubscriber<T>[] joinInnerSubscriberArr3 = this.getOutputMinFrameDuration;
                            if (i4 >= joinInnerSubscriberArr3.length) {
                                return;
                            }
                            joinInnerSubscriberArr3[i4].Camera2StreamConfigurationMap = null;
                            i4++;
                        }
                    } else {
                        boolean z4 = this.getHighSpeedVideoSizes.get() == 0;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i5].Camera2StreamConfigurationMap;
                                if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                                    z = false;
                                    break;
                                }
                                i5++;
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z4 && z) {
                            if (this.getHighSpeedVideoFpsRanges.get() != null) {
                                subscriber.onError(this.getHighSpeedVideoFpsRanges.terminate());
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.getHighSpeedVideoFpsRangesFor.addAndGet(-j2);
                }
                int i6 = get();
                if (i6 == i && (i6 = addAndGet(-i)) == 0) {
                    return;
                } else {
                    i = i6;
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class JoinInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;

        JoinInnerSubscriber(io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase<T> joinSubscriptionBase, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = joinSubscriptionBase;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = i - (i >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this, t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
        }

        public final void Camera2StreamConfigurationMap() {
            long j = this.getHighSpeedVideoSizes + 1;
            if (j == this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoSizes = 0L;
                get().request(j);
            } else {
                this.getHighSpeedVideoSizes = j;
            }
        }

        public final void getHighResolutionOutputSizeshNQ4ISI() {
            long j = this.getHighSpeedVideoSizes + 1;
            if (j >= this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoSizes = 0L;
                get().request(j);
            } else {
                this.getHighSpeedVideoSizes = j;
            }
        }
    }
}
