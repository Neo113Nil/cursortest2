package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class ConstantRateTimestampIterator implements androidx.media3.common.util.TimestampIterator {
    private final double Camera2StreamConfigurationMap;
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;
    private final int getInputFormats;

    public ConstantRateTimestampIterator(long j, float f) {
        this(0L, j, f);
    }

    public ConstantRateTimestampIterator(long j, long j2, float f) {
        boolean z = false;
        com.google.common.base.Preconditions.checkArgument(j2 > 0);
        com.google.common.base.Preconditions.checkArgument(f > 0.0f);
        if (0 <= j && j < j2) {
            z = true;
        }
        com.google.common.base.Preconditions.checkArgument(z);
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getInputFormats = java.lang.Math.max(java.lang.Math.round(((j2 - j) / 1000000.0f) * f), 1);
        this.Camera2StreamConfigurationMap = 1000000.0f / f;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRangesFor < this.getInputFormats;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public final long next() {
        com.google.common.base.Preconditions.checkState(hasNext());
        int i = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i + 1;
        return getHighSpeedVideoSizes(i);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public final androidx.media3.common.util.ConstantRateTimestampIterator copyOf() {
        return new androidx.media3.common.util.ConstantRateTimestampIterator(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public final long getLastTimestampUs() {
        int i = this.getInputFormats;
        return i == 0 ? androidx.media3.common.C.TIME_UNSET : getHighSpeedVideoSizes(i - 1);
    }

    private long getHighSpeedVideoSizes(int i) {
        long round = this.getHighSpeedVideoSizes + java.lang.Math.round(this.Camera2StreamConfigurationMap * i);
        com.google.common.base.Preconditions.checkState(round >= 0);
        return round;
    }
}
