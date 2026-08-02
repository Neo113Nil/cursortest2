package org.jctools.util;

/* loaded from: classes18.dex */
abstract class PaddedAtomicLongL1Field extends org.jctools.util.PaddedAtomicLongL1Pad {
    private static final long VALUE_OFFSET = org.jctools.util.UnsafeAccess.fieldOffset(org.jctools.util.PaddedAtomicLongL1Field.class, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
    private volatile long value;

    PaddedAtomicLongL1Field() {
    }

    public void spVal(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putLong(this, VALUE_OFFSET, j);
    }

    public void soVal(long j) {
        org.jctools.util.UnsafeAccess.UNSAFE.putOrderedLong(this, VALUE_OFFSET, j);
    }

    public void svVal(long j) {
        this.value = j;
    }

    public long lvVal() {
        return this.value;
    }

    public long lpVal() {
        return org.jctools.util.UnsafeAccess.UNSAFE.getLong(this, VALUE_OFFSET);
    }

    public boolean casVal(long j, long j2) {
        return org.jctools.util.UnsafeAccess.UNSAFE.compareAndSwapLong(this, VALUE_OFFSET, j, j2);
    }

    public long getAndSetVal(long j) {
        long lvVal;
        if (org.jctools.util.UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
            return org.jctools.util.UnsafeAccess.UNSAFE.getAndSetLong(this, VALUE_OFFSET, j);
        }
        do {
            lvVal = lvVal();
        } while (!casVal(lvVal, j));
        return lvVal;
    }

    public long getAndAddVal(long j) {
        long lvVal;
        if (org.jctools.util.UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
            return org.jctools.util.UnsafeAccess.UNSAFE.getAndAddLong(this, VALUE_OFFSET, j);
        }
        do {
            lvVal = lvVal();
        } while (!casVal(lvVal, lvVal + j));
        return lvVal;
    }
}
