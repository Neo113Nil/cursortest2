package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDebounce<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> getHighSpeedVideoFpsRangesFor;

    public FlowableDebounce(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> function) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class DebounceSubscriber<T, U> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 6725975399620862591L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> getHighSpeedVideoFpsRanges;
        volatile long getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        org.reactivestreams.Subscription getOutputFormats;

        DebounceSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> function) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            long j = this.getHighSpeedVideoFpsRangesFor + 1;
            this.getHighSpeedVideoFpsRangesFor = j;
            io.reactivex.disposables.Disposable disposable = this.Camera2StreamConfigurationMap.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The publisher supplied is null");
                io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber.DebounceInnerSubscriber debounceInnerSubscriber = new io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber.DebounceInnerSubscriber(this, j, t);
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, disposable, debounceInnerSubscriber)) {
                    publisher.subscribe(debounceInnerSubscriber);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.disposables.Disposable disposable = this.Camera2StreamConfigurationMap.get();
            if (io.reactivex.internal.disposables.DisposableHelper.isDisposed(disposable)) {
                return;
            }
            io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber.DebounceInnerSubscriber debounceInnerSubscriber = (io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber.DebounceInnerSubscriber) disposable;
            if (debounceInnerSubscriber.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                debounceInnerSubscriber.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(debounceInnerSubscriber.getHighSpeedVideoFpsRangesFor, debounceInnerSubscriber.getHighResolutionOutputSizeshNQ4ISI);
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getOutputFormats.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.Camera2StreamConfigurationMap);
        }

        final void getHighSpeedVideoFpsRangesFor(long j, T t) {
            if (j == this.getHighSpeedVideoFpsRangesFor) {
                if (get() != 0) {
                    this.getHighSpeedVideoSizes.onNext(t);
                    io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
                } else {
                    cancel();
                    this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver value due to lack of requests"));
                }
            }
        }

        static final class DebounceInnerSubscriber<T, U> extends io.reactivex.subscribers.DisposableSubscriber<U> {
            boolean Camera2StreamConfigurationMap;
            final T getHighResolutionOutputSizeshNQ4ISI;
            final io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber<T, U> getHighSpeedVideoFpsRanges;
            final long getHighSpeedVideoFpsRangesFor;
            final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();

            DebounceInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber<T, U> debounceSubscriber, long j, T t) {
                this.getHighSpeedVideoFpsRanges = debounceSubscriber;
                this.getHighSpeedVideoFpsRangesFor = j;
                this.getHighResolutionOutputSizeshNQ4ISI = t;
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(U u) {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                cancel();
                if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(java.lang.Throwable th) {
                if (this.Camera2StreamConfigurationMap) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                } else {
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoFpsRanges.onError(th);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
        }
    }
}
