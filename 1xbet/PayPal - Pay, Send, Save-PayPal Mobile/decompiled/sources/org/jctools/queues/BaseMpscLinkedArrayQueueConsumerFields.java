package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class BaseMpscLinkedArrayQueueConsumerFields<E> extends org.jctools.queues.BaseMpscLinkedArrayQueuePad2<E> {
    private static final long C_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.BaseMpscLinkedArrayQueueConsumerFields.class, "consumerIndex");
    protected E[] consumerBuffer;
    private volatile long consumerIndex;
    protected long consumerMask;

    BaseMpscLinkedArrayQueueConsumerFields() {
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    final long lpConsumerIndex() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    final void soConsumerIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }
}
