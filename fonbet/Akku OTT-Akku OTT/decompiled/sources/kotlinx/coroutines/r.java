package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C1089f;
import kotlinx.coroutines.internal.C1090g;

/* loaded from: classes5.dex */
public final class r extends B0 {

    @JvmField
    public final C1100n<?> e;

    public r(C1100n<?> c1100n) {
        this.e = c1100n;
    }

    @Override // kotlinx.coroutines.B0
    public final boolean i() {
        return true;
    }

    @Override // kotlinx.coroutines.B0
    public final void j(Throwable th) {
        C0 h = h();
        C1100n<?> c1100n = this.e;
        Throwable p = c1100n.p(h);
        if (c1100n.v()) {
            Continuation<?> continuation = c1100n.d;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            C1089f c1089f = (C1089f) continuation;
            c1089f.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1089f.j;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c1089f);
                kotlinx.coroutines.internal.x xVar = C1090g.b;
                if (!Intrinsics.areEqual(obj, xVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(c1089f, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(c1089f) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c1089f, xVar, p)) {
                    if (atomicReferenceFieldUpdater.get(c1089f) != xVar) {
                        break;
                    }
                }
                return;
            }
        }
        c1100n.cancel(p);
        if (c1100n.v()) {
            return;
        }
        c1100n.n();
    }
}
