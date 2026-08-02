package rx;

/* loaded from: classes18.dex */
public interface CompletableEmitter {
    void onCompleted();

    void onError(java.lang.Throwable th);

    void setCancellation(rx.functions.Cancellable cancellable);

    void setSubscription(rx.Subscription subscription);
}
