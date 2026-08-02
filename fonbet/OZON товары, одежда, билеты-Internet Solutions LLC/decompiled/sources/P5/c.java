package P5;

import B5.B;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f21871a;

    /* renamed from: b, reason: collision with root package name */
    protected B f21872b;

    public c() {
        this.f21871a = new b<>();
        this.f21872b = null;
    }

    public T a(b<T> bVar) {
        return (T) this.f21872b;
    }

    public final T b(float f7, float f11, T t2, T t11, float f12, float f13, float f14) {
        b<T> bVar = this.f21871a;
        bVar.h(f7, f11, t2, t11, f12, f13, f14);
        return a(bVar);
    }

    public c(B b11) {
        this.f21871a = new b<>();
        this.f21872b = b11;
    }
}
