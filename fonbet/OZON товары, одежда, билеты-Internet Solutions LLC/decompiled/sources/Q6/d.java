package Q6;

/* loaded from: classes9.dex */
public abstract class d<T> {
    public static d e(F8.b bVar, f fVar) {
        return new a(bVar, e.DEFAULT, fVar);
    }

    public static <T> d<T> f(T t2) {
        return new a(t2, e.DEFAULT, null);
    }

    public static <T> d<T> g(T t2) {
        return new a(t2, e.VERY_LOW, null);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract e c();

    public abstract f d();
}
