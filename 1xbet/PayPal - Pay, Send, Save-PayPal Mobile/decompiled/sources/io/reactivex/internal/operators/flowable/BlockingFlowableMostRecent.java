package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class BlockingFlowableMostRecent<T> implements java.lang.Iterable<T> {
    final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;
    final T getHighSpeedVideoFpsRanges;

    public BlockingFlowableMostRecent(io.reactivex.Flowable<T> flowable, T t) {
        this.Camera2StreamConfigurationMap = flowable;
        this.getHighSpeedVideoFpsRanges = t;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber mostRecentSubscriber = new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber(this.getHighSpeedVideoFpsRanges);
        this.Camera2StreamConfigurationMap.subscribe((io.reactivex.FlowableSubscriber) mostRecentSubscriber);
        return new io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber.Iterator();
    }

    /* loaded from: classes17.dex */
    static final class MostRecentSubscriber<T> extends io.reactivex.subscribers.DefaultSubscriber<T> {
        volatile java.lang.Object getHighSpeedVideoFpsRangesFor;

        MostRecentSubscriber(T t) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.NotificationLite.next(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.NotificationLite.complete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.NotificationLite.error(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.NotificationLite.next(t);
        }

        final class Iterator implements java.util.Iterator<T> {
            private java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

            Iterator() {
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber.this.getHighSpeedVideoFpsRangesFor;
                return !io.reactivex.internal.util.NotificationLite.isComplete(r0);
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent.MostRecentSubscriber.this.getHighSpeedVideoFpsRangesFor;
                    }
                    if (io.reactivex.internal.util.NotificationLite.isComplete(this.getHighResolutionOutputSizeshNQ4ISI)) {
                        throw new java.util.NoSuchElementException();
                    }
                    if (io.reactivex.internal.util.NotificationLite.isError(this.getHighResolutionOutputSizeshNQ4ISI)) {
                        throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(io.reactivex.internal.util.NotificationLite.getError(this.getHighResolutionOutputSizeshNQ4ISI));
                    }
                    return (T) io.reactivex.internal.util.NotificationLite.getValue(this.getHighResolutionOutputSizeshNQ4ISI);
                } finally {
                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new java.lang.UnsupportedOperationException("Read only iterator");
            }
        }
    }
}
