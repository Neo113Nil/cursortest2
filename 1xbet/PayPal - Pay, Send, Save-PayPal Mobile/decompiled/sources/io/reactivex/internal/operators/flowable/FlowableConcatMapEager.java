package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableConcatMapEager<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.internal.util.ErrorMode Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public FlowableConcatMapEager(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, int i2, io.reactivex.internal.util.ErrorMode errorMode) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoSizes = i2;
        this.Camera2StreamConfigurationMap = errorMode;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super R> getHighResolutionOutputSizeshNQ4ISI;
        volatile io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.util.ErrorMode getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> getInputFormats;
        final int getInputSizeshNQ4ISI;
        final int getOutputMinFrameDuration;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.internal.subscribers.InnerQueuedSubscriber<R>> getOutputMinFrameDurationlomOqCM;
        org.reactivestreams.Subscription getOutputStallDuration;
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicLong();

        ConcatMapEagerDelayErrorSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, int i2, io.reactivex.internal.util.ErrorMode errorMode) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getInputFormats = function;
            this.getInputSizeshNQ4ISI = i;
            this.getOutputMinFrameDuration = i2;
            this.getHighSpeedVideoSizes = errorMode;
            this.getOutputMinFrameDurationlomOqCM = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(java.lang.Math.min(i2, i));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputStallDuration, subscription)) {
                this.getOutputStallDuration = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                int i = this.getInputSizeshNQ4ISI;
                subscription.request(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            try {
                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(t), "The mapper returned a null Publisher");
                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber = new io.reactivex.internal.subscribers.InnerQueuedSubscriber<>(this, this.getOutputMinFrameDuration);
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getOutputMinFrameDurationlomOqCM.offer(innerQueuedSubscriber);
                publisher.subscribe(innerQueuedSubscriber);
                if (!this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                innerQueuedSubscriber.cancel();
                if (getAndIncrement() != 0) {
                    return;
                }
                while (true) {
                    io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> poll = this.getOutputMinFrameDurationlomOqCM.poll();
                    if (poll == null) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        poll.cancel();
                    }
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputStallDuration.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats.addThrowable(th)) {
                this.Camera2StreamConfigurationMap = true;
                drain();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            drain();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getOutputStallDuration.cancel();
            if (getAndIncrement() != 0) {
                return;
            }
            while (true) {
                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> poll = this.getOutputMinFrameDurationlomOqCM.poll();
                if (poll == null) {
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    poll.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getHighSpeedVideoSizesFor, j);
                drain();
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public final void innerNext(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber, R r) {
            if (innerQueuedSubscriber.queue().offer(r)) {
                drain();
            } else {
                innerQueuedSubscriber.cancel();
                innerError(innerQueuedSubscriber, new io.reactivex.exceptions.MissingBackpressureException());
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public final void innerError(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber, java.lang.Throwable th) {
            if (this.getOutputFormats.addThrowable(th)) {
                innerQueuedSubscriber.setDone();
                if (this.getHighSpeedVideoSizes != io.reactivex.internal.util.ErrorMode.END) {
                    this.getOutputStallDuration.cancel();
                }
                drain();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public final void innerComplete(io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        /* JADX WARN: Code restructure failed: missing block: B:102:0x00f5, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
        
            if (r12 != r6) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
        
            if (r17.getHighSpeedVideoFpsRangesFor == false) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x010d, code lost:
        
            if (r3 != io.reactivex.internal.util.ErrorMode.IMMEDIATE) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0117, code lost:
        
            if (r17.getOutputFormats.get() == null) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0119, code lost:
        
            r17.getHighSpeedVideoFpsRanges = null;
            r8.cancel();
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x011e, code lost:
        
            r0 = r17.getOutputMinFrameDurationlomOqCM.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
        
            if (r0 == null) goto L119;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0128, code lost:
        
            r0.cancel();
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
        
            r2.onError(r17.getOutputFormats.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0135, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0136, code lost:
        
            r9 = r8.isDone();
            r10 = r11.isEmpty();
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x013e, code lost:
        
            if (r9 == false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
        
            if (r10 == false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0142, code lost:
        
            r17.getHighSpeedVideoFpsRanges = null;
            r17.getOutputStallDuration.request(1);
            r8 = null;
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00fc, code lost:
        
            r0 = r17.getOutputMinFrameDurationlomOqCM.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0104, code lost:
        
            if (r0 == null) goto L120;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0106, code lost:
        
            r0.cancel();
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x010a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x014b, code lost:
        
            r4 = 0;
         */
        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void drain() {
            io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber;
            int i;
            boolean z;
            long j;
            long j2;
            io.reactivex.internal.fuseable.SimpleQueue<R> queue;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> innerQueuedSubscriber2 = this.getHighSpeedVideoFpsRanges;
            org.reactivestreams.Subscriber<? super R> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.internal.util.ErrorMode errorMode = this.getHighSpeedVideoSizes;
            int i2 = 1;
            while (true) {
                long j3 = this.getHighSpeedVideoSizesFor.get();
                if (innerQueuedSubscriber2 != null) {
                    innerQueuedSubscriber = innerQueuedSubscriber2;
                } else if (errorMode == io.reactivex.internal.util.ErrorMode.END || this.getOutputFormats.get() == null) {
                    boolean z2 = this.Camera2StreamConfigurationMap;
                    innerQueuedSubscriber = this.getOutputMinFrameDurationlomOqCM.poll();
                    if (z2 && innerQueuedSubscriber == null) {
                        java.lang.Throwable terminate = this.getOutputFormats.terminate();
                        if (terminate != null) {
                            subscriber.onError(terminate);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (innerQueuedSubscriber != null) {
                        this.getHighSpeedVideoFpsRanges = innerQueuedSubscriber;
                    }
                } else {
                    while (true) {
                        io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> poll = this.getOutputMinFrameDurationlomOqCM.poll();
                        if (poll == null) {
                            subscriber.onError(this.getOutputFormats.terminate());
                            return;
                        }
                        poll.cancel();
                    }
                }
                if (innerQueuedSubscriber == null || (queue = innerQueuedSubscriber.queue()) == null) {
                    i = i2;
                    z = false;
                    j = 0;
                    j2 = 0;
                } else {
                    j2 = 0;
                    while (true) {
                        i = i2;
                        if (j2 == j3) {
                            break;
                        }
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            while (true) {
                                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> poll2 = this.getOutputMinFrameDurationlomOqCM.poll();
                                if (poll2 == null) {
                                    return;
                                } else {
                                    poll2.cancel();
                                }
                            }
                        } else if (errorMode == io.reactivex.internal.util.ErrorMode.IMMEDIATE && this.getOutputFormats.get() != null) {
                            this.getHighSpeedVideoFpsRanges = null;
                            innerQueuedSubscriber.cancel();
                            while (true) {
                                io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> poll3 = this.getOutputMinFrameDurationlomOqCM.poll();
                                if (poll3 == null) {
                                    subscriber.onError(this.getOutputFormats.terminate());
                                    return;
                                }
                                poll3.cancel();
                            }
                        } else {
                            boolean isDone = innerQueuedSubscriber.isDone();
                            try {
                                R poll4 = queue.poll();
                                boolean z3 = poll4 == null;
                                if (!isDone || !z3) {
                                    if (z3) {
                                        break;
                                    }
                                    subscriber.onNext(poll4);
                                    j2++;
                                    innerQueuedSubscriber.requestOne();
                                    i2 = i;
                                } else {
                                    this.getHighSpeedVideoFpsRanges = null;
                                    this.getOutputStallDuration.request(1L);
                                    innerQueuedSubscriber = null;
                                    z = true;
                                    break;
                                }
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.getHighSpeedVideoFpsRanges = null;
                                innerQueuedSubscriber.cancel();
                                while (true) {
                                    io.reactivex.internal.subscribers.InnerQueuedSubscriber<R> poll5 = this.getOutputMinFrameDurationlomOqCM.poll();
                                    if (poll5 == null) {
                                        subscriber.onError(th);
                                        return;
                                    }
                                    poll5.cancel();
                                }
                            }
                        }
                    }
                }
                if (j2 != j && j3 != Long.MAX_VALUE) {
                    this.getHighSpeedVideoSizesFor.addAndGet(-j2);
                }
                if (z) {
                    i2 = i;
                } else {
                    i2 = addAndGet(-i);
                    if (i2 == 0) {
                        return;
                    }
                }
                innerQueuedSubscriber2 = innerQueuedSubscriber;
            }
        }
    }
}
