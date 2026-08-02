package org.jctools.queues;

/* loaded from: classes5.dex */
abstract class MpscBlockingConsumerArrayQueueConsumerFields<E> extends org.jctools.queues.MpscBlockingConsumerArrayQueuePad3<E> {
    private volatile java.lang.Thread blocked;
    protected final E[] consumerBuffer;
    private volatile long consumerIndex;
    protected final long consumerMask;
    private static final long C_INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpscBlockingConsumerArrayQueueConsumerFields.class, "consumerIndex");
    private static final long BLOCKED_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpscBlockingConsumerArrayQueueConsumerFields.class, com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_BLOCKED);

    MpscBlockingConsumerArrayQueueConsumerFields(long j, E[] eArr) {
        super(j, eArr);
        this.consumerMask = j;
        this.consumerBuffer = eArr;
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

    final java.lang.Thread lvBlocked() {
        return this.blocked;
    }

    final void soBlocked(java.lang.Thread thread) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedObject(this, BLOCKED_OFFSET, thread);
    }
}
