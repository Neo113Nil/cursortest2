package org.jctools.counters;

/* loaded from: classes18.dex */
class FixedSizeStripedLongCounterV8 extends org.jctools.counters.FixedSizeStripedLongCounter {
    public FixedSizeStripedLongCounterV8(int i) {
        super(i);
    }

    @Override // org.jctools.counters.FixedSizeStripedLongCounter
    protected void inc(long[] jArr, long j, long j2) {
        org.jctools.util.UnsafeAccess.UNSAFE.getAndAddLong(jArr, j, j2);
    }

    @Override // org.jctools.counters.FixedSizeStripedLongCounter
    protected long getAndReset(long[] jArr, long j) {
        return org.jctools.util.UnsafeAccess.UNSAFE.getAndSetLong(jArr, j, 0L);
    }
}
