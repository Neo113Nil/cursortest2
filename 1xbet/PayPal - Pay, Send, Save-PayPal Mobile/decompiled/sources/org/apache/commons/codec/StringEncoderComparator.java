package org.apache.commons.codec;

/* loaded from: classes17.dex */
public class StringEncoderComparator implements java.util.Comparator {
    private final org.apache.commons.codec.StringEncoder getHighSpeedVideoFpsRangesFor;

    @java.lang.Deprecated
    public StringEncoderComparator() {
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    public StringEncoderComparator(org.apache.commons.codec.StringEncoder stringEncoder) {
        this.getHighSpeedVideoFpsRangesFor = stringEncoder;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        try {
            return ((java.lang.Comparable) this.getHighSpeedVideoFpsRangesFor.encode(obj)).compareTo((java.lang.Comparable) this.getHighSpeedVideoFpsRangesFor.encode(obj2));
        } catch (org.apache.commons.codec.EncoderException unused) {
            return 0;
        }
    }
}
