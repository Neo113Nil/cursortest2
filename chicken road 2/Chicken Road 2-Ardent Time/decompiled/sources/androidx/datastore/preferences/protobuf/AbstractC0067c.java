package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0067c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Class f2287a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2288b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        f2287a = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        f2288b = cls2 != null;
    }

    public static boolean a() {
        return (f2287a == null || f2288b) ? false : true;
    }
}
