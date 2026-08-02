package io.reactivex.internal.subscriptions;

/* loaded from: classes17.dex */
public class SubscriptionArbiter extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
    private static final long serialVersionUID = -2189523197179400958L;
    org.reactivestreams.Subscription getOutputFormats;
    volatile boolean getOutputSizes;
    long getOutputStallDurationlomOqCM;
    protected boolean unbounded;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicReference<>();
    final java.util.concurrent.atomic.AtomicLong getOutputStallDuration = new java.util.concurrent.atomic.AtomicLong();
    final java.util.concurrent.atomic.AtomicLong getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();

    public final void setSubscription(org.reactivestreams.Subscription subscription) {
        if (this.getOutputSizes) {
            subscription.cancel();
            return;
        }
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(subscription, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            org.reactivestreams.Subscription subscription2 = this.getOutputFormats;
            if (subscription2 != null) {
                subscription2.cancel();
            }
            this.getOutputFormats = subscription;
            long j = this.getOutputStallDurationlomOqCM;
            if (decrementAndGet() != 0) {
                getHighSpeedVideoFpsRanges();
            }
            if (j != 0) {
                subscription.request(j);
                return;
            }
            return;
        }
        org.reactivestreams.Subscription andSet = this.getOutputMinFrameDurationlomOqCM.getAndSet(subscription);
        if (andSet != null) {
            andSet.cancel();
        }
        if (getAndIncrement() == 0) {
            getHighSpeedVideoFpsRanges();
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (!io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) || this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.getOutputStallDurationlomOqCM;
            if (j2 != Long.MAX_VALUE) {
                long addCap = io.reactivex.internal.util.BackpressureHelper.addCap(j2, j);
                this.getOutputStallDurationlomOqCM = addCap;
                if (addCap == Long.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            org.reactivestreams.Subscription subscription = this.getOutputFormats;
            if (decrementAndGet() != 0) {
                getHighSpeedVideoFpsRanges();
            }
            if (subscription != null) {
                subscription.request(j);
                return;
            }
            return;
        }
        io.reactivex.internal.util.BackpressureHelper.add(this.getOutputStallDuration, j);
        if (getAndIncrement() == 0) {
            getHighSpeedVideoFpsRanges();
        }
    }

    public final void produced(long j) {
        if (this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.getOutputStallDurationlomOqCM;
            if (j2 != Long.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.getOutputStallDurationlomOqCM = j3;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            getHighSpeedVideoFpsRanges();
            return;
        }
        io.reactivex.internal.util.BackpressureHelper.add(this.getOutputSizeshNQ4ISI, j);
        if (getAndIncrement() == 0) {
            getHighSpeedVideoFpsRanges();
        }
    }

    public void cancel() {
        if (this.getOutputSizes) {
            return;
        }
        this.getOutputSizes = true;
        if (getAndIncrement() == 0) {
            getHighSpeedVideoFpsRanges();
        }
    }

    private void getHighSpeedVideoFpsRanges() {
        int i = 1;
        long j = 0;
        org.reactivestreams.Subscription subscription = null;
        do {
            org.reactivestreams.Subscription subscription2 = this.getOutputMinFrameDurationlomOqCM.get();
            if (subscription2 != null) {
                subscription2 = this.getOutputMinFrameDurationlomOqCM.getAndSet(null);
            }
            long j2 = this.getOutputStallDuration.get();
            if (j2 != 0) {
                j2 = this.getOutputStallDuration.getAndSet(0L);
            }
            long j3 = this.getOutputSizeshNQ4ISI.get();
            if (j3 != 0) {
                j3 = this.getOutputSizeshNQ4ISI.getAndSet(0L);
            }
            org.reactivestreams.Subscription subscription3 = this.getOutputFormats;
            if (this.getOutputSizes) {
                if (subscription3 != null) {
                    subscription3.cancel();
                    this.getOutputFormats = null;
                }
                if (subscription2 != null) {
                    subscription2.cancel();
                }
            } else {
                long j4 = this.getOutputStallDurationlomOqCM;
                if (j4 != Long.MAX_VALUE) {
                    j4 = io.reactivex.internal.util.BackpressureHelper.addCap(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            io.reactivex.internal.subscriptions.SubscriptionHelper.reportMoreProduced(j4);
                            j4 = 0;
                        }
                    }
                    this.getOutputStallDurationlomOqCM = j4;
                }
                if (subscription2 != null) {
                    if (subscription3 != null) {
                        subscription3.cancel();
                    }
                    this.getOutputFormats = subscription2;
                    if (j4 != 0) {
                        j = io.reactivex.internal.util.BackpressureHelper.addCap(j, j4);
                        subscription = subscription2;
                    }
                } else if (subscription3 != null && j2 != 0) {
                    j = io.reactivex.internal.util.BackpressureHelper.addCap(j, j2);
                    subscription = subscription3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            subscription.request(j);
        }
    }

    public final boolean isUnbounded() {
        return this.unbounded;
    }

    public final boolean isCancelled() {
        return this.getOutputSizes;
    }
}
