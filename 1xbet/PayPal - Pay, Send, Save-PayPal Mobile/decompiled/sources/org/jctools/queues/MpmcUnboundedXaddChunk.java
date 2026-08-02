package org.jctools.queues;

/* loaded from: classes18.dex */
final class MpmcUnboundedXaddChunk<E> extends org.jctools.queues.MpUnboundedXaddChunk<org.jctools.queues.MpmcUnboundedXaddChunk<E>, E> {
    private final long[] sequence;

    MpmcUnboundedXaddChunk(long j, org.jctools.queues.MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk, int i, boolean z) {
        super(j, mpmcUnboundedXaddChunk, i, z);
        if (z) {
            long[] allocateLongArray = org.jctools.util.UnsafeLongArrayAccess.allocateLongArray(i);
            this.sequence = allocateLongArray;
            java.util.Arrays.fill(allocateLongArray, -1L);
            return;
        }
        this.sequence = null;
    }

    final void soSequence(int i, long j) {
        org.jctools.util.UnsafeLongArrayAccess.soLongElement(this.sequence, org.jctools.util.UnsafeLongArrayAccess.calcLongElementOffset(i), j);
    }

    final long lvSequence(int i) {
        return org.jctools.util.UnsafeLongArrayAccess.lvLongElement(this.sequence, org.jctools.util.UnsafeLongArrayAccess.calcLongElementOffset(i));
    }

    final void spinForSequence(int i, long j) {
        while (org.jctools.util.UnsafeLongArrayAccess.lvLongElement(this.sequence, org.jctools.util.UnsafeLongArrayAccess.calcLongElementOffset(i)) != j) {
        }
    }
}
