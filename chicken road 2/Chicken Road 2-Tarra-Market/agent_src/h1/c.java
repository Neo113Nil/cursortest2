package h1;

import b1.AbstractC0028p;
import b1.D;
import g1.w;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends D implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f1238c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0028p f1239d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [g1.i] */
    static {
        l lVar = l.f1255c;
        int i2 = w.f1181a;
        if (64 >= i2) {
            i2 = 64;
        }
        int k2 = g1.a.k("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12);
        lVar.getClass();
        if (k2 < 1) {
            throw new IllegalArgumentException(C0.g.g(k2, "Expected positive parallelism level, but got ").toString());
        }
        if (k2 < k.f1250d) {
            if (k2 < 1) {
                throw new IllegalArgumentException(C0.g.g(k2, "Expected positive parallelism level, but got ").toString());
            }
            lVar = new g1.i(lVar, k2);
        }
        f1239d = lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l(M0.j.f226a, runnable);
    }

    @Override // b1.AbstractC0028p
    public final void l(M0.i iVar, Runnable runnable) {
        f1239d.l(iVar, runnable);
    }

    @Override // b1.AbstractC0028p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
