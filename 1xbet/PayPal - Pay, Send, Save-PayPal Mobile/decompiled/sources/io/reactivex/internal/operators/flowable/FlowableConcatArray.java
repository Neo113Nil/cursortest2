package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableConcatArray<T> extends io.reactivex.Flowable<T> {
    final boolean Camera2StreamConfigurationMap;
    final org.reactivestreams.Publisher<? extends T>[] getHighResolutionOutputSizeshNQ4ISI;

    public FlowableConcatArray(org.reactivestreams.Publisher<? extends T>[] publisherArr, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = publisherArr;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableConcatArray.ConcatArraySubscriber concatArraySubscriber = new io.reactivex.internal.operators.flowable.FlowableConcatArray.ConcatArraySubscriber(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, subscriber);
        subscriber.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }

    /* loaded from: classes17.dex */
    static final class ConcatArraySubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        long Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        java.util.List<java.lang.Throwable> getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final org.reactivestreams.Publisher<? extends T>[] getInputFormats;
        final java.util.concurrent.atomic.AtomicInteger getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();

        ConcatArraySubscriber(org.reactivestreams.Publisher<? extends T>[] publisherArr, boolean z, org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getInputFormats = publisherArr;
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap++;
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                java.util.List list = this.getHighSpeedVideoFpsRanges;
                if (list == null) {
                    list = new java.util.ArrayList((this.getInputFormats.length - this.getHighResolutionOutputSizeshNQ4ISI) + 1);
                    this.getHighSpeedVideoFpsRanges = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getInputSizeshNQ4ISI.getAndIncrement() == 0) {
                org.reactivestreams.Publisher<? extends T>[] publisherArr = this.getInputFormats;
                int length = publisherArr.length;
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                while (i != length) {
                    org.reactivestreams.Publisher<? extends T> publisher = publisherArr[i];
                    if (publisher == null) {
                        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("A Publisher entry is null");
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            java.util.List list = this.getHighSpeedVideoFpsRanges;
                            if (list == null) {
                                list = new java.util.ArrayList((length - i) + 1);
                                this.getHighSpeedVideoFpsRanges = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.getHighSpeedVideoSizes.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j = this.Camera2StreamConfigurationMap;
                        if (j != 0) {
                            this.Camera2StreamConfigurationMap = 0L;
                            produced(j);
                        }
                        publisher.subscribe(this);
                        i++;
                        this.getHighResolutionOutputSizeshNQ4ISI = i;
                        if (this.getInputSizeshNQ4ISI.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                java.util.List<java.lang.Throwable> list2 = this.getHighSpeedVideoFpsRanges;
                if (list2 != null) {
                    if (list2.size() == 1) {
                        this.getHighSpeedVideoSizes.onError(list2.get(0));
                        return;
                    } else {
                        this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.CompositeException(list2));
                        return;
                    }
                }
                this.getHighSpeedVideoSizes.onComplete();
            }
        }
    }
}
