package i5;

import n1.C1450e;

/* loaded from: classes2.dex */
public interface g {
    default void a(C1282d c1282d, Runnable runnable) {
        c(new C1283e(c1282d == null ? null : new C1450e(c1282d, 15), runnable));
    }

    void c(C1283e c1283e);

    void d();

    void start();
}
