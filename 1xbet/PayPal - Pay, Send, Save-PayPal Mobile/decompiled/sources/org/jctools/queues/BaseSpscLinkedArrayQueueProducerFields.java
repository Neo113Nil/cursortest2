package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseSpscLinkedArrayQueueProducerFields<E> extends org.jctools.queues.BaseSpscLinkedArrayQueueL2Pad<E> {
    private static final long P_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.BaseSpscLinkedArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    BaseSpscLinkedArrayQueueProducerFields() {
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final void soProducerIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }

    final long lpProducerIndex() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLong(this, P_INDEX_OFFSET);
    }
}
