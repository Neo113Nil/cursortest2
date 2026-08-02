package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class BlockingFlowableLatest<T> implements java.lang.Iterable<T> {
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRangesFor;

    public BlockingFlowableLatest(org.reactivestreams.Publisher<? extends T> publisher) {
        this.getHighSpeedVideoFpsRangesFor = publisher;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.flowable.BlockingFlowableLatest.LatestSubscriberIterator latestSubscriberIterator = new io.reactivex.internal.operators.flowable.BlockingFlowableLatest.LatestSubscriberIterator();
        io.reactivex.Flowable.fromPublisher(this.getHighSpeedVideoFpsRangesFor).materialize().subscribe((io.reactivex.FlowableSubscriber<? super io.reactivex.Notification<T>>) latestSubscriberIterator);
        return latestSubscriberIterator;
    }

    /* loaded from: classes17.dex */
    static final class LatestSubscriberIterator<T> extends io.reactivex.subscribers.DisposableSubscriber<io.reactivex.Notification<T>> implements java.util.Iterator<T> {
        io.reactivex.Notification<T> getHighSpeedVideoSizes;
        final java.util.concurrent.Semaphore getHighSpeedVideoFpsRanges = new java.util.concurrent.Semaphore(0);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.Notification<T>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        LatestSubscriberIterator() {
        }

        @Override // org.reactivestreams.Subscriber
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet((io.reactivex.Notification) obj) == null) {
                this.getHighSpeedVideoFpsRanges.release();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            io.reactivex.Notification<T> notification = this.getHighSpeedVideoSizes;
            if (notification != null && notification.isOnError()) {
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(this.getHighSpeedVideoSizes.getError());
            }
            io.reactivex.Notification<T> notification2 = this.getHighSpeedVideoSizes;
            if ((notification2 == null || notification2.isOnNext()) && this.getHighSpeedVideoSizes == null) {
                try {
                    io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                    this.getHighSpeedVideoFpsRanges.acquire();
                    io.reactivex.Notification<T> andSet = this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(null);
                    this.getHighSpeedVideoSizes = andSet;
                    if (andSet.isOnError()) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(andSet.getError());
                    }
                } catch (java.lang.InterruptedException e) {
                    dispose();
                    this.getHighSpeedVideoSizes = io.reactivex.Notification.createOnError(e);
                    throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
                }
            }
            return this.getHighSpeedVideoSizes.isOnNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext() && this.getHighSpeedVideoSizes.isOnNext()) {
                T value = this.getHighSpeedVideoSizes.getValue();
                this.getHighSpeedVideoSizes = null;
                return value;
            }
            throw new java.util.NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException("Read-only iterator.");
        }
    }
}
