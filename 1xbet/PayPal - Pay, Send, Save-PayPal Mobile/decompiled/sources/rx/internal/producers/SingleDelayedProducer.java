package rx.internal.producers;

/* loaded from: classes18.dex */
public final class SingleDelayedProducer<T> extends java.util.concurrent.atomic.AtomicInteger implements rx.Producer {
    private static final long serialVersionUID = -2873467947112093874L;
    T Camera2StreamConfigurationMap;
    final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;

    public SingleDelayedProducer(rx.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRanges = subscriber;
    }

    @Override // rx.Producer
    public final void request(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required");
        }
        if (j != 0) {
            do {
                int i = get();
                if (i != 0) {
                    if (i == 1 && compareAndSet(1, 3)) {
                        rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRanges;
                        T t = this.Camera2StreamConfigurationMap;
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        try {
                            subscriber.onNext(t);
                            if (subscriber.isUnsubscribed()) {
                                return;
                            }
                            subscriber.onCompleted();
                            return;
                        } catch (java.lang.Throwable th) {
                            rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
                            return;
                        }
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void setValue(T t) {
        do {
            int i = get();
            if (i == 0) {
                this.Camera2StreamConfigurationMap = t;
            } else {
                if (i == 2 && compareAndSet(2, 3)) {
                    rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRanges;
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    try {
                        subscriber.onNext(t);
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onCompleted();
                        return;
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
                        return;
                    }
                }
                return;
            }
        } while (!compareAndSet(0, 1));
    }
}
