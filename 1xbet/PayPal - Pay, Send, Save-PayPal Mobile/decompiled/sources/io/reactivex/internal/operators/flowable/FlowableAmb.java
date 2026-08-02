package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableAmb<T> extends io.reactivex.Flowable<T> {
    final org.reactivestreams.Publisher<? extends T>[] getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> getHighSpeedVideoFpsRangesFor;

    public FlowableAmb(org.reactivestreams.Publisher<? extends T>[] publisherArr, java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> iterable) {
        this.getHighResolutionOutputSizeshNQ4ISI = publisherArr;
        this.getHighSpeedVideoFpsRangesFor = iterable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        int length;
        org.reactivestreams.Publisher<? extends T>[] publisherArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (publisherArr == null) {
            publisherArr = new org.reactivestreams.Publisher[8];
            try {
                length = 0;
                for (org.reactivestreams.Publisher<? extends T> publisher : this.getHighSpeedVideoFpsRangesFor) {
                    if (publisher == null) {
                        io.reactivex.internal.subscriptions.EmptySubscription.error(new java.lang.NullPointerException("One of the sources is null"), subscriber);
                        return;
                    }
                    if (length == publisherArr.length) {
                        org.reactivestreams.Publisher<? extends T>[] publisherArr2 = new org.reactivestreams.Publisher[(length >> 2) + length];
                        java.lang.System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                        publisherArr = publisherArr2;
                    }
                    publisherArr[length] = publisher;
                    length++;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                return;
            }
        } else {
            length = publisherArr.length;
        }
        if (length == 0) {
            io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
            return;
        }
        if (length == 1) {
            publisherArr[0].subscribe(subscriber);
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableAmb.AmbCoordinator ambCoordinator = new io.reactivex.internal.operators.flowable.FlowableAmb.AmbCoordinator(subscriber, length);
        io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber<T>[] ambInnerSubscriberArr = ambCoordinator.Camera2StreamConfigurationMap;
        int length2 = ambInnerSubscriberArr.length;
        int i = 0;
        while (i < length2) {
            int i2 = i + 1;
            ambInnerSubscriberArr[i] = new io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber<>(ambCoordinator, i2, ambCoordinator.getHighSpeedVideoFpsRanges);
            i = i2;
        }
        ambCoordinator.getHighResolutionOutputSizeshNQ4ISI.lazySet(0);
        ambCoordinator.getHighSpeedVideoFpsRanges.onSubscribe(ambCoordinator);
        for (int i3 = 0; i3 < length2 && ambCoordinator.getHighResolutionOutputSizeshNQ4ISI.get() == 0; i3++) {
            publisherArr[i3].subscribe(ambInnerSubscriberArr[i3]);
        }
    }

    /* loaded from: classes17.dex */
    static final class AmbCoordinator<T> implements org.reactivestreams.Subscription {
        final io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber<T>[] Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;

        AmbCoordinator(org.reactivestreams.Subscriber<? super T> subscriber, int i) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber[i];
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                int i = this.getHighResolutionOutputSizeshNQ4ISI.get();
                if (i > 0) {
                    this.Camera2StreamConfigurationMap[i - 1].request(j);
                    return;
                }
                if (i == 0) {
                    for (io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber<T> ambInnerSubscriber : this.Camera2StreamConfigurationMap) {
                        ambInnerSubscriber.request(j);
                    }
                }
            }
        }

        public final boolean getHighSpeedVideoSizes(int i) {
            int i2 = 0;
            if (this.getHighResolutionOutputSizeshNQ4ISI.get() != 0 || !this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(0, i)) {
                return false;
            }
            io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.Camera2StreamConfigurationMap;
            int length = ambInnerSubscriberArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    ambInnerSubscriberArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.get() != -1) {
                this.getHighResolutionOutputSizeshNQ4ISI.lazySet(-1);
                for (io.reactivex.internal.operators.flowable.FlowableAmb.AmbInnerSubscriber<T> ambInnerSubscriber : this.Camera2StreamConfigurationMap) {
                    ambInnerSubscriber.cancel();
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class AmbInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -1185974347409665484L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.operators.flowable.FlowableAmb.AmbCoordinator<T> getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        AmbInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableAmb.AmbCoordinator<T> ambCoordinator, int i, org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRanges = ambCoordinator;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this, this.getHighResolutionOutputSizeshNQ4ISI, subscription);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this, this.getHighResolutionOutputSizeshNQ4ISI, j);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                this.Camera2StreamConfigurationMap.onNext(t);
            } else if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor)) {
                this.getHighSpeedVideoSizes = true;
                this.Camera2StreamConfigurationMap.onNext(t);
            } else {
                get().cancel();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                this.Camera2StreamConfigurationMap.onError(th);
            } else if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor)) {
                this.getHighSpeedVideoSizes = true;
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                get().cancel();
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                this.Camera2StreamConfigurationMap.onComplete();
            } else if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor)) {
                this.getHighSpeedVideoSizes = true;
                this.Camera2StreamConfigurationMap.onComplete();
            } else {
                get().cancel();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }
    }
}
