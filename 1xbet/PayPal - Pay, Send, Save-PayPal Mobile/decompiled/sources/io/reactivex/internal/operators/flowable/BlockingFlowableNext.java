package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class BlockingFlowableNext<T> implements java.lang.Iterable<T> {
    final org.reactivestreams.Publisher<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public BlockingFlowableNext(org.reactivestreams.Publisher<? extends T> publisher) {
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return new io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextIterator(this.getHighResolutionOutputSizeshNQ4ISI, new io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber());
    }

    /* loaded from: classes17.dex */
    static final class NextIterator<T> implements java.util.Iterator<T> {
        private T getHighResolutionOutputSizeshNQ4ISI;
        private final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRangesFor;
        private java.lang.Throwable getHighSpeedVideoSizes;
        private final io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber<T> getInputFormats;
        private boolean getInputSizeshNQ4ISI;
        private boolean Camera2StreamConfigurationMap = true;
        private boolean getHighSpeedVideoFpsRanges = true;

        NextIterator(org.reactivestreams.Publisher<? extends T> publisher, io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber<T> nextSubscriber) {
            this.getHighSpeedVideoFpsRangesFor = publisher;
            this.getInputFormats = nextSubscriber;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            java.lang.Throwable th = this.getHighSpeedVideoSizes;
            if (th != null) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
            if (this.Camera2StreamConfigurationMap) {
                return !this.getHighSpeedVideoFpsRanges || Camera2StreamConfigurationMap();
            }
            return false;
        }

        private boolean Camera2StreamConfigurationMap() {
            try {
                if (!this.getInputSizeshNQ4ISI) {
                    this.getInputSizeshNQ4ISI = true;
                    this.getInputFormats.Camera2StreamConfigurationMap.set(1);
                    io.reactivex.Flowable.fromPublisher(this.getHighSpeedVideoFpsRangesFor).materialize().subscribe((io.reactivex.FlowableSubscriber<? super io.reactivex.Notification<T>>) this.getInputFormats);
                }
                io.reactivex.internal.operators.flowable.BlockingFlowableNext.NextSubscriber<T> nextSubscriber = this.getInputFormats;
                nextSubscriber.Camera2StreamConfigurationMap.set(1);
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                io.reactivex.Notification<T> take = nextSubscriber.getHighResolutionOutputSizeshNQ4ISI.take();
                if (take.isOnNext()) {
                    this.getHighSpeedVideoFpsRanges = false;
                    this.getHighResolutionOutputSizeshNQ4ISI = take.getValue();
                    return true;
                }
                this.Camera2StreamConfigurationMap = false;
                if (take.isOnComplete()) {
                    return false;
                }
                if (take.isOnError()) {
                    java.lang.Throwable error = take.getError();
                    this.getHighSpeedVideoSizes = error;
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(error);
                }
                throw new java.lang.IllegalStateException("Should not reach here");
            } catch (java.lang.InterruptedException e) {
                this.getInputFormats.dispose();
                this.getHighSpeedVideoSizes = e;
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            java.lang.Throwable th = this.getHighSpeedVideoSizes;
            if (th != null) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
            if (hasNext()) {
                this.getHighSpeedVideoFpsRanges = true;
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }
            throw new java.util.NoSuchElementException("No more elements");
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Read only iterator");
        }
    }

    /* loaded from: classes17.dex */
    static final class NextSubscriber<T> extends io.reactivex.subscribers.DisposableSubscriber<io.reactivex.Notification<T>> {
        final java.util.concurrent.BlockingQueue<io.reactivex.Notification<T>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ArrayBlockingQueue(1);
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        NextSubscriber() {
        }

        @Override // org.reactivestreams.Subscriber
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            io.reactivex.Notification<T> notification = (io.reactivex.Notification) obj;
            if (this.Camera2StreamConfigurationMap.getAndSet(0) == 1 || !notification.isOnNext()) {
                while (!this.getHighResolutionOutputSizeshNQ4ISI.offer(notification)) {
                    io.reactivex.Notification<T> poll = this.getHighResolutionOutputSizeshNQ4ISI.poll();
                    if (poll != null && !poll.isOnNext()) {
                        notification = poll;
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }
}
