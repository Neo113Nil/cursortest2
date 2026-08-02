package org.threeten.bp.temporal;

/* loaded from: classes18.dex */
public final class ValueRange implements java.io.Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoSizes;

    public static org.threeten.bp.temporal.ValueRange of(long j, long j2) {
        if (j > j2) {
            throw new java.lang.IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new org.threeten.bp.temporal.ValueRange(j, j, j2, j2);
    }

    public static org.threeten.bp.temporal.ValueRange of(long j, long j2, long j3) {
        return of(j, j, j2, j3);
    }

    public static org.threeten.bp.temporal.ValueRange of(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new java.lang.IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j3 > j4) {
            throw new java.lang.IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new java.lang.IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new org.threeten.bp.temporal.ValueRange(j, j2, j3, j4);
    }

    private ValueRange(long j, long j2, long j3, long j4) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.Camera2StreamConfigurationMap = j3;
        this.getHighSpeedVideoSizes = j4;
    }

    public final boolean isFixed() {
        return this.getHighResolutionOutputSizeshNQ4ISI == this.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == this.getHighSpeedVideoSizes;
    }

    public final long getMinimum() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final long getLargestMinimum() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final long getSmallestMaximum() {
        return this.Camera2StreamConfigurationMap;
    }

    public final long getMaximum() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean isIntValue() {
        return getMinimum() >= androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask && getMaximum() <= androidx.collection.SieveCacheKt.NodeLinkMask;
    }

    public final boolean isValidValue(long j) {
        return j >= getMinimum() && j <= getMaximum();
    }

    public final boolean isValidIntValue(long j) {
        return isIntValue() && isValidValue(j);
    }

    public final long checkValidValue(long j, org.threeten.bp.temporal.TemporalField temporalField) {
        if (isValidValue(j)) {
            return j;
        }
        if (temporalField != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid value for ");
            sb.append(temporalField);
            sb.append(" (valid values ");
            sb.append(this);
            sb.append("): ");
            sb.append(j);
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid value (valid values ");
        sb2.append(this);
        sb2.append("): ");
        sb2.append(j);
        throw new org.threeten.bp.DateTimeException(sb2.toString());
    }

    public final int checkValidIntValue(long j, org.threeten.bp.temporal.TemporalField temporalField) {
        if (isValidIntValue(j)) {
            return (int) j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid int value for ");
        sb.append(temporalField);
        sb.append(": ");
        sb.append(j);
        throw new org.threeten.bp.DateTimeException(sb.toString());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.temporal.ValueRange)) {
            return false;
        }
        org.threeten.bp.temporal.ValueRange valueRange = (org.threeten.bp.temporal.ValueRange) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI == valueRange.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == valueRange.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap == valueRange.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes == valueRange.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        long j2 = this.getHighSpeedVideoFpsRanges;
        long j3 = this.Camera2StreamConfigurationMap;
        long j4 = this.getHighSpeedVideoSizes;
        long j5 = ((((((j + j2) << ((int) (16 + j2))) >> ((int) (j3 + 48))) << ((int) (j3 + 32))) >> ((int) (32 + j4))) << ((int) (j4 + 48))) >> 16;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        if (this.getHighResolutionOutputSizeshNQ4ISI != this.getHighSpeedVideoFpsRanges) {
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(this.getHighSpeedVideoFpsRanges);
        }
        sb.append(" - ");
        sb.append(this.Camera2StreamConfigurationMap);
        if (this.Camera2StreamConfigurationMap != this.getHighSpeedVideoSizes) {
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(this.getHighSpeedVideoSizes);
        }
        return sb.toString();
    }
}
