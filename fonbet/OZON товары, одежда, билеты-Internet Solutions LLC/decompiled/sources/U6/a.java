package U6;

/* loaded from: classes9.dex */
public final class a<T> implements Pc.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f27361c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile b f27362a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f27363b;

    public static Pc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f27363b = f27361c;
        aVar.f27362a = bVar;
        return aVar;
    }

    @Override // Pc.a
    public final T get() {
        T t2;
        T t11 = (T) this.f27363b;
        Object obj = f27361c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t2 = (T) this.f27363b;
                if (t2 == obj) {
                    t2 = this.f27362a.get();
                    Object obj2 = this.f27363b;
                    if (obj2 != obj && obj2 != t2) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t2 + ". This is likely due to a circular dependency.");
                    }
                    this.f27363b = t2;
                    this.f27362a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t2;
    }
}
