package org.jctools.counters;

/* loaded from: classes18.dex */
public abstract class FixedSizeStripedLongCounter extends org.jctools.counters.FixedSizeStripedLongCounterFields implements org.jctools.counters.Counter {
    private static final long PROBE = getProbeOffset();

    protected abstract long getAndReset(long[] jArr, long j);

    protected abstract void inc(long[] jArr, long j, long j2);

    private static long getProbeOffset() {
        try {
            return org.jctools.util.UnsafeAccess.UNSAFE.objectFieldOffset(java.lang.Thread.class.getDeclaredField("threadLocalRandomProbe"));
        } catch (java.lang.NoSuchFieldException unused) {
            return -1L;
        }
    }

    public FixedSizeStripedLongCounter(int i) {
        super(i);
    }

    @Override // org.jctools.counters.Counter
    public void inc() {
        inc(1L);
    }

    @Override // org.jctools.counters.Counter
    public void inc(long j) {
        inc(this.cells, counterOffset(index()), j);
    }

    @Override // org.jctools.counters.Counter
    public long get() {
        long[] jArr = this.cells;
        int i = this.mask;
        long j = 0;
        for (int i2 = 0; i2 < i + 1; i2++) {
            j += org.jctools.util.UnsafeAccess.UNSAFE.getLongVolatile(jArr, counterOffset(i2));
        }
        return j;
    }

    private long counterOffset(long j) {
        return COUNTER_ARRAY_BASE + (j << ((int) ELEMENT_SHIFT));
    }

    @Override // org.jctools.counters.Counter
    public long getAndReset() {
        long[] jArr = this.cells;
        int i = this.mask;
        long j = 0;
        for (int i2 = 0; i2 < i + 1; i2++) {
            j += getAndReset(jArr, counterOffset(i2));
        }
        return j;
    }

    private int index() {
        return probe() & this.mask;
    }

    private int probe() {
        long j = PROBE;
        if (j != -1) {
            int i = org.jctools.util.UnsafeAccess.UNSAFE.getInt(java.lang.Thread.currentThread(), j);
            if (i != 0) {
                return i;
            }
            java.util.concurrent.ThreadLocalRandom.current();
            return org.jctools.util.UnsafeAccess.UNSAFE.getInt(java.lang.Thread.currentThread(), j);
        }
        int id = (int) ((java.lang.Thread.currentThread().getId() * (-1640531527)) & androidx.collection.SieveCacheKt.NodeLinkMask);
        int i2 = id ^ (id << 13);
        int i3 = i2 ^ (i2 >>> 17);
        return i3 ^ (i3 << 5);
    }
}
