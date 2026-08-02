package io.reactivex.processors;

/* loaded from: classes17.dex */
final class SerializedProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final io.reactivex.processors.FlowableProcessor<T> Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> getHighSpeedVideoFpsRangesFor;
    volatile boolean getHighSpeedVideoSizes;

    SerializedProcessor(io.reactivex.processors.FlowableProcessor<T> flowableProcessor) {
        this.Camera2StreamConfigurationMap = flowableProcessor;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.Camera2StreamConfigurationMap.subscribe(subscriber);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (!this.getHighSpeedVideoSizes) {
            synchronized (this) {
                boolean z = true;
                if (!this.getHighSpeedVideoSizes) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI) {
                        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoFpsRangesFor;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                            this.getHighSpeedVideoFpsRangesFor = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.subscription(subscription));
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    z = false;
                }
                if (!z) {
                    this.Camera2StreamConfigurationMap.onSubscribe(subscription);
                    getHighSpeedVideoFpsRanges();
                    return;
                }
            }
        }
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoFpsRangesFor;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.getHighSpeedVideoFpsRangesFor = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.next(t));
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.Camera2StreamConfigurationMap.onNext(t);
            getHighSpeedVideoFpsRanges();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        if (this.getHighSpeedVideoSizes) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoSizes = true;
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoFpsRangesFor;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                        this.getHighSpeedVideoFpsRangesFor = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.setFirst(io.reactivex.internal.util.NotificationLite.error(th));
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                z = false;
            }
            if (z) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoFpsRangesFor;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.getHighSpeedVideoFpsRangesFor = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.complete());
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.getHighSpeedVideoFpsRangesFor;
                if (appendOnlyLinkedArrayList == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = false;
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = null;
            }
            appendOnlyLinkedArrayList.accept(this.Camera2StreamConfigurationMap);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.Camera2StreamConfigurationMap.hasSubscribers();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasThrowable() {
        return this.Camera2StreamConfigurationMap.hasThrowable();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final java.lang.Throwable getThrowable() {
        return this.Camera2StreamConfigurationMap.getThrowable();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasComplete() {
        return this.Camera2StreamConfigurationMap.hasComplete();
    }
}
