package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class DDSpanId {
    public static final long MAX = -1;
    public static final long ZERO = 0;

    private DDSpanId() {
    }

    public static long from(java.lang.String str) throws java.lang.NumberFormatException {
        return com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLong(str);
    }

    public static long fromHex(java.lang.String str) throws java.lang.NumberFormatException {
        return com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(str);
    }

    public static long fromHexOrDefault(java.lang.String str, long j) {
        try {
            return fromHex(str);
        } catch (java.lang.NumberFormatException unused) {
            return j;
        }
    }

    public static long fromHex(java.lang.String str, int i, int i2, boolean z) throws java.lang.NumberFormatException {
        return com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(str, i, i2, z);
    }

    public static java.lang.String toString(long j) {
        return java.lang.Long.toUnsignedString(j);
    }

    public static java.lang.String toHexString(long j) {
        return java.lang.Long.toHexString(j);
    }

    public static java.lang.String toHexStringPadded(long j) {
        return com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(j, 16);
    }
}
