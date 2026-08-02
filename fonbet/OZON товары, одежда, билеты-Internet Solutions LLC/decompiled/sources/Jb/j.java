package Jb;

import Sc.C4001c;

/* loaded from: classes.dex */
public final class j implements Kj0.a {
    public static void a(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public static void d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final void e(AutoCloseable autoCloseable, Throwable th2) {
        try {
            autoCloseable.close();
        } catch (Throwable th3) {
            C4001c.a(th2, th3);
        }
    }

    public long f() {
        return System.nanoTime();
    }
}
