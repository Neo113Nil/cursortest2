package rx.internal.producers;

/* loaded from: classes18.dex */
public final class QueuedProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer, rx.Observer<T> {
    static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.Queue<java.lang.Object> getHighSpeedVideoFpsRanges;
    volatile boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Throwable getHighSpeedVideoSizes;
    final java.util.concurrent.atomic.AtomicInteger getOutputFormats;

    public QueuedProducer(rx.Subscriber<? super T> subscriber) {
        this(subscriber, rx.internal.util.unsafe.UnsafeAccess.isUnsafeAvailable() ? new rx.internal.util.unsafe.SpscLinkedQueue() : new rx.internal.util.atomic.SpscLinkedAtomicQueue());
    }

    public QueuedProducer(rx.Subscriber<? super T> subscriber, java.util.Queue<java.lang.Object> queue) {
        this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        this.getHighSpeedVideoFpsRanges = queue;
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicInteger();
    }

    @Override // rx.Producer
    public final void request(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required");
        }
        if (j > 0) {
            rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j);
            Camera2StreamConfigurationMap();
        }
    }

    public final boolean offer(T t) {
        if (t == null) {
            if (!this.getHighSpeedVideoFpsRanges.offer(Camera2StreamConfigurationMap)) {
                return false;
            }
        } else if (!this.getHighSpeedVideoFpsRanges.offer(t)) {
            return false;
        }
        Camera2StreamConfigurationMap();
        return true;
    }

    @Override // rx.Observer
    public final void onNext(T t) {
        if (offer(t)) {
            return;
        }
        onError(new rx.exceptions.MissingBackpressureException());
    }

    @Override // rx.Observer
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoSizes = th;
        this.getHighSpeedVideoFpsRangesFor = true;
        Camera2StreamConfigurationMap();
    }

    @Override // rx.Observer
    public final void onCompleted() {
        this.getHighSpeedVideoFpsRangesFor = true;
        Camera2StreamConfigurationMap();
    }

    private boolean getHighSpeedVideoFpsRangesFor(boolean z, boolean z2) {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed()) {
            return true;
        }
        if (!z) {
            return false;
        }
        java.lang.Throwable th = this.getHighSpeedVideoSizes;
        if (th != null) {
            this.getHighSpeedVideoFpsRanges.clear();
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
        return true;
    }

    private void Camera2StreamConfigurationMap() {
        if (this.getOutputFormats.getAndIncrement() == 0) {
            rx.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.Queue<java.lang.Object> queue = this.getHighSpeedVideoFpsRanges;
            while (!getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, queue.isEmpty())) {
                this.getOutputFormats.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0) {
                    boolean z = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object poll = queue.poll();
                    if (!getHighSpeedVideoFpsRangesFor(z, poll == null)) {
                        if (poll == null) {
                            break;
                        }
                        try {
                            if (poll == Camera2StreamConfigurationMap) {
                                subscriber.onNext(null);
                            } else {
                                subscriber.onNext(poll);
                            }
                            j--;
                            j2++;
                        } catch (java.lang.Throwable th) {
                            if (poll == Camera2StreamConfigurationMap) {
                                poll = null;
                            }
                            rx.exceptions.Exceptions.throwOrReport(th, subscriber, poll);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (j2 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j2);
                }
                if (this.getOutputFormats.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
