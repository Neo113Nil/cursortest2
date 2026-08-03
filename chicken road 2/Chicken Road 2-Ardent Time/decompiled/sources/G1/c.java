package G1;

/* loaded from: classes.dex */
public final class c extends z1.I implements java.util.concurrent.Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final G1.c f577c = new G1.c();

    /* renamed from: d, reason: collision with root package name */
    public static final z1.AbstractC1065s f578d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [E1.i] */
    static {
        G1.l lVar = G1.l.f594c;
        int i2 = E1.w.f305a;
        if (64 >= i2) {
            i2 = 64;
        }
        int k2 = E1.AbstractC0000a.k("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (k2 < 1) {
            throw new java.lang.IllegalArgumentException(B1.a.f(k2, "Expected positive parallelism level, but got ").toString());
        }
        if (k2 < G1.k.f589d) {
            if (k2 < 1) {
                throw new java.lang.IllegalArgumentException(B1.a.f(k2, "Expected positive parallelism level, but got ").toString());
            }
            lVar = new E1.i(lVar, k2);
        }
        f578d = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        l(k1.j.f7951a, runnable);
    }

    @Override // z1.AbstractC1065s
    public final void l(k1.i iVar, java.lang.Runnable runnable) {
        f578d.l(iVar, runnable);
    }

    @Override // z1.AbstractC1065s
    public final java.lang.String toString() {
        return "Dispatchers.IO";
    }
}
