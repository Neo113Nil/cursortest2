package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class LongArrayQueue {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private long[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public LongArrayQueue() {
        this(16);
    }

    public LongArrayQueue(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = java.lang.Integer.bitCount(i) != 1 ? java.lang.Integer.highestOneBit(i - 1) << 1 : i;
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoFpsRanges = new long[i];
        this.Camera2StreamConfigurationMap = i - 1;
    }

    public final void add(long j) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new java.lang.IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.getHighSpeedVideoSizes;
            int i3 = length2 - i2;
            java.lang.System.arraycopy(jArr, i2, jArr2, 0, i3);
            java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, jArr2, i3, i2);
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI - 1;
            this.getHighSpeedVideoFpsRanges = jArr2;
            this.Camera2StreamConfigurationMap = length - 1;
        }
        int i4 = (this.getHighSpeedVideoFpsRangesFor + 1) & this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = i4;
        this.getHighSpeedVideoFpsRanges[i4] = j;
        this.getHighResolutionOutputSizeshNQ4ISI++;
    }

    public final long remove() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            throw new java.util.NoSuchElementException();
        }
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighSpeedVideoSizes;
        long j = jArr[i2];
        this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap & (i2 + 1);
        this.getHighResolutionOutputSizeshNQ4ISI = i - 1;
        return j;
    }

    public final long element() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            throw new java.util.NoSuchElementException();
        }
        return this.getHighSpeedVideoFpsRanges[this.getHighSpeedVideoSizes];
    }

    public final int size() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI == 0;
    }

    public final void clear() {
        this.getHighSpeedVideoSizes = 0;
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }
}
