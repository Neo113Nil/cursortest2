package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureDrop<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> implements io.reactivex.functions.Consumer<T> {
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizes;

    @Override // io.reactivex.functions.Consumer
    public final void accept(T t) {
    }

    public FlowableOnBackpressureDrop(io.reactivex.Flowable<T> flowable) {
        super(flowable);
        this.getHighSpeedVideoSizes = this;
    }

    public FlowableOnBackpressureDrop(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Consumer<? super T> consumer) {
        super(flowable);
        this.getHighSpeedVideoSizes = consumer;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop.BackpressureDropSubscriber(subscriber, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class BackpressureDropSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -6246093802440953054L;
        boolean Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizes;

        BackpressureDropSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Consumer<? super T> consumer) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoSizes = consumer;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            if (get() != 0) {
                this.getHighSpeedVideoFpsRangesFor.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
                return;
            }
            try {
                this.getHighSpeedVideoSizes.accept(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges.cancel();
        }
    }
}
