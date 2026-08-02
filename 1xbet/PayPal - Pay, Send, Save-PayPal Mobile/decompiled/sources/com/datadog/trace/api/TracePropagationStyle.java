package com.datadog.trace.api;

/* loaded from: classes3.dex */
public enum TracePropagationStyle {
    DATADOG,
    B3SINGLE,
    B3MULTI,
    HAYSTACK,
    XRAY,
    TRACECONTEXT,
    NONE;

    private java.lang.String getHighSpeedVideoFpsRanges;

    public static com.datadog.trace.api.TracePropagationStyle valueOfDisplayName(java.lang.String str) {
        java.lang.String replace = str.toUpperCase(java.util.Locale.US).replace(' ', '_');
        replace.hashCode();
        if (replace.equals("B3_SINGLE_HEADER")) {
            return B3SINGLE;
        }
        if (replace.equals("B3")) {
            return B3MULTI;
        }
        return valueOf(replace);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (str != null) {
            return str;
        }
        java.lang.String replace = name().toLowerCase(java.util.Locale.ROOT).replace('_', ' ');
        this.getHighSpeedVideoFpsRanges = replace;
        return replace;
    }
}
