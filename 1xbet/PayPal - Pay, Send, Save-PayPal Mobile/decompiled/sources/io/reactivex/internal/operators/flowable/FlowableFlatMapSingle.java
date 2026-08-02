package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFlatMapSingle<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoFpsRangesFor;

    public FlowableFlatMapSingle(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z, int i) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = function;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapSingleSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizesFor;
        final int getInputFormats;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getOutputFormats = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.disposables.CompositeDisposable getOutputStallDurationlomOqCM = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizes = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(1);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

        FlatMapSingleSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z, int i) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getOutputMinFrameDuration = function;
            this.getHighSpeedVideoFpsRanges = z;
            this.getInputFormats = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                int i = this.getInputFormats;
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
                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.apply(t), "The mapper returned a null SingleSource");
                this.Camera2StreamConfigurationMap.getAndIncrement();
                io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.InnerObserver innerObserver = new io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.InnerObserver();
                if (this.getHighResolutionOutputSizeshNQ4ISI || !this.getOutputStallDurationlomOqCM.add(innerObserver)) {
                    return;
                }
                singleSource.subscribe(innerObserver);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizesFor.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.decrementAndGet();
            if (this.getHighSpeedVideoSizes.addThrowable(th)) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    this.getOutputStallDurationlomOqCM.dispose();
                }
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRanges();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.decrementAndGet();
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizesFor.cancel();
            this.getOutputStallDurationlomOqCM.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputFormats, j);
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRanges();
                }
            }
        }

        final io.reactivex.internal.queue.SpscLinkedArrayQueue<R> getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.getInputSizeshNQ4ISI.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Flowable.bufferSize());
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        
            if (r10 != r6) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
        
            if (r17.getHighResolutionOutputSizeshNQ4ISI == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        
            if (r17.getHighSpeedVideoFpsRanges != false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
        
            if (r17.getHighSpeedVideoSizes.get() == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
        
            r2 = r17.getHighSpeedVideoSizes.terminate();
            r3 = r17.getInputSizeshNQ4ISI.get();
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
        
            r2 = r17.getHighSpeedVideoSizes.terminate();
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
        
            r1 = r17.getInputSizeshNQ4ISI.get();
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
        
            io.reactivex.internal.util.BackpressureHelper.produced(r17.getOutputFormats, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00fd, code lost:
        
            if (r17.getInputFormats == Integer.MAX_VALUE) goto L80;
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
        final void getHighSpeedVideoFpsRanges() {
            org.reactivestreams.Subscriber<? super R> subscriber = this.getHighSpeedVideoFpsRangesFor;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.Camera2StreamConfigurationMap;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.SpscLinkedArrayQueue<R>> atomicReference = this.getInputSizeshNQ4ISI;
            int i = 1;
            do {
                long j = this.getOutputFormats.get();
                long j2 = 0;
                while (true) {
                    boolean z = false;
                    if (j2 == j) {
                        break;
                    }
                    if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                        if (!this.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes.get() != null) {
                            java.lang.Throwable terminate = this.getHighSpeedVideoSizes.terminate();
                            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.getInputSizeshNQ4ISI.get();
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
                            java.lang.Throwable terminate2 = this.getHighSpeedVideoSizes.terminate();
                            if (terminate2 != null) {
                                subscriber.onError(terminate2);
                                return;
                            } else {
                                subscriber.onComplete();
                                return;
                            }
                        }
                    } else {
                        io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue3 = this.getInputSizeshNQ4ISI.get();
                        if (spscLinkedArrayQueue3 != null) {
                            spscLinkedArrayQueue3.clear();
                            return;
                        }
                        return;
                    }
                }
            } while (i != 0);
        }

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R>, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            InnerObserver() {
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber flatMapSingleSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.getOutputStallDurationlomOqCM.delete(this);
                if (flatMapSingleSubscriber.get() == 0) {
                    if (flatMapSingleSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapSingleSubscriber.Camera2StreamConfigurationMap.decrementAndGet() == 0;
                        if (flatMapSingleSubscriber.getOutputFormats.get() != 0) {
                            flatMapSingleSubscriber.getHighSpeedVideoFpsRangesFor.onNext(r);
                            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> spscLinkedArrayQueue = flatMapSingleSubscriber.getInputSizeshNQ4ISI.get();
                            if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                                java.lang.Throwable terminate = flatMapSingleSubscriber.getHighSpeedVideoSizes.terminate();
                                if (terminate != null) {
                                    flatMapSingleSubscriber.getHighSpeedVideoFpsRangesFor.onError(terminate);
                                    return;
                                } else {
                                    flatMapSingleSubscriber.getHighSpeedVideoFpsRangesFor.onComplete();
                                    return;
                                }
                            }
                            io.reactivex.internal.util.BackpressureHelper.produced(flatMapSingleSubscriber.getOutputFormats, 1L);
                            if (flatMapSingleSubscriber.getInputFormats != Integer.MAX_VALUE) {
                                flatMapSingleSubscriber.getHighSpeedVideoSizesFor.request(1L);
                            }
                        } else {
                            io.reactivex.internal.queue.SpscLinkedArrayQueue<R> highResolutionOutputSizeshNQ4ISI = flatMapSingleSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                            synchronized (highResolutionOutputSizeshNQ4ISI) {
                                highResolutionOutputSizeshNQ4ISI.offer(r);
                            }
                        }
                        if (flatMapSingleSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                        flatMapSingleSubscriber.getHighSpeedVideoFpsRanges();
                    }
                }
                io.reactivex.internal.queue.SpscLinkedArrayQueue<R> highResolutionOutputSizeshNQ4ISI2 = flatMapSingleSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                synchronized (highResolutionOutputSizeshNQ4ISI2) {
                    highResolutionOutputSizeshNQ4ISI2.offer(r);
                }
                flatMapSingleSubscriber.Camera2StreamConfigurationMap.decrementAndGet();
                if (flatMapSingleSubscriber.getAndIncrement() != 0) {
                    return;
                }
                flatMapSingleSubscriber.getHighSpeedVideoFpsRanges();
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber flatMapSingleSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapSingle.FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.getOutputStallDurationlomOqCM.delete(this);
                if (flatMapSingleSubscriber.getHighSpeedVideoSizes.addThrowable(th)) {
                    if (!flatMapSingleSubscriber.getHighSpeedVideoFpsRanges) {
                        flatMapSingleSubscriber.getHighSpeedVideoSizesFor.cancel();
                        flatMapSingleSubscriber.getOutputStallDurationlomOqCM.dispose();
                    } else if (flatMapSingleSubscriber.getInputFormats != Integer.MAX_VALUE) {
                        flatMapSingleSubscriber.getHighSpeedVideoSizesFor.request(1L);
                    }
                    flatMapSingleSubscriber.Camera2StreamConfigurationMap.decrementAndGet();
                    if (flatMapSingleSubscriber.getAndIncrement() == 0) {
                        flatMapSingleSubscriber.getHighSpeedVideoFpsRanges();
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
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
