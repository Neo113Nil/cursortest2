package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableFlatMapCompletable<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public FlowableFlatMapCompletable(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z, int i) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes));
    }

    static final class FlatMapCompletableMainSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> Camera2StreamConfigurationMap;
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizesFor;
        final int getOutputMinFrameDuration;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizes = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.disposables.CompositeDisposable getInputSizeshNQ4ISI = new io.reactivex.disposables.CompositeDisposable();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            return null;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 2;
        }

        FlatMapCompletableMainSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z, int i) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.Camera2StreamConfigurationMap = function;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getOutputMinFrameDuration = i;
            lazySet(1);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                int i = this.getOutputMinFrameDuration;
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
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber.InnerConsumer innerConsumer = new io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber.InnerConsumer();
                if (this.getHighSpeedVideoFpsRanges || !this.getInputSizeshNQ4ISI.add(innerConsumer)) {
                    return;
                }
                completableSource.subscribe(innerConsumer);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizesFor.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes.addThrowable(th)) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    if (decrementAndGet() == 0) {
                        this.getHighSpeedVideoFpsRangesFor.onError(this.getHighSpeedVideoSizes.terminate());
                        return;
                    } else {
                        if (this.getOutputMinFrameDuration != Integer.MAX_VALUE) {
                            this.getHighSpeedVideoSizesFor.request(1L);
                            return;
                        }
                        return;
                    }
                }
                cancel();
                if (getAndSet(0) > 0) {
                    this.getHighSpeedVideoFpsRangesFor.onError(this.getHighSpeedVideoSizes.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                java.lang.Throwable terminate = this.getHighSpeedVideoSizes.terminate();
                if (terminate != null) {
                    this.getHighSpeedVideoFpsRangesFor.onError(terminate);
                    return;
                } else {
                    this.getHighSpeedVideoFpsRangesFor.onComplete();
                    return;
                }
            }
            if (this.getOutputMinFrameDuration != Integer.MAX_VALUE) {
                this.getHighSpeedVideoSizesFor.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizesFor.cancel();
            this.getInputSizeshNQ4ISI.dispose();
        }

        final class InnerConsumer extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerConsumer() {
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.getInputSizeshNQ4ISI.delete(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.getInputSizeshNQ4ISI.delete(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
            }
        }
    }
}
