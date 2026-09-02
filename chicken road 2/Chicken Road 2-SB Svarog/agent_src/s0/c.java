package s0;

import java.util.concurrent.Executor;
import m0.AbstractC0059p;
import m0.E;
import r0.AbstractC0088a;
import r0.x;

/* loaded from: classes.dex */
public final class c extends E implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final c f1228d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0059p f1229e;

    static {
        AbstractC0059p abstractC0059p = k.f1244d;
        int i2 = x.f1199a;
        if (64 >= i2) {
            i2 = 64;
        }
        int i3 = AbstractC0088a.i("kotlinx.coroutines.io.parallelism", i2, 12);
        abstractC0059p.getClass();
        if (i3 < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i3).toString());
        }
        if (i3 < j.f1239d) {
            if (i3 < 1) {
                throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i3).toString());
            }
            abstractC0059p = new r0.j(abstractC0059p, i3);
        }
        f1229e = abstractC0059p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f(Y.j.f410b, runnable);
    }

    @Override // m0.AbstractC0059p
    public final void f(Y.i iVar, Runnable runnable) {
        f1229e.f(iVar, runnable);
    }

    @Override // m0.AbstractC0059p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
