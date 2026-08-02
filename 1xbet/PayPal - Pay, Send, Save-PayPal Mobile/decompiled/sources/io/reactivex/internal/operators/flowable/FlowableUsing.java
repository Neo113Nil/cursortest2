package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableUsing<T, D> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.Consumer<? super D> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Callable<? extends D> getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;

    public FlowableUsing(java.util.concurrent.Callable<? extends D> callable, io.reactivex.functions.Function<? super D, ? extends org.reactivestreams.Publisher<? extends T>> function, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.Camera2StreamConfigurationMap = consumer;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            D call = this.getHighSpeedVideoFpsRangesFor.call();
            try {
                ((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(call), "The sourceSupplier returned a null Publisher")).subscribe(new io.reactivex.internal.operators.flowable.FlowableUsing.UsingSubscriber(subscriber, call, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                try {
                    this.Camera2StreamConfigurationMap.accept(call);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(new io.reactivex.exceptions.CompositeException(th, th2), subscriber);
                }
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th3, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class UsingSubscriber<T, D> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 5904473792286235046L;
        final D Camera2StreamConfigurationMap;
        final io.reactivex.functions.Consumer<? super D> getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        UsingSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, D d, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.Camera2StreamConfigurationMap = d;
            this.getHighResolutionOutputSizeshNQ4ISI = consumer;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                if (compareAndSet(false, true)) {
                    try {
                        this.getHighResolutionOutputSizeshNQ4ISI.accept(this.Camera2StreamConfigurationMap);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    }
                }
                th = null;
                this.getHighSpeedVideoSizes.cancel();
                if (th != null) {
                    this.getHighSpeedVideoFpsRangesFor.onError(new io.reactivex.exceptions.CompositeException(th, th));
                    return;
                } else {
                    this.getHighSpeedVideoFpsRangesFor.onError(th);
                    return;
                }
            }
            this.getHighSpeedVideoFpsRangesFor.onError(th);
            this.getHighSpeedVideoSizes.cancel();
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                if (compareAndSet(false, true)) {
                    try {
                        this.getHighResolutionOutputSizeshNQ4ISI.accept(this.Camera2StreamConfigurationMap);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighSpeedVideoFpsRangesFor.onError(th);
                        return;
                    }
                }
                this.getHighSpeedVideoSizes.cancel();
                this.getHighSpeedVideoFpsRangesFor.onComplete();
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onComplete();
            this.getHighSpeedVideoSizes.cancel();
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoSizes.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            getHighSpeedVideoFpsRanges();
            this.getHighSpeedVideoSizes.cancel();
        }

        private void getHighSpeedVideoFpsRanges() {
            if (compareAndSet(false, true)) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.accept(this.Camera2StreamConfigurationMap);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
