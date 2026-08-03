package g1;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0130a implements java.lang.AutoCloseable {
    public static java.lang.String a(java.lang.String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void b(java.lang.String str) {
        android.os.Trace.beginSection(Q1.l.A(a(str)));
    }
}
