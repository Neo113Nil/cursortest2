package D2;

import B2.w;
import java.util.concurrent.Executor;
import w2.AbstractC1239s;
import w2.I;

/* loaded from: classes.dex */
public final class c extends I implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f310c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1239s f311d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [B2.i] */
    static {
        l lVar = l.f326c;
        int i3 = w.f185a;
        if (64 >= i3) {
            i3 = 64;
        }
        int j3 = B2.a.j(i3, 12, "kotlinx.coroutines.io.parallelism");
        lVar.getClass();
        if (j3 < 1) {
            throw new IllegalArgumentException(B0.c.h(j3, "Expected positive parallelism level, but got ").toString());
        }
        if (j3 < k.f322d) {
            if (j3 < 1) {
                throw new IllegalArgumentException(B0.c.h(j3, "Expected positive parallelism level, but got ").toString());
            }
            lVar = new B2.i(lVar, j3);
        }
        f311d = lVar;
    }

    @Override // w2.AbstractC1239s
    public final void c(g2.h hVar, Runnable runnable) {
        f311d.c(hVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(g2.i.f4981a, runnable);
    }

    @Override // w2.AbstractC1239s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
