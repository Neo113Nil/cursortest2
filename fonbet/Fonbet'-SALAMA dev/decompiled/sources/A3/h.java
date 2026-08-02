package A3;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f654c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile i f655a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f656b;

    /* JADX WARN: Multi-variable type inference failed */
    public static h b(i iVar) {
        if (iVar instanceof h) {
            return (h) iVar;
        }
        h hVar = new h();
        hVar.f656b = f654c;
        hVar.f655a = iVar;
        return hVar;
    }

    @Override // A3.j
    public final Object a() {
        Object obj = this.f656b;
        Object obj2 = f654c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f656b;
                    if (obj == obj2) {
                        obj = this.f655a.a();
                        Object obj3 = this.f656b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f656b = obj;
                        this.f655a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
