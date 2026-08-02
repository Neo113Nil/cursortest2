package org.jctools.queues;

/* loaded from: classes18.dex */
abstract class MpUnboundedXaddArrayQueueProducerChunk<R extends org.jctools.queues.MpUnboundedXaddChunk<R, E>, E> extends org.jctools.queues.MpUnboundedXaddArrayQueuePad2<E> {
    private volatile R producerChunk;
    private volatile long producerChunkIndex;
    private static final long P_CHUNK_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpUnboundedXaddArrayQueueProducerChunk.class, "producerChunk");
    private static final long P_CHUNK_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpUnboundedXaddArrayQueueProducerChunk.class, "producerChunkIndex");

    MpUnboundedXaddArrayQueueProducerChunk() {
    }

    final long lvProducerChunkIndex() {
        return this.producerChunkIndex;
    }

    final boolean casProducerChunkIndex(long j, long j2) {
        return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_CHUNK_INDEX_OFFSET, j, j2);
    }

    final void soProducerChunkIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, P_CHUNK_INDEX_OFFSET, j);
    }

    final R lvProducerChunk() {
        return this.producerChunk;
    }

    final void soProducerChunk(R r) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedObject(this, P_CHUNK_OFFSET, r);
    }
}
