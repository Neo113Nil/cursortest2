package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableBufferExactBoundary<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final org.reactivestreams.Publisher<B> getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.Callable<U> getHighSpeedVideoSizes;

    public FlowableBufferExactBoundary(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<B> publisher, java.util.concurrent.Callable<U> callable) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.getHighSpeedVideoSizes = callable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferExactBoundarySubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class BufferExactBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        final java.util.concurrent.Callable<U> Camera2StreamConfigurationMap;
        U getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Publisher<B> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final /* synthetic */ boolean accept(org.reactivestreams.Subscriber subscriber, java.lang.Object obj) {
            this.actual.onNext((java.util.Collection) obj);
            return true;
        }

        BufferExactBoundarySubscriber(org.reactivestreams.Subscriber<? super U> subscriber, java.util.concurrent.Callable<U> callable, org.reactivestreams.Publisher<B> publisher) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.Camera2StreamConfigurationMap = callable;
            this.getHighSpeedVideoFpsRangesFor = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The buffer supplied is null");
                    io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferBoundarySubscriber bufferBoundarySubscriber = new io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferBoundarySubscriber(this);
                    this.getHighSpeedVideoFpsRanges = bufferBoundarySubscriber;
                    this.actual.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    subscription.request(Long.MAX_VALUE);
                    this.getHighSpeedVideoFpsRangesFor.subscribe(bufferBoundarySubscriber);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.cancelled = true;
                    subscription.cancel();
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, this.actual);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.getHighResolutionOutputSizeshNQ4ISI;
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
                U u = this.getHighResolutionOutputSizeshNQ4ISI;
                if (u == null) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = null;
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
            this.getHighSpeedVideoFpsRanges.dispose();
            this.getHighSpeedVideoSizes.cancel();
            if (enter()) {
                this.queue.clear();
            }
        }

        final void getHighSpeedVideoSizes() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (u2 == null) {
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = u;
                    fastPathEmitMax(u2, false, this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                this.actual.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferBoundarySubscriber<T, U extends java.util.Collection<? super T>, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        final io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferExactBoundarySubscriber<T, U, B> getHighSpeedVideoSizes;

        BufferBoundarySubscriber(io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary.BufferExactBoundarySubscriber<T, U, B> bufferExactBoundarySubscriber) {
            this.getHighSpeedVideoSizes = bufferExactBoundarySubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
