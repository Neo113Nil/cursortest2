package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDebounceTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

    public FlowableDebounceTimed(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceTimedSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.createWorker()));
    }

    /* loaded from: classes17.dex */
    static final class DebounceTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -9102637559663639004L;
        final long Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        volatile long getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final java.util.concurrent.TimeUnit getInputFormats;
        final io.reactivex.Scheduler.Worker getInputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputFormats;

        DebounceTimedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.getHighSpeedVideoSizes = subscriber;
            this.Camera2StreamConfigurationMap = j;
            this.getInputFormats = timeUnit;
            this.getInputSizeshNQ4ISI = worker;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            long j = this.getHighSpeedVideoFpsRanges + 1;
            this.getHighSpeedVideoFpsRanges = j;
            io.reactivex.disposables.Disposable disposable = this.getOutputFormats;
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceEmitter debounceEmitter = new io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceEmitter(t, j, this);
            this.getOutputFormats = debounceEmitter;
            io.reactivex.internal.disposables.DisposableHelper.replace(debounceEmitter, this.getInputSizeshNQ4ISI.schedule(debounceEmitter, this.Camera2StreamConfigurationMap, this.getInputFormats));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.disposables.Disposable disposable = this.getOutputFormats;
            if (disposable != null) {
                disposable.dispose();
            }
            this.getHighSpeedVideoSizes.onError(th);
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.disposables.Disposable disposable = this.getOutputFormats;
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceEmitter debounceEmitter = (io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.Camera2StreamConfigurationMap();
            }
            this.getHighSpeedVideoSizes.onComplete();
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            this.getInputSizeshNQ4ISI.dispose();
        }
    }

    /* loaded from: classes17.dex */
    static final class DebounceEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceTimedSubscriber<T> getHighResolutionOutputSizeshNQ4ISI;
        final T getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean();
        final long getHighSpeedVideoSizes;

        DebounceEmitter(T t, long j, io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceTimedSubscriber<T> debounceTimedSubscriber) {
            this.getHighSpeedVideoFpsRanges = t;
            this.getHighSpeedVideoSizes = j;
            this.getHighResolutionOutputSizeshNQ4ISI = debounceTimedSubscriber;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Camera2StreamConfigurationMap();
        }

        final void Camera2StreamConfigurationMap() {
            if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
                io.reactivex.internal.operators.flowable.FlowableDebounceTimed.DebounceTimedSubscriber<T> debounceTimedSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                long j = this.getHighSpeedVideoSizes;
                T t = this.getHighSpeedVideoFpsRanges;
                if (j == debounceTimedSubscriber.getHighSpeedVideoFpsRanges) {
                    if (debounceTimedSubscriber.get() != 0) {
                        debounceTimedSubscriber.getHighSpeedVideoSizes.onNext(t);
                        io.reactivex.internal.util.BackpressureHelper.produced(debounceTimedSubscriber, 1L);
                        dispose();
                    } else {
                        debounceTimedSubscriber.cancel();
                        debounceTimedSubscriber.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver value due to lack of requests"));
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
