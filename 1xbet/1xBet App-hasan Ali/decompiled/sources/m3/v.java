package m3;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f18107a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f18108b;

    /* renamed from: c, reason: collision with root package name */
    public static int f18109c;

    public static void a(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void c(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void f(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
