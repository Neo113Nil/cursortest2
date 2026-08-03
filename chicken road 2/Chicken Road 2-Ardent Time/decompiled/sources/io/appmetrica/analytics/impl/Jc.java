package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Jc {
    public abstract void a(int i2);

    public final synchronized void a(android.content.Context context) {
        try {
            int b2 = b();
            int libraryApiLevel = io.appmetrica.analytics.AppMetrica.getLibraryApiLevel();
            if (b2 != libraryApiLevel) {
                if (b2 < libraryApiLevel) {
                    android.util.SparseArray c2 = c();
                    while (true) {
                        b2++;
                        if (b2 > libraryApiLevel) {
                            break;
                        }
                        io.appmetrica.analytics.impl.Ic ic = (io.appmetrica.analytics.impl.Ic) c2.get(b2);
                        if (ic != null) {
                            ic.a(context);
                        }
                    }
                }
                a(libraryApiLevel);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public abstract int b();

    public abstract android.util.SparseArray c();

    public final int a() {
        return io.appmetrica.analytics.AppMetrica.getLibraryApiLevel();
    }
}
