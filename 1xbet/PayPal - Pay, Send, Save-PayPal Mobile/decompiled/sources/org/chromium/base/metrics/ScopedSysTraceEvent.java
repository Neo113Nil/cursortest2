package org.chromium.base.metrics;

/* loaded from: classes5.dex */
public class ScopedSysTraceEvent implements java.lang.AutoCloseable {
    public static final int MAX_SECTION_NAME_LEN = 127;

    public static org.chromium.base.metrics.ScopedSysTraceEvent scoped(java.lang.String str) {
        return new org.chromium.base.metrics.ScopedSysTraceEvent(str);
    }

    private ScopedSysTraceEvent(java.lang.String str) {
        if (str.length() > 127) {
            java.lang.String substring = str.substring(0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(substring);
            sb.append("...");
            str = sb.toString();
        }
        android.os.Trace.beginSection(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        android.os.Trace.endSection();
    }
}
