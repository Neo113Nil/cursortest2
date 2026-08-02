package io.reactivex.internal.queue;

/* loaded from: classes17.dex */
public final class MpscLinkedQueue<T> implements io.reactivex.internal.fuseable.SimplePlainQueue<T> {
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T>> getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T>> getHighSpeedVideoSizes;

    public MpscLinkedQueue() {
        java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T>> atomicReference = new java.util.concurrent.atomic.AtomicReference<>();
        this.getHighSpeedVideoSizes = atomicReference;
        java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T>> atomicReference2 = new java.util.concurrent.atomic.AtomicReference<>();
        this.getHighSpeedVideoFpsRangesFor = atomicReference2;
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> linkedQueueNode = new io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<>();
        atomicReference2.lazySet(linkedQueueNode);
        atomicReference.getAndSet(linkedQueueNode);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t) {
        if (t == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> linkedQueueNode = new io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<>(t);
        this.getHighSpeedVideoSizes.getAndSet(linkedQueueNode).lazySet(linkedQueueNode);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t, T t2) {
        offer(t);
        offer(t2);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    static final class LinkedQueueNode<E> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        E getHighSpeedVideoFpsRangesFor;

        LinkedQueueNode() {
        }

        LinkedQueueNode(E e) {
            this.getHighSpeedVideoFpsRangesFor = e;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRangesFor.get() == this.getHighSpeedVideoSizes.get();
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    public final T poll() {
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode linkedQueueNode;
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode<T> linkedQueueNode2 = this.getHighSpeedVideoFpsRangesFor.get();
        io.reactivex.internal.queue.MpscLinkedQueue.LinkedQueueNode linkedQueueNode3 = linkedQueueNode2.get();
        if (linkedQueueNode3 != null) {
            T t = linkedQueueNode3.getHighSpeedVideoFpsRangesFor;
            linkedQueueNode3.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRangesFor.lazySet(linkedQueueNode3);
            return t;
        }
        if (linkedQueueNode2 == this.getHighSpeedVideoSizes.get()) {
            return null;
        }
        do {
            linkedQueueNode = linkedQueueNode2.get();
        } while (linkedQueueNode == null);
        T t2 = linkedQueueNode.getHighSpeedVideoFpsRangesFor;
        linkedQueueNode.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRangesFor.lazySet(linkedQueueNode);
        return t2;
    }
}
