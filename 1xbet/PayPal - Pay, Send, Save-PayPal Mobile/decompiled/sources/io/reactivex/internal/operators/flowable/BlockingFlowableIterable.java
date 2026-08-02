package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class BlockingFlowableIterable<T> implements java.lang.Iterable<T> {
    final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;

    public BlockingFlowableIterable(io.reactivex.Flowable<T> flowable, int i) {
        this.Camera2StreamConfigurationMap = flowable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.flowable.BlockingFlowableIterable.BlockingFlowableIterator blockingFlowableIterator = new io.reactivex.internal.operators.flowable.BlockingFlowableIterable.BlockingFlowableIterator(this.getHighResolutionOutputSizeshNQ4ISI);
        this.Camera2StreamConfigurationMap.subscribe((io.reactivex.FlowableSubscriber) blockingFlowableIterator);
        return blockingFlowableIterator;
    }

    /* loaded from: classes17.dex */
    static final class BlockingFlowableIterator<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, java.util.Iterator<T>, java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        volatile boolean Camera2StreamConfigurationMap;
        final java.util.concurrent.locks.Condition getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        final long getHighSpeedVideoSizes;
        final java.util.concurrent.locks.Lock getHighSpeedVideoSizesFor;
        long getInputFormats;
        final io.reactivex.internal.queue.SpscArrayQueue<T> getOutputMinFrameDuration;

        BlockingFlowableIterator(int i) {
            this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscArrayQueue<>(i);
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = i - (i >> 2);
            java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
            this.getHighSpeedVideoSizesFor = reentrantLock;
            this.getHighResolutionOutputSizeshNQ4ISI = reentrantLock.newCondition();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                boolean z = this.Camera2StreamConfigurationMap;
                boolean isEmpty = this.getOutputMinFrameDuration.isEmpty();
                if (z) {
                    java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
                    if (th != null) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
                    }
                    if (isEmpty) {
                        return false;
                    }
                }
                if (!isEmpty) {
                    return true;
                }
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                this.getHighSpeedVideoSizesFor.lock();
                while (!this.Camera2StreamConfigurationMap && this.getOutputMinFrameDuration.isEmpty()) {
                    try {
                        try {
                            this.getHighResolutionOutputSizeshNQ4ISI.await();
                        } catch (java.lang.InterruptedException e) {
                            run();
                            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
                        }
                    } finally {
                        this.getHighSpeedVideoSizesFor.unlock();
                    }
                }
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T poll = this.getOutputMinFrameDuration.poll();
                long j = this.getInputFormats + 1;
                if (j == this.getHighSpeedVideoFpsRangesFor) {
                    this.getInputFormats = 0L;
                    get().request(j);
                    return poll;
                }
                this.getInputFormats = j;
                return poll;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, this.getHighSpeedVideoSizes);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (!this.getOutputMinFrameDuration.offer(t)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
                onError(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = th;
            this.Camera2StreamConfigurationMap = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoSizesFor.lock();
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.signalAll();
            } finally {
                this.getHighSpeedVideoSizesFor.unlock();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("remove");
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(get());
        }
    }
}
