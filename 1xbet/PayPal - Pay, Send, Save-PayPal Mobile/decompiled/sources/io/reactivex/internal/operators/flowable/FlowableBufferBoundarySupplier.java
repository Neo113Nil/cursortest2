package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableBufferBoundarySupplier<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> Camera2StreamConfigurationMap;
    final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableBufferBoundarySupplier(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> callable, java.util.concurrent.Callable<U> callable2) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
        this.Camera2StreamConfigurationMap = callable2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class BufferBoundarySupplierSubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<U> Camera2StreamConfigurationMap;
        final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;
        U getHighSpeedVideoSizes;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final /* synthetic */ boolean accept(org.reactivestreams.Subscriber subscriber, java.lang.Object obj) {
            this.actual.onNext((java.util.Collection) obj);
            return true;
        }

        BufferBoundarySupplierSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, java.util.concurrent.Callable<U> callable, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> callable2) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
            this.Camera2StreamConfigurationMap = callable;
            this.getHighResolutionOutputSizeshNQ4ISI = callable2;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRangesFor, subscription)) {
                this.getHighSpeedVideoFpsRangesFor = subscription;
                org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
                try {
                    this.getHighSpeedVideoSizes = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The buffer supplied is null");
                    try {
                        org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The boundary publisher supplied is null");
                        io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySubscriber bufferBoundarySubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySubscriber(this);
                        this.getHighSpeedVideoFpsRanges.set(bufferBoundarySubscriber);
                        subscriber.onSubscribe(this);
                        if (this.cancelled) {
                            return;
                        }
                        subscription.request(Long.MAX_VALUE);
                        publisher.subscribe(bufferBoundarySubscriber);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.cancelled = true;
                        subscription.cancel();
                        io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    subscription.cancel();
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.getHighSpeedVideoSizes;
                if (u == null) {
                    return;
                }
                u.add(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            cancel();
            this.actual.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            synchronized (this) {
                U u = this.getHighSpeedVideoSizes;
                if (u == null) {
                    return;
                }
                this.getHighSpeedVideoSizes = null;
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(this.queue, this.actual, false, this, this);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.getHighSpeedVideoFpsRangesFor.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            if (enter()) {
                this.queue.clear();
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The buffer supplied is null");
                try {
                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The boundary publisher supplied is null");
                    io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySubscriber bufferBoundarySubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySubscriber(this);
                    if (io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoFpsRanges, bufferBoundarySubscriber)) {
                        synchronized (this) {
                            U u2 = this.getHighSpeedVideoSizes;
                            if (u2 == null) {
                                return;
                            }
                            this.getHighSpeedVideoSizes = u;
                            publisher.subscribe(bufferBoundarySubscriber);
                            fastPathEmitMax(u2, false, this);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    this.getHighSpeedVideoFpsRangesFor.cancel();
                    this.actual.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                cancel();
                this.actual.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        final io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber<T, U, B> getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        BufferBoundarySubscriber(io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier.BufferBoundarySupplierSubscriber<T, U, B> bufferBoundarySupplierSubscriber) {
            this.getHighSpeedVideoFpsRangesFor = bufferBoundarySupplierSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            cancel();
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
        }
    }
}
