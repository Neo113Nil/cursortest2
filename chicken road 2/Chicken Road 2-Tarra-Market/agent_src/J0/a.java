package J0;

import a.AbstractC0009a;
import android.os.Trace;

/* loaded from: classes.dex */
public abstract class a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void b(String str) {
        Trace.beginSection(AbstractC0009a.H(a(str)));
    }
}
