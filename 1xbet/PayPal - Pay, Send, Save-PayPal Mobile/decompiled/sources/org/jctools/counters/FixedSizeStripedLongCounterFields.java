package org.jctools.counters;

/* loaded from: classes18.dex */
abstract class FixedSizeStripedLongCounterFields extends org.jctools.counters.FixedSizeStripedLongCounterPrePad {
    protected static final int CACHE_LINE_IN_LONGS = org.jctools.util.PortableJvmInfo.CACHE_LINE_SIZE / 8;
    protected static final long COUNTER_ARRAY_BASE = java.lang.Math.max(org.jctools.util.UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class), org.jctools.util.PortableJvmInfo.CACHE_LINE_SIZE - 8);
    protected static final long ELEMENT_SHIFT = java.lang.Integer.numberOfTrailingZeros(org.jctools.util.PortableJvmInfo.CACHE_LINE_SIZE);
    protected final long[] cells;
    protected final int mask;

    protected FixedSizeStripedLongCounterFields(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Expecting a stripesCount that is larger than 0");
        }
        int roundToPowerOfTwo = org.jctools.util.Pow2.roundToPowerOfTwo(i);
        this.cells = new long[CACHE_LINE_IN_LONGS * roundToPowerOfTwo];
        this.mask = roundToPowerOfTwo - 1;
    }
}
