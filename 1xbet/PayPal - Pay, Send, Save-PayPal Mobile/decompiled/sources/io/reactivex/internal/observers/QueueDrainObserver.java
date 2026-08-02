package io.reactivex.internal.observers;

/* loaded from: classes17.dex */
public abstract class QueueDrainObserver<T, U, V> extends io.reactivex.internal.observers.QueueDrainSubscriberPad2 implements io.reactivex.Observer<T>, io.reactivex.internal.util.ObservableQueueDrain<U, V> {
    protected final io.reactivex.Observer<? super V> actual;
    public volatile boolean cancelled;
    protected volatile boolean done;
    protected java.lang.Throwable error;
    public final io.reactivex.internal.fuseable.SimplePlainQueue<U> queue;

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public void accept(io.reactivex.Observer<? super V> observer, U u) {
    }

    public QueueDrainObserver(io.reactivex.Observer<? super V> observer, io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue) {
        this.actual = observer;
        this.queue = simplePlainQueue;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final boolean enter() {
        return this.getHighSpeedVideoSizes.getAndIncrement() == 0;
    }

    public final boolean fastEnter() {
        return this.getHighSpeedVideoSizes.get() == 0 && this.getHighSpeedVideoSizes.compareAndSet(0, 1);
    }

    protected final void fastPathEmit(U u, boolean z, io.reactivex.disposables.Disposable disposable) {
        io.reactivex.Observer<? super V> observer = this.actual;
        io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (this.getHighSpeedVideoSizes.get() == 0 && this.getHighSpeedVideoSizes.compareAndSet(0, 1)) {
            accept(observer, u);
            if (leave(-1) == 0) {
                return;
            }
        } else {
            simplePlainQueue.offer(u);
            if (!enter()) {
                return;
            }
        }
        io.reactivex.internal.util.QueueDrainHelper.drainLoop(simplePlainQueue, observer, z, disposable, this);
    }

    public final void fastPathOrderedEmit(U u, boolean z, io.reactivex.disposables.Disposable disposable) {
        io.reactivex.Observer<? super V> observer = this.actual;
        io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (this.getHighSpeedVideoSizes.get() == 0 && this.getHighSpeedVideoSizes.compareAndSet(0, 1)) {
            if (simplePlainQueue.isEmpty()) {
                accept(observer, u);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                simplePlainQueue.offer(u);
            }
        } else {
            simplePlainQueue.offer(u);
            if (!enter()) {
                return;
            }
        }
        io.reactivex.internal.util.QueueDrainHelper.drainLoop(simplePlainQueue, observer, z, disposable, this);
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final java.lang.Throwable error() {
        return this.error;
    }

    @Override // io.reactivex.internal.util.ObservableQueueDrain
    public final int leave(int i) {
        return this.getHighSpeedVideoSizes.addAndGet(i);
    }
}
