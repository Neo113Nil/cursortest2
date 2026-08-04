package K6;

import D6.A;
import D6.Y;
import I6.w;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Y implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f4158c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f4159d;

    static {
        A iVar;
        k kVar = k.f4174c;
        int i7 = w.f3761a;
        if (64 >= i7) {
            i7 = 64;
        }
        int iK = I6.a.k("kotlinx.coroutines.io.parallelism", i7, 0, 0, 12);
        kVar.getClass();
        if (iK < 1) {
            throw new IllegalArgumentException(p031e1.k.d(iK, "Expected positive parallelism level, but got ").toString());
        }
        if (iK < j.f4169d) {
            if (iK < 1) {
                throw new IllegalArgumentException(p031e1.k.d(iK, "Expected positive parallelism level, but got ").toString());
            }
            iVar = new I6.i(kVar, iK);
        }
        iVar = kVar;
        f4159d = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // D6.A
    public final void d(p065i6.i iVar, Runnable runnable) {
        f4159d.d(iVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(p065i6.j.f14074a, runnable);
    }

    @Override // D6.A
    public final String toString() {
        return "Dispatchers.IO";
    }
}
