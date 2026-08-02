package Ld;

import org.jetbrains.annotations.NotNull;
import yd.C10884b;

/* loaded from: classes.dex */
public interface y {

    public interface a {
        void a();

        b b(Sd.f fVar);

        void c(Sd.f fVar, @NotNull Sd.b bVar, @NotNull Sd.f fVar2);

        void d(Sd.f fVar, @NotNull Xd.f fVar2);

        a e(@NotNull Sd.b bVar, Sd.f fVar);

        void f(Sd.f fVar, Object obj);
    }

    public interface b {
        void a();

        void b(Object obj);

        void c(@NotNull Sd.b bVar, @NotNull Sd.f fVar);

        a d(@NotNull Sd.b bVar);

        void e(@NotNull Xd.f fVar);
    }

    public interface c {
        void a();

        a b(@NotNull Sd.b bVar, @NotNull C10884b c10884b);
    }

    @NotNull
    Md.a a();

    @NotNull
    Sd.b b();

    void c(@NotNull C3577d c3577d);

    void d(@NotNull c cVar);

    @NotNull
    String getLocation();
}
