package com.datadog.trace.api;

/* loaded from: classes3.dex */
public class DD64bTraceId extends com.datadog.trace.api.DDTraceId {
    public static final com.datadog.trace.api.DD64bTraceId MAX = new com.datadog.trace.api.DD64bTraceId(-1, "18446744073709551615");
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    @Override // com.datadog.trace.api.DDTraceId
    public long toHighOrderLong() {
        return 0L;
    }

    private DD64bTraceId(long j, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public static com.datadog.trace.api.DD64bTraceId from(long j) {
        return getHighSpeedVideoSizes(j, null);
    }

    public static com.datadog.trace.api.DD64bTraceId from(java.lang.String str) throws java.lang.NumberFormatException {
        return getHighSpeedVideoSizes(com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLong(str), str);
    }

    public static com.datadog.trace.api.DD64bTraceId fromHex(java.lang.String str) throws java.lang.NumberFormatException {
        return getHighSpeedVideoSizes(com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(str), null);
    }

    static com.datadog.trace.api.DD64bTraceId getHighSpeedVideoSizes(long j, java.lang.String str) {
        if (j == 0 && ZERO != null) {
            return (com.datadog.trace.api.DD64bTraceId) ZERO;
        }
        if (j == -1) {
            return MAX;
        }
        return new com.datadog.trace.api.DD64bTraceId(j, str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.datadog.trace.api.DD64bTraceId) && this.getHighResolutionOutputSizeshNQ4ISI == ((com.datadog.trace.api.DD64bTraceId) obj).getHighResolutionOutputSizeshNQ4ISI;
    }

    public int hashCode() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        return (int) (j ^ (j >>> 32));
    }

    @Override // com.datadog.trace.api.DDTraceId
    public java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        if (str != null) {
            return str;
        }
        java.lang.String unsignedString = java.lang.Long.toUnsignedString(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = unsignedString;
        return unsignedString;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public java.lang.String toHexString() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str != null) {
            return str;
        }
        java.lang.String hexStringPadded = com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(this.getHighResolutionOutputSizeshNQ4ISI, 32);
        this.getHighSpeedVideoSizes = hexStringPadded;
        return hexStringPadded;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public java.lang.String toHexStringPadded(int i) {
        if (i > 16) {
            return toHexString();
        }
        return com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(this.getHighResolutionOutputSizeshNQ4ISI, i);
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public long toLong() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
