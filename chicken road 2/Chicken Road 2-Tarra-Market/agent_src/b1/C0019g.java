package b1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019g extends L {

    /* renamed from: e, reason: collision with root package name */
    public final C0017e f661e;

    public C0019g(C0017e c0017e) {
        this.f661e = c0017e;
    }

    @Override // U0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return K0.i.f206a;
    }

    @Override // b1.N
    public final void k(Throwable th) {
        S j2 = j();
        C0017e c0017e = this.f661e;
        c0017e.getClass();
        CancellationException u2 = j2.u();
        if (c0017e.r()) {
            M0.d dVar = c0017e.f658d;
            kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            g1.h hVar = (g1.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.h.f1149h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C0.a aVar = g1.a.f1139d;
                if (!kotlin.jvm.internal.j.a(obj, aVar)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, u2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0017e.l(u2);
        if (c0017e.r()) {
            return;
        }
        c0017e.m();
    }
}
