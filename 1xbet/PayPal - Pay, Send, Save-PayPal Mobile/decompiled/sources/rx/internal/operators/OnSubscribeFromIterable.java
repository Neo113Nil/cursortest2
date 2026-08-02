package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeFromIterable<T> implements rx.Observable.OnSubscribe<T> {
    final java.lang.Iterable<? extends T> getHighSpeedVideoFpsRangesFor;

    public OnSubscribeFromIterable(java.lang.Iterable<? extends T> iterable) {
        if (iterable == null) {
            throw new java.lang.NullPointerException("iterable must not be null");
        }
        this.getHighSpeedVideoFpsRangesFor = iterable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        try {
            java.util.Iterator<? extends T> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            boolean hasNext = it.hasNext();
            if (subscriber.isUnsubscribed()) {
                return;
            }
            if (!hasNext) {
                subscriber.onCompleted();
            } else {
                subscriber.setProducer(new rx.internal.operators.OnSubscribeFromIterable.IterableProducer(subscriber, it));
            }
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber);
        }
    }

    static final class IterableProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer {
        private static final long serialVersionUID = -8730475647105475802L;
        private final java.util.Iterator<? extends T> getHighSpeedVideoFpsRanges;
        private final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

        IterableProducer(rx.Subscriber<? super T> subscriber, java.util.Iterator<? extends T> it) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoFpsRanges = it;
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
        
            r9 = rx.internal.operators.BackpressureUtils.produced(r8, r2);
         */
        @Override // rx.Producer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void request(long j) {
            if (get() != Long.MAX_VALUE) {
                if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                    rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
                    java.util.Iterator<? extends T> it = this.getHighSpeedVideoFpsRanges;
                    while (!subscriber.isUnsubscribed()) {
                        try {
                            subscriber.onNext(it.next());
                            if (subscriber.isUnsubscribed()) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (subscriber.isUnsubscribed()) {
                                        return;
                                    }
                                    subscriber.onCompleted();
                                    return;
                                }
                            } catch (java.lang.Throwable th) {
                                rx.exceptions.Exceptions.throwOrReport(th, subscriber);
                                return;
                            }
                        } catch (java.lang.Throwable th2) {
                            rx.exceptions.Exceptions.throwOrReport(th2, subscriber);
                            return;
                        }
                    }
                    return;
                }
                if (j <= 0 || rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j) != 0) {
                    return;
                }
                rx.Subscriber<? super T> subscriber2 = this.getHighSpeedVideoFpsRangesFor;
                java.util.Iterator<? extends T> it2 = this.getHighSpeedVideoFpsRanges;
                do {
                    long j2 = 0;
                    while (true) {
                        if (j2 != j) {
                            if (subscriber2.isUnsubscribed()) {
                                return;
                            }
                            try {
                                subscriber2.onNext(it2.next());
                                if (subscriber2.isUnsubscribed()) {
                                    return;
                                }
                                try {
                                    if (!it2.hasNext()) {
                                        if (subscriber2.isUnsubscribed()) {
                                            return;
                                        }
                                        subscriber2.onCompleted();
                                        return;
                                    }
                                    j2++;
                                } catch (java.lang.Throwable th3) {
                                    rx.exceptions.Exceptions.throwOrReport(th3, subscriber2);
                                    return;
                                }
                            } catch (java.lang.Throwable th4) {
                                rx.exceptions.Exceptions.throwOrReport(th4, subscriber2);
                                return;
                            }
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    }
                } while (j != 0);
            }
        }
    }
}
