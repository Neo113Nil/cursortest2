package q;

import android.os.Trace;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0086a {
    public static void a(String str, int i2) {
        Trace.beginAsyncSection(str, i2);
    }

    public static void b(String str, int i2) {
        Trace.endAsyncSection(str, i2);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
