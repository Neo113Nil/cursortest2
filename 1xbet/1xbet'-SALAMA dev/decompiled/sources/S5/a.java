package S5;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void b(String str) {
        Trace.beginSection(p097n3.a.W(a(str)));
    }
}
