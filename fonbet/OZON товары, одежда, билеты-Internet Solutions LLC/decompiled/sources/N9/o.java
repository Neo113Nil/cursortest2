package N9;

import android.os.Looper;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static String f18822a;

    public static final int a(float f7) {
        return ((int) (f7 >= 0.0f ? Math.ceil(f7) : Math.floor(f7))) * (-1);
    }

    public static String b() {
        return f18822a;
    }

    public static void c(String str) {
        f18822a = str;
    }

    public static void d() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
