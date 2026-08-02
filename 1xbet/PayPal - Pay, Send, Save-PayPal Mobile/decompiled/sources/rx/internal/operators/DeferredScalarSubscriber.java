package rx.internal.operators;

/* loaded from: classes18.dex */
public abstract class DeferredScalarSubscriber<T, R> extends rx.Subscriber<T> {
    protected final rx.Subscriber<? super R> actual;
    final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
    protected boolean hasValue;
    protected R value;

    public DeferredScalarSubscriber(rx.Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    @Override // rx.Observer
    public void onError(java.lang.Throwable th) {
        this.value = null;
        this.actual.onError(th);
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            complete();
        }
    }

    protected final void complete() {
        this.actual.onCompleted();
    }

    protected final void complete(R r) {
        rx.Subscriber<? super R> subscriber = this.actual;
        do {
            int i = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (i == 2 || i == 3 || subscriber.isUnsubscribed()) {
                return;
            }
            if (i == 1) {
                subscriber.onNext(r);
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onCompleted();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.lazySet(3);
                return;
            }
            this.value = r;
        } while (!this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(0, 2));
    }

    final void getHighSpeedVideoSizes(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
        }
        if (j != 0) {
            rx.Subscriber<? super R> subscriber = this.actual;
            do {
                int i = this.getHighResolutionOutputSizeshNQ4ISI.get();
                if (i == 1 || i == 3 || subscriber.isUnsubscribed()) {
                    return;
                }
                if (i == 2) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(2, 3)) {
                        subscriber.onNext(this.value);
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onCompleted();
                        return;
                    }
                    return;
                }
            } while (!this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(0, 1));
        }
    }

    @Override // rx.Subscriber, rx.observers.AssertableSubscriber
    public final void setProducer(rx.Producer producer) {
        producer.request(Long.MAX_VALUE);
    }

    static final class InnerProducer implements rx.Producer {
        final rx.internal.operators.DeferredScalarSubscriber<?, ?> getHighSpeedVideoSizes;

        public InnerProducer(rx.internal.operators.DeferredScalarSubscriber<?, ?> deferredScalarSubscriber) {
            this.getHighSpeedVideoSizes = deferredScalarSubscriber;
        }

        @Override // rx.Producer
        public final void request(long j) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(j);
        }
    }

    public final void subscribeTo(rx.Observable<? extends T> observable) {
        rx.Subscriber<? super R> subscriber = this.actual;
        subscriber.add(this);
        subscriber.setProducer(new rx.internal.operators.DeferredScalarSubscriber.InnerProducer(this));
        observable.unsafeSubscribe(this);
    }
}
