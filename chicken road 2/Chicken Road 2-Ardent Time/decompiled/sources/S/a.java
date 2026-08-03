package S;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(int i2, java.lang.String str) {
        android.os.Trace.beginAsyncSection(str, i2);
    }

    public static void b(int i2, java.lang.String str) {
        android.os.Trace.endAsyncSection(str, i2);
    }

    public static boolean c() {
        return android.os.Trace.isEnabled();
    }
}
