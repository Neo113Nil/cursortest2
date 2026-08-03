package com.amazon.device.iap.internal;

/* compiled from: ImplementationFactory.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3490a = "com.amazon.device.iap.internal.e";
    private static volatile boolean b;
    private static volatile boolean c;
    private static volatile com.amazon.device.iap.internal.c d;
    private static volatile com.amazon.device.iap.internal.a e;
    private static volatile com.amazon.device.iap.internal.b f;

    private static com.amazon.device.iap.internal.b d() {
        if (f == null) {
            synchronized (com.amazon.device.iap.internal.e.class) {
                if (f == null) {
                    if (a()) {
                        f = new com.amazon.device.iap.internal.a.d();
                    } else {
                        f = new com.amazon.device.iap.internal.b.g();
                    }
                }
            }
        }
        return f;
    }

    public static boolean a() {
        if (c) {
            return b;
        }
        synchronized (com.amazon.device.iap.internal.e.class) {
            if (c) {
                return b;
            }
            try {
                com.amazon.device.iap.internal.e.class.getClassLoader().loadClass("com.amazon.android.Kiwi");
                b = false;
            } catch (java.lang.Throwable unused) {
                b = true;
            }
            c = true;
            return b;
        }
    }

    public static com.amazon.device.iap.internal.c b() {
        if (d == null) {
            synchronized (com.amazon.device.iap.internal.e.class) {
                if (d == null) {
                    d = (com.amazon.device.iap.internal.c) a(com.amazon.device.iap.internal.c.class);
                }
            }
        }
        return d;
    }

    public static com.amazon.device.iap.internal.a c() {
        if (e == null) {
            synchronized (com.amazon.device.iap.internal.e.class) {
                if (e == null) {
                    e = (com.amazon.device.iap.internal.a) a(com.amazon.device.iap.internal.a.class);
                }
            }
        }
        return e;
    }

    private static <T> T a(java.lang.Class<T> cls) {
        try {
            return d().a(cls).newInstance();
        } catch (java.lang.Exception e2) {
            android.util.Log.e(f3490a, "error getting instance for " + cls, e2);
            return null;
        }
    }
}
