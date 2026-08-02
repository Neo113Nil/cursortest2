package rx.internal.producers;

/* loaded from: classes18.dex */
public final class SingleProducer<T> extends java.util.concurrent.atomic.AtomicBoolean implements rx.Producer {
    private static final long serialVersionUID = -3353584923995471404L;
    final T getHighSpeedVideoFpsRanges;
    final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

    public SingleProducer(rx.Subscriber<? super T> subscriber, T t) {
        this.getHighSpeedVideoFpsRangesFor = subscriber;
        this.getHighSpeedVideoFpsRanges = t;
    }

    @Override // rx.Producer
    public final void request(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required");
        }
        if (j == 0 || !compareAndSet(false, true)) {
            return;
        }
        rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
        if (subscriber.isUnsubscribed()) {
            return;
        }
        T t = this.getHighSpeedVideoFpsRanges;
        try {
            subscriber.onNext(t);
            if (subscriber.isUnsubscribed()) {
                return;
            }
            subscriber.onCompleted();
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
        }
    }
}
