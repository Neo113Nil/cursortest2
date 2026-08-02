package io.reactivex.internal.observers;

/* loaded from: classes17.dex */
public final class SubscriberCompletableObserver<T> implements io.reactivex.CompletableObserver, org.reactivestreams.Subscription {
    final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
    io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }

    public SubscriberCompletableObserver(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.Camera2StreamConfigurationMap = subscriber;
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        this.Camera2StreamConfigurationMap.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap.onError(th);
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
            this.getHighSpeedVideoFpsRangesFor = disposable;
            this.Camera2StreamConfigurationMap.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.getHighSpeedVideoFpsRangesFor.dispose();
    }
}
