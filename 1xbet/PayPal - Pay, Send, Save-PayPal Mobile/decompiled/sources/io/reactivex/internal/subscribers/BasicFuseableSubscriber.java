package io.reactivex.internal.subscribers;

/* loaded from: classes17.dex */
public abstract class BasicFuseableSubscriber<T, R> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.fuseable.QueueSubscription<R> {
    protected final org.reactivestreams.Subscriber<? super R> actual;
    protected boolean done;
    protected io.reactivex.internal.fuseable.QueueSubscription<T> qs;
    protected org.reactivestreams.Subscription s;
    protected int sourceMode;

    protected void afterDownstream() {
    }

    protected boolean beforeDownstream() {
        return true;
    }

    public BasicFuseableSubscriber(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.s, subscription)) {
            this.s = subscription;
            if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                this.qs = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
            }
            if (beforeDownstream()) {
                this.actual.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        if (this.done) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        } else {
            this.done = true;
            this.actual.onError(th);
        }
    }

    protected final void fail(java.lang.Throwable th) {
        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
        this.s.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.actual.onComplete();
    }

    protected final int transitiveBoundaryFusion(int i) {
        io.reactivex.internal.fuseable.QueueSubscription<T> queueSubscription = this.qs;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = queueSubscription.requestFusion(i);
        if (requestFusion != 0) {
            this.sourceMode = requestFusion;
        }
        return requestFusion;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        this.s.request(j);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.s.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.qs.isEmpty();
    }

    public void clear() {
        this.qs.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r, R r2) {
        throw new java.lang.UnsupportedOperationException("Should not be called!");
    }
}
