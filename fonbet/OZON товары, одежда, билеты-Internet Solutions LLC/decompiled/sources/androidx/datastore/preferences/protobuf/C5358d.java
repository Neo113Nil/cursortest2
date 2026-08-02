package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5358d {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f42506a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f42507b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f42506a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f42507b = cls2 != null;
    }

    static Class<?> a() {
        return f42506a;
    }

    static boolean b() {
        return (f42506a == null || f42507b) ? false : true;
    }
}
