package io.reactivex.internal.subscribers;

/* loaded from: classes17.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    private static final long serialVersionUID = 7917814472626990048L;
    protected final org.reactivestreams.Subscriber<? super R> actual;
    protected long produced;
    protected org.reactivestreams.Subscription s;
    protected R value;

    protected void onDrop(R r) {
    }

    public SinglePostCompleteSubscriber(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.s, subscription)) {
            this.s = subscription;
            this.actual.onSubscribe(this);
        }
    }

    protected final void complete(R r) {
        long j = this.produced;
        if (j != 0) {
            io.reactivex.internal.util.BackpressureHelper.produced(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                onDrop(r);
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(androidx.media3.common.C.TIME_UNSET);
                this.actual.onNext(r);
                this.actual.onComplete();
                return;
            } else {
                this.value = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        long j2;
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, androidx.media3.common.C.TIME_UNSET)) {
                        this.actual.onNext(this.value);
                        this.actual.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, io.reactivex.internal.util.BackpressureHelper.addCap(j2, j)));
            this.s.request(j);
        }
    }

    public void cancel() {
        this.s.cancel();
    }
}
