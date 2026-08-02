package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseMpscLinkedArrayQueueProducerFields<E> extends org.jctools.queues.BaseMpscLinkedArrayQueuePad1<E> {
    private static final long P_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.BaseMpscLinkedArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    BaseMpscLinkedArrayQueueProducerFields() {
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final void soProducerIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }

    final boolean casProducerIndex(long j, long j2) {
        return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j, j2);
    }
}
