package org.jctools.queues;

/* loaded from: classes18.dex */
class MpUnboundedXaddChunk<R, E> {
    private final E[] buffer;
    private volatile long index;
    private volatile R next;
    private final boolean pooled;
    private volatile R prev;
    private static final long PREV_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpUnboundedXaddChunk.class, "prev");
    private static final long NEXT_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpUnboundedXaddChunk.class, io.ktor.http.LinkHeader.Rel.Next);
    private static final long INDEX_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.queues.MpUnboundedXaddChunk.class, "index");

    MpUnboundedXaddChunk(long j, R r, int i, boolean z) {
        this.buffer = (E[]) org.jctools.util.UnsafeRefArrayAccess.allocateRefArray(i);
        soPrev(r);
        spIndex(j);
        this.pooled = z;
    }

    final boolean isPooled() {
        return this.pooled;
    }

    final long lvIndex() {
        return this.index;
    }

    final void soIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, INDEX_OFFSET, j);
    }

    final void spIndex(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putLong(this, INDEX_OFFSET, j);
    }

    final R lvNext() {
        return this.next;
    }

    final void soNext(R r) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedObject(this, NEXT_OFFSET, r);
    }

    final R lvPrev() {
        return this.prev;
    }

    final void soPrev(R r) {
        org.jctools.util.UnsafeAccess.UNSAFE.putObject(this, PREV_OFFSET, r);
    }

    final void soElement(int i, E e) {
        org.jctools.util.UnsafeRefArrayAccess.soRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcRefElementOffset(i), e);
    }

    final E lvElement(int i) {
        return (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(this.buffer, org.jctools.util.UnsafeRefArrayAccess.calcRefElementOffset(i));
    }

    final E spinForElement(int i, boolean z) {
        E e;
        E[] eArr = this.buffer;
        long calcRefElementOffset = org.jctools.util.UnsafeRefArrayAccess.calcRefElementOffset(i);
        do {
            e = (E) org.jctools.util.UnsafeRefArrayAccess.lvRefElement(eArr, calcRefElementOffset);
        } while (z != (e == null));
        return e;
    }
}
