package com.datadog.trace.api;

/* loaded from: classes3.dex */
public abstract class DDTraceId {
    public static final com.datadog.trace.api.DDTraceId ZERO = from(0);
    public static final com.datadog.trace.api.DDTraceId ONE = from(1);

    public abstract java.lang.String toHexString();

    public abstract java.lang.String toHexStringPadded(int i);

    public abstract long toHighOrderLong();

    public abstract long toLong();

    public abstract java.lang.String toString();

    public static com.datadog.trace.api.DDTraceId from(long j) {
        return com.datadog.trace.api.DD64bTraceId.from(j);
    }

    public static com.datadog.trace.api.DDTraceId from(java.lang.String str) throws java.lang.NumberFormatException {
        return com.datadog.trace.api.DD64bTraceId.getHighSpeedVideoSizes(com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLong(str), str);
    }

    public static com.datadog.trace.api.DDTraceId fromHex(java.lang.String str) throws java.lang.NumberFormatException {
        if (str != null) {
            return str.length() > 16 ? com.datadog.trace.api.DD128bTraceId.fromHex(str) : com.datadog.trace.api.DD64bTraceId.fromHex(str);
        }
        throw new java.lang.NumberFormatException("s cannot be null");
    }

    public static com.datadog.trace.api.DDTraceId fromHexOrDefault(java.lang.String str, com.datadog.trace.api.DDTraceId dDTraceId) {
        try {
            return fromHex(str);
        } catch (java.lang.NumberFormatException unused) {
            return dDTraceId;
        }
    }
}
