package org.jctools.queues.atomic;

/* loaded from: classes18.dex */
public final class LinkedQueueAtomicNode<E> extends java.util.concurrent.atomic.AtomicReference<org.jctools.queues.atomic.LinkedQueueAtomicNode<E>> {
    private static final long serialVersionUID = 2404266111789071508L;
    private E value;

    LinkedQueueAtomicNode() {
    }

    LinkedQueueAtomicNode(E e) {
        spValue(e);
    }

    public final E getAndNullValue() {
        E lpValue = lpValue();
        spValue(null);
        return lpValue;
    }

    public final E lpValue() {
        return this.value;
    }

    public final void spValue(E e) {
        this.value = e;
    }

    public final void soNext(org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        lazySet(linkedQueueAtomicNode);
    }

    public final void spNext(org.jctools.queues.atomic.LinkedQueueAtomicNode<E> linkedQueueAtomicNode) {
        lazySet(linkedQueueAtomicNode);
    }

    public final org.jctools.queues.atomic.LinkedQueueAtomicNode<E> lvNext() {
        return get();
    }
}
