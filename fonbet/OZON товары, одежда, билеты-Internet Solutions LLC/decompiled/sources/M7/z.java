package M7;

/* loaded from: classes9.dex */
public final class z implements c {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f17543c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile a f17544a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f17545b;

    public static c b(a aVar) {
        if (aVar instanceof z) {
            return aVar;
        }
        z zVar = new z();
        zVar.f17545b = f17543c;
        zVar.f17544a = aVar;
        return zVar;
    }

    @Override // M7.c
    public final Object a() {
        Object obj;
        Object obj2 = this.f17545b;
        Object obj3 = f17543c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f17545b;
                if (obj == obj3) {
                    obj = this.f17544a.a();
                    Object obj4 = this.f17545b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f17545b = obj;
                    this.f17544a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
