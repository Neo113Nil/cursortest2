package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpUnboundedXaddArrayQueueConsumerFields<R extends org.jctools.queues.MpUnboundedXaddChunk<R, E>, E> extends org.jctools.queues.MpUnboundedXaddArrayQueuePad3<R, E> {
    private volatile R consumerChunk;
    private volatile long consumerIndex;
    private static final long C_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpUnboundedXaddArrayQueueConsumerFields.class, "consumerIndex");
    private static final long C_CHUNK_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpUnboundedXaddArrayQueueConsumerFields.class, "consumerChunk");

    MpUnboundedXaddArrayQueueConsumerFields() {
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    final boolean casConsumerIndex(long j, long j2) {
        return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }

    final R lpConsumerChunk() {
        return (R) org.jctools.util.UnsafeAccess.UNSAFE.getObject(this, C_CHUNK_OFFSET);
    }

    final R lvConsumerChunk() {
        return this.consumerChunk;
    }

    final void soConsumerChunk(R r) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedObject(this, C_CHUNK_OFFSET, r);
    }

    final long lpConsumerIndex() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    final void soConsumerIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }
}
