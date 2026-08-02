package D7;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6100c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile c f6101a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f6102b;

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.f6102b = f6100c;
        bVar.f6101a = cVar;
        return bVar;
    }

    @Override // D7.c
    public final Object zza() {
        Object obj;
        Object obj2 = this.f6102b;
        Object obj3 = f6100c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f6102b;
                if (obj == obj3) {
                    obj = this.f6101a.zza();
                    Object obj4 = this.f6102b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f6102b = obj;
                    this.f6101a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
