package p064i5;

import p096n1.e;

/* JADX INFO: loaded from: classes2.dex */
public interface g {
    default void a(d dVar, Runnable runnable) {
        c(new e(dVar == null ? null : new e(dVar, 15), runnable));
    }

    void c(e eVar);

    void d();

    void start();
}
