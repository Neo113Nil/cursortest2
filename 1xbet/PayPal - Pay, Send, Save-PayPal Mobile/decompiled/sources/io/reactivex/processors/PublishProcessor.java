package io.reactivex.processors;

/* loaded from: classes17.dex */
public final class PublishProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    static final io.reactivex.processors.PublishProcessor.PublishSubscription[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.processors.PublishProcessor.PublishSubscription[0];
    static final io.reactivex.processors.PublishProcessor.PublishSubscription[] getHighSpeedVideoSizes = new io.reactivex.processors.PublishProcessor.PublishSubscription[0];
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.PublishProcessor.PublishSubscription<T>[]> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoSizes);
    java.lang.Throwable getHighSpeedVideoFpsRangesFor;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.PublishProcessor<T> create() {
        return new io.reactivex.processors.PublishProcessor<>();
    }

    PublishProcessor() {
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr;
        io.reactivex.processors.PublishProcessor.PublishSubscription[] publishSubscriptionArr2;
        io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription = new io.reactivex.processors.PublishProcessor.PublishSubscription<>(subscriber, this);
        subscriber.onSubscribe(publishSubscription);
        do {
            publishSubscriptionArr = this.Camera2StreamConfigurationMap.get();
            if (publishSubscriptionArr == getHighResolutionOutputSizeshNQ4ISI) {
                java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
                if (th != null) {
                    subscriber.onError(th);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new io.reactivex.processors.PublishProcessor.PublishSubscription[length + 1];
            java.lang.System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, publishSubscriptionArr, publishSubscriptionArr2));
        if (publishSubscription.get() == Long.MIN_VALUE) {
            getHighSpeedVideoSizes(publishSubscription);
        }
    }

    final void getHighSpeedVideoSizes(io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription) {
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr;
        io.reactivex.processors.PublishProcessor.PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.Camera2StreamConfigurationMap.get();
            if (publishSubscriptionArr == getHighResolutionOutputSizeshNQ4ISI || publishSubscriptionArr == getHighSpeedVideoSizes) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishSubscriptionArr[i] == publishSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr2 = getHighSpeedVideoSizes;
            } else {
                io.reactivex.processors.PublishProcessor.PublishSubscription[] publishSubscriptionArr3 = new io.reactivex.processors.PublishProcessor.PublishSubscription[length - 1];
                java.lang.System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i);
                java.lang.System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr3, i, (length - i) - 1);
                publishSubscriptionArr2 = publishSubscriptionArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.Camera2StreamConfigurationMap.get() == getHighResolutionOutputSizeshNQ4ISI) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription : this.Camera2StreamConfigurationMap.get()) {
            publishSubscription.getHighSpeedVideoSizes(t);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr = this.Camera2StreamConfigurationMap.get();
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr2 = getHighResolutionOutputSizeshNQ4ISI;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = th;
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription : this.Camera2StreamConfigurationMap.getAndSet(publishSubscriptionArr2)) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.getHighSpeedVideoSizes.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr = this.Camera2StreamConfigurationMap.get();
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr2 = getHighResolutionOutputSizeshNQ4ISI;
        if (publishSubscriptionArr != publishSubscriptionArr2) {
            for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription : this.Camera2StreamConfigurationMap.getAndSet(publishSubscriptionArr2)) {
                if (publishSubscription.get() != Long.MIN_VALUE) {
                    publishSubscription.getHighSpeedVideoSizes.onComplete();
                }
            }
        }
    }

    public final boolean offer(T t) {
        if (t == null) {
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        io.reactivex.processors.PublishProcessor.PublishSubscription<T>[] publishSubscriptionArr = this.Camera2StreamConfigurationMap.get();
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.get() == 0) {
                return false;
            }
        }
        for (io.reactivex.processors.PublishProcessor.PublishSubscription<T> publishSubscription2 : publishSubscriptionArr) {
            publishSubscription2.getHighSpeedVideoSizes(t);
        }
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.Camera2StreamConfigurationMap.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final java.lang.Throwable getThrowable() {
        if (this.Camera2StreamConfigurationMap.get() == getHighResolutionOutputSizeshNQ4ISI) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasThrowable() {
        return this.Camera2StreamConfigurationMap.get() == getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasComplete() {
        return this.Camera2StreamConfigurationMap.get() == getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == null;
    }

    static final class PublishSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3562861878281475070L;
        final io.reactivex.processors.PublishProcessor<T> getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        PublishSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.PublishProcessor<T> publishProcessor) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRanges = publishProcessor;
        }

        public final void getHighSpeedVideoSizes(T t) {
            long j = get();
            if (j == Long.MIN_VALUE) {
                return;
            }
            if (j != 0) {
                this.getHighSpeedVideoSizes.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.producedCancel(this, 1L);
            } else {
                cancel();
                this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.addCancel(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this);
            }
        }
    }
}
