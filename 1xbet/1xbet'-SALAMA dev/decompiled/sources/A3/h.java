package A3;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f654c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile i f655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        Object objA = this.f656b;
        Object obj = f654c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f656b;
                    if (objA == obj) {
                        objA = this.f655a.a();
                        Object obj2 = this.f656b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f656b = objA;
                        this.f655a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return objA;
    }
}
