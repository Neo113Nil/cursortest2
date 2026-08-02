package Jb;

/* loaded from: classes.dex */
public final class d<T> implements Pc.a<T>, Ib.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f14333c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Pc.a<T> f14334a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f14335b = f14333c;

    private d(Pc.a<T> aVar) {
        this.f14334a = aVar;
    }

    public static <P extends Pc.a<T>, T> Ib.a<T> a(P p11) {
        if (p11 instanceof Ib.a) {
            return (Ib.a) p11;
        }
        p11.getClass();
        return new d(p11);
    }

    public static <P extends Pc.a<T>, T> Pc.a<T> b(P p11) {
        p11.getClass();
        return p11 instanceof d ? p11 : new d(p11);
    }

    @Override // Pc.a
    public final T get() {
        T t2;
        T t11 = (T) this.f14335b;
        Object obj = f14333c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t2 = (T) this.f14335b;
                if (t2 == obj) {
                    t2 = this.f14334a.get();
                    Object obj2 = this.f14335b;
                    if (obj2 != obj && obj2 != t2) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t2 + ". This is likely due to a circular dependency.");
                    }
                    this.f14335b = t2;
                    this.f14334a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t2;
    }
}
