package io.reactivex.subscribers;

/* loaded from: classes17.dex */
public final class SerializedSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> Camera2StreamConfigurationMap;
    volatile boolean getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
    org.reactivestreams.Subscription getHighSpeedVideoSizesFor;

    public SerializedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
        this(subscriber, false);
    }

    public SerializedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, boolean z) {
        this.getHighSpeedVideoSizes = subscriber;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
            this.getHighSpeedVideoSizesFor = subscription;
            this.getHighSpeedVideoSizes.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (t == null) {
            this.getHighSpeedVideoSizesFor.cancel();
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList2 = this.Camera2StreamConfigurationMap;
                if (appendOnlyLinkedArrayList2 == null) {
                    appendOnlyLinkedArrayList2 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.Camera2StreamConfigurationMap = appendOnlyLinkedArrayList2;
                }
                appendOnlyLinkedArrayList2.add(io.reactivex.internal.util.NotificationLite.next(t));
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizes.onNext(t);
            do {
                synchronized (this) {
                    appendOnlyLinkedArrayList = this.Camera2StreamConfigurationMap;
                    if (appendOnlyLinkedArrayList == null) {
                        this.getHighSpeedVideoFpsRanges = false;
                        return;
                    }
                    this.Camera2StreamConfigurationMap = null;
                }
            } while (!appendOnlyLinkedArrayList.accept(this.getHighSpeedVideoSizes));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRanges) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.Camera2StreamConfigurationMap;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                        this.Camera2StreamConfigurationMap = appendOnlyLinkedArrayList;
                    }
                    java.lang.Object error = io.reactivex.internal.util.NotificationLite.error(th);
                    if (this.getHighSpeedVideoFpsRangesFor) {
                        appendOnlyLinkedArrayList.add(error);
                    } else {
                        appendOnlyLinkedArrayList.setFirst(error);
                    }
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRanges = true;
                z = false;
            }
            if (z) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.Camera2StreamConfigurationMap;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.Camera2StreamConfigurationMap = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.complete());
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizes.onComplete();
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        this.getHighSpeedVideoSizesFor.request(j);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.getHighSpeedVideoSizesFor.cancel();
    }
}
