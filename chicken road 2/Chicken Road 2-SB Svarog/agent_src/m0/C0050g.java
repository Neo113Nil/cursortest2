package m0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r0.AbstractC0088a;

/* renamed from: m0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050g extends M {

    /* renamed from: f, reason: collision with root package name */
    public final C0048e f927f;

    public C0050g(C0048e c0048e) {
        this.f927f = c0048e;
    }

    @Override // f0.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return W.g.f394a;
    }

    @Override // m0.O
    public final void o(Throwable th) {
        CancellationException v = n().v();
        C0048e c0048e = this.f927f;
        if (c0048e.s()) {
            Y.d dVar = c0048e.f924e;
            g0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            r0.h hVar = (r0.h) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.h.f1168i;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                io.flutter.plugin.platform.i iVar = AbstractC0088a.f1158d;
                if (!g0.h.a(obj, iVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, iVar, v)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != iVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0048e.m(v);
        if (c0048e.s()) {
            return;
        }
        c0048e.n();
    }
}
