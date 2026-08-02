package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpmcArrayQueueConsumerIndexField<E> extends org.jctools.queues.MpmcArrayQueueL2Pad<E> {
    private static final long C_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpmcArrayQueueConsumerIndexField.class, "consumerIndex");
    private volatile long consumerIndex;

    MpmcArrayQueueConsumerIndexField(int i) {
        super(i);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    final boolean casConsumerIndex(long j, long j2) {
        return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }
}
