package io.reactivex.internal.util;

/* loaded from: classes17.dex */
public enum EmptyComponent implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.Observer<java.lang.Object>, io.reactivex.MaybeObserver<java.lang.Object>, io.reactivex.SingleObserver<java.lang.Object>, io.reactivex.CompletableObserver, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
    INSTANCE;

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(java.lang.Object obj) {
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(java.lang.Object obj) {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }

    public static <T> org.reactivestreams.Subscriber<T> asSubscriber() {
        return INSTANCE;
    }

    public static <T> io.reactivex.Observer<T> asObserver() {
        return INSTANCE;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        subscription.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }
}
