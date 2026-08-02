package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> getHighSpeedVideoFpsRangesFor;
    final org.reactivestreams.Publisher<B> getHighSpeedVideoSizes;

    public FlowableWindowBoundarySelector(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<B> publisher, io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> function, int i) {
        super(flowable);
        this.getHighSpeedVideoSizes = publisher;
        this.getHighSpeedVideoFpsRangesFor = function;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryMainSubscriber<T, B, V> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription {
        final io.reactivex.disposables.CompositeDisposable Camera2StreamConfigurationMap;
        final org.reactivestreams.Publisher<B> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        final java.util.List<io.reactivex.processors.UnicastProcessor<T>> getInputFormats;
        org.reactivestreams.Subscription getInputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicLong getOutputFormats;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean accept(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, java.lang.Object obj) {
            return false;
        }

        WindowBoundaryMainSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, org.reactivestreams.Publisher<B> publisher, io.reactivex.functions.Function<? super B, ? extends org.reactivestreams.Publisher<V>> function, int i) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();
            java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
            this.getOutputFormats = atomicLong;
            this.getHighResolutionOutputSizeshNQ4ISI = publisher;
            this.getHighSpeedVideoFpsRanges = function;
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = new io.reactivex.disposables.CompositeDisposable();
            this.getInputFormats = new java.util.ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getInputSizeshNQ4ISI, subscription)) {
                this.getInputSizeshNQ4ISI = subscription;
                this.actual.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryOpenSubscriber operatorWindowBoundaryOpenSubscriber = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryOpenSubscriber(this);
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, null, operatorWindowBoundaryOpenSubscriber)) {
                    this.getOutputFormats.getAndIncrement();
                    subscription.request(Long.MAX_VALUE);
                    this.getHighResolutionOutputSizeshNQ4ISI.subscribe(operatorWindowBoundaryOpenSubscriber);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (fastEnter()) {
                java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.getInputFormats.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                getHighSpeedVideoFpsRanges();
            }
            if (this.getOutputFormats.decrementAndGet() == 0) {
                this.Camera2StreamConfigurationMap.dispose();
            }
            this.actual.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                getHighSpeedVideoFpsRanges();
            }
            if (this.getOutputFormats.decrementAndGet() == 0) {
                this.Camera2StreamConfigurationMap.dispose();
            }
            this.actual.onComplete();
        }

        final void getHighSpeedVideoSizes(java.lang.Throwable th) {
            this.getInputSizeshNQ4ISI.cancel();
            this.Camera2StreamConfigurationMap.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
            this.actual.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighSpeedVideoFpsRanges() {
            io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.queue;
            org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
            java.util.List<io.reactivex.processors.UnicastProcessor<T>> list = this.getInputFormats;
            int i = 1;
            while (true) {
                boolean z = this.done;
                java.lang.Object poll = simpleQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    this.Camera2StreamConfigurationMap.dispose();
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (!z2) {
                    if (poll instanceof io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation) {
                        io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation windowOperation = (io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation) poll;
                        if (windowOperation.getHighSpeedVideoSizes != null) {
                            if (list.remove(windowOperation.getHighSpeedVideoSizes)) {
                                windowOperation.getHighSpeedVideoSizes.onComplete();
                                if (this.getOutputFormats.decrementAndGet() == 0) {
                                    this.Camera2StreamConfigurationMap.dispose();
                                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else if (!this.cancelled) {
                            io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoSizes);
                            long requested = requested();
                            if (requested != 0) {
                                list.add(create);
                                subscriber.onNext(create);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                try {
                                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(windowOperation.Camera2StreamConfigurationMap), "The publisher supplied is null");
                                    io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryCloseSubscriber operatorWindowBoundaryCloseSubscriber = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.OperatorWindowBoundaryCloseSubscriber(this, create);
                                    if (this.Camera2StreamConfigurationMap.add(operatorWindowBoundaryCloseSubscriber)) {
                                        this.getOutputFormats.getAndIncrement();
                                        publisher.subscribe(operatorWindowBoundaryCloseSubscriber);
                                    }
                                } catch (java.lang.Throwable th2) {
                                    this.cancelled = true;
                                    subscriber.onError(th2);
                                }
                            } else {
                                this.cancelled = true;
                                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver new window due to lack of requests"));
                            }
                        }
                    } else {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().onNext(io.reactivex.internal.util.NotificationLite.getValue(poll));
                        }
                    }
                } else {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowOperation<T, B> {
        final B Camera2StreamConfigurationMap;
        final io.reactivex.processors.UnicastProcessor<T> getHighSpeedVideoSizes;

        WindowOperation(io.reactivex.processors.UnicastProcessor<T> unicastProcessor, B b) {
            this.getHighSpeedVideoSizes = unicastProcessor;
            this.Camera2StreamConfigurationMap = b;
        }
    }

    /* loaded from: classes17.dex */
    static final class OperatorWindowBoundaryOpenSubscriber<T, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, B, ?> getHighSpeedVideoSizes;

        OperatorWindowBoundaryOpenSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber) {
            this.getHighSpeedVideoSizes = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b) {
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, B, ?> windowBoundaryMainSubscriber = this.getHighSpeedVideoSizes;
            windowBoundaryMainSubscriber.queue.offer(new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation(null, b));
            if (windowBoundaryMainSubscriber.enter()) {
                windowBoundaryMainSubscriber.getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class OperatorWindowBoundaryCloseSubscriber<T, V> extends io.reactivex.subscribers.DisposableSubscriber<V> {
        final io.reactivex.processors.UnicastProcessor<T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, ?, V> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoSizes;

        OperatorWindowBoundaryCloseSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber, io.reactivex.processors.UnicastProcessor<T> unicastProcessor) {
            this.getHighSpeedVideoFpsRanges = windowBoundaryMainSubscriber;
            this.Camera2StreamConfigurationMap = unicastProcessor;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(V v) {
            cancel();
            onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowBoundaryMainSubscriber<T, ?, V> windowBoundaryMainSubscriber = this.getHighSpeedVideoFpsRanges;
            windowBoundaryMainSubscriber.Camera2StreamConfigurationMap.delete(this);
            windowBoundaryMainSubscriber.queue.offer(new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector.WindowOperation(this.Camera2StreamConfigurationMap, null));
            if (windowBoundaryMainSubscriber.enter()) {
                windowBoundaryMainSubscriber.getHighSpeedVideoFpsRanges();
            }
        }
    }
}
