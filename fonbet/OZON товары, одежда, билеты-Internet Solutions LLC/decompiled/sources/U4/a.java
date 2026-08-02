package U4;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static long f27327a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f27328b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f27329c;

    private static void a(@NonNull String str, @NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a();
        }
        try {
            if (f27328b == null) {
                f27327a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f27328b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f27328b.invoke(null, Long.valueOf(f27327a))).booleanValue();
        } catch (Exception e11) {
            a("isTagEnabled", e11);
            return false;
        }
    }

    public static void c(int i11, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (str.length() > 127) {
                str = str.substring(0, 127);
            }
            b.b(i11, str);
            return;
        }
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        try {
            if (f27329c == null) {
                f27329c = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f27329c.invoke(null, Long.valueOf(f27327a), str, Integer.valueOf(i11));
        } catch (Exception e11) {
            a("traceCounter", e11);
        }
    }
}
