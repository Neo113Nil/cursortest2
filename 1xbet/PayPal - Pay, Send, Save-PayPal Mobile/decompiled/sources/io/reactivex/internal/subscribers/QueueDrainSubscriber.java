package io.reactivex.internal.subscribers;

/* loaded from: classes17.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends io.reactivex.internal.subscribers.QueueDrainSubscriberPad4 implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.util.QueueDrain<U, V> {
    protected final org.reactivestreams.Subscriber<? super V> actual;
    public volatile boolean cancelled;
    protected volatile boolean done;
    protected java.lang.Throwable error;
    public final io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;

    public boolean accept(org.reactivestreams.Subscriber<? super V> subscriber, U u) {
        return false;
    }

    public QueueDrainSubscriber(org.reactivestreams.Subscriber<? super V> subscriber, io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue) {
        this.actual = subscriber;
        this.queue = simplePlainQueue;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean enter() {
        return this.unwrapAs.getAndIncrement() == 0;
    }

    public final boolean fastEnter() {
        return this.unwrapAs.get() == 0 && this.unwrapAs.compareAndSet(0, 1);
    }

    protected final void fastPathEmitMax(U u, boolean z, io.reactivex.disposables.Disposable disposable) {
        org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
        io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j = this.getOutputSizeshNQ4ISI.get();
            if (j != 0) {
                if (accept(subscriber, u) && j != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                disposable.dispose();
                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            simplePlainQueue.offer(u);
            if (!enter()) {
                return;
            }
        }
        io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(simplePlainQueue, subscriber, z, disposable, this);
    }

    public final void fastPathOrderedEmitMax(U u, boolean z, io.reactivex.disposables.Disposable disposable) {
        org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
        io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j = this.getOutputSizeshNQ4ISI.get();
            if (j != 0) {
                if (simplePlainQueue.isEmpty()) {
                    if (accept(subscriber, u) && j != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    simplePlainQueue.offer(u);
                }
            } else {
                this.cancelled = true;
                disposable.dispose();
                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            simplePlainQueue.offer(u);
            if (!enter()) {
                return;
            }
        }
        io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(simplePlainQueue, subscriber, z, disposable, this);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final java.lang.Throwable error() {
        return this.error;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int i) {
        return this.unwrapAs.addAndGet(i);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
        return this.getOutputSizeshNQ4ISI.get();
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long j) {
        return this.getOutputSizeshNQ4ISI.addAndGet(-j);
    }

    public final void requested(long j) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getOutputSizeshNQ4ISI, j);
        }
    }
}
