package C0;

/* loaded from: classes.dex */
public final class a implements c2.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f192c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f193a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f194b;

    public static c2.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f194b = f192c;
        aVar.f193a = bVar;
        return aVar;
    }

    @Override // c2.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f194b;
        Object obj3 = f192c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f194b;
                if (obj == obj3) {
                    obj = this.f193a.get();
                    Object obj4 = this.f194b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f194b = obj;
                    this.f193a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
