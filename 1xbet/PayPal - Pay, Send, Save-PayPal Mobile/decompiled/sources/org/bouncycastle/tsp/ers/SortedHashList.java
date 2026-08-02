package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
public class SortedHashList {
    private static final java.util.Comparator<byte[]> getHighSpeedVideoFpsRangesFor = new org.bouncycastle.tsp.ers.ByteArrayComparator();
    private final java.util.LinkedList<byte[]> getHighSpeedVideoFpsRanges = new java.util.LinkedList<>();

    public java.util.List<byte[]> toList() {
        return new java.util.ArrayList(this.getHighSpeedVideoFpsRanges);
    }

    public void add(byte[] bArr) {
        if (this.getHighSpeedVideoFpsRanges.size() == 0) {
            this.getHighSpeedVideoFpsRanges.addFirst(bArr);
            return;
        }
        if (getHighSpeedVideoFpsRangesFor.compare(bArr, this.getHighSpeedVideoFpsRanges.get(0)) < 0) {
            this.getHighSpeedVideoFpsRanges.addFirst(bArr);
            return;
        }
        int i = 1;
        while (i < this.getHighSpeedVideoFpsRanges.size() && getHighSpeedVideoFpsRangesFor.compare(this.getHighSpeedVideoFpsRanges.get(i), bArr) <= 0) {
            i++;
        }
        if (i == this.getHighSpeedVideoFpsRanges.size()) {
            this.getHighSpeedVideoFpsRanges.add(bArr);
        } else {
            this.getHighSpeedVideoFpsRanges.add(i, bArr);
        }
    }
}
