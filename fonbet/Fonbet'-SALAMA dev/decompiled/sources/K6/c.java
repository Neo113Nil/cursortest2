package K6;

import D6.A;
import D6.Y;
import I6.w;
import i6.C1293j;
import i6.InterfaceC1292i;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class c extends Y implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final c f4158c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final A f4159d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [I6.i] */
    static {
        k kVar = k.f4174c;
        int i7 = w.f3761a;
        if (64 >= i7) {
            i7 = 64;
        }
        int k7 = I6.a.k("kotlinx.coroutines.io.parallelism", i7, 0, 0, 12);
        kVar.getClass();
        if (k7 < 1) {
            throw new IllegalArgumentException(e1.k.d(k7, "Expected positive parallelism level, but got ").toString());
        }
        if (k7 < j.f4169d) {
            if (k7 < 1) {
                throw new IllegalArgumentException(e1.k.d(k7, "Expected positive parallelism level, but got ").toString());
            }
            kVar = new I6.i(kVar, k7);
        }
        f4159d = kVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // D6.A
    public final void d(InterfaceC1292i interfaceC1292i, Runnable runnable) {
        f4159d.d(interfaceC1292i, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(C1293j.f14068a, runnable);
    }

    @Override // D6.A
    public final String toString() {
        return "Dispatchers.IO";
    }
}
