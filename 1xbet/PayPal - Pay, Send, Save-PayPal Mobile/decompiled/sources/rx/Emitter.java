package rx;

/* loaded from: classes18.dex */
public interface Emitter<T> extends rx.Observer<T> {

    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    long requested();

    void setCancellation(rx.functions.Cancellable cancellable);

    void setSubscription(rx.Subscription subscription);
}
