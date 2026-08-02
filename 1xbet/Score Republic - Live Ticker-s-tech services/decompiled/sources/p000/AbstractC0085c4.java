package p000;

/* JADX INFO: renamed from: c4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0085c4 {

    /* JADX INFO: renamed from: a */
    public static final Class f1084a;

    /* JADX INFO: renamed from: b */
    public static final boolean f1085b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f1084a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f1085b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m846a() {
        return (f1084a == null || f1085b) ? false : true;
    }
}
