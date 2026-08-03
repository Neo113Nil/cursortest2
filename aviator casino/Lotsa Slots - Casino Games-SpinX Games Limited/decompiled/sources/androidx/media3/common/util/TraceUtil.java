package androidx.media3.common.util;

/* loaded from: classes2.dex */
public final class TraceUtil {
    private TraceUtil() {
    }

    public static void beginSection(java.lang.String str) {
        android.os.Trace.beginSection(str);
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }
}
