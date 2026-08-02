package rx.internal.producers;

/* loaded from: classes18.dex */
public final class QueuedValueProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer {
    static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final java.util.Queue<java.lang.Object> Camera2StreamConfigurationMap;
    final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;
    final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes;

    public QueuedValueProducer(rx.Subscriber<? super T> subscriber) {
        this(subscriber, rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable() ? new rx.internal.util.unsafe.SpscLinkedQueue() : new rx.internal.util.atomic.SpscLinkedAtomicQueue());
    }

    public QueuedValueProducer(rx.Subscriber<? super T> subscriber, java.util.Queue<java.lang.Object> queue) {
        this.getHighSpeedVideoFpsRanges = subscriber;
        this.Camera2StreamConfigurationMap = queue;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger();
    }

    @Override // rx.Producer
    public final void request(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required");
        }
        if (j > 0) {
            rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
            getHighSpeedVideoFpsRangesFor();
        }
    }

    public final boolean offer(T t) {
        if (t == null) {
            if (!this.Camera2StreamConfigurationMap.offer(getHighResolutionOutputSizeshNQ4ISI)) {
                return false;
            }
        } else if (!this.Camera2StreamConfigurationMap.offer(t)) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor();
        return true;
    }

    private void getHighSpeedVideoFpsRangesFor() {
        java.lang.Object poll;
        if (this.getHighSpeedVideoSizes.getAndIncrement() == 0) {
            rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRanges;
            java.util.Queue<java.lang.Object> queue = this.Camera2StreamConfigurationMap;
            while (!subscriber.isUnsubscribed()) {
                this.getHighSpeedVideoSizes.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0 && (poll = queue.poll()) != null) {
                    try {
                        if (poll == getHighResolutionOutputSizeshNQ4ISI) {
                            subscriber.onNext(null);
                        } else {
                            subscriber.onNext(poll);
                        }
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        j--;
                        j2++;
                    } catch (java.lang.Throwable th) {
                        if (poll == getHighResolutionOutputSizeshNQ4ISI) {
                            poll = null;
                        }
                        rx.exceptions.Exceptions.throwOrReport(th, subscriber, poll);
                        return;
                    }
                }
                if (j2 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j2);
                }
                if (this.getHighSpeedVideoSizes.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
