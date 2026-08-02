package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static long f42188a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f42189b;

    static class a {
        static void a(String str, int i11) {
        }

        static void b(String str, int i11) {
        }

        static boolean c() {
            return Trace.isEnabled();
        }

        static void d(String str, long j11) {
            Trace.setCounter(str, j11);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f42188a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f42189b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e11) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e11);
            }
        }
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.c();
        }
        try {
            return ((Boolean) f42189b.invoke(null, Long.valueOf(f42188a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }
}
