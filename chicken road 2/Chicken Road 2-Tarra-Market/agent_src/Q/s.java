package Q;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f469a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f470b;

    /* renamed from: c, reason: collision with root package name */
    public static int f471c;

    public static void a(Z.e eVar) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != eVar.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + eVar.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void b(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
