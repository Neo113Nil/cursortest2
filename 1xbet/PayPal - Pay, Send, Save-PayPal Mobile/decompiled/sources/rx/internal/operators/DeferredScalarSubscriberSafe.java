package rx.internal.operators;

/* loaded from: classes18.dex */
public abstract class DeferredScalarSubscriberSafe<T, R> extends rx.internal.operators.DeferredScalarSubscriber<T, R> {
    protected boolean done;

    public DeferredScalarSubscriberSafe(rx.Subscriber<? super R> subscriber) {
        super(subscriber);
    }

    @Override // rx.internal.operators.DeferredScalarSubscriber, rx.Observer
    public void onError(java.lang.Throwable th) {
        if (!this.done) {
            this.done = true;
            super.onError(th);
        } else {
            rx.plugins.RxJavaHooks.onError(th);
        }
    }

    @Override // rx.internal.operators.DeferredScalarSubscriber, rx.Observer
    public void onCompleted() {
        if (this.done) {
            return;
        }
        this.done = true;
        super.onCompleted();
    }
}
