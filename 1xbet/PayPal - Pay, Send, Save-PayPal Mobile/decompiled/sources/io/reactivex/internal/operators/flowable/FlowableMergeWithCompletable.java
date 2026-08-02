package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableMergeWithCompletable<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.CompletableSource getHighResolutionOutputSizeshNQ4ISI;

    public FlowableMergeWithCompletable(io.reactivex.Flowable<T> flowable, io.reactivex.CompletableSource completableSource) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = completableSource;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber mergeWithSubscriber = new io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber(subscriber);
        subscriber.onSubscribe(mergeWithSubscriber);
        this.source.subscribe((io.reactivex.FlowableSubscriber) mergeWithSubscriber);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(mergeWithSubscriber.getOutputMinFrameDuration);
    }

    /* loaded from: classes17.dex */
    static final class MergeWithSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber.OtherObserver getOutputMinFrameDuration = new io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber.OtherObserver(this);
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizes = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicLong();

        MergeWithSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            io.reactivex.internal.util.HalfSerializer.onNext(this.getHighSpeedVideoFpsRangesFor, t, this, this.getHighSpeedVideoSizes);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.Camera2StreamConfigurationMap);
            io.reactivex.internal.util.HalfSerializer.onError(this.getHighSpeedVideoFpsRangesFor, th, this, this.getHighSpeedVideoSizes);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = true;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.internal.util.HalfSerializer.onComplete(this.getHighSpeedVideoFpsRangesFor, this, this.getHighSpeedVideoSizes);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.Camera2StreamConfigurationMap);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputMinFrameDuration);
        }

        static final class OtherObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber<?> getHighSpeedVideoFpsRangesFor;

            OtherObserver(io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber<?> mergeWithSubscriber) {
                this.getHighSpeedVideoFpsRangesFor = mergeWithSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber<?> mergeWithSubscriber = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(mergeWithSubscriber.Camera2StreamConfigurationMap);
                io.reactivex.internal.util.HalfSerializer.onError(mergeWithSubscriber.getHighSpeedVideoFpsRangesFor, th, mergeWithSubscriber, mergeWithSubscriber.getHighSpeedVideoSizes);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber<?> mergeWithSubscriber = this.getHighSpeedVideoFpsRangesFor;
                mergeWithSubscriber.getHighResolutionOutputSizeshNQ4ISI = true;
                if (mergeWithSubscriber.getHighSpeedVideoFpsRanges) {
                    io.reactivex.internal.util.HalfSerializer.onComplete(mergeWithSubscriber.getHighSpeedVideoFpsRangesFor, mergeWithSubscriber, mergeWithSubscriber.getHighSpeedVideoSizes);
                }
            }
        }
    }
}
