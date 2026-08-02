package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public final class FutureSubscriber<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.FlowableSubscriber<T>, java.util.concurrent.Future<T>, org.reactivestreams.Subscription {
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> Camera2StreamConfigurationMap;
    java.lang.Throwable getHighSpeedVideoFpsRangesFor;
    T getHighSpeedVideoSizes;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }

    public FutureSubscriber() {
        super(1);
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        org.reactivestreams.Subscription subscription;
        do {
            subscription = this.Camera2StreamConfigurationMap.get();
            if (subscription == this || subscription == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                return false;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, subscription, io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED));
        if (subscription != null) {
            subscription.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(this.Camera2StreamConfigurationMap.get());
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        if (getCount() != 0) {
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new java.util.concurrent.CancellationException();
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.util.concurrent.Future
    public final T get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new java.util.concurrent.TimeoutException();
            }
        }
        if (isCancelled()) {
            throw new java.util.concurrent.CancellationException();
        }
        java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
        if (th != null) {
            throw new java.util.concurrent.ExecutionException(th);
        }
        return this.getHighSpeedVideoSizes;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.Camera2StreamConfigurationMap, subscription, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        if (this.getHighSpeedVideoSizes != null) {
            this.Camera2StreamConfigurationMap.get().cancel();
            onError(new java.lang.IndexOutOfBoundsException("More than one element received"));
        } else {
            this.getHighSpeedVideoSizes = t;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        org.reactivestreams.Subscription subscription;
        do {
            subscription = this.Camera2StreamConfigurationMap.get();
            if (subscription == this || subscription == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = th;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, subscription, this));
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        org.reactivestreams.Subscription subscription;
        if (this.getHighSpeedVideoSizes == null) {
            onError(new java.util.NoSuchElementException("The source is empty"));
            return;
        }
        do {
            subscription = this.Camera2StreamConfigurationMap.get();
            if (subscription == this || subscription == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, subscription, this));
        countDown();
    }
}
