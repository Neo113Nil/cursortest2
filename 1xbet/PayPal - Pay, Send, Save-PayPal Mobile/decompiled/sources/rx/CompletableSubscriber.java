package rx;

/* loaded from: classes18.dex */
public interface CompletableSubscriber {
    void onCompleted();

    void onError(java.lang.Throwable th);

    void onSubscribe(rx.Subscription subscription);
}
