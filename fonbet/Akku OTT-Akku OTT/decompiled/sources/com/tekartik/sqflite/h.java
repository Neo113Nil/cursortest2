package com.tekartik.sqflite;

/* loaded from: classes4.dex */
public interface h {

    public class a implements e {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }
    }

    void a();

    void b(f fVar);

    default void c(d dVar, Runnable runnable) {
        b(new f(dVar == null ? null : new a(dVar), runnable));
    }

    void start();
}
