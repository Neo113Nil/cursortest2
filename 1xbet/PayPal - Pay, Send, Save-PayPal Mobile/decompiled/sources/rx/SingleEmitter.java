package rx;

/* loaded from: classes18.dex */
public interface SingleEmitter<T> {
    void onError(java.lang.Throwable th);

    void onSuccess(T t);

    void setCancellation(rx.functions.Cancellable cancellable);

    void setSubscription(rx.Subscription subscription);
}
