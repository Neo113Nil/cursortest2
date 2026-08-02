package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public final class BlockingFirstSubscriber<T> extends io.reactivex.internal.subscribers.BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = t;
            this.getHighSpeedVideoFpsRanges.cancel();
            countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = th;
        } else {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
        countDown();
    }
}
