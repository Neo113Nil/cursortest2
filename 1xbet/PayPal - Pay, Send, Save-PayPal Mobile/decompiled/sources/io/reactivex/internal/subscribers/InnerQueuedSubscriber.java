package io.reactivex.internal.subscribers;

/* loaded from: classes17.dex */
public final class InnerQueuedSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    private static final long serialVersionUID = 22876611072430776L;
    final int Camera2StreamConfigurationMap;
    final io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> getHighResolutionOutputSizeshNQ4ISI;
    volatile boolean getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    volatile io.reactivex.internal.fuseable.SimpleQueue<T> getHighSpeedVideoSizesFor;
    long getInputSizeshNQ4ISI;

    public InnerQueuedSubscriber(io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = innerQueuedSubscriberSupport;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i - (i >> 2);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
            if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.getHighSpeedVideoSizes = requestFusion;
                    this.getHighSpeedVideoSizesFor = queueSubscription;
                    this.getHighSpeedVideoFpsRanges = true;
                    this.getHighResolutionOutputSizeshNQ4ISI.innerComplete(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.getHighSpeedVideoSizes = requestFusion;
                    this.getHighSpeedVideoSizesFor = queueSubscription;
                    io.reactivex.internal.util.QueueDrainHelper.request(subscription, this.Camera2StreamConfigurationMap);
                    return;
                }
            }
            this.getHighSpeedVideoSizesFor = io.reactivex.internal.util.QueueDrainHelper.createQueue(this.Camera2StreamConfigurationMap);
            io.reactivex.internal.util.QueueDrainHelper.request(subscription, this.Camera2StreamConfigurationMap);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        if (this.getHighSpeedVideoSizes == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.innerNext(this, t);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.drain();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        this.getHighResolutionOutputSizeshNQ4ISI.innerError(this, th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.getHighResolutionOutputSizeshNQ4ISI.innerComplete(this);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (this.getHighSpeedVideoSizes != 1) {
            long j2 = this.getInputSizeshNQ4ISI + j;
            if (j2 >= this.getHighSpeedVideoFpsRangesFor) {
                this.getInputSizeshNQ4ISI = 0L;
                get().request(j2);
            } else {
                this.getInputSizeshNQ4ISI = j2;
            }
        }
    }

    public final void requestOne() {
        if (this.getHighSpeedVideoSizes != 1) {
            long j = this.getInputSizeshNQ4ISI + 1;
            if (j == this.getHighSpeedVideoFpsRangesFor) {
                this.getInputSizeshNQ4ISI = 0L;
                get().request(j);
            } else {
                this.getInputSizeshNQ4ISI = j;
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
    }

    public final boolean isDone() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setDone() {
        this.getHighSpeedVideoFpsRanges = true;
    }

    public final io.reactivex.internal.fuseable.SimpleQueue<T> queue() {
        return this.getHighSpeedVideoSizesFor;
    }
}
