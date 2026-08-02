package org.jctools.counters;

/* loaded from: classes18.dex */
public final class CountersFactory {
    private CountersFactory() {
    }

    public static org.jctools.counters.FixedSizeStripedLongCounter createFixedSizeStripedCounter(int i) {
        if (org.jctools.util.UnsafeAccess.SUPPORTS_GET_AND_ADD_LONG) {
            return new org.jctools.counters.FixedSizeStripedLongCounterV8(i);
        }
        return new org.jctools.counters.FixedSizeStripedLongCounterV6(i);
    }

    public static org.jctools.counters.FixedSizeStripedLongCounter createFixedSizeStripedCounterV6(int i) {
        return new org.jctools.counters.FixedSizeStripedLongCounterV6(i);
    }

    public static org.jctools.counters.FixedSizeStripedLongCounter createFixedSizeStripedCounterV8(int i) {
        return new org.jctools.counters.FixedSizeStripedLongCounterV8(i);
    }
}
