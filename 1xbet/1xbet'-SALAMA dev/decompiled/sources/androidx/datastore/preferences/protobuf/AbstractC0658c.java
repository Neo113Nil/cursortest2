package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0658c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f9172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f9173b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f9172a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f9173b = cls2 != null;
    }

    public static boolean a() {
        return (f9172a == null || f9173b) ? false : true;
    }
}
