package Jb;

/* loaded from: classes.dex */
public final class m<T> implements Pc.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14344c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Pc.a<T> f14345a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f14346b;

    public static <P extends Pc.a<T>, T> Pc.a<T> a(P p11) {
        if ((p11 instanceof m) || (p11 instanceof d)) {
            return p11;
        }
        p11.getClass();
        m mVar = new m();
        mVar.f14346b = f14344c;
        mVar.f14345a = p11;
        return mVar;
    }

    @Override // Pc.a
    public final T get() {
        T t2 = (T) this.f14346b;
        if (t2 != f14344c) {
            return t2;
        }
        Pc.a<T> aVar = this.f14345a;
        if (aVar == null) {
            return (T) this.f14346b;
        }
        T t11 = aVar.get();
        this.f14346b = t11;
        this.f14345a = null;
        return t11;
    }
}
