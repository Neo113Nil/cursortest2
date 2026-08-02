package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class LongArray {
    private int getHighSpeedVideoFpsRangesFor;
    private long[] getHighSpeedVideoSizes;

    public LongArray() {
        this(32);
    }

    public LongArray(int i) {
        this.getHighSpeedVideoSizes = new long[i];
    }

    public final void add(long j) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        long[] jArr = this.getHighSpeedVideoSizes;
        if (i == jArr.length) {
            this.getHighSpeedVideoSizes = java.util.Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.getHighSpeedVideoSizes;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i2 + 1;
        jArr2[i2] = j;
    }

    public final void addAll(long[] jArr) {
        int length = this.getHighSpeedVideoFpsRangesFor + jArr.length;
        long[] jArr2 = this.getHighSpeedVideoSizes;
        if (length > jArr2.length) {
            this.getHighSpeedVideoSizes = java.util.Arrays.copyOf(jArr2, java.lang.Math.max(jArr2.length * 2, length));
        }
        java.lang.System.arraycopy(jArr, 0, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, jArr.length);
        this.getHighSpeedVideoFpsRangesFor = length;
    }

    public final long get(int i) {
        if (i < 0 || i >= this.getHighSpeedVideoFpsRangesFor) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid index ");
            sb.append(i);
            sb.append(", size is ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        return this.getHighSpeedVideoSizes[i];
    }

    public final int size() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final long[] toArray() {
        return java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }
}
