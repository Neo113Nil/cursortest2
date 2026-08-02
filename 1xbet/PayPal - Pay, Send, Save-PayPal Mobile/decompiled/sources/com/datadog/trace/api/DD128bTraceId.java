package com.datadog.trace.api;

/* loaded from: classes3.dex */
public class DD128bTraceId extends com.datadog.trace.api.DDTraceId {
    public static final com.datadog.trace.api.DD128bTraceId ZERO = new com.datadog.trace.api.DD128bTraceId(0, 0, "00000000000000000000000000000000");
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;

    private DD128bTraceId(long j, long j2, java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = j2;
        this.getHighSpeedVideoFpsRanges = str;
    }

    public static com.datadog.trace.api.DD128bTraceId from(long j, long j2) {
        return new com.datadog.trace.api.DD128bTraceId(j, j2, null);
    }

    public static com.datadog.trace.api.DD128bTraceId fromHex(java.lang.String str) throws java.lang.NumberFormatException {
        return fromHex(str, 0, str == null ? 0 : str.length(), true);
    }

    public static com.datadog.trace.api.DD128bTraceId fromHex(java.lang.String str, int i, int i2, boolean z) throws java.lang.NumberFormatException {
        long parseUnsignedLongHex;
        long j;
        java.lang.String str2 = str;
        if (str2 == null) {
            throw new java.lang.NumberFormatException("s can't be null");
        }
        int length = str.length();
        if (i < 0 || i2 <= 0 || i2 > 32 || i + i2 > length) {
            throw new java.lang.NumberFormatException("Illegal start or length");
        }
        if (i2 > 16) {
            int i3 = i2 - 16;
            j = com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(str2, i, i3, z);
            parseUnsignedLongHex = com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(str2, i3 + i, 16, z);
        } else {
            parseUnsignedLongHex = com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(str, i, i2, z);
            j = 0;
        }
        long j2 = j;
        long j3 = parseUnsignedLongHex;
        if (i2 == 32) {
            if (i != 0) {
                str2 = str2.substring(i, i + 32);
            }
            if (!z) {
                str2 = str2.toLowerCase(java.util.Locale.ROOT);
            }
        } else {
            str2 = null;
        }
        return new com.datadog.trace.api.DD128bTraceId(j2, j3, str2);
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public java.lang.String toHexString() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (str != null) {
            return str;
        }
        java.lang.String hexStringPadded = com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, 32);
        this.getHighSpeedVideoFpsRanges = hexStringPadded;
        return hexStringPadded;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public java.lang.String toHexStringPadded(int i) {
        if (i <= 16) {
            return com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(this.getHighSpeedVideoSizes, 16);
        }
        return toHexString();
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public long toLong() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public long toHighOrderLong() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.datadog.trace.api.DD128bTraceId)) {
            return false;
        }
        com.datadog.trace.api.DD128bTraceId dD128bTraceId = (com.datadog.trace.api.DD128bTraceId) obj;
        return this.getHighSpeedVideoFpsRangesFor == dD128bTraceId.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoSizes == dD128bTraceId.getHighSpeedVideoSizes;
    }

    public int hashCode() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        long j2 = this.getHighSpeedVideoSizes;
        return (int) (((j ^ (j >>> 32)) ^ j2) ^ (j2 >>> 32));
    }

    @Override // com.datadog.trace.api.DDTraceId
    public java.lang.String toString() {
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        if (str != null) {
            return str;
        }
        java.lang.String unsignedString = java.lang.Long.toUnsignedString(this.getHighSpeedVideoSizes);
        this.getHighResolutionOutputSizeshNQ4ISI = unsignedString;
        return unsignedString;
    }
}
