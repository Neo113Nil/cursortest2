package p000;

/* JADX INFO: renamed from: b4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0049b4 {

    /* JADX INFO: renamed from: a */
    public static final Class f704a;

    /* JADX INFO: renamed from: b */
    public static final boolean f705b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f704a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f705b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m589a() {
        return (f704a == null || f705b) ? false : true;
    }
}
