package w4;

import java.util.concurrent.Executor;
import p4.AbstractC2277q;
import p4.L;
import u4.s;

/* loaded from: classes.dex */
public final class d extends L implements Executor {

    /* renamed from: m, reason: collision with root package name */
    public static final d f20559m = new d();

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC2277q f20560n;

    static {
        l lVar = l.f20572m;
        int i = s.f20115a;
        if (64 >= i) {
            i = 64;
        }
        f20560n = lVar.G(u4.a.j(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // p4.AbstractC2277q
    public final void E(a4.h hVar, Runnable runnable) {
        f20560n.E(hVar, runnable);
    }

    @Override // p4.AbstractC2277q
    public final AbstractC2277q G(int i) {
        return l.f20572m.G(1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        E(a4.i.f6649k, runnable);
    }

    @Override // p4.AbstractC2277q
    public final String toString() {
        return "Dispatchers.IO";
    }
}
