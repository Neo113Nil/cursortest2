package org.jctools.queues;

/* loaded from: classes18.dex */
final class LinkedQueueNode<E> {
    private static final long NEXT_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.LinkedQueueNode.class, io.ktor.http.LinkHeader.Rel.Next);
    private volatile org.jctools.queues.LinkedQueueNode<E> next;
    private E value;

    LinkedQueueNode() {
        this(null);
    }

    LinkedQueueNode(E e) {
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

    public final void soNext(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedObject(this, NEXT_OFFSET, linkedQueueNode);
    }

    public final void spNext(org.jctools.queues.LinkedQueueNode<E> linkedQueueNode) {
        org.jctools.util.UnsafeAccess.UNSAFE.putObject(this, NEXT_OFFSET, linkedQueueNode);
    }

    public final org.jctools.queues.LinkedQueueNode<E> lvNext() {
        return this.next;
    }
}
