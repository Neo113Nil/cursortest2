package org.jctools.counters;

/* loaded from: classes18.dex */
class FixedSizeStripedLongCounterV6 extends org.jctools.counters.FixedSizeStripedLongCounter {
    public FixedSizeStripedLongCounterV6(int i) {
        super(i);
    }

    @Override // org.jctools.counters.FixedSizeStripedLongCounter
    protected void inc(long[] jArr, long j, long j2) {
        long longVolatile;
        do {
            longVolatile = org.jctools.util.UnsafeAccess.UNSAFE.getLongVolatile(jArr, j);
        } while (!org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(jArr, j, longVolatile, longVolatile + j2));
    }

    @Override // org.jctools.counters.FixedSizeStripedLongCounter
    protected long getAndReset(long[] jArr, long j) {
        long longVolatile;
        do {
            longVolatile = org.jctools.util.UnsafeAccess.UNSAFE.getLongVolatile(jArr, j);
        } while (!org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(jArr, j, longVolatile, 0L));
        return longVolatile;
    }
}
