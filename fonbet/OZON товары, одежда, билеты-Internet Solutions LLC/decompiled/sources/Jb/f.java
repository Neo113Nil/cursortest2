package Jb;

/* loaded from: classes.dex */
public final class f<T> implements e<T>, Ib.a<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final f<Object> f14336b = new f<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f14337a;

    private f(T t2) {
        this.f14337a = t2;
    }

    public static f a(Object obj) {
        j.b(obj, "instance cannot be null");
        return new f(obj);
    }

    public static f b(Object obj) {
        return obj == null ? f14336b : new f(obj);
    }

    @Override // Pc.a
    public final T get() {
        return this.f14337a;
    }
}
