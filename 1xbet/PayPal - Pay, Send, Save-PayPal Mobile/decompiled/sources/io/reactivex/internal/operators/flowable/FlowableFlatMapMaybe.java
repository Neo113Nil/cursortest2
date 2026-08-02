package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFlatMapMaybe<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoSizes;

    public FlowableFlatMapMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z, int i) {
        super(flowable);
        this.getHighSpeedVideoSizes = function;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber(subscriber, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapMaybeSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        final org.reactivestreams.Subscriber<? super R> getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoSizes;
        org.reactivestreams.Subscription getHighSpeedVideoSizesFor;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getInputFormats;
        final int getOutputFormats;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.disposables.CompositeDisposable getOutputStallDurationlomOqCM = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger(1);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();

        FlatMapMaybeSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getInputFormats = function;
            this.getHighSpeedVideoFpsRanges = z;
            this.getOutputFormats = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                int i = this.getOutputFormats;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(t), "The mapper returned a null MaybeSource");
                this.getHighSpeedVideoFpsRangesFor.getAndIncrement();
                io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver innerObserver = new io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver();
                if (this.getHighSpeedVideoSizes || !this.getOutputStallDurationlomOqCM.add(innerObserver)) {
                    return;
                }
                maybeSource.subscribe(innerObserver);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizesFor.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.decrementAndGet();
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    this.getOutputStallDurationlomOqCM.dispose();
                }
                if (getAndIncrement() == 0) {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.decrementAndGet();
            if (getAndIncrement() == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoSizesFor.cancel();
            this.getOutputStallDurationlomOqCM.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
                if (getAndIncrement() == 0) {
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        }

        final io.reactivex.internal.queue.SpscLinkedArrayQueue<R> Camera2StreamConfigurationMap() {
            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.getOutputMinFrameDuration.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Flowable.bufferSize());
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        
            if (r10 != r6) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
        
            if (r17.getHighSpeedVideoSizes == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        
            if (r17.getHighSpeedVideoFpsRanges != false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
        
            if (r17.Camera2StreamConfigurationMap.get() == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
        
            r2 = r17.Camera2StreamConfigurationMap.terminate();
            r3 = r17.getOutputMinFrameDuration.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
        
            if (r3 == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00bc, code lost:
        
            r3.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00bf, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
        
            if (r2.get() != 0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00c9, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
        
            if (r7 == null) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00d8, code lost:
        
            if (r7.isEmpty() == false) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
        
            if (r6 == false) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00dd, code lost:
        
            if (r13 == false) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00df, code lost:
        
            r2 = r17.Camera2StreamConfigurationMap.terminate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
        
            if (r2 == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00e7, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00eb, code lost:
        
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00ee, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00da, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00cb, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0090, code lost:
        
            r1 = r17.getOutputMinFrameDuration.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0098, code lost:
        
            if (r1 == null) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x009a, code lost:
        
            r1.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x009d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
        
            if (r10 == 0) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
        
            io.reactivex.internal.util.BackpressureHelper.produced(r17.getInputSizeshNQ4ISI, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00fd, code lost:
        
            if (r17.getOutputFormats == Integer.MAX_VALUE) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00ff, code lost:
        
            r17.getHighSpeedVideoSizesFor.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0104, code lost:
        
            r5 = addAndGet(-r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighResolutionOutputSizeshNQ4ISI() {
            org.reactivestreams.Subscriber<? super R> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.getHighSpeedVideoFpsRangesFor;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> atomicReference = this.getOutputMinFrameDuration;
            int i = 1;
            do {
                long j = this.getInputSizeshNQ4ISI.get();
                long j2 = 0;
                while (true) {
                    boolean z = false;
                    if (j2 == j) {
                        break;
                    }
                    if (!this.getHighSpeedVideoSizes) {
                        if (!this.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap.get() != null) {
                            java.lang.Throwable terminate = this.Camera2StreamConfigurationMap.terminate();
                            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.getOutputMinFrameDuration.get();
                            if (spscLinkedArrayQueue != null) {
                                spscLinkedArrayQueue.clear();
                            }
                            subscriber.onError(terminate);
                            return;
                        }
                        boolean z2 = atomicInteger.get() == 0;
                        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                        amex.AMEXKernel poll = spscLinkedArrayQueue2 != null ? spscLinkedArrayQueue2.poll() : null;
                        boolean z3 = poll == null;
                        if (!z2 || !z3) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            java.lang.Throwable terminate2 = this.Camera2StreamConfigurationMap.terminate();
                            if (terminate2 != null) {
                                subscriber.onError(terminate2);
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    } else {
                        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue3 = this.getOutputMinFrameDuration.get();
                        if (spscLinkedArrayQueue3 != null) {
                            spscLinkedArrayQueue3.clear();
                            return;
                        }
                        return;
                    }
                }
            } while (i != 0);
        }

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber flatMapMaybeSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.getOutputStallDurationlomOqCM.delete(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeSubscriber.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0;
                        if (flatMapMaybeSubscriber.getInputSizeshNQ4ISI.get() != 0) {
                            flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI.onNext(r);
                            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue = flatMapMaybeSubscriber.getOutputMinFrameDuration.get();
                            if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                                java.lang.Throwable terminate = flatMapMaybeSubscriber.Camera2StreamConfigurationMap.terminate();
                                if (terminate != null) {
                                    flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI.onError(terminate);
                                    return;
                                } else {
                                    flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                                    return;
                                }
                            }
                            io.reactivex.internal.util.BackpressureHelper.produced(flatMapMaybeSubscriber.getInputSizeshNQ4ISI, 1L);
                            if (flatMapMaybeSubscriber.getOutputFormats != Integer.MAX_VALUE) {
                                flatMapMaybeSubscriber.getHighSpeedVideoSizesFor.request(1L);
                            }
                        } else {
                            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> Camera2StreamConfigurationMap = flatMapMaybeSubscriber.Camera2StreamConfigurationMap();
                            synchronized (Camera2StreamConfigurationMap) {
                                Camera2StreamConfigurationMap.offer(r);
                            }
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                        flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> Camera2StreamConfigurationMap2 = flatMapMaybeSubscriber.Camera2StreamConfigurationMap();
                synchronized (Camera2StreamConfigurationMap2) {
                    Camera2StreamConfigurationMap2.offer(r);
                }
                flatMapMaybeSubscriber.getHighSpeedVideoFpsRangesFor.decrementAndGet();
                if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                    return;
                }
                flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber flatMapMaybeSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.getOutputStallDurationlomOqCM.delete(this);
                if (flatMapMaybeSubscriber.Camera2StreamConfigurationMap.addThrowable(th)) {
                    if (!flatMapMaybeSubscriber.getHighSpeedVideoFpsRanges) {
                        flatMapMaybeSubscriber.getHighSpeedVideoSizesFor.cancel();
                        flatMapMaybeSubscriber.getOutputStallDurationlomOqCM.dispose();
                    } else if (flatMapMaybeSubscriber.getOutputFormats != Integer.MAX_VALUE) {
                        flatMapMaybeSubscriber.getHighSpeedVideoSizesFor.request(1L);
                    }
                    flatMapMaybeSubscriber.getHighSpeedVideoFpsRangesFor.decrementAndGet();
                    if (flatMapMaybeSubscriber.getAndIncrement() == 0) {
                        flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber flatMapMaybeSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.getOutputStallDurationlomOqCM.delete(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeSubscriber.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0;
                        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue = flatMapMaybeSubscriber.getOutputMinFrameDuration.get();
                        if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                            java.lang.Throwable terminate = flatMapMaybeSubscriber.Camera2StreamConfigurationMap.terminate();
                            if (terminate != null) {
                                flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI.onError(terminate);
                                return;
                            } else {
                                flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                                return;
                            }
                        }
                        if (flatMapMaybeSubscriber.getOutputFormats != Integer.MAX_VALUE) {
                            flatMapMaybeSubscriber.getHighSpeedVideoSizesFor.request(1L);
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() != 0) {
                            flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                            return;
                        }
                        return;
                    }
                }
                flatMapMaybeSubscriber.getHighSpeedVideoFpsRangesFor.decrementAndGet();
                if (flatMapMaybeSubscriber.getOutputFormats != Integer.MAX_VALUE) {
                    flatMapMaybeSubscriber.getHighSpeedVideoSizesFor.request(1L);
                }
                if (flatMapMaybeSubscriber.getAndIncrement() == 0) {
                    flatMapMaybeSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                }
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }
        }
    }
}
